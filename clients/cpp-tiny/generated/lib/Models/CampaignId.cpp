

#include "CampaignId.h"

using namespace Tiny;

CampaignId::CampaignId()
{
	id = std::string();
}

CampaignId::CampaignId(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignId::~CampaignId()
{

}

void
CampaignId::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
CampaignId::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();



    return object;

}

std::string
CampaignId::getId()
{
	return id;
}

void
CampaignId::setId(std::string  id)
{
	this->id = id;
}



