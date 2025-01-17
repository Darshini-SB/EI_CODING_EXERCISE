package commands;



import satellite.Satellite;

public class RotateCommand implements Command {
    private Satellite satellite;
    private String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        satellite.setOrientation(direction);
        System.out.println("Satellite rotated to " + direction);
    }
}
