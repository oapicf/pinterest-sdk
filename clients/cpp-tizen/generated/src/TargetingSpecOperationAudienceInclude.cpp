#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpecOperationAudienceInclude.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpecOperationAudienceInclude::TargetingSpecOperationAudienceInclude()
{
	//__init();
}

TargetingSpecOperationAudienceInclude::~TargetingSpecOperationAudienceInclude()
{
	//__cleanup();
}

void
TargetingSpecOperationAudienceInclude::__init()
{
	//field = std::string();
	//operation = new TargetingSpecListOperation();
	//new std::list()std::list> values;
}

void
TargetingSpecOperationAudienceInclude::__cleanup()
{
	//if(field != NULL) {
	//
	//delete field;
	//field = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
TargetingSpecOperationAudienceInclude::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldKey = "field";
	node = json_object_get_member(pJsonObject, fieldKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&field, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecListOperation")) {
			jsonToValue(&operation, node, "TargetingSpecListOperation", "TargetingSpecListOperation");
		} else {
			
			TargetingSpecListOperation* obj = static_cast<TargetingSpecListOperation*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
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

TargetingSpecOperationAudienceInclude::TargetingSpecOperationAudienceInclude(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpecOperationAudienceInclude::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getField();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fieldKey = "field";
	json_object_set_member(pJsonObject, fieldKey, node);
	if (isprimitive("TargetingSpecListOperation")) {
		TargetingSpecListOperation obj = getOperation();
		node = converttoJson(&obj, "TargetingSpecListOperation", "");
	}
	else {
		
		TargetingSpecListOperation obj = static_cast<TargetingSpecListOperation> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
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
TargetingSpecOperationAudienceInclude::getField()
{
	return field;
}

void
TargetingSpecOperationAudienceInclude::setField(std::string  field)
{
	this->field = field;
}

TargetingSpecListOperation
TargetingSpecOperationAudienceInclude::getOperation()
{
	return operation;
}

void
TargetingSpecOperationAudienceInclude::setOperation(TargetingSpecListOperation  operation)
{
	this->operation = operation;
}

std::list<std::string>
TargetingSpecOperationAudienceInclude::getValues()
{
	return values;
}

void
TargetingSpecOperationAudienceInclude::setValues(std::list <std::string> values)
{
	this->values = values;
}


