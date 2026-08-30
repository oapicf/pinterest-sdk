

#include "GoogleProductCategory4Filter.h"

using namespace Tiny;

GoogleProductCategory4Filter::GoogleProductCategory4Filter()
{
	gOOGLE_PRODUCT_CATEGORY_4 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory4Filter::GoogleProductCategory4Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory4Filter::~GoogleProductCategory4Filter()
{

}

void
GoogleProductCategory4Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_4Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_4Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_4;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory4Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_4"] = getGOOGLEPRODUCTCATEGORY4().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory4Filter::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
GoogleProductCategory4Filter::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}



