package org.wmxl.model;

public class Log {
	private String id;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String name;
    private String description;
    private String data;
    protected double size;
    protected String type;
    

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public long getInternalID() {
        return internalID;
    }

    private long internalID;
    private String uniqueShortCode;

    public Log(){

    }

    public Log(String name, String description, String data) {
        this.name = name;
        this.description = description;
        this.data = data;
        this.internalID = System.currentTimeMillis();
        if(name.length() > 3)
            name = name.substring(0, 3);
        if(description.length() > 3)
            description = description.substring(0,3);
        this.uniqueShortCode = (name + "-" + description + "-" + internalID).substring(0,11);
    }

    public void read(){
        System.out.println("read log");
        System.out.println("name: " + name);
        System.out.println("description: " + description);
        System.out.println("data: " + data);
    }

    public void update(String name, String des, String data){
        this.name = name;
        this.description = des;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Log{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'';
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
