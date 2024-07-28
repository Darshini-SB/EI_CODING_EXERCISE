package commands;



import satellite.Satellite;

public class DeactivatePanelsCommand implements Command {
    private Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.setSolarPanels("Inactive");
        System.out.println("Solar panels deactivated.");
    }
}
