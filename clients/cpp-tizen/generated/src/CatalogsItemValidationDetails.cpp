#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemValidationDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemValidationDetails::CatalogsItemValidationDetails()
{
	//__init();
}

CatalogsItemValidationDetails::~CatalogsItemValidationDetails()
{
	//__cleanup();
}

void
CatalogsItemValidationDetails::__init()
{
	//attribute_name = new NullableCatalogsItemFieldType();
	//provided_value = std::string();
}

void
CatalogsItemValidationDetails::__cleanup()
{
	//if(attribute_name != NULL) {
	//
	//delete attribute_name;
	//attribute_name = NULL;
	//}
	//if(provided_value != NULL) {
	//
	//delete provided_value;
	//provided_value = NULL;
	//}
	//
}

void
CatalogsItemValidationDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attribute_nameKey = "attribute_name";
	node = json_object_get_member(pJsonObject, attribute_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("NullableCatalogsItemFieldType")) {
			jsonToValue(&attribute_name, node, "NullableCatalogsItemFieldType", "NullableCatalogsItemFieldType");
		} else {
			
			NullableCatalogsItemFieldType* obj = static_cast<NullableCatalogsItemFieldType*> (&attribute_name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *provided_valueKey = "provided_value";
	node = json_object_get_member(pJsonObject, provided_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&provided_value, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsItemValidationDetails::CatalogsItemValidationDetails(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemValidationDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("NullableCatalogsItemFieldType")) {
		NullableCatalogsItemFieldType obj = getAttributeName();
		node = converttoJson(&obj, "NullableCatalogsItemFieldType", "");
	}
	else {
		
		NullableCatalogsItemFieldType obj = static_cast<NullableCatalogsItemFieldType> (getAttributeName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attribute_nameKey = "attribute_name";
	json_object_set_member(pJsonObject, attribute_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProvidedValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *provided_valueKey = "provided_value";
	json_object_set_member(pJsonObject, provided_valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

NullableCatalogsItemFieldType
CatalogsItemValidationDetails::getAttributeName()
{
	return attribute_name;
}

void
CatalogsItemValidationDetails::setAttributeName(NullableCatalogsItemFieldType  attribute_name)
{
	this->attribute_name = attribute_name;
}

std::string
CatalogsItemValidationDetails::getProvidedValue()
{
	return provided_value;
}

void
CatalogsItemValidationDetails::setProvidedValue(std::string  provided_value)
{
	this->provided_value = provided_value;
}


