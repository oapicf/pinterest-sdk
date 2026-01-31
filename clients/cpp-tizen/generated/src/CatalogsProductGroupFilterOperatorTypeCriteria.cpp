#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupFilterOperatorTypeCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupFilterOperatorTypeCriteria::CatalogsProductGroupFilterOperatorTypeCriteria()
{
	//__init();
}

CatalogsProductGroupFilterOperatorTypeCriteria::~CatalogsProductGroupFilterOperatorTypeCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::__init()
{
	//filter_operator_type = std::string();
	//negated = bool(false);
	//new std::list()std::list> values;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::__cleanup()
{
	//if(filter_operator_type != NULL) {
	//
	//delete filter_operator_type;
	//filter_operator_type = NULL;
	//}
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *filter_operator_typeKey = "filter_operator_type";
	node = json_object_get_member(pJsonObject, filter_operator_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filter_operator_type, node, "std::string", "");
		} else {
			
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
}

CatalogsProductGroupFilterOperatorTypeCriteria::CatalogsProductGroupFilterOperatorTypeCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupFilterOperatorTypeCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFilterOperatorType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filter_operator_typeKey = "filter_operator_type";
	json_object_set_member(pJsonObject, filter_operator_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsProductGroupFilterOperatorTypeCriteria::getFilterOperatorType()
{
	return filter_operator_type;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setFilterOperatorType(std::string  filter_operator_type)
{
	this->filter_operator_type = filter_operator_type;
}

bool
CatalogsProductGroupFilterOperatorTypeCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::list<std::string>
CatalogsProductGroupFilterOperatorTypeCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupFilterOperatorTypeCriteria::setValues(std::list <std::string> values)
{
	this->values = values;
}


