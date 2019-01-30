package aufgabe_2;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement

public class Weather {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "main")
    private String main;
    @XmlElement(name = "description")
    private String description;
    //@XmlElement(name = "icon") Aufgabe 4
    @XmlTransient
    private String icon;

    public Weather() {
    }

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Main: " + getMain() + ", Description: " + getDescription() + ", Icon: " + getIcon();
    }

}

