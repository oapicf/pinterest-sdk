

#include "ProductType3Filter.h"

using namespace Tiny;

ProductType3Filter::ProductType3Filter()
{
	pRODUCT_TYPE_3 = CatalogsProductGroupMultipleStringListCriteria();
}

ProductType3Filter::ProductType3Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductType3Filter::~ProductType3Filter()
{

}

void
ProductType3Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_TYPE_3Key = "PRODUCT_TYPE_3";

    if(object.has_key(pRODUCT_TYPE_3Key))
    {
        bourne::json value = object[pRODUCT_TYPE_3Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_3;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductType3Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_TYPE_3"] = getPRODUCTTYPE3().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
ProductType3Filter::getPRODUCTTYPE3()
{
	return pRODUCT_TYPE_3;
}

void
ProductType3Filter::setPRODUCTTYPE3(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_3)
{
	this->pRODUCT_TYPE_3 = pRODUCT_TYPE_3;
}



