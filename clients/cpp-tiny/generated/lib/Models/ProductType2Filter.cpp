

#include "ProductType2Filter.h"

using namespace Tiny;

ProductType2Filter::ProductType2Filter()
{
	pRODUCT_TYPE_2 = CatalogsProductGroupMultipleStringListCriteria();
}

ProductType2Filter::ProductType2Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductType2Filter::~ProductType2Filter()
{

}

void
ProductType2Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_TYPE_2Key = "PRODUCT_TYPE_2";

    if(object.has_key(pRODUCT_TYPE_2Key))
    {
        bourne::json value = object[pRODUCT_TYPE_2Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_2;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductType2Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_TYPE_2"] = getPRODUCTTYPE2().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
ProductType2Filter::getPRODUCTTYPE2()
{
	return pRODUCT_TYPE_2;
}

void
ProductType2Filter::setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria  pRODUCT_TYPE_2)
{
	this->pRODUCT_TYPE_2 = pRODUCT_TYPE_2;
}



