

#include "GoogleProductCategory5Filter.h"

using namespace Tiny;

GoogleProductCategory5Filter::GoogleProductCategory5Filter()
{
	gOOGLE_PRODUCT_CATEGORY_5 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory5Filter::GoogleProductCategory5Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory5Filter::~GoogleProductCategory5Filter()
{

}

void
GoogleProductCategory5Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_5Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_5Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_5;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory5Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_5"] = getGOOGLEPRODUCTCATEGORY5().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory5Filter::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
GoogleProductCategory5Filter::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}



