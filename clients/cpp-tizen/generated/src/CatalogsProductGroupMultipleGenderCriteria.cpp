#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupMultipleGenderCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupMultipleGenderCriteria::CatalogsProductGroupMultipleGenderCriteria()
{
	//__init();
}

CatalogsProductGroupMultipleGenderCriteria::~CatalogsProductGroupMultipleGenderCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupMultipleGenderCriteria::__init()
{
	//new std::list()std::list> values;
	//negated = bool(false);
}

void
CatalogsProductGroupMultipleGenderCriteria::__cleanup()
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
CatalogsProductGroupMultipleGenderCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Gender> new_list;
			Gender inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Gender")) {
					jsonToValue(&inst, temp_json, "Gender", "");
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

CatalogsProductGroupMultipleGenderCriteria::CatalogsProductGroupMultipleGenderCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupMultipleGenderCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Gender")) {
		list<Gender> new_list = static_cast<list <Gender> > (getValues());
		node = converttoJson(&new_list, "Gender", "array");
	} else {
		node = json_node_alloc();
		list<Gender> new_list = static_cast<list <Gender> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Gender>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Gender obj = *it;
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

std::list<Gender>
CatalogsProductGroupMultipleGenderCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleGenderCriteria::setValues(std::list <Gender> values)
{
	this->values = values;
}

bool
CatalogsProductGroupMultipleGenderCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleGenderCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}


