

#include "KeywordInfo.h"

using namespace Tiny;

KeywordInfo::KeywordInfo()
{
	name = std::string();
	pct_growth_mom = float(0);
}

KeywordInfo::KeywordInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordInfo::~KeywordInfo()
{

}

void
KeywordInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *pct_growth_momKey = "pct_growth_mom";

    if(object.has_key(pct_growth_momKey))
    {
        bourne::json value = object[pct_growth_momKey];



        jsonToValue(&pct_growth_mom, value, "long");


    }


}

bourne::json
KeywordInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["pct_growth_mom"] = getPctGrowthMom();



    return object;

}

std::string
KeywordInfo::getName()
{
	return name;
}

void
KeywordInfo::setName(std::string name)
{
	this->name = name;
}

long
KeywordInfo::getPctGrowthMom()
{
	return pct_growth_mom;
}

void
KeywordInfo::setPctGrowthMom(long pct_growth_mom)
{
	this->pct_growth_mom = pct_growth_mom;
}



