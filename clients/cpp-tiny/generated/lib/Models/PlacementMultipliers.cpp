

#include "PlacementMultipliers.h"

using namespace Tiny;

PlacementMultipliers::PlacementMultipliers()
{
	pLACEMENT = null;
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




        PlacementType* obj = &pLACEMENT;
		obj->fromJson(value.dump());

    }


}

bourne::json
PlacementMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["pLACEMENT"] = getPLACEMENT().toJson();


    return object;

}

PlacementType
PlacementMultipliers::getPLACEMENT()
{
	return pLACEMENT;
}

void
PlacementMultipliers::setPLACEMENT(PlacementType pLACEMENT)
{
	this->pLACEMENT = pLACEMENT;
}



