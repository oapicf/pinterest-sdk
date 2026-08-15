

#include "CatalogsHotelProductMetadata.h"

using namespace Tiny;

CatalogsHotelProductMetadata::CatalogsHotelProductMetadata()
{
	hotel_id = std::string();
}

CatalogsHotelProductMetadata::CatalogsHotelProductMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductMetadata::~CatalogsHotelProductMetadata()
{

}

void
CatalogsHotelProductMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hotel_idKey = "hotel_id";

    if(object.has_key(hotel_idKey))
    {
        bourne::json value = object[hotel_idKey];



        jsonToValue(&hotel_id, value, "std::string");


    }


}

bourne::json
CatalogsHotelProductMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["hotel_id"] = getHotelId();



    return object;

}

std::string
CatalogsHotelProductMetadata::getHotelId()
{
	return hotel_id;
}

void
CatalogsHotelProductMetadata::setHotelId(std::string  hotel_id)
{
	this->hotel_id = hotel_id;
}



