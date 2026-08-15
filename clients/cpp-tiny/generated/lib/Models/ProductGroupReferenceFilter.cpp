

#include "ProductGroupReferenceFilter.h"

using namespace Tiny;

ProductGroupReferenceFilter::ProductGroupReferenceFilter()
{
	pRODUCT_GROUP = CatalogsProductGroupMultipleStringCriteria();
}

ProductGroupReferenceFilter::ProductGroupReferenceFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupReferenceFilter::~ProductGroupReferenceFilter()
{

}

void
ProductGroupReferenceFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRODUCT_GROUPKey = "PRODUCT_GROUP";

    if(object.has_key(pRODUCT_GROUPKey))
    {
        bourne::json value = object[pRODUCT_GROUPKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &pRODUCT_GROUP;
		obj->fromJson(value.dump());

    }


}

bourne::json
ProductGroupReferenceFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRODUCT_GROUP"] = getPRODUCTGROUP().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
ProductGroupReferenceFilter::getPRODUCTGROUP()
{
	return pRODUCT_GROUP;
}

void
ProductGroupReferenceFilter::setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria  pRODUCT_GROUP)
{
	this->pRODUCT_GROUP = pRODUCT_GROUP;
}



