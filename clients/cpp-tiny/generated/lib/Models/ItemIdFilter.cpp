

#include "ItemIdFilter.h"

using namespace Tiny;

ItemIdFilter::ItemIdFilter()
{
	iTEM_ID = CatalogsProductGroupMultipleStringCriteria();
}

ItemIdFilter::ItemIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemIdFilter::~ItemIdFilter()
{

}

void
ItemIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *iTEM_IDKey = "ITEM_ID";

    if(object.has_key(iTEM_IDKey))
    {
        bourne::json value = object[iTEM_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &iTEM_ID;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemIdFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["iTEM_ID"] = getITEMID().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
ItemIdFilter::getITEMID()
{
	return iTEM_ID;
}

void
ItemIdFilter::setITEMID(CatalogsProductGroupMultipleStringCriteria iTEM_ID)
{
	this->iTEM_ID = iTEM_ID;
}



