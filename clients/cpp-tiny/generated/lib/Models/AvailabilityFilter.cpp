

#include "AvailabilityFilter.h"

using namespace Tiny;

AvailabilityFilter::AvailabilityFilter()
{
	aVAILABILITY = CatalogsProductGroupMultipleStringCriteria();
}

AvailabilityFilter::AvailabilityFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

AvailabilityFilter::~AvailabilityFilter()
{

}

void
AvailabilityFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aVAILABILITYKey = "AVAILABILITY";

    if(object.has_key(aVAILABILITYKey))
    {
        bourne::json value = object[aVAILABILITYKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &aVAILABILITY;
		obj->fromJson(value.dump());

    }


}

bourne::json
AvailabilityFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["aVAILABILITY"] = getAVAILABILITY().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
AvailabilityFilter::getAVAILABILITY()
{
	return aVAILABILITY;
}

void
AvailabilityFilter::setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria aVAILABILITY)
{
	this->aVAILABILITY = aVAILABILITY;
}



