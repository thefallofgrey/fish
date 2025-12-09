public class fish{
    private String type;
    public fish(){
        this.type = "betta";
    }

    public void setType(String species){
        this.type = species;
    }
    public String gettype(){
        return this.type;
    }

    public void swim(){
        System.out.print("glub glub");

    }
}
