#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupMultipleStringCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupMultipleStringCriteria::CatalogsProductGroupMultipleStringCriteria()
{
	//__init();
}

CatalogsProductGroupMultipleStringCriteria::~CatalogsProductGroupMultipleStringCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupMultipleStringCriteria::__init()
{
	//new std::list()std::list> values;
	//negated = bool(false);
}

void
CatalogsProductGroupMultipleStringCriteria::__cleanup()
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
CatalogsProductGroupMultipleStringCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
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

CatalogsProductGroupMultipleStringCriteria::CatalogsProductGroupMultipleStringCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupMultipleStringCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getValues());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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

std::list<std::string>
CatalogsProductGroupMultipleStringCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleStringCriteria::setValues(std::list <std::string> values)
{
	this->values = values;
}

bool
CatalogsProductGroupMultipleStringCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleStringCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}


