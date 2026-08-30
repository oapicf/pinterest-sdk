#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EntityLabel.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EntityLabel::EntityLabel()
{
	//__init();
}

EntityLabel::~EntityLabel()
{
	//__cleanup();
}

void
EntityLabel::__init()
{
	//entity_id = std::string();
	//entity_type = null;
	//label_id = std::string();
	//status = null;
}

void
EntityLabel::__cleanup()
{
	//if(entity_id != NULL) {
	//
	//delete entity_id;
	//entity_id = NULL;
	//}
	//if(entity_type != NULL) {
	//
	//delete entity_type;
	//entity_type = NULL;
	//}
	//if(label_id != NULL) {
	//
	//delete label_id;
	//label_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
EntityLabel::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entity_idKey = "entity_id";
	node = json_object_get_member(pJsonObject, entity_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entity_typeKey = "entity_type";
	node = json_object_get_member(pJsonObject, entity_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LabelParentType")) {
			jsonToValue(&entity_type, node, "LabelParentType", "LabelParentType");
		} else {
			
			LabelParentType* obj = static_cast<LabelParentType*> (&entity_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *label_idKey = "label_id";
	node = json_object_get_member(pJsonObject, label_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&label_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityLabelStatus")) {
			jsonToValue(&status, node, "EntityLabelStatus", "EntityLabelStatus");
		} else {
			
			EntityLabelStatus* obj = static_cast<EntityLabelStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EntityLabel::EntityLabel(char* json)
{
	this->fromJson(json);
}

char*
EntityLabel::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEntityId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entity_idKey = "entity_id";
	json_object_set_member(pJsonObject, entity_idKey, node);
	if (isprimitive("LabelParentType")) {
		LabelParentType obj = getEntityType();
		node = converttoJson(&obj, "LabelParentType", "");
	}
	else {
		
		LabelParentType obj = static_cast<LabelParentType> (getEntityType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *entity_typeKey = "entity_type";
	json_object_set_member(pJsonObject, entity_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLabelId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *label_idKey = "label_id";
	json_object_set_member(pJsonObject, label_idKey, node);
	if (isprimitive("EntityLabelStatus")) {
		EntityLabelStatus obj = getStatus();
		node = converttoJson(&obj, "EntityLabelStatus", "");
	}
	else {
		
		EntityLabelStatus obj = static_cast<EntityLabelStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
EntityLabel::getEntityId()
{
	return entity_id;
}

void
EntityLabel::setEntityId(std::string  entity_id)
{
	this->entity_id = entity_id;
}

LabelParentType
EntityLabel::getEntityType()
{
	return entity_type;
}

void
EntityLabel::setEntityType(LabelParentType  entity_type)
{
	this->entity_type = entity_type;
}

std::string
EntityLabel::getLabelId()
{
	return label_id;
}

void
EntityLabel::setLabelId(std::string  label_id)
{
	this->label_id = label_id;
}

EntityLabelStatus
EntityLabel::getStatus()
{
	return status;
}

void
EntityLabel::setStatus(EntityLabelStatus  status)
{
	this->status = status;
}


