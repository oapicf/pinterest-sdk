

#include "CatalogsCreativeAssetsItemsBatch.h"

using namespace Tiny;

CatalogsCreativeAssetsItemsBatch::CatalogsCreativeAssetsItemsBatch()
{
	batch_id = null;
	catalog_type = std::string();
	completed_time = std::string();
	created_time = std::string();
	items = std::list<CreativeAssetsProcessingRecord>();
	status = BatchOperationStatus();
}

CatalogsCreativeAssetsItemsBatch::CatalogsCreativeAssetsItemsBatch(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsItemsBatch::~CatalogsCreativeAssetsItemsBatch()
{

}

void
CatalogsCreativeAssetsItemsBatch::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *batch_idKey = "batch_id";

    if(object.has_key(batch_idKey))
    {
        bourne::json value = object[batch_idKey];



        jsonToValue(&batch_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *completed_timeKey = "completed_time";

    if(object.has_key(completed_timeKey))
    {
        bourne::json value = object[completed_timeKey];



        jsonToValue(&completed_time, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "std::string");


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CreativeAssetsProcessingRecord> items_list;
        CreativeAssetsProcessingRecord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        BatchOperationStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsCreativeAssetsItemsBatch::toJson()
{
    bourne::json object = bourne::json::object();





    object["batch_id"] = getBatchId();






    object["catalog_type"] = getCatalogType();






    object["completed_time"] = getCompletedTime();






    object["created_time"] = getCreatedTime();





    std::list<CreativeAssetsProcessingRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CreativeAssetsProcessingRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;








	object["status"] = getStatus().toJson();


    return object;

}

std::string
CatalogsCreativeAssetsItemsBatch::getBatchId()
{
	return batch_id;
}

void
CatalogsCreativeAssetsItemsBatch::setBatchId(std::string batch_id)
{
	this->batch_id = batch_id;
}

std::string
CatalogsCreativeAssetsItemsBatch::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsItemsBatch::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsCreativeAssetsItemsBatch::getCompletedTime()
{
	return completed_time;
}

void
CatalogsCreativeAssetsItemsBatch::setCompletedTime(std::string completed_time)
{
	this->completed_time = completed_time;
}

std::string
CatalogsCreativeAssetsItemsBatch::getCreatedTime()
{
	return created_time;
}

void
CatalogsCreativeAssetsItemsBatch::setCreatedTime(std::string created_time)
{
	this->created_time = created_time;
}

std::list<CreativeAssetsProcessingRecord>
CatalogsCreativeAssetsItemsBatch::getItems()
{
	return items;
}

void
CatalogsCreativeAssetsItemsBatch::setItems(std::list<CreativeAssetsProcessingRecord> items)
{
	this->items = items;
}

BatchOperationStatus
CatalogsCreativeAssetsItemsBatch::getStatus()
{
	return status;
}

void
CatalogsCreativeAssetsItemsBatch::setStatus(BatchOperationStatus status)
{
	this->status = status;
}



