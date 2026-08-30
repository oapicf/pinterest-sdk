

#include "AdAccountsAudienceCreate.h"

using namespace Tiny;

AdAccountsAudienceCreate::AdAccountsAudienceCreate()
{
	ad_account_id = std::string();
	audience_type = null;
	description = std::string();
	name = std::string();
	rule = AdAccountsAudienceRule();
}

AdAccountsAudienceCreate::AdAccountsAudienceCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsAudienceCreate::~AdAccountsAudienceCreate()
{

}

void
AdAccountsAudienceCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


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




        AdAccountsAudienceRule* obj = &rule;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdAccountsAudienceCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();







	object["audience_type"] = getAudienceType().toJson();





    object["description"] = getDescription();






    object["name"] = getName();







	object["rule"] = getRule().toJson();


    return object;

}

std::string
AdAccountsAudienceCreate::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudienceCreate::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

AudienceType
AdAccountsAudienceCreate::getAudienceType()
{
	return audience_type;
}

void
AdAccountsAudienceCreate::setAudienceType(AudienceType audience_type)
{
	this->audience_type = audience_type;
}

std::string
AdAccountsAudienceCreate::getDescription()
{
	return description;
}

void
AdAccountsAudienceCreate::setDescription(std::string description)
{
	this->description = description;
}

std::string
AdAccountsAudienceCreate::getName()
{
	return name;
}

void
AdAccountsAudienceCreate::setName(std::string name)
{
	this->name = name;
}

AdAccountsAudienceRule
AdAccountsAudienceCreate::getRule()
{
	return rule;
}

void
AdAccountsAudienceCreate::setRule(AdAccountsAudienceRule rule)
{
	this->rule = rule;
}



