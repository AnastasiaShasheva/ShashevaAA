public class dimensionalGoods extends Supermarket{
    private int height;
    private int weight;
    private int length;

    public dimensionalGoods(String nameOtdela, String name, String cuntry, int retailPrice, String namesource, int height, int weight, int length) {
        super(nameOtdela, name, cuntry, retailPrice, namesource);
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public int getLength() { return length; }

    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }
    public void setLength(int length) { this.length = length;}

    @Override
    public String toString() {
        return super.toString() + " " + height + " " + weight + " " + length;
    }
}
