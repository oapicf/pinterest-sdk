#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMMMReportRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMMMReportRequest::CreateMMMReportRequest()
{
	//__init();
}

CreateMMMReportRequest::~CreateMMMReportRequest()
{
	//__cleanup();
}

void
CreateMMMReportRequest::__init()
{
	//report_name = std::string();
	//start_date = std::string();
	//end_date = std::string();
	//granularity = std::string();
	//level = std::string();
	//new std::list()std::list> targeting_types;
	//new std::list()std::list> columns;
	//new std::list()std::list> countries;
}

void
CreateMMMReportRequest::__cleanup()
{
	//if(report_name != NULL) {
	//
	//delete report_name;
	//report_name = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(granularity != NULL) {
	//
	//delete granularity;
	//granularity = NULL;
	//}
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(targeting_types != NULL) {
	//targeting_types.RemoveAll(true);
	//delete targeting_types;
	//targeting_types = NULL;
	//}
	//if(columns != NULL) {
	//columns.RemoveAll(true);
	//delete columns;
	//columns = NULL;
	//}
	//if(countries != NULL) {
	//countries.RemoveAll(true);
	//delete countries;
	//countries = NULL;
	//}
	//
}

void
CreateMMMReportRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_nameKey = "report_name";
	node = json_object_get_member(pJsonObject, report_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *granularityKey = "granularity";
	node = json_object_get_member(pJsonObject, granularityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&granularity, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&level, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *targeting_typesKey = "targeting_types";
	node = json_object_get_member(pJsonObject, targeting_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MMMReportingTargetingType> new_list;
			MMMReportingTargetingType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MMMReportingTargetingType")) {
					jsonToValue(&inst, temp_json, "MMMReportingTargetingType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			targeting_types = new_list;
		}
		
	}
	const gchar *columnsKey = "columns";
	node = json_object_get_member(pJsonObject, columnsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MMMReportingColumn> new_list;
			MMMReportingColumn inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MMMReportingColumn")) {
					jsonToValue(&inst, temp_json, "MMMReportingColumn", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			columns = new_list;
		}
		
	}
	const gchar *countriesKey = "countries";
	node = json_object_get_member(pJsonObject, countriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingAdvertiserCountry> new_list;
			TargetingAdvertiserCountry inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingAdvertiserCountry")) {
					jsonToValue(&inst, temp_json, "TargetingAdvertiserCountry", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			countries = new_list;
		}
		
	}
}

CreateMMMReportRequest::CreateMMMReportRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateMMMReportRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReportName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *report_nameKey = "report_name";
	json_object_set_member(pJsonObject, report_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGranularity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *granularityKey = "granularity";
	json_object_set_member(pJsonObject, granularityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLevel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("MMMReportingTargetingType")) {
		list<MMMReportingTargetingType> new_list = static_cast<list <MMMReportingTargetingType> > (getTargetingTypes());
		node = converttoJson(&new_list, "MMMReportingTargetingType", "array");
	} else {
		node = json_node_alloc();
		list<MMMReportingTargetingType> new_list = static_cast<list <MMMReportingTargetingType> > (getTargetingTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MMMReportingTargetingType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MMMReportingTargetingType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *targeting_typesKey = "targeting_types";
	json_object_set_member(pJsonObject, targeting_typesKey, node);
	if (isprimitive("MMMReportingColumn")) {
		list<MMMReportingColumn> new_list = static_cast<list <MMMReportingColumn> > (getColumns());
		node = converttoJson(&new_list, "MMMReportingColumn", "array");
	} else {
		node = json_node_alloc();
		list<MMMReportingColumn> new_list = static_cast<list <MMMReportingColumn> > (getColumns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MMMReportingColumn>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MMMReportingColumn obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *columnsKey = "columns";
	json_object_set_member(pJsonObject, columnsKey, node);
	if (isprimitive("TargetingAdvertiserCountry")) {
		list<TargetingAdvertiserCountry> new_list = static_cast<list <TargetingAdvertiserCountry> > (getCountries());
		node = converttoJson(&new_list, "TargetingAdvertiserCountry", "array");
	} else {
		node = json_node_alloc();
		list<TargetingAdvertiserCountry> new_list = static_cast<list <TargetingAdvertiserCountry> > (getCountries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingAdvertiserCountry>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingAdvertiserCountry obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *countriesKey = "countries";
	json_object_set_member(pJsonObject, countriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateMMMReportRequest::getReportName()
{
	return report_name;
}

void
CreateMMMReportRequest::setReportName(std::string  report_name)
{
	this->report_name = report_name;
}

std::string
CreateMMMReportRequest::getStartDate()
{
	return start_date;
}

void
CreateMMMReportRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
CreateMMMReportRequest::getEndDate()
{
	return end_date;
}

void
CreateMMMReportRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
CreateMMMReportRequest::getGranularity()
{
	return granularity;
}

void
CreateMMMReportRequest::setGranularity(std::string  granularity)
{
	this->granularity = granularity;
}

std::string
CreateMMMReportRequest::getLevel()
{
	return level;
}

void
CreateMMMReportRequest::setLevel(std::string  level)
{
	this->level = level;
}

std::list<MMMReportingTargetingType>
CreateMMMReportRequest::getTargetingTypes()
{
	return targeting_types;
}

void
CreateMMMReportRequest::setTargetingTypes(std::list <MMMReportingTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}

std::list<MMMReportingColumn>
CreateMMMReportRequest::getColumns()
{
	return columns;
}

void
CreateMMMReportRequest::setColumns(std::list <MMMReportingColumn> columns)
{
	this->columns = columns;
}

std::list<TargetingAdvertiserCountry>
CreateMMMReportRequest::getCountries()
{
	return countries;
}

void
CreateMMMReportRequest::setCountries(std::list <TargetingAdvertiserCountry> countries)
{
	this->countries = countries;
}


