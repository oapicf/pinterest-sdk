

#include "SSIOCreateInsertionOrderResponse.h"

using namespace Tiny;

SSIOCreateInsertionOrderResponse::SSIOCreateInsertionOrderResponse()
{
	pin_order_id = std::string();
}

SSIOCreateInsertionOrderResponse::SSIOCreateInsertionOrderResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOCreateInsertionOrderResponse::~SSIOCreateInsertionOrderResponse()
{

}

void
SSIOCreateInsertionOrderResponse::fromJson(std::string jsonObj)
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
SSIOCreateInsertionOrderResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["pin_order_id"] = getPinOrderId();



    return object;

}

std::string
SSIOCreateInsertionOrderResponse::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOCreateInsertionOrderResponse::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}



