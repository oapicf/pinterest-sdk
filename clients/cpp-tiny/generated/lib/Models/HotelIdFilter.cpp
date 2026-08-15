

#include "HotelIdFilter.h"

using namespace Tiny;

HotelIdFilter::HotelIdFilter()
{
	hOTEL_ID = CatalogsProductGroupMultipleStringCriteria();
}

HotelIdFilter::HotelIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

HotelIdFilter::~HotelIdFilter()
{

}

void
HotelIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hOTEL_IDKey = "HOTEL_ID";

    if(object.has_key(hOTEL_IDKey))
    {
        bourne::json value = object[hOTEL_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &hOTEL_ID;
		obj->fromJson(value.dump());

    }


}

bourne::json
HotelIdFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["hOTEL_ID"] = getHOTELID().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
HotelIdFilter::getHOTELID()
{
	return hOTEL_ID;
}

void
HotelIdFilter::setHOTELID(CatalogsProductGroupMultipleStringCriteria  hOTEL_ID)
{
	this->hOTEL_ID = hOTEL_ID;
}



