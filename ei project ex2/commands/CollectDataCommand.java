package commands;

import satellite.Satellite;

public class CollectDataCommand implements Command {
    private Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        if ("Active".equals(satellite.getSolarPanels())) {
            satellite.incrementDataCollected(10);
            System.out.println("Data collected. Total data: " + satellite.getDataCollected());
        } else {
            System.out.println("Solar panels are inactive. Cannot collect data.");
        }
    }
}
