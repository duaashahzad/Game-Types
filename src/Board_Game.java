public class Board_Game extends Game
{
    int num_player;
    int time;

    public Board_Game()
    {
        num_player = 0;
        time = 0;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setNumPlayer(int num)
    {
        num_player = num;
    }

    public void setTimeLimit(int t)
    {
        time = t;
    }

    public String getDescription()
    {
        return description;
    }

    public int getNumPlayer()
    {
        return num_player;
    }

    public int getTimeLimit()
    {
        return time;
    }


}
