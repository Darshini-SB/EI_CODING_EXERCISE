package satellite;

public class Satellite {
    private String orientation;
    private String solarPanels;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanels = "Inactive";
        this.dataCollected = 0;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getSolarPanels() {
        return solarPanels;
    }

    public void setSolarPanels(String solarPanels) {
        this.solarPanels = solarPanels;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void incrementDataCollected(int amount) {
        this.dataCollected += amount;
    }

    public void displayStatus() {
        System.out.println("Satellite Status:");
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + solarPanels);
        System.out.println("Data Collected: " + dataCollected);
    }
}
