package commands;

import satellite.Satellite;

public class ActivatePanelsCommand implements Command {
    private Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.setSolarPanels("Active");
        System.out.println("Solar panels activated.");
    }
}
