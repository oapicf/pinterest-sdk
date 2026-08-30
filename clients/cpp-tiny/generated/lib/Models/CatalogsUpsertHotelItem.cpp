

#include "CatalogsUpsertHotelItem.h"

using namespace Tiny;

CatalogsUpsertHotelItem::CatalogsUpsertHotelItem()
{
	attributes = CatalogsHotelAttributes();
	hotel_id = std::string();
	operation = std::string();
}

CatalogsUpsertHotelItem::CatalogsUpsertHotelItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpsertHotelItem::~CatalogsUpsertHotelItem()
{

}

void
CatalogsUpsertHotelItem::fromJson(std::string jsonObj)
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
CatalogsUpsertHotelItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["hotel_id"] = getHotelId();






    object["operation"] = getOperation();



    return object;

}

CatalogsHotelAttributes
CatalogsUpsertHotelItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpsertHotelItem::setAttributes(CatalogsHotelAttributes attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpsertHotelItem::getHotelId()
{
	return hotel_id;
}

void
CatalogsUpsertHotelItem::setHotelId(std::string hotel_id)
{
	this->hotel_id = hotel_id;
}

std::string
CatalogsUpsertHotelItem::getOperation()
{
	return operation;
}

void
CatalogsUpsertHotelItem::setOperation(std::string operation)
{
	this->operation = operation;
}



