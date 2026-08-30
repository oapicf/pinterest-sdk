

#include "BrandFilter.h"

using namespace Tiny;

BrandFilter::BrandFilter()
{
	bRAND = CatalogsProductGroupMultipleStringCriteria();
}

BrandFilter::BrandFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandFilter::~BrandFilter()
{

}

void
BrandFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bRANDKey = "BRAND";

    if(object.has_key(bRANDKey))
    {
        bourne::json value = object[bRANDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &bRAND;
		obj->fromJson(value.dump());

    }


}

bourne::json
BrandFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["bRAND"] = getBRAND().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
BrandFilter::getBRAND()
{
	return bRAND;
}

void
BrandFilter::setBRAND(CatalogsProductGroupMultipleStringCriteria bRAND)
{
	this->bRAND = bRAND;
}



