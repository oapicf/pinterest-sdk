#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelUpdateRequest_labels_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelUpdateRequest_labels_inner::LabelUpdateRequest_labels_inner()
{
	//__init();
}

LabelUpdateRequest_labels_inner::~LabelUpdateRequest_labels_inner()
{
	//__cleanup();
}

void
LabelUpdateRequest_labels_inner::__init()
{
	//id = std::string();
	//status = new LabelStatus();
	//value = std::string();
}

void
LabelUpdateRequest_labels_inner::__cleanup()
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
LabelUpdateRequest_labels_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("LabelStatus")) {
			jsonToValue(&status, node, "LabelStatus", "LabelStatus");
		} else {
			
			LabelStatus* obj = static_cast<LabelStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
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

LabelUpdateRequest_labels_inner::LabelUpdateRequest_labels_inner(char* json)
{
	this->fromJson(json);
}

char*
LabelUpdateRequest_labels_inner::toJson()
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
	if (isprimitive("LabelStatus")) {
		LabelStatus obj = getStatus();
		node = converttoJson(&obj, "LabelStatus", "");
	}
	else {
		
		LabelStatus obj = static_cast<LabelStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
LabelUpdateRequest_labels_inner::getId()
{
	return id;
}

void
LabelUpdateRequest_labels_inner::setId(std::string  id)
{
	this->id = id;
}

LabelStatus
LabelUpdateRequest_labels_inner::getStatus()
{
	return status;
}

void
LabelUpdateRequest_labels_inner::setStatus(LabelStatus  status)
{
	this->status = status;
}

std::string
LabelUpdateRequest_labels_inner::getValue()
{
	return value;
}

void
LabelUpdateRequest_labels_inner::setValue(std::string  value)
{
	this->value = value;
}


