

#include "TargetingTemplateUpdateRequest.h"

using namespace Tiny;

TargetingTemplateUpdateRequest::TargetingTemplateUpdateRequest()
{
	id = std::string();
	operation_type = std::string();
	targeting_attributes = TargetingSpec();
}

TargetingTemplateUpdateRequest::TargetingTemplateUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateUpdateRequest::~TargetingTemplateUpdateRequest()
{

}

void
TargetingTemplateUpdateRequest::fromJson(std::string jsonObj)
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



        jsonToValue(&operation_type, value, "std::string");


    }

    const char *targeting_attributesKey = "targeting_attributes";

    if(object.has_key(targeting_attributesKey))
    {
        bourne::json value = object[targeting_attributesKey];




        TargetingSpec* obj = &targeting_attributes;
		obj->fromJson(value.dump());

    }


}

bourne::json
TargetingTemplateUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["operation_type"] = getOperationType();







	object["targeting_attributes"] = getTargetingAttributes().toJson();


    return object;

}

std::string
TargetingTemplateUpdateRequest::getId()
{
	return id;
}

void
TargetingTemplateUpdateRequest::setId(std::string  id)
{
	this->id = id;
}

std::string
TargetingTemplateUpdateRequest::getOperationType()
{
	return operation_type;
}

void
TargetingTemplateUpdateRequest::setOperationType(std::string  operation_type)
{
	this->operation_type = operation_type;
}

TargetingSpec
TargetingTemplateUpdateRequest::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateUpdateRequest::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}



