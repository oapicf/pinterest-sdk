

#include "CatalogsRetailItemsBatch.h"

using namespace Tiny;

CatalogsRetailItemsBatch::CatalogsRetailItemsBatch()
{
	batch_id = std::string();
	catalog_type = CatalogsType();
	completed_time = std::string();
	created_time = std::string();
	items = std::list<ItemProcessingRecord>();
	status = BatchOperationStatus();
}

CatalogsRetailItemsBatch::CatalogsRetailItemsBatch(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailItemsBatch::~CatalogsRetailItemsBatch()
{

}

void
CatalogsRetailItemsBatch::fromJson(std::string jsonObj)
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




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

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


        std::list<ItemProcessingRecord> items_list;
        ItemProcessingRecord element;
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
CatalogsRetailItemsBatch::toJson()
{
    bourne::json object = bourne::json::object();





    object["batch_id"] = getBatchId();







	object["catalog_type"] = getCatalogType().toJson();





    object["completed_time"] = getCompletedTime();






    object["created_time"] = getCreatedTime();





    std::list<ItemProcessingRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemProcessingRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;








	object["status"] = getStatus().toJson();


    return object;

}

std::string
CatalogsRetailItemsBatch::getBatchId()
{
	return batch_id;
}

void
CatalogsRetailItemsBatch::setBatchId(std::string  batch_id)
{
	this->batch_id = batch_id;
}

CatalogsType
CatalogsRetailItemsBatch::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailItemsBatch::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailItemsBatch::getCompletedTime()
{
	return completed_time;
}

void
CatalogsRetailItemsBatch::setCompletedTime(std::string  completed_time)
{
	this->completed_time = completed_time;
}

std::string
CatalogsRetailItemsBatch::getCreatedTime()
{
	return created_time;
}

void
CatalogsRetailItemsBatch::setCreatedTime(std::string  created_time)
{
	this->created_time = created_time;
}

std::list<ItemProcessingRecord>
CatalogsRetailItemsBatch::getItems()
{
	return items;
}

void
CatalogsRetailItemsBatch::setItems(std::list <ItemProcessingRecord> items)
{
	this->items = items;
}

BatchOperationStatus
CatalogsRetailItemsBatch::getStatus()
{
	return status;
}

void
CatalogsRetailItemsBatch::setStatus(BatchOperationStatus  status)
{
	this->status = status;
}



