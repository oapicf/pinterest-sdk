

#include "SSIOInsertionOrderStatus.h"

using namespace Tiny;

SSIOInsertionOrderStatus::SSIOInsertionOrderStatus()
{
	creation_time = std::string();
	pin_order_id = std::string();
	status = std::string();
}

SSIOInsertionOrderStatus::SSIOInsertionOrderStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOInsertionOrderStatus::~SSIOInsertionOrderStatus()
{

}

void
SSIOInsertionOrderStatus::fromJson(std::string jsonObj)
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
SSIOInsertionOrderStatus::toJson()
{
    bourne::json object = bourne::json::object();





    object["creation_time"] = getCreationTime();






    object["pin_order_id"] = getPinOrderId();






    object["status"] = getStatus();



    return object;

}

std::string
SSIOInsertionOrderStatus::getCreationTime()
{
	return creation_time;
}

void
SSIOInsertionOrderStatus::setCreationTime(std::string  creation_time)
{
	this->creation_time = creation_time;
}

std::string
SSIOInsertionOrderStatus::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOInsertionOrderStatus::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}

std::string
SSIOInsertionOrderStatus::getStatus()
{
	return status;
}

void
SSIOInsertionOrderStatus::setStatus(std::string  status)
{
	this->status = status;
}



