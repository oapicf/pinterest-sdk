

#include "SSIOInsertionOrderStatusResponse.h"

using namespace Tiny;

SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse()
{
	creation_time = std::string();
	pin_order_id = std::string();
	status = std::string();
}

SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOInsertionOrderStatusResponse::~SSIOInsertionOrderStatusResponse()
{

}

void
SSIOInsertionOrderStatusResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creation_timeKey = "creation_time";

    if(object.has_key(creation_timeKey))
    {
        bourne::json value = object[creation_timeKey];



        jsonToValue(&creation_time, value, "std::string");


    }

    const char *pin_order_idKey = "pin_order_id";

    if(object.has_key(pin_order_idKey))
    {
        bourne::json value = object[pin_order_idKey];



        jsonToValue(&pin_order_id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
SSIOInsertionOrderStatusResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["creation_time"] = getCreationTime();






    object["pin_order_id"] = getPinOrderId();






    object["status"] = getStatus();



    return object;

}

std::string
SSIOInsertionOrderStatusResponse::getCreationTime()
{
	return creation_time;
}

void
SSIOInsertionOrderStatusResponse::setCreationTime(std::string  creation_time)
{
	this->creation_time = creation_time;
}

std::string
SSIOInsertionOrderStatusResponse::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOInsertionOrderStatusResponse::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}

std::string
SSIOInsertionOrderStatusResponse::getStatus()
{
	return status;
}

void
SSIOInsertionOrderStatusResponse::setStatus(std::string  status)
{
	this->status = status;
}



