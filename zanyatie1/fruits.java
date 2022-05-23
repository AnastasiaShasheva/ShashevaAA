public class fruits extends Supermarket{
    private int max_time;
    private int temperature;

    public fruits(String nameOtdela, String name, String cuntry, int retailPrice, String namesource, int max_time, int temperature) {
        super(nameOtdela, name, cuntry, retailPrice, namesource);
        this.max_time = max_time;
        this.temperature = temperature;
    }

    public int getMax_time() { return max_time; }
    public int getTemperature() { return temperature; }

    public void setMax_time(int max_time) { this.max_time = max_time; }
    public void setTemperature(int temperature) { this.temperature = temperature; }

    @Override
    public String toString() {
        return super.toString() + " " + max_time + " " + temperature;
    }
}
