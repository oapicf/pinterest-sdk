

#include "ProductType4Filter.h"

using namespace Tiny;

ProductType4Filter::ProductType4Filter()
{
	pRODUCT_TYPE_4 = CatalogsProductGroupMultipleStringListCriteria();
}

ProductType4Filter::ProductType4Filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductType4Filter::~ProductType4Filter()
{

}

void
ProductType4Filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_TYPE_4Key = "PRODUCT_TYPE_4";

    if(object.has_key(pRODUCT_TYPE_4Key))
    {
        bourne::json value = object[pRODUCT_TYPE_4Key];




        CatalogsProductGroupMultipleStringListCriteria* obj = &pRODUCT_TYPE_4;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductType4Filter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_TYPE_4"] = getPRODUCTTYPE4().toJson();


    return object;

}

CatalogsProductGroupMultipleStringListCriteria
ProductType4Filter::getPRODUCTTYPE4()
{
	return pRODUCT_TYPE_4;
}

void
ProductType4Filter::setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria pRODUCT_TYPE_4)
{
	this->pRODUCT_TYPE_4 = pRODUCT_TYPE_4;
}



