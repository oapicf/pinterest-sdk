#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelUpdateItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelUpdateItem::LabelUpdateItem()
{
	//__init();
}

LabelUpdateItem::~LabelUpdateItem()
{
	//__cleanup();
}

void
LabelUpdateItem::__init()
{
	//id = null;
	//status = new LabelStatus();
	//value = std::string();
}

void
LabelUpdateItem::__cleanup()
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
LabelUpdateItem::fromJson(char* jsonStr)
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

LabelUpdateItem::LabelUpdateItem(char* json)
{
	this->fromJson(json);
}

char*
LabelUpdateItem::toJson()
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
LabelUpdateItem::getId()
{
	return id;
}

void
LabelUpdateItem::setId(std::string  id)
{
	this->id = id;
}

LabelStatus
LabelUpdateItem::getStatus()
{
	return status;
}

void
LabelUpdateItem::setStatus(LabelStatus  status)
{
	this->status = status;
}

std::string
LabelUpdateItem::getValue()
{
	return value;
}

void
LabelUpdateItem::setValue(std::string  value)
{
	this->value = value;
}


