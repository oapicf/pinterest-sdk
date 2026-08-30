

#include "TotalCountByEntityStatus.h"

using namespace Tiny;

TotalCountByEntityStatus::TotalCountByEntityStatus()
{
	aCTIVE = int(0);
	aRCHIVED = int(0);
	pAUSED = int(0);
}

TotalCountByEntityStatus::TotalCountByEntityStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

TotalCountByEntityStatus::~TotalCountByEntityStatus()
{

}

void
TotalCountByEntityStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aCTIVEKey = "ACTIVE";

    if(object.has_key(aCTIVEKey))
    {
        bourne::json value = object[aCTIVEKey];



        jsonToValue(&aCTIVE, value, "int");


    }

    const char *aRCHIVEDKey = "ARCHIVED";

    if(object.has_key(aRCHIVEDKey))
    {
        bourne::json value = object[aRCHIVEDKey];



        jsonToValue(&aRCHIVED, value, "int");


    }

    const char *pAUSEDKey = "PAUSED";

    if(object.has_key(pAUSEDKey))
    {
        bourne::json value = object[pAUSEDKey];



        jsonToValue(&pAUSED, value, "int");


    }


}

bourne::json
TotalCountByEntityStatus::toJson()
{
    bourne::json object = bourne::json::object();





    object["aCTIVE"] = getACTIVE();






    object["aRCHIVED"] = getARCHIVED();






    object["pAUSED"] = getPAUSED();



    return object;

}

int
TotalCountByEntityStatus::getACTIVE()
{
	return aCTIVE;
}

void
TotalCountByEntityStatus::setACTIVE(int aCTIVE)
{
	this->aCTIVE = aCTIVE;
}

int
TotalCountByEntityStatus::getARCHIVED()
{
	return aRCHIVED;
}

void
TotalCountByEntityStatus::setARCHIVED(int aRCHIVED)
{
	this->aRCHIVED = aRCHIVED;
}

int
TotalCountByEntityStatus::getPAUSED()
{
	return pAUSED;
}

void
TotalCountByEntityStatus::setPAUSED(int pAUSED)
{
	this->pAUSED = pAUSED;
}



