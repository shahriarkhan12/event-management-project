
public class EventType {
    private int typeID;
    private String name;
    private String description;

    public int getTypeID() {
        return typeID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void create() {
    }

    public void update(int typeID, String name, String description) {
        this.typeID = typeID;
        this.name = name;
        this.description = description;
    }

    public EventType() {
    }

    public EventType(int typeID, String name, String description) {
        this.typeID = typeID;
        this.name = name;
        this.description = description;
    }
}
