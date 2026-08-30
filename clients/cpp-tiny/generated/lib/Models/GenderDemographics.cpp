

#include "GenderDemographics.h"

using namespace Tiny;

GenderDemographics::GenderDemographics()
{
	female = float(0);
	male = float(0);
	unspecified = float(0);
}

GenderDemographics::GenderDemographics(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderDemographics::~GenderDemographics()
{

}

void
GenderDemographics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *femaleKey = "female";

    if(object.has_key(femaleKey))
    {
        bourne::json value = object[femaleKey];



        jsonToValue(&female, value, "long");


    }

    const char *maleKey = "male";

    if(object.has_key(maleKey))
    {
        bourne::json value = object[maleKey];



        jsonToValue(&male, value, "long");


    }

    const char *unspecifiedKey = "unspecified";

    if(object.has_key(unspecifiedKey))
    {
        bourne::json value = object[unspecifiedKey];



        jsonToValue(&unspecified, value, "long");


    }


}

bourne::json
GenderDemographics::toJson()
{
    bourne::json object = bourne::json::object();





    object["female"] = getFemale();






    object["male"] = getMale();






    object["unspecified"] = getUnspecified();



    return object;

}

long
GenderDemographics::getFemale()
{
	return female;
}

void
GenderDemographics::setFemale(long female)
{
	this->female = female;
}

long
GenderDemographics::getMale()
{
	return male;
}

void
GenderDemographics::setMale(long male)
{
	this->male = male;
}

long
GenderDemographics::getUnspecified()
{
	return unspecified;
}

void
GenderDemographics::setUnspecified(long unspecified)
{
	this->unspecified = unspecified;
}



