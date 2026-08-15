

#include "ConditionFilter.h"

using namespace Tiny;

ConditionFilter::ConditionFilter()
{
	cONDITION = CatalogsProductGroupMultipleStringCriteria();
}

ConditionFilter::ConditionFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConditionFilter::~ConditionFilter()
{

}

void
ConditionFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cONDITIONKey = "CONDITION";

    if(object.has_key(cONDITIONKey))
    {
        bourne::json value = object[cONDITIONKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &cONDITION;
		obj->fromJson(value.dump());

    }


}

bourne::json
ConditionFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cONDITION"] = getCONDITION().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
ConditionFilter::getCONDITION()
{
	return cONDITION;
}

void
ConditionFilter::setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION)
{
	this->cONDITION = cONDITION;
}



