

#include "CatalogsRetailProduct.h"

using namespace Tiny;

CatalogsRetailProduct::CatalogsRetailProduct()
{
	catalog_type = std::string();
	metadata = CatalogsRetailProductMetadata();
	pin = Pin();
}

CatalogsRetailProduct::CatalogsRetailProduct(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailProduct::~CatalogsRetailProduct()
{

}

void
CatalogsRetailProduct::fromJson(std::string jsonObj)
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




        CatalogsRetailProductMetadata* obj = &metadata;
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
CatalogsRetailProduct::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["metadata"] = getMetadata().toJson();






	object["pin"] = getPin().toJson();


    return object;

}

std::string
CatalogsRetailProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailProduct::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsRetailProductMetadata
CatalogsRetailProduct::getMetadata()
{
	return metadata;
}

void
CatalogsRetailProduct::setMetadata(CatalogsRetailProductMetadata metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsRetailProduct::getPin()
{
	return pin;
}

void
CatalogsRetailProduct::setPin(Pin pin)
{
	this->pin = pin;
}



