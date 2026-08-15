

#include "CatalogsHotelProduct.h"

using namespace Tiny;

CatalogsHotelProduct::CatalogsHotelProduct()
{
	catalog_type = std::string();
	metadata = CatalogsHotelProductMetadata();
	pin = Pin();
}

CatalogsHotelProduct::CatalogsHotelProduct(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProduct::~CatalogsHotelProduct()
{

}

void
CatalogsHotelProduct::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        CatalogsHotelProductMetadata* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *pinKey = "pin";

    if(object.has_key(pinKey))
    {
        bourne::json value = object[pinKey];




        Pin* obj = &pin;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelProduct::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["metadata"] = getMetadata().toJson();






	object["pin"] = getPin().toJson();


    return object;

}

std::string
CatalogsHotelProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelProduct::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelProductMetadata
CatalogsHotelProduct::getMetadata()
{
	return metadata;
}

void
CatalogsHotelProduct::setMetadata(CatalogsHotelProductMetadata  metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsHotelProduct::getPin()
{
	return pin;
}

void
CatalogsHotelProduct::setPin(Pin  pin)
{
	this->pin = pin;
}



