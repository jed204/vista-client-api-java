package com.intelemage.vista.api;

import com.untzuntz.ustackclientapi.ParameterDefinition;

public enum Params implements ParameterDefinition {
	
	trial_id,
	site_name,
	subject_id,
	subject_name,
	visit_id,
	visit_name,
	visit_date,
	tracked_data,
	requirement_name,
	form_xml,
	mode,
	status,
	actor,
	name,
	change_reason,
	include_tracked_items,
	include_studies;

	private Params() {}
	
	public String getName() {
		return this.name();
	}
	
}
