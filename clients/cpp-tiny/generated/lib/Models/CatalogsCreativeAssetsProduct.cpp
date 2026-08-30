

#include "CatalogsCreativeAssetsProduct.h"

using namespace Tiny;

CatalogsCreativeAssetsProduct::CatalogsCreativeAssetsProduct()
{
	catalog_type = std::string();
	metadata = CatalogsCreativeAssetsProductMetadata();
	pin = Pin();
}

CatalogsCreativeAssetsProduct::CatalogsCreativeAssetsProduct(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProduct::~CatalogsCreativeAssetsProduct()
{

}

void
CatalogsCreativeAssetsProduct::fromJson(std::string jsonObj)
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
CatalogsCreativeAssetsProduct::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







	object["metadata"] = getMetadata().toJson();






	object["pin"] = getPin().toJson();


    return object;

}

std::string
CatalogsCreativeAssetsProduct::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsProduct::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsCreativeAssetsProductMetadata
CatalogsCreativeAssetsProduct::getMetadata()
{
	return metadata;
}

void
CatalogsCreativeAssetsProduct::setMetadata(CatalogsCreativeAssetsProductMetadata metadata)
{
	this->metadata = metadata;
}

Pin
CatalogsCreativeAssetsProduct::getPin()
{
	return pin;
}

void
CatalogsCreativeAssetsProduct::setPin(Pin pin)
{
	this->pin = pin;
}



