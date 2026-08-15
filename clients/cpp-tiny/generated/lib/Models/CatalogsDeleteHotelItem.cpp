

#include "CatalogsDeleteHotelItem.h"

using namespace Tiny;

CatalogsDeleteHotelItem::CatalogsDeleteHotelItem()
{
	hotel_id = std::string();
	operation = std::string();
}

CatalogsDeleteHotelItem::CatalogsDeleteHotelItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsDeleteHotelItem::~CatalogsDeleteHotelItem()
{

}

void
CatalogsDeleteHotelItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
CatalogsDeleteHotelItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["hotel_id"] = getHotelId();






    object["operation"] = getOperation();



    return object;

}

std::string
CatalogsDeleteHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsDeleteHotelItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsDeleteHotelItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteHotelItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



