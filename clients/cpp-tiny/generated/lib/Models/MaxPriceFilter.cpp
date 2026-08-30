

#include "MaxPriceFilter.h"

using namespace Tiny;

MaxPriceFilter::MaxPriceFilter()
{
	mAX_PRICE = CatalogsProductGroupPricingCriteria();
}

MaxPriceFilter::MaxPriceFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

MaxPriceFilter::~MaxPriceFilter()
{

}

void
MaxPriceFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mAX_PRICEKey = "MAX_PRICE";

    if(object.has_key(mAX_PRICEKey))
    {
        bourne::json value = object[mAX_PRICEKey];




        CatalogsProductGroupPricingCriteria* obj = &mAX_PRICE;
		obj->fromJson(value.dump());

    }


}

bourne::json
MaxPriceFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["mAX_PRICE"] = getMAXPRICE().toJson();


    return object;

}

CatalogsProductGroupPricingCriteria
MaxPriceFilter::getMAXPRICE()
{
	return mAX_PRICE;
}

void
MaxPriceFilter::setMAXPRICE(CatalogsProductGroupPricingCriteria mAX_PRICE)
{
	this->mAX_PRICE = mAX_PRICE;
}



