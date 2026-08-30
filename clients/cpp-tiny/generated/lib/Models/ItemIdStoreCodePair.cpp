

#include "ItemIdStoreCodePair.h"

using namespace Tiny;

ItemIdStoreCodePair::ItemIdStoreCodePair()
{
	item_id = std::string();
	store_code = std::string();
}

ItemIdStoreCodePair::ItemIdStoreCodePair(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemIdStoreCodePair::~ItemIdStoreCodePair()
{

}

void
ItemIdStoreCodePair::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *store_codeKey = "store_code";

    if(object.has_key(store_codeKey))
    {
        bourne::json value = object[store_codeKey];



        jsonToValue(&store_code, value, "std::string");


    }


}

bourne::json
ItemIdStoreCodePair::toJson()
{
    bourne::json object = bourne::json::object();





    object["item_id"] = getItemId();






    object["store_code"] = getStoreCode();



    return object;

}

std::string
ItemIdStoreCodePair::getItemId()
{
	return item_id;
}

void
ItemIdStoreCodePair::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

std::string
ItemIdStoreCodePair::getStoreCode()
{
	return store_code;
}

void
ItemIdStoreCodePair::setStoreCode(std::string store_code)
{
	this->store_code = store_code;
}



