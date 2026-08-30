

#include "CurrencyFilter.h"

using namespace Tiny;

CurrencyFilter::CurrencyFilter()
{
	cURRENCY = CatalogsProductGroupCurrencyCriteria();
}

CurrencyFilter::CurrencyFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CurrencyFilter::~CurrencyFilter()
{

}

void
CurrencyFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cURRENCYKey = "CURRENCY";

    if(object.has_key(cURRENCYKey))
    {
        bourne::json value = object[cURRENCYKey];




        CatalogsProductGroupCurrencyCriteria* obj = &cURRENCY;
		obj->fromJson(value.dump());

    }


}

bourne::json
CurrencyFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cURRENCY"] = getCURRENCY().toJson();


    return object;

}

CatalogsProductGroupCurrencyCriteria
CurrencyFilter::getCURRENCY()
{
	return cURRENCY;
}

void
CurrencyFilter::setCURRENCY(CatalogsProductGroupCurrencyCriteria cURRENCY)
{
	this->cURRENCY = cURRENCY;
}



