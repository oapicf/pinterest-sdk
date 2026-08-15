

#include "GoogleProductCategory6Filter.h"

using namespace Tiny;

GoogleProductCategory6Filter::GoogleProductCategory6Filter()
{
	gOOGLE_PRODUCT_CATEGORY_6 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory6Filter::GoogleProductCategory6Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory6Filter::~GoogleProductCategory6Filter()
{

}

void
GoogleProductCategory6Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_6Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_6Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_6;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory6Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_6"] = getGOOGLEPRODUCTCATEGORY6().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory6Filter::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
GoogleProductCategory6Filter::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}



