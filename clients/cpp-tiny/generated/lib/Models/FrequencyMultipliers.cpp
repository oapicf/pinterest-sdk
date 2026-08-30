

#include "FrequencyMultipliers.h"

using namespace Tiny;

FrequencyMultipliers::FrequencyMultipliers()
{
	iMPRESSION_COUNT = std::string();
}

FrequencyMultipliers::FrequencyMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

FrequencyMultipliers::~FrequencyMultipliers()
{

}

void
FrequencyMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *iMPRESSION_COUNTKey = "IMPRESSION_COUNT";

    if(object.has_key(iMPRESSION_COUNTKey))
    {
        bourne::json value = object[iMPRESSION_COUNTKey];



        jsonToValue(&iMPRESSION_COUNT, value, "std::string");


    }


}

bourne::json
FrequencyMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["iMPRESSION_COUNT"] = getIMPRESSIONCOUNT();



    return object;

}

std::string
FrequencyMultipliers::getIMPRESSIONCOUNT()
{
	return iMPRESSION_COUNT;
}

void
FrequencyMultipliers::setIMPRESSIONCOUNT(std::string iMPRESSION_COUNT)
{
	this->iMPRESSION_COUNT = iMPRESSION_COUNT;
}



