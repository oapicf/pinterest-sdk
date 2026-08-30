#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelErrorData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelErrorData::LabelErrorData()
{
	//__init();
}

LabelErrorData::~LabelErrorData()
{
	//__cleanup();
}

void
LabelErrorData::__init()
{
	//id = null;
	//label_type = new NullableLabelType();
	//status = new NullableLabelStatus();
	//value = std::string();
}

void
LabelErrorData::__cleanup()
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
LabelErrorData::fromJson(char* jsonStr)
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
	

		if (isprimitive("NullableLabelType")) {
			jsonToValue(&label_type, node, "NullableLabelType", "NullableLabelType");
		} else {
			
			NullableLabelType* obj = static_cast<NullableLabelType*> (&label_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("NullableLabelStatus")) {
			jsonToValue(&status, node, "NullableLabelStatus", "NullableLabelStatus");
		} else {
			
			NullableLabelStatus* obj = static_cast<NullableLabelStatus*> (&status);
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

LabelErrorData::LabelErrorData(char* json)
{
	this->fromJson(json);
}

char*
LabelErrorData::toJson()
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
	if (isprimitive("NullableLabelType")) {
		NullableLabelType obj = getLabelType();
		node = converttoJson(&obj, "NullableLabelType", "");
	}
	else {
		
		NullableLabelType obj = static_cast<NullableLabelType> (getLabelType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *label_typeKey = "label_type";
	json_object_set_member(pJsonObject, label_typeKey, node);
	if (isprimitive("NullableLabelStatus")) {
		NullableLabelStatus obj = getStatus();
		node = converttoJson(&obj, "NullableLabelStatus", "");
	}
	else {
		
		NullableLabelStatus obj = static_cast<NullableLabelStatus> (getStatus());
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
LabelErrorData::getId()
{
	return id;
}

void
LabelErrorData::setId(std::string  id)
{
	this->id = id;
}

NullableLabelType
LabelErrorData::getLabelType()
{
	return label_type;
}

void
LabelErrorData::setLabelType(NullableLabelType  label_type)
{
	this->label_type = label_type;
}

NullableLabelStatus
LabelErrorData::getStatus()
{
	return status;
}

void
LabelErrorData::setStatus(NullableLabelStatus  status)
{
	this->status = status;
}

std::string
LabelErrorData::getValue()
{
	return value;
}

void
LabelErrorData::setValue(std::string  value)
{
	this->value = value;
}


