class UnitConverter {
    private final double factor;
    private final String fromUnit;
    private final String toUnit;

    public UnitConverter(double factor, String fromUnit, String toUnit) {
        this.factor = factor;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public void convert(double value) {
        double convertedValue = value * factor;
        System.out.println(value + " " + fromUnit + " = " + convertedValue + " " + toUnit);
    }
}
