

#include "CatalogsUpdateHotelItem.h"

using namespace Tiny;

CatalogsUpdateHotelItem::CatalogsUpdateHotelItem()
{
	attributes = CatalogsUpdatableHotelAttributes();
	hotel_id = std::string();
	operation = std::string();
}

CatalogsUpdateHotelItem::CatalogsUpdateHotelItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpdateHotelItem::~CatalogsUpdateHotelItem()
{

}

void
CatalogsUpdateHotelItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsUpdatableHotelAttributes* obj = &attributes;
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
CatalogsUpdateHotelItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["hotel_id"] = getHotelId();






    object["operation"] = getOperation();



    return object;

}

CatalogsUpdatableHotelAttributes
CatalogsUpdateHotelItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpdateHotelItem::setAttributes(CatalogsUpdatableHotelAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpdateHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsUpdateHotelItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsUpdateHotelItem::getOperation()
{
	return operation;
}

void
CatalogsUpdateHotelItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



