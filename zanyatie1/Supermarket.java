public class Supermarket {
    private String nameOtdela; //Название отдела
    private String name; //Наименование товара
    private String cuntry; //Страна-производитель
    private int retailPrice; //Розничная цена
    private String namesource; //Поставщик

    public String getNameOtdela(){ return nameOtdela; }
    public String getName(){ return name; }
    public String getCuntry(){ return cuntry; }
    public int getRetailPrice(){ return retailPrice; }
    public String getNamesource(){ return namesource; }

    public void setNameOtdela(String nameOtdela){ this.nameOtdela = nameOtdela; }
    public void setName(String name){ this.name = name; }
    public void setCuntry(String cuntry) { this.cuntry = cuntry; }
    public void setRetailPrice(int retailPrice){ this.retailPrice = retailPrice; }
    public void setNamesource(String namesource) { this.namesource = namesource; }

    public String toString(){ return nameOtdela + " " + name + " " + cuntry + " " + retailPrice + " " + namesource; }

    public Supermarket(String nameOtdela, String name, String cuntry, int retailPrice, String namesource){
        this.nameOtdela = nameOtdela;
        this.name = name;
        this.cuntry = cuntry;
        this.retailPrice = retailPrice;
        this.namesource = namesource;
    }
}
