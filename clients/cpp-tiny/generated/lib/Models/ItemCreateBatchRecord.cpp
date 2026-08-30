

#include "ItemCreateBatchRecord.h"

using namespace Tiny;

ItemCreateBatchRecord::ItemCreateBatchRecord()
{
	attributes = ItemAttributesRequest();
	item_id = std::string();
}

ItemCreateBatchRecord::ItemCreateBatchRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemCreateBatchRecord::~ItemCreateBatchRecord()
{

}

void
ItemCreateBatchRecord::fromJson(std::string jsonObj)
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
ItemCreateBatchRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["item_id"] = getItemId();



    return object;

}

ItemAttributesRequest
ItemCreateBatchRecord::getAttributes()
{
	return attributes;
}

void
ItemCreateBatchRecord::setAttributes(ItemAttributesRequest attributes)
{
	this->attributes = attributes;
}

std::string
ItemCreateBatchRecord::getItemId()
{
	return item_id;
}

void
ItemCreateBatchRecord::setItemId(std::string item_id)
{
	this->item_id = item_id;
}



