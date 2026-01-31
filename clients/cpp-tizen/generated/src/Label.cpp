#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Label.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Label::Label()
{
	//__init();
}

Label::~Label()
{
	//__cleanup();
}

void
Label::__init()
{
	//id = std::string();
	//label_type = new LabelType();
	//parent_id = std::string();
	//parent_type = std::string();
	//status = new LabelStatus();
	//value = std::string();
}

void
Label::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(label_type != NULL) {
	//
	//delete label_type;
	//label_type = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
	//}
	//if(parent_type != NULL) {
	//
	//delete parent_type;
	//parent_type = NULL;
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
Label::fromJson(char* jsonStr)
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
	const gchar *label_typeKey = "label_type";
	node = json_object_get_member(pJsonObject, label_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LabelType")) {
			jsonToValue(&label_type, node, "LabelType", "LabelType");
		} else {
			
			LabelType* obj = static_cast<LabelType*> (&label_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parent_typeKey = "parent_type";
	node = json_object_get_member(pJsonObject, parent_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_type, node, "std::string", "");
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

Label::Label(char* json)
{
	this->fromJson(json);
}

char*
Label::toJson()
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
	if (isprimitive("LabelType")) {
		LabelType obj = getLabelType();
		node = converttoJson(&obj, "LabelType", "");
	}
	else {
		
		LabelType obj = static_cast<LabelType> (getLabelType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *label_typeKey = "label_type";
	json_object_set_member(pJsonObject, label_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_typeKey = "parent_type";
	json_object_set_member(pJsonObject, parent_typeKey, node);
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
Label::getId()
{
	return id;
}

void
Label::setId(std::string  id)
{
	this->id = id;
}

LabelType
Label::getLabelType()
{
	return label_type;
}

void
Label::setLabelType(LabelType  label_type)
{
	this->label_type = label_type;
}

std::string
Label::getParentId()
{
	return parent_id;
}

void
Label::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
Label::getParentType()
{
	return parent_type;
}

void
Label::setParentType(std::string  parent_type)
{
	this->parent_type = parent_type;
}

LabelStatus
Label::getStatus()
{
	return status;
}

void
Label::setStatus(LabelStatus  status)
{
	this->status = status;
}

std::string
Label::getValue()
{
	return value;
}

void
Label::setValue(std::string  value)
{
	this->value = value;
}


