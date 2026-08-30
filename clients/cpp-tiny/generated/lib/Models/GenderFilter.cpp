

#include "GenderFilter.h"

using namespace Tiny;

GenderFilter::GenderFilter()
{
	gENDER = CatalogsProductGroupMultipleGenderCriteria();
}

GenderFilter::GenderFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderFilter::~GenderFilter()
{

}

void
GenderFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *gENDERKey = "GENDER";

    if(object.has_key(gENDERKey))
    {
        bourne::json value = object[gENDERKey];




        CatalogsProductGroupMultipleGenderCriteria* obj = &gENDER;
		obj->fromJson(value.dump());

    }


}

bourne::json
GenderFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["gENDER"] = getGENDER().toJson();


    return object;

}

CatalogsProductGroupMultipleGenderCriteria
GenderFilter::getGENDER()
{
	return gENDER;
}

void
GenderFilter::setGENDER(CatalogsProductGroupMultipleGenderCriteria gENDER)
{
	this->gENDER = gENDER;
}



