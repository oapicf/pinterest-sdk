#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AudienceDemographics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AudienceDemographics::AudienceDemographics()
{
	//__init();
}

AudienceDemographics::~AudienceDemographics()
{
	//__cleanup();
}

void
AudienceDemographics::__init()
{
	//new std::list()std::list> ages;
	//new std::list()std::list> genders;
	//new std::list()std::list> devices;
	//new std::list()std::list> metros;
	//new std::list()std::list> countries;
}

void
AudienceDemographics::__cleanup()
{
	//if(ages != NULL) {
	//ages.RemoveAll(true);
	//delete ages;
	//ages = NULL;
	//}
	//if(genders != NULL) {
	//genders.RemoveAll(true);
	//delete genders;
	//genders = NULL;
	//}
	//if(devices != NULL) {
	//devices.RemoveAll(true);
	//delete devices;
	//devices = NULL;
	//}
	//if(metros != NULL) {
	//metros.RemoveAll(true);
	//delete metros;
	//metros = NULL;
	//}
	//if(countries != NULL) {
	//countries.RemoveAll(true);
	//delete countries;
	//countries = NULL;
	//}
	//
}

void
AudienceDemographics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *agesKey = "ages";
	node = json_object_get_member(pJsonObject, agesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceDemographicValue> new_list;
			AudienceDemographicValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceDemographicValue")) {
					jsonToValue(&inst, temp_json, "AudienceDemographicValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ages = new_list;
		}
		
	}
	const gchar *gendersKey = "genders";
	node = json_object_get_member(pJsonObject, gendersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceDemographicValue> new_list;
			AudienceDemographicValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceDemographicValue")) {
					jsonToValue(&inst, temp_json, "AudienceDemographicValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			genders = new_list;
		}
		
	}
	const gchar *devicesKey = "devices";
	node = json_object_get_member(pJsonObject, devicesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceDemographicValue> new_list;
			AudienceDemographicValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceDemographicValue")) {
					jsonToValue(&inst, temp_json, "AudienceDemographicValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			devices = new_list;
		}
		
	}
	const gchar *metrosKey = "metros";
	node = json_object_get_member(pJsonObject, metrosKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceDemographicValue> new_list;
			AudienceDemographicValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceDemographicValue")) {
					jsonToValue(&inst, temp_json, "AudienceDemographicValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			metros = new_list;
		}
		
	}
	const gchar *countriesKey = "countries";
	node = json_object_get_member(pJsonObject, countriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceDemographicValue> new_list;
			AudienceDemographicValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceDemographicValue")) {
					jsonToValue(&inst, temp_json, "AudienceDemographicValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			countries = new_list;
		}
		
	}
}

AudienceDemographics::AudienceDemographics(char* json)
{
	this->fromJson(json);
}

char*
AudienceDemographics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AudienceDemographicValue")) {
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getAges());
		node = converttoJson(&new_list, "AudienceDemographicValue", "array");
	} else {
		node = json_node_alloc();
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getAges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceDemographicValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceDemographicValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *agesKey = "ages";
	json_object_set_member(pJsonObject, agesKey, node);
	if (isprimitive("AudienceDemographicValue")) {
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getGenders());
		node = converttoJson(&new_list, "AudienceDemographicValue", "array");
	} else {
		node = json_node_alloc();
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getGenders());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceDemographicValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceDemographicValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *gendersKey = "genders";
	json_object_set_member(pJsonObject, gendersKey, node);
	if (isprimitive("AudienceDemographicValue")) {
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getDevices());
		node = converttoJson(&new_list, "AudienceDemographicValue", "array");
	} else {
		node = json_node_alloc();
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getDevices());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceDemographicValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceDemographicValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *devicesKey = "devices";
	json_object_set_member(pJsonObject, devicesKey, node);
	if (isprimitive("AudienceDemographicValue")) {
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getMetros());
		node = converttoJson(&new_list, "AudienceDemographicValue", "array");
	} else {
		node = json_node_alloc();
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getMetros());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceDemographicValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceDemographicValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *metrosKey = "metros";
	json_object_set_member(pJsonObject, metrosKey, node);
	if (isprimitive("AudienceDemographicValue")) {
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getCountries());
		node = converttoJson(&new_list, "AudienceDemographicValue", "array");
	} else {
		node = json_node_alloc();
		list<AudienceDemographicValue> new_list = static_cast<list <AudienceDemographicValue> > (getCountries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceDemographicValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceDemographicValue obj = *it;
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

std::list<AudienceDemographicValue>
AudienceDemographics::getAges()
{
	return ages;
}

void
AudienceDemographics::setAges(std::list <AudienceDemographicValue> ages)
{
	this->ages = ages;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getGenders()
{
	return genders;
}

void
AudienceDemographics::setGenders(std::list <AudienceDemographicValue> genders)
{
	this->genders = genders;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getDevices()
{
	return devices;
}

void
AudienceDemographics::setDevices(std::list <AudienceDemographicValue> devices)
{
	this->devices = devices;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getMetros()
{
	return metros;
}

void
AudienceDemographics::setMetros(std::list <AudienceDemographicValue> metros)
{
	this->metros = metros;
}

std::list<AudienceDemographicValue>
AudienceDemographics::getCountries()
{
	return countries;
}

void
AudienceDemographics::setCountries(std::list <AudienceDemographicValue> countries)
{
	this->countries = countries;
}


