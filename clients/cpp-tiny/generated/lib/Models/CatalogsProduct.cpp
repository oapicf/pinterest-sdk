

#include "CatalogsProduct.h"

using namespace Tiny;

CatalogsProduct::CatalogsProduct()
{
	catalog_type = CatalogsType();
	metadata = CatalogsCreativeAssetsProductMetadata();
	pin = Pin();
}

CatalogsProduct::CatalogsProduct(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProduct::~CatalogsProduct()
{

}

void
CatalogsProduct::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        CatalogsCreativeAssetsProductMetadata* obj = &metadata;
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
CatalogsProduct::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["metadata"] = getMetadata().toJson();






	object["pin"] = getPin().toJson();


    return object;

}

CatalogsType
CatalogsProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsProduct::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsProductMetadata
CatalogsProduct::getMetadata()
{
	return metadata;
}

void
CatalogsProduct::setMetadata(CatalogsCreativeAssetsProductMetadata  metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsProduct::getPin()
{
	return pin;
}

void
CatalogsProduct::setPin(Pin  pin)
{
	this->pin = pin;
}



