package aufgabe_5;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    @JsonProperty("Identification")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    //dieses teil wird ignoriert und nicht verwendet
    @JsonIgnore
    public String getMain()
    {
        return main;
    }

    public void setMain(String main)
    {
        this.main = main;
    }

    @JsonProperty("Description")
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @JsonProperty("Icon")
    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    @Override
    public String toString()
    {
        return "ID: " + getId() + ", Main: " + getMain() + ", Description: " + getDescription() + ", Icon: " + getIcon();
    }

}