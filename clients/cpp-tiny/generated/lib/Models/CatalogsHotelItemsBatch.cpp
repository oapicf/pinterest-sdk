

#include "CatalogsHotelItemsBatch.h"

using namespace Tiny;

CatalogsHotelItemsBatch::CatalogsHotelItemsBatch()
{
	batch_id = std::string();
	catalog_type = CatalogsType();
	completed_time = std::string();
	created_time = std::string();
	items = std::list<HotelProcessingRecord>();
	status = BatchOperationStatus();
}

CatalogsHotelItemsBatch::CatalogsHotelItemsBatch(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelItemsBatch::~CatalogsHotelItemsBatch()
{

}

void
CatalogsHotelItemsBatch::fromJson(std::string jsonObj)
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


        std::list<HotelProcessingRecord> items_list;
        HotelProcessingRecord element;
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
CatalogsHotelItemsBatch::toJson()
{
    bourne::json object = bourne::json::object();





    object["batch_id"] = getBatchId();







	object["catalog_type"] = getCatalogType().toJson();





    object["completed_time"] = getCompletedTime();






    object["created_time"] = getCreatedTime();





    std::list<HotelProcessingRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        HotelProcessingRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;








	object["status"] = getStatus().toJson();


    return object;

}

std::string
CatalogsHotelItemsBatch::getBatchId()
{
	return batch_id;
}

void
CatalogsHotelItemsBatch::setBatchId(std::string  batch_id)
{
	this->batch_id = batch_id;
}

CatalogsType
CatalogsHotelItemsBatch::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelItemsBatch::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelItemsBatch::getCompletedTime()
{
	return completed_time;
}

void
CatalogsHotelItemsBatch::setCompletedTime(std::string  completed_time)
{
	this->completed_time = completed_time;
}

std::string
CatalogsHotelItemsBatch::getCreatedTime()
{
	return created_time;
}

void
CatalogsHotelItemsBatch::setCreatedTime(std::string  created_time)
{
	this->created_time = created_time;
}

std::list<HotelProcessingRecord>
CatalogsHotelItemsBatch::getItems()
{
	return items;
}

void
CatalogsHotelItemsBatch::setItems(std::list <HotelProcessingRecord> items)
{
	this->items = items;
}

BatchOperationStatus
CatalogsHotelItemsBatch::getStatus()
{
	return status;
}

void
CatalogsHotelItemsBatch::setStatus(BatchOperationStatus  status)
{
	this->status = status;
}



