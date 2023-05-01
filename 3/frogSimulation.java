class frogSimulation {
    private int goalDistance;
    private int maxHops;

    public int hopDistance() {
        /* implemantation not shown */
    }
    public boolean simulate() {
        // (a)
        int pos = 0;
        for (int count = 0; count < maxHops; count++) {
            pos += hopDistance();

            if (pos >= goalDistance) {
                return true;
            } 
            else if {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        // (b)
        int countSucc = 0;
        for (int count = 0; count < num; count++) {
            if (simulate()) {
                countSucc++;
            }
            return (double)countSucc / num;
        }
    }
}
