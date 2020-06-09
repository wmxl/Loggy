package org.wmxl.model;

public class VideoLog extends Log {
    private String type;
   


	public VideoLog(String name, String description, String data, double size, String type) {
        super(name, description, data);
        this.size = size;
        this.type = type;
    }
	public VideoLog(String name, String description, String data, String type) {
        super(name, description, data);
        this.size = size;
        this.type = type;
    }

    
    public String getType() {
		return type;
	}
    
	public void setType(String type) {
		this.type = type;
	}
}
