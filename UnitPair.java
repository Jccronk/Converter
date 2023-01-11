class UnitPair {
    private final double factor;
    private final String fromUnit;
    private final String toUnit;

    public UnitPair(double factor, String fromUnit, String toUnit) {
        this.factor = factor;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public double getFactor() {
        return factor;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }
}
