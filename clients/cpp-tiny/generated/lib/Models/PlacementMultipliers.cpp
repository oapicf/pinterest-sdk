

#include "PlacementMultipliers.h"

using namespace Tiny;

PlacementMultipliers::PlacementMultipliers()
{
	pLACEMENT = std::string();
}

PlacementMultipliers::PlacementMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

PlacementMultipliers::~PlacementMultipliers()
{

}

void
PlacementMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pLACEMENTKey = "PLACEMENT";

    if(object.has_key(pLACEMENTKey))
    {
        bourne::json value = object[pLACEMENTKey];



        jsonToValue(&pLACEMENT, value, "std::string");


    }


}

bourne::json
PlacementMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["pLACEMENT"] = getPLACEMENT();



    return object;

}

std::string
PlacementMultipliers::getPLACEMENT()
{
	return pLACEMENT;
}

void
PlacementMultipliers::setPLACEMENT(std::string  pLACEMENT)
{
	this->pLACEMENT = pLACEMENT;
}



