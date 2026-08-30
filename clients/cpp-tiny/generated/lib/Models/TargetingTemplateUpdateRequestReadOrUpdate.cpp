

#include "TargetingTemplateUpdateRequestReadOrUpdate.h"

using namespace Tiny;

TargetingTemplateUpdateRequestReadOrUpdate::TargetingTemplateUpdateRequestReadOrUpdate()
{
	id = std::string();
	operation_type = AudienceUpdateOperationType();
	targeting_attributes = null;
}

TargetingTemplateUpdateRequestReadOrUpdate::TargetingTemplateUpdateRequestReadOrUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateUpdateRequestReadOrUpdate::~TargetingTemplateUpdateRequestReadOrUpdate()
{

}

void
TargetingTemplateUpdateRequestReadOrUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        AudienceUpdateOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }

    const char *targeting_attributesKey = "targeting_attributes";

    if(object.has_key(targeting_attributesKey))
    {
        bourne::json value = object[targeting_attributesKey];




        TargetingSpecOptimal* obj = &targeting_attributes;
		obj->fromJson(value.dump());

    }


}

bourne::json
TargetingTemplateUpdateRequestReadOrUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["operation_type"] = getOperationType().toJson();






	object["targeting_attributes"] = getTargetingAttributes().toJson();


    return object;

}

std::string
TargetingTemplateUpdateRequestReadOrUpdate::getId()
{
	return id;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setId(std::string id)
{
	this->id = id;
}

AudienceUpdateOperationType
TargetingTemplateUpdateRequestReadOrUpdate::getOperationType()
{
	return operation_type;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setOperationType(AudienceUpdateOperationType operation_type)
{
	this->operation_type = operation_type;
}

TargetingSpecOptimal
TargetingTemplateUpdateRequestReadOrUpdate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateUpdateRequestReadOrUpdate::setTargetingAttributes(TargetingSpecOptimal targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}



