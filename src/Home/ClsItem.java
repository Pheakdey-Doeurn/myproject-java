package Home;


public class ClsItem {
    //Data or field
    private int id;
    private String item;
    //Constructor
    public ClsItem(){}
    public ClsItem(int i,String t){id=i;item=t;}
    //setter
    public void setID(int i){id=i;}
    public void setItem(String t){item=t;}
    //getter
    public int getId(){return id;}
    public String getItem(){return item;}
    //toString
    public String toString(){return getItem();}
}
