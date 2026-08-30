

#include "SSIOInsertionOrder.h"

using namespace Tiny;

SSIOInsertionOrder::SSIOInsertionOrder()
{
	pin_order_id = std::string();
}

SSIOInsertionOrder::SSIOInsertionOrder(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOInsertionOrder::~SSIOInsertionOrder()
{

}

void
SSIOInsertionOrder::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pin_order_idKey = "pin_order_id";

    if(object.has_key(pin_order_idKey))
    {
        bourne::json value = object[pin_order_idKey];



        jsonToValue(&pin_order_id, value, "std::string");


    }


}

bourne::json
SSIOInsertionOrder::toJson()
{
    bourne::json object = bourne::json::object();





    object["pin_order_id"] = getPinOrderId();



    return object;

}

std::string
SSIOInsertionOrder::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOInsertionOrder::setPinOrderId(std::string pin_order_id)
{
	this->pin_order_id = pin_order_id;
}



