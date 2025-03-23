package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int diggingDepth;
    private int armLength;
    private int bucketCapacity;

    public Excavator() {
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "diggingDepth=" + diggingDepth
                + ", armLength=" + armLength
                + ", bucketCapacity=" + bucketCapacity
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Excavator excavator = (Excavator) o;
        return diggingDepth == excavator.diggingDepth
                && armLength == excavator.armLength
                && bucketCapacity == excavator.bucketCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diggingDepth, armLength, bucketCapacity);
    }
}
