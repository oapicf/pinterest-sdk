

#include "ProductType0Filter.h"

using namespace Tiny;

ProductType0Filter::ProductType0Filter()
{
	pRODUCT_TYPE_0 = CatalogsProductGroupMultipleStringListCriteria();
}

ProductType0Filter::ProductType0Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductType0Filter::~ProductType0Filter()
{

}

void
ProductType0Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_TYPE_0Key = "PRODUCT_TYPE_0";

    if(object.has_key(pRODUCT_TYPE_0Key))
    {
        bourne::json value = object[pRODUCT_TYPE_0Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_0;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductType0Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_TYPE_0"] = getPRODUCTTYPE0().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
ProductType0Filter::getPRODUCTTYPE0()
{
	return pRODUCT_TYPE_0;
}

void
ProductType0Filter::setPRODUCTTYPE0(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_0)
{
	this->pRODUCT_TYPE_0 = pRODUCT_TYPE_0;
}



