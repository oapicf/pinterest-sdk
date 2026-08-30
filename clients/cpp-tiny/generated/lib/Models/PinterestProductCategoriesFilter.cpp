

#include "PinterestProductCategoriesFilter.h"

using namespace Tiny;

PinterestProductCategoriesFilter::PinterestProductCategoriesFilter()
{
	pINTEREST_PRODUCT_CATEGORIES = CatalogsProductGroupMultiplePinterestProductCategoryCriteria();
}

PinterestProductCategoriesFilter::PinterestProductCategoriesFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinterestProductCategoriesFilter::~PinterestProductCategoriesFilter()
{

}

void
PinterestProductCategoriesFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pINTEREST_PRODUCT_CATEGORIESKey = "PINTEREST_PRODUCT_CATEGORIES";

    if(object.has_key(pINTEREST_PRODUCT_CATEGORIESKey))
    {
        bourne::json value = object[pINTEREST_PRODUCT_CATEGORIESKey];




        CatalogsProductGroupMultiplePinterestProductCategoryCriteria* obj = &pINTEREST_PRODUCT_CATEGORIES;
		obj->fromJson(value.dump());

    }


}

bourne::json
PinterestProductCategoriesFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pINTEREST_PRODUCT_CATEGORIES"] = getPINTERESTPRODUCTCATEGORIES().toJson();


    return object;

}

CatalogsProductGroupMultiplePinterestProductCategoryCriteria
PinterestProductCategoriesFilter::getPINTERESTPRODUCTCATEGORIES()
{
	return pINTEREST_PRODUCT_CATEGORIES;
}

void
PinterestProductCategoriesFilter::setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria pINTEREST_PRODUCT_CATEGORIES)
{
	this->pINTEREST_PRODUCT_CATEGORIES = pINTEREST_PRODUCT_CATEGORIES;
}



