

#include "AdPinAnalytics.h"

using namespace Tiny;

AdPinAnalytics::AdPinAnalytics()
{
	dATE = std::string();
	pIN_ID = std::string();
}

AdPinAnalytics::AdPinAnalytics(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPinAnalytics::~AdPinAnalytics()
{

}

void
AdPinAnalytics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dATEKey = "DATE";

    if(object.has_key(dATEKey))
    {
        bourne::json value = object[dATEKey];




        Date* obj = &dATE;
		obj->fromJson(value.dump());

    }

    const char *pIN_IDKey = "PIN_ID";

    if(object.has_key(pIN_IDKey))
    {
        bourne::json value = object[pIN_IDKey];



        jsonToValue(&pIN_ID, value, "std::string");


    }


}

bourne::json
AdPinAnalytics::toJson()
{
    bourne::json object = bourne::json::object();






	object["dATE"] = getDATE().toJson();





    object["pIN_ID"] = getPINID();



    return object;

}

Date
AdPinAnalytics::getDATE()
{
	return dATE;
}

void
AdPinAnalytics::setDATE(Date  dATE)
{
	this->dATE = dATE;
}

std::string
AdPinAnalytics::getPINID()
{
	return pIN_ID;
}

void
AdPinAnalytics::setPINID(std::string  pIN_ID)
{
	this->pIN_ID = pIN_ID;
}



