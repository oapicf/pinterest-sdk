#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelBulkUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelBulkUpdateRequest::LabelBulkUpdateRequest()
{
	//__init();
}

LabelBulkUpdateRequest::~LabelBulkUpdateRequest()
{
	//__cleanup();
}

void
LabelBulkUpdateRequest::__init()
{
	//id = std::string();
	//status = std::string();
	//value = std::string();
}

void
LabelBulkUpdateRequest::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
LabelBulkUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

LabelBulkUpdateRequest::LabelBulkUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
LabelBulkUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LabelBulkUpdateRequest::getId()
{
	return id;
}

void
LabelBulkUpdateRequest::setId(std::string  id)
{
	this->id = id;
}

std::string
LabelBulkUpdateRequest::getStatus()
{
	return status;
}

void
LabelBulkUpdateRequest::setStatus(std::string  status)
{
	this->status = status;
}

std::string
LabelBulkUpdateRequest::getValue()
{
	return value;
}

void
LabelBulkUpdateRequest::setValue(std::string  value)
{
	this->value = value;
}


