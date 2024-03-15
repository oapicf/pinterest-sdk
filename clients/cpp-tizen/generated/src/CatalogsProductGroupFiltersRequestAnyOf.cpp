#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupFiltersRequest_anyOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupFiltersRequest_anyOf::CatalogsProductGroupFiltersRequest_anyOf()
{
	//__init();
}

CatalogsProductGroupFiltersRequest_anyOf::~CatalogsProductGroupFiltersRequest_anyOf()
{
	//__cleanup();
}

void
CatalogsProductGroupFiltersRequest_anyOf::__init()
{
	//new std::list()std::list> any_of;
}

void
CatalogsProductGroupFiltersRequest_anyOf::__cleanup()
{
	//if(any_of != NULL) {
	//any_of.RemoveAll(true);
	//delete any_of;
	//any_of = NULL;
	//}
	//
}

void
CatalogsProductGroupFiltersRequest_anyOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *any_ofKey = "any_of";
	node = json_object_get_member(pJsonObject, any_ofKey);
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
			any_of = new_list;
		}
		
	}
}

CatalogsProductGroupFiltersRequest_anyOf::CatalogsProductGroupFiltersRequest_anyOf(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupFiltersRequest_anyOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupFilterKeys")) {
		list<CatalogsProductGroupFilterKeys> new_list = static_cast<list <CatalogsProductGroupFilterKeys> > (getAnyOf());
		node = converttoJson(&new_list, "CatalogsProductGroupFilterKeys", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsProductGroupFilterKeys> new_list = static_cast<list <CatalogsProductGroupFilterKeys> > (getAnyOf());
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


	
	const gchar *any_ofKey = "any_of";
	json_object_set_member(pJsonObject, any_ofKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CatalogsProductGroupFilterKeys>
CatalogsProductGroupFiltersRequest_anyOf::getAnyOf()
{
	return any_of;
}

void
CatalogsProductGroupFiltersRequest_anyOf::setAnyOf(std::list <CatalogsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}


