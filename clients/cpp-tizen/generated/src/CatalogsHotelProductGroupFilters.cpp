#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelProductGroupFilters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelProductGroupFilters::CatalogsHotelProductGroupFilters()
{
	//__init();
}

CatalogsHotelProductGroupFilters::~CatalogsHotelProductGroupFilters()
{
	//__cleanup();
}

void
CatalogsHotelProductGroupFilters::__init()
{
	//new std::list()std::list> any_of;
	//new std::list()std::list> all_of;
}

void
CatalogsHotelProductGroupFilters::__cleanup()
{
	//if(any_of != NULL) {
	//any_of.RemoveAll(true);
	//delete any_of;
	//any_of = NULL;
	//}
	//if(all_of != NULL) {
	//all_of.RemoveAll(true);
	//delete all_of;
	//all_of = NULL;
	//}
	//
}

void
CatalogsHotelProductGroupFilters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *any_ofKey = "any_of";
	node = json_object_get_member(pJsonObject, any_ofKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsHotelProductGroupFilterKeys> new_list;
			CatalogsHotelProductGroupFilterKeys inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsHotelProductGroupFilterKeys")) {
					jsonToValue(&inst, temp_json, "CatalogsHotelProductGroupFilterKeys", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			any_of = new_list;
		}
		
	}
	const gchar *all_ofKey = "all_of";
	node = json_object_get_member(pJsonObject, all_ofKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsHotelProductGroupFilterKeys> new_list;
			CatalogsHotelProductGroupFilterKeys inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsHotelProductGroupFilterKeys")) {
					jsonToValue(&inst, temp_json, "CatalogsHotelProductGroupFilterKeys", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			all_of = new_list;
		}
		
	}
}

CatalogsHotelProductGroupFilters::CatalogsHotelProductGroupFilters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelProductGroupFilters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsHotelProductGroupFilterKeys")) {
		list<CatalogsHotelProductGroupFilterKeys> new_list = static_cast<list <CatalogsHotelProductGroupFilterKeys> > (getAnyOf());
		node = converttoJson(&new_list, "CatalogsHotelProductGroupFilterKeys", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsHotelProductGroupFilterKeys> new_list = static_cast<list <CatalogsHotelProductGroupFilterKeys> > (getAnyOf());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsHotelProductGroupFilterKeys>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsHotelProductGroupFilterKeys obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *any_ofKey = "any_of";
	json_object_set_member(pJsonObject, any_ofKey, node);
	if (isprimitive("CatalogsHotelProductGroupFilterKeys")) {
		list<CatalogsHotelProductGroupFilterKeys> new_list = static_cast<list <CatalogsHotelProductGroupFilterKeys> > (getAllOf());
		node = converttoJson(&new_list, "CatalogsHotelProductGroupFilterKeys", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsHotelProductGroupFilterKeys> new_list = static_cast<list <CatalogsHotelProductGroupFilterKeys> > (getAllOf());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsHotelProductGroupFilterKeys>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsHotelProductGroupFilterKeys obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *all_ofKey = "all_of";
	json_object_set_member(pJsonObject, all_ofKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CatalogsHotelProductGroupFilterKeys>
CatalogsHotelProductGroupFilters::getAnyOf()
{
	return any_of;
}

void
CatalogsHotelProductGroupFilters::setAnyOf(std::list <CatalogsHotelProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}

std::list<CatalogsHotelProductGroupFilterKeys>
CatalogsHotelProductGroupFilters::getAllOf()
{
	return all_of;
}

void
CatalogsHotelProductGroupFilters::setAllOf(std::list <CatalogsHotelProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}


