

#include "PriceFilter.h"

using namespace Tiny;

PriceFilter::PriceFilter()
{
	pRICE = PriceFilterPrice();
}

PriceFilter::PriceFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

PriceFilter::~PriceFilter()
{

}

void
PriceFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pRICEKey = "PRICE";

    if(object.has_key(pRICEKey))
    {
        bourne::json value = object[pRICEKey];




        PriceFilterPrice* obj = &pRICE;
		obj->fromJson(value.dump());

    }


}

bourne::json
PriceFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["pRICE"] = getPRICE().toJson();


    return object;

}

PriceFilterPrice
PriceFilter::getPRICE()
{
	return pRICE;
}

void
PriceFilter::setPRICE(PriceFilterPrice pRICE)
{
	this->pRICE = pRICE;
}



