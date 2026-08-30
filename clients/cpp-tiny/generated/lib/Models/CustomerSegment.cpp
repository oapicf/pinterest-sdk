

#include "CustomerSegment.h"

using namespace Tiny;

CustomerSegment::CustomerSegment()
{
	ad_account_id = std::string();
	audience_ids = std::list<std::string>();
	created_time = int(0);
	id = std::string();
	name = std::string();
	status = null;
	updated_time = int(0);
}

CustomerSegment::CustomerSegment(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerSegment::~CustomerSegment()
{

}

void
CustomerSegment::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *audience_idsKey = "audience_ids";

    if(object.has_key(audience_idsKey))
    {
        bourne::json value = object[audience_idsKey];


        std::list<std::string> audience_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            audience_ids_list.push_back(element);
        }
        audience_ids = audience_ids_list;


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


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

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        TargetingTemplateStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
CustomerSegment::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();





    std::list<std::string> audience_ids_list = getAudienceIds();
    bourne::json audience_ids_arr = bourne::json::array();

    for(auto& var : audience_ids_list)
    {
        audience_ids_arr.append(var);
    }
    object["audience_ids"] = audience_ids_arr;









    object["created_time"] = getCreatedTime();






    object["id"] = getId();






    object["name"] = getName();







	object["status"] = getStatus().toJson();





    object["updated_time"] = getUpdatedTime();



    return object;

}

std::string
CustomerSegment::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerSegment::setAdAccountId(std::string ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
CustomerSegment::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegment::setAudienceIds(std::list<std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

int
CustomerSegment::getCreatedTime()
{
	return created_time;
}

void
CustomerSegment::setCreatedTime(int created_time)
{
	this->created_time = created_time;
}

std::string
CustomerSegment::getId()
{
	return id;
}

void
CustomerSegment::setId(std::string id)
{
	this->id = id;
}

std::string
CustomerSegment::getName()
{
	return name;
}

void
CustomerSegment::setName(std::string name)
{
	this->name = name;
}

TargetingTemplateStatus
CustomerSegment::getStatus()
{
	return status;
}

void
CustomerSegment::setStatus(TargetingTemplateStatus status)
{
	this->status = status;
}

int
CustomerSegment::getUpdatedTime()
{
	return updated_time;
}

void
CustomerSegment::setUpdatedTime(int updated_time)
{
	this->updated_time = updated_time;
}



