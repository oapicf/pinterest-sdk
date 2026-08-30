

#include "GoogleProductCategory1Filter.h"

using namespace Tiny;

GoogleProductCategory1Filter::GoogleProductCategory1Filter()
{
	gOOGLE_PRODUCT_CATEGORY_1 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory1Filter::GoogleProductCategory1Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory1Filter::~GoogleProductCategory1Filter()
{

}

void
GoogleProductCategory1Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_1Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_1Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_1;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory1Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_1"] = getGOOGLEPRODUCTCATEGORY1().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory1Filter::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
GoogleProductCategory1Filter::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}



