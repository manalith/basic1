public enum LengthUnit implements Unit{
    MILIMETER(0.001), CENTIMETER(0.01), METER(1), KILOMETER(1000), INCH(0.0254), FEET(0.3048), YARD(0.9144), MILE(1609.34);
    private double unitValue;

    LengthUnit(double referTo) {
        this.unitValue = referTo;
    }

    public double getUnitValue() {
        return unitValue;
    }


}
