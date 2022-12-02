class Solution {
    public int minimumKeypresses(String s) {
        // count same letters - this is effectively map from char to occurrence but faster since it's an array
        int[] occurrences = new int[26];
        for (char c: s.toCharArray()) {
            ++occurrences[c - 'a'];
        }
        // sort from the rarest occurrence to the highest occurrence
        // - can't do easily Comparator.reverseOrder() without conversion, so we go from back of the array
        Arrays.sort(occurrences);
        // placeReservation serves for binding to the keyboard (for operation modulo 9)
        int placeReservation = 0;
        int minimumKeypresses = 0;
        for (int index = occurrences.length - 1; index >= 0; --index) {
            int i = occurrences[index];
            if (i == 0) {
                break;
            }
            // +1 because minimum 1 click on keyboard
            minimumKeypresses += ((placeReservation / 9) + 1) * i;
            ++placeReservation;
        }
        return minimumKeypresses;
    }
}