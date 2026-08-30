

#include "AdAccountsAudienceUpdate.h"

using namespace Tiny;

AdAccountsAudienceUpdate::AdAccountsAudienceUpdate()
{
	ad_account_id = std::string();
	audience_type = null;
	description = std::string();
	name = std::string();
	operation_type = null;
	rule = AdAccountsAudienceRule();
}

AdAccountsAudienceUpdate::AdAccountsAudienceUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsAudienceUpdate::~AdAccountsAudienceUpdate()
{

}

void
AdAccountsAudienceUpdate::fromJson(std::string jsonObj)
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

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        AudienceUpdateOperationType* obj = &operation_type;
		obj->fromJson(value.dump());

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
AdAccountsAudienceUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();







	object["audience_type"] = getAudienceType().toJson();





    object["description"] = getDescription();






    object["name"] = getName();







	object["operation_type"] = getOperationType().toJson();






	object["rule"] = getRule().toJson();


    return object;

}

std::string
AdAccountsAudienceUpdate::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudienceUpdate::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

AudienceType
AdAccountsAudienceUpdate::getAudienceType()
{
	return audience_type;
}

void
AdAccountsAudienceUpdate::setAudienceType(AudienceType audience_type)
{
	this->audience_type = audience_type;
}

std::string
AdAccountsAudienceUpdate::getDescription()
{
	return description;
}

void
AdAccountsAudienceUpdate::setDescription(std::string description)
{
	this->description = description;
}

std::string
AdAccountsAudienceUpdate::getName()
{
	return name;
}

void
AdAccountsAudienceUpdate::setName(std::string name)
{
	this->name = name;
}

AudienceUpdateOperationType
AdAccountsAudienceUpdate::getOperationType()
{
	return operation_type;
}

void
AdAccountsAudienceUpdate::setOperationType(AudienceUpdateOperationType operation_type)
{
	this->operation_type = operation_type;
}

AdAccountsAudienceRule
AdAccountsAudienceUpdate::getRule()
{
	return rule;
}

void
AdAccountsAudienceUpdate::setRule(AdAccountsAudienceRule rule)
{
	this->rule = rule;
}



