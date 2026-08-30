

#include "BidOptionsGenderMultipliers.h"

using namespace Tiny;

BidOptionsGenderMultipliers::BidOptionsGenderMultipliers()
{
	female = float(0);
	male = float(0);
}

BidOptionsGenderMultipliers::BidOptionsGenderMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidOptionsGenderMultipliers::~BidOptionsGenderMultipliers()
{

}

void
BidOptionsGenderMultipliers::fromJson(std::string jsonObj)
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


}

bourne::json
BidOptionsGenderMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["female"] = getFemale();






    object["male"] = getMale();



    return object;

}

long
BidOptionsGenderMultipliers::getFemale()
{
	return female;
}

void
BidOptionsGenderMultipliers::setFemale(long female)
{
	this->female = female;
}

long
BidOptionsGenderMultipliers::getMale()
{
	return male;
}

void
BidOptionsGenderMultipliers::setMale(long male)
{
	this->male = male;
}



