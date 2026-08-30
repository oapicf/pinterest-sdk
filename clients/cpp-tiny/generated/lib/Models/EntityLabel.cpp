

#include "EntityLabel.h"

using namespace Tiny;

EntityLabel::EntityLabel()
{
	entity_id = std::string();
	entity_type = null;
	label_id = std::string();
	status = null;
}

EntityLabel::EntityLabel(std::string jsonString)
{
	this->fromJson(jsonString);
}

EntityLabel::~EntityLabel()
{

}

void
EntityLabel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *entity_idKey = "entity_id";

    if(object.has_key(entity_idKey))
    {
        bourne::json value = object[entity_idKey];



        jsonToValue(&entity_id, value, "std::string");


    }

    const char *entity_typeKey = "entity_type";

    if(object.has_key(entity_typeKey))
    {
        bourne::json value = object[entity_typeKey];




        LabelParentType* obj = &entity_type;
		obj->fromJson(value.dump());

    }

    const char *label_idKey = "label_id";

    if(object.has_key(label_idKey))
    {
        bourne::json value = object[label_idKey];



        jsonToValue(&label_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityLabelStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
EntityLabel::toJson()
{
    bourne::json object = bourne::json::object();





    object["entity_id"] = getEntityId();







	object["entity_type"] = getEntityType().toJson();





    object["label_id"] = getLabelId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
EntityLabel::getEntityId()
{
	return entity_id;
}

void
EntityLabel::setEntityId(std::string entity_id)
{
	this->entity_id = entity_id;
}

LabelParentType
EntityLabel::getEntityType()
{
	return entity_type;
}

void
EntityLabel::setEntityType(LabelParentType entity_type)
{
	this->entity_type = entity_type;
}

std::string
EntityLabel::getLabelId()
{
	return label_id;
}

void
EntityLabel::setLabelId(std::string label_id)
{
	this->label_id = label_id;
}

EntityLabelStatus
EntityLabel::getStatus()
{
	return status;
}

void
EntityLabel::setStatus(EntityLabelStatus status)
{
	this->status = status;
}



