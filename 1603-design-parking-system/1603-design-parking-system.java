class ParkingSystem {
    private int[] count;

    public ParkingSystem(int big, int medium, int small) {
        // 1-based indexing to align directly with carType (1: big, 2: medium, 3: small)
        count = new int[]{0, big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if (count[carType] > 0) {
            count[carType]--;
            return true;
        }
        return false;
    }
}
