

#include "CatalogsHotelBatchItem.h"

using namespace Tiny;

CatalogsHotelBatchItem::CatalogsHotelBatchItem()
{
	attributes = CatalogsUpdatableHotelAttributes();
	hotel_id = std::string();
	operation = std::string();
}

CatalogsHotelBatchItem::CatalogsHotelBatchItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelBatchItem::~CatalogsHotelBatchItem()
{

}

void
CatalogsHotelBatchItem::fromJson(std::string jsonObj)
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
CatalogsHotelBatchItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["hotel_id"] = getHotelId();






    object["operation"] = getOperation();



    return object;

}

CatalogsUpdatableHotelAttributes
CatalogsHotelBatchItem::getAttributes()
{
	return attributes;
}

void
CatalogsHotelBatchItem::setAttributes(CatalogsUpdatableHotelAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsHotelBatchItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsHotelBatchItem::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsHotelBatchItem::getOperation()
{
	return operation;
}

void
CatalogsHotelBatchItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



