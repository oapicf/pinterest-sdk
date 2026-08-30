

#include "ProductTagItem.h"

using namespace Tiny;

ProductTagItem::ProductTagItem()
{
	pin_id = std::string();
}

ProductTagItem::ProductTagItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductTagItem::~ProductTagItem()
{

}

void
ProductTagItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pin_idKey = "pin_id";

    if(object.has_key(pin_idKey))
    {
        bourne::json value = object[pin_idKey];



        jsonToValue(&pin_id, value, "std::string");


    }


}

bourne::json
ProductTagItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["pin_id"] = getPinId();



    return object;

}

std::string
ProductTagItem::getPinId()
{
	return pin_id;
}

void
ProductTagItem::setPinId(std::string pin_id)
{
	this->pin_id = pin_id;
}



