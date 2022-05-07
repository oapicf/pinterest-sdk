#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupFiltersAllOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupFiltersAllOf::CatalogsProductGroupFiltersAllOf()
{
	//__init();
}

CatalogsProductGroupFiltersAllOf::~CatalogsProductGroupFiltersAllOf()
{
	//__cleanup();
}

void
CatalogsProductGroupFiltersAllOf::__init()
{
	//new std::list()std::list> all_of;
}

void
CatalogsProductGroupFiltersAllOf::__cleanup()
{
	//if(all_of != NULL) {
	//all_of.RemoveAll(true);
	//delete all_of;
	//all_of = NULL;
	//}
	//
}

void
CatalogsProductGroupFiltersAllOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *all_ofKey = "all_of";
	node = json_object_get_member(pJsonObject, all_ofKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsProductGroupFilterKeys> new_list;
			CatalogsProductGroupFilterKeys inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsProductGroupFilterKeys")) {
					jsonToValue(&inst, temp_json, "CatalogsProductGroupFilterKeys", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			all_of = new_list;
		}
		
	}
}

CatalogsProductGroupFiltersAllOf::CatalogsProductGroupFiltersAllOf(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupFiltersAllOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupFilterKeys")) {
		list<CatalogsProductGroupFilterKeys> new_list = static_cast<list <CatalogsProductGroupFilterKeys> > (getAllOf());
		node = converttoJson(&new_list, "CatalogsProductGroupFilterKeys", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsProductGroupFilterKeys> new_list = static_cast<list <CatalogsProductGroupFilterKeys> > (getAllOf());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsProductGroupFilterKeys>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsProductGroupFilterKeys obj = *it;
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

std::list<CatalogsProductGroupFilterKeys>
CatalogsProductGroupFiltersAllOf::getAllOf()
{
	return all_of;
}

void
CatalogsProductGroupFiltersAllOf::setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}


