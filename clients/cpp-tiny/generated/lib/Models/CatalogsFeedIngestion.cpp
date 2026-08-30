

#include "CatalogsFeedIngestion.h"

using namespace Tiny;

CatalogsFeedIngestion::CatalogsFeedIngestion()
{
	created_at = std::string();
	feed_id = std::string();
	id = std::string();
	status = null;
}

CatalogsFeedIngestion::CatalogsFeedIngestion(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedIngestion::~CatalogsFeedIngestion()
{

}

void
CatalogsFeedIngestion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


    }

    const char *feed_idKey = "feed_id";

    if(object.has_key(feed_idKey))
    {
        bourne::json value = object[feed_idKey];



        jsonToValue(&feed_id, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        CatalogsFeedProcessingStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsFeedIngestion::toJson()
{
    bourne::json object = bourne::json::object();





    object["created_at"] = getCreatedAt();






    object["feed_id"] = getFeedId();






    object["id"] = getId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
CatalogsFeedIngestion::getCreatedAt()
{
	return created_at;
}

void
CatalogsFeedIngestion::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsFeedIngestion::getFeedId()
{
	return feed_id;
}

void
CatalogsFeedIngestion::setFeedId(std::string feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsFeedIngestion::getId()
{
	return id;
}

void
CatalogsFeedIngestion::setId(std::string id)
{
	this->id = id;
}

CatalogsFeedProcessingStatus
CatalogsFeedIngestion::getStatus()
{
	return status;
}

void
CatalogsFeedIngestion::setStatus(CatalogsFeedProcessingStatus status)
{
	this->status = status;
}



