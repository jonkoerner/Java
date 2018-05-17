public class Project{
    private String name;
    private String description;
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(){}
    public Project(String name){
        this.name = name;
    }
    public String elavatorPitch(){
        return this.name + ":"+ this.description;
    }
    public String description(String agrs){
        return " this is your project description";
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void objectMethods(Project anotherObject){
        System.out.println("");
    }
}
