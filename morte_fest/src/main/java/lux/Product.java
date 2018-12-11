package lux;

import java.util.Calendar;

public class Product { 
	private String TwelveNC;
	
	private float value;
	private String description;
	
	private Calendar Date;
	
	public Product() {
		this.TwelveNC = "";
		this.value = 0;
		this.description = "";
		this.Date = null;
	}
	
	public Product(float value, String description, String TwelveNC, Calendar Date) {
		this.setValue(value);
		this.setDescription(description);
		this.setTwelveNC(TwelveNC);
	//	this.SetCalendarDate(Date);
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTwelveNC() {
		return TwelveNC;
	}

	public void setTwelveNC(String twelveNC) {
		TwelveNC = twelveNC;
	}
	
	public void SetCalendarDate(Calendar Date) {
		this.Date = Date;
	}
	
	public Calendar getDate() {
		return this.Date;
	}
	
	
	
}
