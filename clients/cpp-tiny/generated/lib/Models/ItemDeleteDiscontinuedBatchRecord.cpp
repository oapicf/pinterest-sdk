

#include "ItemDeleteDiscontinuedBatchRecord.h"

using namespace Tiny;

ItemDeleteDiscontinuedBatchRecord::ItemDeleteDiscontinuedBatchRecord()
{
	item_id = std::string();
}

ItemDeleteDiscontinuedBatchRecord::ItemDeleteDiscontinuedBatchRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDeleteDiscontinuedBatchRecord::~ItemDeleteDiscontinuedBatchRecord()
{

}

void
ItemDeleteDiscontinuedBatchRecord::fromJson(std::string jsonObj)
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
ItemDeleteDiscontinuedBatchRecord::toJson()
{
    bourne::json object = bourne::json::object();





    object["item_id"] = getItemId();



    return object;

}

std::string
ItemDeleteDiscontinuedBatchRecord::getItemId()
{
	return item_id;
}

void
ItemDeleteDiscontinuedBatchRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}



