

#include "CatalogsRetailBatchRequest_items_inner.h"

using namespace Tiny;

CatalogsRetailBatchRequest_items_inner::CatalogsRetailBatchRequest_items_inner()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
	operation = std::string();
	update_mask = std::list<UpdateMaskFieldType>();
	last_updated_time = long(0);
}

CatalogsRetailBatchRequest_items_inner::CatalogsRetailBatchRequest_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailBatchRequest_items_inner::~CatalogsRetailBatchRequest_items_inner()
{

}

void
CatalogsRetailBatchRequest_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        ItemAttributesRequest* obj = &attributes;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }

    const char *update_maskKey = "update_mask";

    if(object.has_key(update_maskKey))
    {
        bourne::json value = object[update_maskKey];


        std::list<UpdateMaskFieldType> update_mask_list;
        UpdateMaskFieldType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            update_mask_list.push_back(element);
        }
        update_mask = update_mask_list;


    }

    const char *last_updated_timeKey = "last_updated_time";

    if(object.has_key(last_updated_timeKey))
    {
        bourne::json value = object[last_updated_timeKey];



        jsonToValue(&last_updated_time, value, "long");


    }


}

bourne::json
CatalogsRetailBatchRequest_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();






    object["operation"] = getOperation();





    std::list<UpdateMaskFieldType> update_mask_list = getUpdateMask();
    bourne::json update_mask_arr = bourne::json::array();

    for(auto& var : update_mask_list)
    {
        UpdateMaskFieldType obj = var;
        update_mask_arr.append(obj.toJson());
    }
    object["update_mask"] = update_mask_arr;







    object["last_updated_time"] = getLastUpdatedTime();



    return object;

}

ItemAttributesRequest
CatalogsRetailBatchRequest_items_inner::getAttributes()
{
	return attributes;
}

void
CatalogsRetailBatchRequest_items_inner::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsRetailBatchRequest_items_inner::getItemId()
{
	return item_id;
}

void
CatalogsRetailBatchRequest_items_inner::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

std::string
CatalogsRetailBatchRequest_items_inner::getOperation()
{
	return operation;
}

void
CatalogsRetailBatchRequest_items_inner::setOperation(std::string  operation)
{
	this->operation = operation;
}

std::list<UpdateMaskFieldType>
CatalogsRetailBatchRequest_items_inner::getUpdateMask()
{
	return update_mask;
}

void
CatalogsRetailBatchRequest_items_inner::setUpdateMask(std::list <UpdateMaskFieldType> update_mask)
{
	this->update_mask = update_mask;
}

long
CatalogsRetailBatchRequest_items_inner::getLastUpdatedTime()
{
	return last_updated_time;
}

void
CatalogsRetailBatchRequest_items_inner::setLastUpdatedTime(long  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}



