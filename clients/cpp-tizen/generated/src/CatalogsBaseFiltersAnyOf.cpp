#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsBaseFiltersAnyOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsBaseFiltersAnyOf::CatalogsBaseFiltersAnyOf()
{
	//__init();
}

CatalogsBaseFiltersAnyOf::~CatalogsBaseFiltersAnyOf()
{
	//__cleanup();
}

void
CatalogsBaseFiltersAnyOf::__init()
{
	//new std::list()std::list> any_of;
}

void
CatalogsBaseFiltersAnyOf::__cleanup()
{
	//if(any_of != NULL) {
	//any_of.RemoveAll(true);
	//delete any_of;
	//any_of = NULL;
	//}
	//
}

void
CatalogsBaseFiltersAnyOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *any_ofKey = "any_of";
	node = json_object_get_member(pJsonObject, any_ofKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CatalogsBaseFilterKeys> new_list;
			CatalogsBaseFilterKeys inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CatalogsBaseFilterKeys")) {
					jsonToValue(&inst, temp_json, "CatalogsBaseFilterKeys", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			any_of = new_list;
		}
		
	}
}

CatalogsBaseFiltersAnyOf::CatalogsBaseFiltersAnyOf(char* json)
{
	this->fromJson(json);
}

char*
CatalogsBaseFiltersAnyOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsBaseFilterKeys")) {
		list<CatalogsBaseFilterKeys> new_list = static_cast<list <CatalogsBaseFilterKeys> > (getAnyOf());
		node = converttoJson(&new_list, "CatalogsBaseFilterKeys", "array");
	} else {
		node = json_node_alloc();
		list<CatalogsBaseFilterKeys> new_list = static_cast<list <CatalogsBaseFilterKeys> > (getAnyOf());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CatalogsBaseFilterKeys>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CatalogsBaseFilterKeys obj = *it;
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

std::list<CatalogsBaseFilterKeys>
CatalogsBaseFiltersAnyOf::getAnyOf()
{
	return any_of;
}

void
CatalogsBaseFiltersAnyOf::setAnyOf(std::list <CatalogsBaseFilterKeys> any_of)
{
	this->any_of = any_of;
}


