

#include "ItemUpsertBatchRecord.h"

using namespace Tiny;

ItemUpsertBatchRecord::ItemUpsertBatchRecord()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
}

ItemUpsertBatchRecord::ItemUpsertBatchRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemUpsertBatchRecord::~ItemUpsertBatchRecord()
{

}

void
ItemUpsertBatchRecord::fromJson(std::string jsonObj)
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


}

bourne::json
ItemUpsertBatchRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();



    return object;

}

ItemAttributesRequest
ItemUpsertBatchRecord::getAttributes()
{
	return attributes;
}

void
ItemUpsertBatchRecord::setAttributes(ItemAttributesRequest  attributes)
{
	this->attributes = attributes;
}

std::string
ItemUpsertBatchRecord::getItemId()
{
	return item_id;
}

void
ItemUpsertBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



