

#include "CatalogsCreateHotelItem.h"

using namespace Tiny;

CatalogsCreateHotelItem::CatalogsCreateHotelItem()
{
	attributes = CatalogsHotelAttributes();
	hotel_id = std::string();
	operation = std::string();
}

CatalogsCreateHotelItem::CatalogsCreateHotelItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreateHotelItem::~CatalogsCreateHotelItem()
{

}

void
CatalogsCreateHotelItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsHotelAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

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
CatalogsCreateHotelItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["hotel_id"] = getHotelId();






    object["operation"] = getOperation();



    return object;

}

CatalogsHotelAttributes
CatalogsCreateHotelItem::getAttributes()
{
	return attributes;
}

void
CatalogsCreateHotelItem::setAttributes(CatalogsHotelAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsCreateHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsCreateHotelItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsCreateHotelItem::getOperation()
{
	return operation;
}

void
CatalogsCreateHotelItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



