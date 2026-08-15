

#include "CreativeAssetsIdFilter.h"

using namespace Tiny;

CreativeAssetsIdFilter::CreativeAssetsIdFilter()
{
	cREATIVE_ASSETS_ID = CatalogsProductGroupMultipleStringCriteria();
}

CreativeAssetsIdFilter::CreativeAssetsIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreativeAssetsIdFilter::~CreativeAssetsIdFilter()
{

}

void
CreativeAssetsIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";

    if(object.has_key(cREATIVE_ASSETS_IDKey))
    {
        bourne::json value = object[cREATIVE_ASSETS_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &cREATIVE_ASSETS_ID;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreativeAssetsIdFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["cREATIVE_ASSETS_ID"] = getCREATIVEASSETSID().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
CreativeAssetsIdFilter::getCREATIVEASSETSID()
{
	return cREATIVE_ASSETS_ID;
}

void
CreativeAssetsIdFilter::setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID)
{
	this->cREATIVE_ASSETS_ID = cREATIVE_ASSETS_ID;
}



