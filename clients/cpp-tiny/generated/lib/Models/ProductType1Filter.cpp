

#include "ProductType1Filter.h"

using namespace Tiny;

ProductType1Filter::ProductType1Filter()
{
	pRODUCT_TYPE_1 = CatalogsProductGroupMultipleStringListCriteria();
}

ProductType1Filter::ProductType1Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductType1Filter::~ProductType1Filter()
{

}

void
ProductType1Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_TYPE_1Key = "PRODUCT_TYPE_1";

    if(object.has_key(pRODUCT_TYPE_1Key))
    {
        bourne::json value = object[pRODUCT_TYPE_1Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_1;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductType1Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_TYPE_1"] = getPRODUCTTYPE1().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
ProductType1Filter::getPRODUCTTYPE1()
{
	return pRODUCT_TYPE_1;
}

void
ProductType1Filter::setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_1)
{
	this->pRODUCT_TYPE_1 = pRODUCT_TYPE_1;
}



