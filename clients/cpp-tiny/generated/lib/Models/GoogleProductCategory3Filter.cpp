

#include "GoogleProductCategory3Filter.h"

using namespace Tiny;

GoogleProductCategory3Filter::GoogleProductCategory3Filter()
{
	gOOGLE_PRODUCT_CATEGORY_3 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory3Filter::GoogleProductCategory3Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory3Filter::~GoogleProductCategory3Filter()
{

}

void
GoogleProductCategory3Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_3Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_3Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_3;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory3Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_3"] = getGOOGLEPRODUCTCATEGORY3().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory3Filter::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
GoogleProductCategory3Filter::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}



