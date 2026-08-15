

#include "CatalogsFeedProcessingResult.h"

using namespace Tiny;

CatalogsFeedProcessingResult::CatalogsFeedProcessingResult()
{
	created_at = std::string();
	id = std::string();
	updated_at = std::string();
	ingestion_details = CatalogsFeedIngestionDetails();
	product_counts = CatalogsFeedProductCounts();
	status = CatalogsFeedProcessingStatus();
	validation_details = CatalogsFeedValidationDetails();
	video_counts = CatalogsFeedVideoCounts();
}

CatalogsFeedProcessingResult::CatalogsFeedProcessingResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedProcessingResult::~CatalogsFeedProcessingResult()
{

}

void
CatalogsFeedProcessingResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "std::string");


    }

    const char *ingestion_detailsKey = "ingestion_details";

    if(object.has_key(ingestion_detailsKey))
    {
        bourne::json value = object[ingestion_detailsKey];




        CatalogsFeedIngestionDetails* obj = &ingestion_details;
		obj->fromJson(value.dump());

    }

    const char *product_countsKey = "product_counts";

    if(object.has_key(product_countsKey))
    {
        bourne::json value = object[product_countsKey];




        CatalogsFeedProductCounts* obj = &product_counts;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        CatalogsFeedProcessingStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *validation_detailsKey = "validation_details";

    if(object.has_key(validation_detailsKey))
    {
        bourne::json value = object[validation_detailsKey];




        CatalogsFeedValidationDetails* obj = &validation_details;
		obj->fromJson(value.dump());

    }

    const char *video_countsKey = "video_counts";

    if(object.has_key(video_countsKey))
    {
        bourne::json value = object[video_countsKey];




        CatalogsFeedVideoCounts* obj = &video_counts;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsFeedProcessingResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["created_at"] = getCreatedAt();






    object["id"] = getId();






    object["updated_at"] = getUpdatedAt();







	object["ingestion_details"] = getIngestionDetails().toJson();






	object["product_counts"] = getProductCounts().toJson();






	object["status"] = getStatus().toJson();






	object["validation_details"] = getValidationDetails().toJson();






	object["video_counts"] = getVideoCounts().toJson();


    return object;

}

std::string
CatalogsFeedProcessingResult::getCreatedAt()
{
	return created_at;
}

void
CatalogsFeedProcessingResult::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsFeedProcessingResult::getId()
{
	return id;
}

void
CatalogsFeedProcessingResult::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsFeedProcessingResult::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsFeedProcessingResult::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}

CatalogsFeedIngestionDetails
CatalogsFeedProcessingResult::getIngestionDetails()
{
	return ingestion_details;
}

void
CatalogsFeedProcessingResult::setIngestionDetails(CatalogsFeedIngestionDetails  ingestion_details)
{
	this->ingestion_details = ingestion_details;
}

CatalogsFeedProductCounts
CatalogsFeedProcessingResult::getProductCounts()
{
	return product_counts;
}

void
CatalogsFeedProcessingResult::setProductCounts(CatalogsFeedProductCounts  product_counts)
{
	this->product_counts = product_counts;
}

CatalogsFeedProcessingStatus
CatalogsFeedProcessingResult::getStatus()
{
	return status;
}

void
CatalogsFeedProcessingResult::setStatus(CatalogsFeedProcessingStatus  status)
{
	this->status = status;
}

CatalogsFeedValidationDetails
CatalogsFeedProcessingResult::getValidationDetails()
{
	return validation_details;
}

void
CatalogsFeedProcessingResult::setValidationDetails(CatalogsFeedValidationDetails  validation_details)
{
	this->validation_details = validation_details;
}

CatalogsFeedVideoCounts
CatalogsFeedProcessingResult::getVideoCounts()
{
	return video_counts;
}

void
CatalogsFeedProcessingResult::setVideoCounts(CatalogsFeedVideoCounts  video_counts)
{
	this->video_counts = video_counts;
}



