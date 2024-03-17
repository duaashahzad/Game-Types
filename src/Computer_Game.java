public class Computer_Game extends Game {
    public Computer_Game()
    {

    }

    public void setDescription(String s) {
        description = s;

    }

    //overload
    public void setDescription(String s, double t) {
        description = s;

    }


    public String getDescription() {
        return description;
    }

    //overload
    public String getDescription(String f) {
        return description;
    }
}

