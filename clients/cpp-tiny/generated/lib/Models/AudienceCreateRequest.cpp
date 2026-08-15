

#include "AudienceCreateRequest.h"

using namespace Tiny;

AudienceCreateRequest::AudienceCreateRequest()
{
	ad_account_id = std::string();
	name = std::string();
	rule = AudienceRule();
	audience_type = std::string();
	description = std::string();
}

AudienceCreateRequest::AudienceCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceCreateRequest::~AudienceCreateRequest()
{

}

void
AudienceCreateRequest::fromJson(std::string jsonObj)
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

    const char *audience_typeKey = "audience_type";

    if(object.has_key(audience_typeKey))
    {
        bourne::json value = object[audience_typeKey];




        AudienceType* obj = &audience_type;
		obj->fromJson(value.dump());

    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }


}

bourne::json
AudienceCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["name"] = getName();







	object["rule"] = getRule().toJson();






	object["audience_type"] = getAudienceType().toJson();





    object["description"] = getDescription();



    return object;

}

std::string
AudienceCreateRequest::getAdAccountId()
{
	return ad_account_id;
}

void
AudienceCreateRequest::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AudienceCreateRequest::getName()
{
	return name;
}

void
AudienceCreateRequest::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
AudienceCreateRequest::getRule()
{
	return rule;
}

void
AudienceCreateRequest::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

AudienceType
AudienceCreateRequest::getAudienceType()
{
	return audience_type;
}

void
AudienceCreateRequest::setAudienceType(AudienceType  audience_type)
{
	this->audience_type = audience_type;
}

std::string
AudienceCreateRequest::getDescription()
{
	return description;
}

void
AudienceCreateRequest::setDescription(std::string  description)
{
	this->description = description;
}



