package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private int enginePower;
    private String trackType;

    public Bulldozer() {
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "bladeWidth=" + bladeWidth
                + ", enginePower=" + enginePower
                + ", trackType='" + trackType + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bulldozer bulldozer = (Bulldozer) o;
        return bladeWidth == bulldozer.bladeWidth
                && enginePower == bulldozer.enginePower
                && Objects.equals(trackType, bulldozer.trackType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bladeWidth, enginePower, trackType);
    }
}
