

#include "MinPriceFilter.h"

using namespace Tiny;

MinPriceFilter::MinPriceFilter()
{
	mIN_PRICE = CatalogsProductGroupPricingCriteria();
}

MinPriceFilter::MinPriceFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

MinPriceFilter::~MinPriceFilter()
{

}

void
MinPriceFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mIN_PRICEKey = "MIN_PRICE";

    if(object.has_key(mIN_PRICEKey))
    {
        bourne::json value = object[mIN_PRICEKey];




        CatalogsProductGroupPricingCriteria* obj = &mIN_PRICE;
		obj->fromJson(value.dump());

    }


}

bourne::json
MinPriceFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["mIN_PRICE"] = getMINPRICE().toJson();


    return object;

}

CatalogsProductGroupPricingCriteria
MinPriceFilter::getMINPRICE()
{
	return mIN_PRICE;
}

void
MinPriceFilter::setMINPRICE(CatalogsProductGroupPricingCriteria  mIN_PRICE)
{
	this->mIN_PRICE = mIN_PRICE;
}



