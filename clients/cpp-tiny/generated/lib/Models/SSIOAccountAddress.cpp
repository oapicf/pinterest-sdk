

#include "SSIOAccountAddress.h"

using namespace Tiny;

SSIOAccountAddress::SSIOAccountAddress()
{
	address_id = std::string();
	display = std::string();
	order_legal_entity = std::string();
	purpose = std::string();
}

SSIOAccountAddress::SSIOAccountAddress(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOAccountAddress::~SSIOAccountAddress()
{

}

void
SSIOAccountAddress::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *address_idKey = "address_id";

    if(object.has_key(address_idKey))
    {
        bourne::json value = object[address_idKey];



        jsonToValue(&address_id, value, "std::string");


    }

    const char *displayKey = "display";

    if(object.has_key(displayKey))
    {
        bourne::json value = object[displayKey];



        jsonToValue(&display, value, "std::string");


    }

    const char *order_legal_entityKey = "order_legal_entity";

    if(object.has_key(order_legal_entityKey))
    {
        bourne::json value = object[order_legal_entityKey];



        jsonToValue(&order_legal_entity, value, "std::string");


    }

    const char *purposeKey = "purpose";

    if(object.has_key(purposeKey))
    {
        bourne::json value = object[purposeKey];



        jsonToValue(&purpose, value, "std::string");


    }


}

bourne::json
SSIOAccountAddress::toJson()
{
    bourne::json object = bourne::json::object();





    object["address_id"] = getAddressId();






    object["display"] = getDisplay();






    object["order_legal_entity"] = getOrderLegalEntity();






    object["purpose"] = getPurpose();



    return object;

}

std::string
SSIOAccountAddress::getAddressId()
{
	return address_id;
}

void
SSIOAccountAddress::setAddressId(std::string address_id)
{
	this->address_id = address_id;
}

std::string
SSIOAccountAddress::getDisplay()
{
	return display;
}

void
SSIOAccountAddress::setDisplay(std::string display)
{
	this->display = display;
}

std::string
SSIOAccountAddress::getOrderLegalEntity()
{
	return order_legal_entity;
}

void
SSIOAccountAddress::setOrderLegalEntity(std::string order_legal_entity)
{
	this->order_legal_entity = order_legal_entity;
}

std::string
SSIOAccountAddress::getPurpose()
{
	return purpose;
}

void
SSIOAccountAddress::setPurpose(std::string purpose)
{
	this->purpose = purpose;
}



