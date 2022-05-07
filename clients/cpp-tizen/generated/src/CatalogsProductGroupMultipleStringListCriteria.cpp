#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupMultipleStringListCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupMultipleStringListCriteria::CatalogsProductGroupMultipleStringListCriteria()
{
	//__init();
}

CatalogsProductGroupMultipleStringListCriteria::~CatalogsProductGroupMultipleStringListCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupMultipleStringListCriteria::__init()
{
	//new std::list()std::list> values;
	//negated = bool(false);
}

void
CatalogsProductGroupMultipleStringListCriteria::__cleanup()
{
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//
}

void
CatalogsProductGroupMultipleStringListCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::list> new_list;
			std::list inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::list")) {
					jsonToValue(&inst, temp_json, "std::list", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
	const gchar *negatedKey = "negated";
	node = json_object_get_member(pJsonObject, negatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&negated, node, "bool", "");
		} else {
			
		}
	}
}

CatalogsProductGroupMultipleStringListCriteria::CatalogsProductGroupMultipleStringListCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupMultipleStringListCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::list")) {
		list<std::list> new_list = static_cast<list <std::list> > (getValues());
		node = converttoJson(&new_list, "std::list", "array");
	} else {
		node = json_node_alloc();
		list<std::list> new_list = static_cast<list <std::list> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<std::list>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			std::list obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::list>
CatalogsProductGroupMultipleStringListCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleStringListCriteria::setValues(std::list <std::list> values)
{
	this->values = values;
}

bool
CatalogsProductGroupMultipleStringListCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleStringListCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}


