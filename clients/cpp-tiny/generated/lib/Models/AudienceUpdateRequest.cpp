

#include "AudienceUpdateRequest.h"

using namespace Tiny;

AudienceUpdateRequest::AudienceUpdateRequest()
{
	ad_account_id = std::string();
	name = std::string();
	rule = AudienceRule();
	description = std::string();
	operation_type = AudienceUpdateOperationType();
}

AudienceUpdateRequest::AudienceUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceUpdateRequest::~AudienceUpdateRequest()
{

}

void
AudienceUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ruleKey = "rule";

    if(object.has_key(ruleKey))
    {
        bourne::json value = object[ruleKey];




        AudienceRule* obj = &rule;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        AudienceUpdateOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
AudienceUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["name"] = getName();







	object["rule"] = getRule().toJson();





    object["description"] = getDescription();







	object["operation_type"] = getOperationType().toJson();


    return object;

}

std::string
AudienceUpdateRequest::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceUpdateRequest::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceUpdateRequest::getName()
{
	return name;
}

void
AudienceUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceUpdateRequest::getRule()
{
	return rule;
}

void
AudienceUpdateRequest::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

std::string
AudienceUpdateRequest::getDescription()
{
	return description;
}

void
AudienceUpdateRequest::setDescription(std::string  description)
{
	this->description = description;
}

AudienceUpdateOperationType
AudienceUpdateRequest::getOperationType()
{
	return operation_type;
}

void
AudienceUpdateRequest::setOperationType(AudienceUpdateOperationType  operation_type)
{
	this->operation_type = operation_type;
}



