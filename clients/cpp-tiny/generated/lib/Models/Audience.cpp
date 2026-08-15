

#include "Audience.h"

using namespace Tiny;

Audience::Audience()
{
	ad_account_id = std::string();
	audience_type = std::string();
	created_by_company_name = std::string();
	created_timestamp = int(0);
	description = std::string();
	id = std::string();
	name = std::string();
	rule = AudienceRule();
	size = int(0);
	status = std::string();
	type = std::string();
	updated_timestamp = int(0);
}

Audience::Audience(std::string jsonString)
{
	this->fromJson(jsonString);
}

Audience::~Audience()
{

}

void
Audience::fromJson(std::string jsonObj)
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



        jsonToValue(&audience_type, value, "std::string");


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



        jsonToValue(&status, value, "std::string");


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
Audience::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["audience_type"] = getAudienceType();






    object["created_by_company_name"] = getCreatedByCompanyName();






    object["created_timestamp"] = getCreatedTimestamp();






    object["description"] = getDescription();






    object["id"] = getId();






    object["name"] = getName();







	object["rule"] = getRule().toJson();





    object["size"] = getSize();






    object["status"] = getStatus();






    object["type"] = getType();






    object["updated_timestamp"] = getUpdatedTimestamp();



    return object;

}

std::string
Audience::getAdAccountId()
{
	return ad_account_id;
}

void
Audience::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
Audience::getAudienceType()
{
	return audience_type;
}

void
Audience::setAudienceType(std::string  audience_type)
{
	this->audience_type = audience_type;
}

std::string
Audience::getCreatedByCompanyName()
{
	return created_by_company_name;
}

void
Audience::setCreatedByCompanyName(std::string  created_by_company_name)
{
	this->created_by_company_name = created_by_company_name;
}

int
Audience::getCreatedTimestamp()
{
	return created_timestamp;
}

void
Audience::setCreatedTimestamp(int  created_timestamp)
{
	this->created_timestamp = created_timestamp;
}

std::string
Audience::getDescription()
{
	return description;
}

void
Audience::setDescription(std::string  description)
{
	this->description = description;
}

std::string
Audience::getId()
{
	return id;
}

void
Audience::setId(std::string  id)
{
	this->id = id;
}

std::string
Audience::getName()
{
	return name;
}

void
Audience::setName(std::string  name)
{
	this->name = name;
}

AudienceRule
Audience::getRule()
{
	return rule;
}

void
Audience::setRule(AudienceRule  rule)
{
	this->rule = rule;
}

int
Audience::getSize()
{
	return size;
}

void
Audience::setSize(int  size)
{
	this->size = size;
}

std::string
Audience::getStatus()
{
	return status;
}

void
Audience::setStatus(std::string  status)
{
	this->status = status;
}

std::string
Audience::getType()
{
	return type;
}

void
Audience::setType(std::string  type)
{
	this->type = type;
}

int
Audience::getUpdatedTimestamp()
{
	return updated_timestamp;
}

void
Audience::setUpdatedTimestamp(int  updated_timestamp)
{
	this->updated_timestamp = updated_timestamp;
}



