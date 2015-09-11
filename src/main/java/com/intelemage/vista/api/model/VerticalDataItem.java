package com.intelemage.vista.api.model;

import java.util.List;

public class VerticalDataItem {

	private String key;
	private String name;
	private String action;
	private String type;
	private String value;
	private List<String> arrayValue;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrackedItemActions getActionE() {
		return TrackedItemActions.valueOf(action);
	}
	public String getAction() {
		return action;
	}
	public void setAction(TrackedItemActions a) {
		setAction(a.name());
	}
	public void setAction(String action) {
		this.action = action;
	}
	public TrackedItemTypes getItemType() {
		return TrackedItemTypes.valueOf(type);
	}
	public String getType() {
		return type;
	}
	public void setType(TrackedItemTypes t) {
		setType(t.name());
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<String> getArrayValue() {
		return arrayValue;
	}
	public void setArrayValue(List<String>  arrayValue) {
		this.arrayValue = arrayValue;
	}

	public static enum TrackedItemActions {
		set,
		remove;
	}
	
	public static enum TrackedItemTypes {
		string,
		time,
		stringArray;
	}
	
}
