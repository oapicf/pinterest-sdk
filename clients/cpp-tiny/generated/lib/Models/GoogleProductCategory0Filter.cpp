

#include "GoogleProductCategory0Filter.h"

using namespace Tiny;

GoogleProductCategory0Filter::GoogleProductCategory0Filter()
{
	gOOGLE_PRODUCT_CATEGORY_0 = CatalogsProductGroupMultipleStringListCriteria();
}

GoogleProductCategory0Filter::GoogleProductCategory0Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GoogleProductCategory0Filter::~GoogleProductCategory0Filter()
{

}

void
GoogleProductCategory0Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";

    if(object.has_key(gOOGLE_PRODUCT_CATEGORY_0Key))
    {
        bourne::json value = object[gOOGLE_PRODUCT_CATEGORY_0Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &gOOGLE_PRODUCT_CATEGORY_0;
		obj->fromJson(value.dump());

    }


}

bourne::json
GoogleProductCategory0Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gOOGLE_PRODUCT_CATEGORY_0"] = getGOOGLEPRODUCTCATEGORY0().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
GoogleProductCategory0Filter::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
GoogleProductCategory0Filter::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}



