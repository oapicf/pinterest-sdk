

#include "ItemDeleteBatchRecord.h"

using namespace Tiny;

ItemDeleteBatchRecord::ItemDeleteBatchRecord()
{
	item_id = std::string();
}

ItemDeleteBatchRecord::ItemDeleteBatchRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDeleteBatchRecord::~ItemDeleteBatchRecord()
{

}

void
ItemDeleteBatchRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }


}

bourne::json
ItemDeleteBatchRecord::toJson()
{
    bourne::json object = bourne::json::object();





    object["item_id"] = getItemId();



    return object;

}

std::string
ItemDeleteBatchRecord::getItemId()
{
	return item_id;
}

void
ItemDeleteBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



