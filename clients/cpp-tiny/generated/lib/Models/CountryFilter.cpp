

#include "CountryFilter.h"

using namespace Tiny;

CountryFilter::CountryFilter()
{
	cOUNTRY = CatalogsProductGroupMultipleCountriesCriteria();
}

CountryFilter::CountryFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CountryFilter::~CountryFilter()
{

}

void
CountryFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cOUNTRYKey = "COUNTRY";

    if(object.has_key(cOUNTRYKey))
    {
        bourne::json value = object[cOUNTRYKey];




        CatalogsProductGroupMultipleCountriesCriteria* obj = &cOUNTRY;
		obj->fromJson(value.dump());

    }


}

bourne::json
CountryFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cOUNTRY"] = getCOUNTRY().toJson();


    return object;

}

CatalogsProductGroupMultipleCountriesCriteria
CountryFilter::getCOUNTRY()
{
	return cOUNTRY;
}

void
CountryFilter::setCOUNTRY(CatalogsProductGroupMultipleCountriesCriteria  cOUNTRY)
{
	this->cOUNTRY = cOUNTRY;
}



