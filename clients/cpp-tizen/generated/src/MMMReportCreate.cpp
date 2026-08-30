#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MMMReportCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MMMReportCreate::MMMReportCreate()
{
	//__init();
}

MMMReportCreate::~MMMReportCreate()
{
	//__cleanup();
}

void
MMMReportCreate::__init()
{
	//new std::list()std::list> advertiser_ids;
	//new std::list()std::list> columns;
	//new std::list()std::list> countries;
	//new std::list()std::list> custom_column_ids;
	//end_date = std::string();
	//granularity = null;
	//level = null;
	//report_name = std::string();
	//start_date = std::string();
	//new std::list()std::list> targeting_types;
}

void
MMMReportCreate::__cleanup()
{
	//if(advertiser_ids != NULL) {
	//advertiser_ids.RemoveAll(true);
	//delete advertiser_ids;
	//advertiser_ids = NULL;
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
	//if(custom_column_ids != NULL) {
	//custom_column_ids.RemoveAll(true);
	//delete custom_column_ids;
	//custom_column_ids = NULL;
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
	//if(targeting_types != NULL) {
	//targeting_types.RemoveAll(true);
	//delete targeting_types;
	//targeting_types = NULL;
	//}
	//
}

void
MMMReportCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *advertiser_idsKey = "advertiser_ids";
	node = json_object_get_member(pJsonObject, advertiser_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			advertiser_ids = new_list;
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
	const gchar *custom_column_idsKey = "custom_column_ids";
	node = json_object_get_member(pJsonObject, custom_column_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_column_ids = new_list;
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
	

		if (isprimitive("MMMReportGranularity")) {
			jsonToValue(&granularity, node, "MMMReportGranularity", "MMMReportGranularity");
		} else {
			
			MMMReportGranularity* obj = static_cast<MMMReportGranularity*> (&granularity);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("MMMReportLevel")) {
			jsonToValue(&level, node, "MMMReportLevel", "MMMReportLevel");
		} else {
			
			MMMReportLevel* obj = static_cast<MMMReportLevel*> (&level);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

MMMReportCreate::MMMReportCreate(char* json)
{
	this->fromJson(json);
}

char*
MMMReportCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdvertiserIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdvertiserIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *advertiser_idsKey = "advertiser_ids";
	json_object_set_member(pJsonObject, advertiser_idsKey, node);
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomColumnIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomColumnIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_column_idsKey = "custom_column_ids";
	json_object_set_member(pJsonObject, custom_column_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("MMMReportGranularity")) {
		MMMReportGranularity obj = getGranularity();
		node = converttoJson(&obj, "MMMReportGranularity", "");
	}
	else {
		
		MMMReportGranularity obj = static_cast<MMMReportGranularity> (getGranularity());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granularityKey = "granularity";
	json_object_set_member(pJsonObject, granularityKey, node);
	if (isprimitive("MMMReportLevel")) {
		MMMReportLevel obj = getLevel();
		node = converttoJson(&obj, "MMMReportLevel", "");
	}
	else {
		
		MMMReportLevel obj = static_cast<MMMReportLevel> (getLevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
MMMReportCreate::getAdvertiserIds()
{
	return advertiser_ids;
}

void
MMMReportCreate::setAdvertiserIds(std::list <std::string> advertiser_ids)
{
	this->advertiser_ids = advertiser_ids;
}

std::list<MMMReportingColumn>
MMMReportCreate::getColumns()
{
	return columns;
}

void
MMMReportCreate::setColumns(std::list <MMMReportingColumn> columns)
{
	this->columns = columns;
}

std::list<TargetingAdvertiserCountry>
MMMReportCreate::getCountries()
{
	return countries;
}

void
MMMReportCreate::setCountries(std::list <TargetingAdvertiserCountry> countries)
{
	this->countries = countries;
}

std::list<std::string>
MMMReportCreate::getCustomColumnIds()
{
	return custom_column_ids;
}

void
MMMReportCreate::setCustomColumnIds(std::list <std::string> custom_column_ids)
{
	this->custom_column_ids = custom_column_ids;
}

std::string
MMMReportCreate::getEndDate()
{
	return end_date;
}

void
MMMReportCreate::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

MMMReportGranularity
MMMReportCreate::getGranularity()
{
	return granularity;
}

void
MMMReportCreate::setGranularity(MMMReportGranularity  granularity)
{
	this->granularity = granularity;
}

MMMReportLevel
MMMReportCreate::getLevel()
{
	return level;
}

void
MMMReportCreate::setLevel(MMMReportLevel  level)
{
	this->level = level;
}

std::string
MMMReportCreate::getReportName()
{
	return report_name;
}

void
MMMReportCreate::setReportName(std::string  report_name)
{
	this->report_name = report_name;
}

std::string
MMMReportCreate::getStartDate()
{
	return start_date;
}

void
MMMReportCreate::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::list<MMMReportingTargetingType>
MMMReportCreate::getTargetingTypes()
{
	return targeting_types;
}

void
MMMReportCreate::setTargetingTypes(std::list <MMMReportingTargetingType> targeting_types)
{
	this->targeting_types = targeting_types;
}


