

#include "GoogleProductCategory2Filter.h"

using namespace Tiny;

GoogleProductCategory2Filter::GoogleProductCategory2Filter()
{
	gOOGLE_PRODUCT_CATEGORY_2 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory2Filter::GoogleProductCategory2Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory2Filter::~GoogleProductCategory2Filter()
{

}

void
GoogleProductCategory2Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_2Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_2Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_2;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory2Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_2"] = getGOOGLEPRODUCTCATEGORY2().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory2Filter::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
GoogleProductCategory2Filter::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}



