#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupMultipleCountriesCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupMultipleCountriesCriteria::CatalogsProductGroupMultipleCountriesCriteria()
{
	//__init();
}

CatalogsProductGroupMultipleCountriesCriteria::~CatalogsProductGroupMultipleCountriesCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupMultipleCountriesCriteria::__init()
{
	//new std::list()std::list> values;
	//negated = bool(false);
}

void
CatalogsProductGroupMultipleCountriesCriteria::__cleanup()
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
CatalogsProductGroupMultipleCountriesCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Country> new_list;
			Country inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Country")) {
					jsonToValue(&inst, temp_json, "Country", "");
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

CatalogsProductGroupMultipleCountriesCriteria::CatalogsProductGroupMultipleCountriesCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupMultipleCountriesCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Country")) {
		list<Country> new_list = static_cast<list <Country> > (getValues());
		node = converttoJson(&new_list, "Country", "array");
	} else {
		node = json_node_alloc();
		list<Country> new_list = static_cast<list <Country> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Country>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Country obj = *it;
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

std::list<Country>
CatalogsProductGroupMultipleCountriesCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupMultipleCountriesCriteria::setValues(std::list <Country> values)
{
	this->values = values;
}

bool
CatalogsProductGroupMultipleCountriesCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupMultipleCountriesCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}


