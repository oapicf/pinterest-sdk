

#include "AdAccountsAudience.h"

using namespace Tiny;

AdAccountsAudience::AdAccountsAudience()
{
	ad_account_id = std::string();
	audience_type = null;
	created_by_company_name = std::string();
	created_timestamp = int(0);
	description = std::string();
	id = std::string();
	is_nca = bool(false);
	name = std::string();
	rule = AdAccountsAudienceRule();
	size = int(0);
	status = null;
	type = std::string();
	updated_timestamp = int(0);
}

AdAccountsAudience::AdAccountsAudience(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountsAudience::~AdAccountsAudience()
{

}

void
AdAccountsAudience::fromJson(std::string jsonObj)
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

    const char *created_by_company_nameKey = "created_by_company_name";

    if(object.has_key(created_by_company_nameKey))
    {
        bourne::json value = object[created_by_company_nameKey];



        jsonToValue(&created_by_company_name, value, "std::string");


    }

    const char *created_timestampKey = "created_timestamp";

    if(object.has_key(created_timestampKey))
    {
        bourne::json value = object[created_timestampKey];



        jsonToValue(&created_timestamp, value, "int");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_ncaKey = "is_nca";

    if(object.has_key(is_ncaKey))
    {
        bourne::json value = object[is_ncaKey];



        jsonToValue(&is_nca, value, "bool");


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

    const char *sizeKey = "size";

    if(object.has_key(sizeKey))
    {
        bourne::json value = object[sizeKey];



        jsonToValue(&size, value, "int");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        AudienceStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *updated_timestampKey = "updated_timestamp";

    if(object.has_key(updated_timestampKey))
    {
        bourne::json value = object[updated_timestampKey];



        jsonToValue(&updated_timestamp, value, "int");


    }


}

bourne::json
AdAccountsAudience::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();







	object["audience_type"] = getAudienceType().toJson();





    object["created_by_company_name"] = getCreatedByCompanyName();






    object["created_timestamp"] = getCreatedTimestamp();






    object["description"] = getDescription();






    object["id"] = getId();






    object["is_nca"] = isIsNca();






    object["name"] = getName();







	object["rule"] = getRule().toJson();





    object["size"] = getSize();







	object["status"] = getStatus().toJson();





    object["type"] = getType();






    object["updated_timestamp"] = getUpdatedTimestamp();



    return object;

}

std::string
AdAccountsAudience::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudience::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

AudienceType
AdAccountsAudience::getAudienceType()
{
	return audience_type;
}

void
AdAccountsAudience::setAudienceType(AudienceType audience_type)
{
	this->audience_type = audience_type;
}

std::string
AdAccountsAudience::getCreatedByCompanyName()
{
	return created_by_company_name;
}

void
AdAccountsAudience::setCreatedByCompanyName(std::string created_by_company_name)
{
	this->created_by_company_name = created_by_company_name;
}

int
AdAccountsAudience::getCreatedTimestamp()
{
	return created_timestamp;
}

void
AdAccountsAudience::setCreatedTimestamp(int created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

std::string
AdAccountsAudience::getDescription()
{
	return description;
}

void
AdAccountsAudience::setDescription(std::string description)
{
	this->description = description;
}

std::string
AdAccountsAudience::getId()
{
	return id;
}

void
AdAccountsAudience::setId(std::string id)
{
	this->id = id;
}

bool
AdAccountsAudience::isIsNca()
{
	return is_nca;
}

void
AdAccountsAudience::setIsNca(bool is_nca)
{
	this->is_nca = is_nca;
}

std::string
AdAccountsAudience::getName()
{
	return name;
}

void
AdAccountsAudience::setName(std::string name)
{
	this->name = name;
}

AdAccountsAudienceRule
AdAccountsAudience::getRule()
{
	return rule;
}

void
AdAccountsAudience::setRule(AdAccountsAudienceRule rule)
{
	this->rule = rule;
}

int
AdAccountsAudience::getSize()
{
	return size;
}

void
AdAccountsAudience::setSize(int size)
{
	this->size = size;
}

AudienceStatus
AdAccountsAudience::getStatus()
{
	return status;
}

void
AdAccountsAudience::setStatus(AudienceStatus status)
{
	this->status = status;
}

std::string
AdAccountsAudience::getType()
{
	return type;
}

void
AdAccountsAudience::setType(std::string type)
{
	this->type = type;
}

int
AdAccountsAudience::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
AdAccountsAudience::setUpdatedTimestamp(int updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
}



