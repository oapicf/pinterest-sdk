

#include "ItemGroupIdFilter.h"

using namespace Tiny;

ItemGroupIdFilter::ItemGroupIdFilter()
{
	iTEM_GROUP_ID = CatalogsProductGroupMultipleStringCriteria();
}

ItemGroupIdFilter::ItemGroupIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemGroupIdFilter::~ItemGroupIdFilter()
{

}

void
ItemGroupIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *iTEM_GROUP_IDKey = "ITEM_GROUP_ID";

    if(object.has_key(iTEM_GROUP_IDKey))
    {
        bourne::json value = object[iTEM_GROUP_IDKey];




        CatalogsProductGroupMultipleStringCriteria* obj = &iTEM_GROUP_ID;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemGroupIdFilter::toJson()
{
    bourne::json object = bourne::json::object();






	object["iTEM_GROUP_ID"] = getITEMGROUPID().toJson();


    return object;

}

CatalogsProductGroupMultipleStringCriteria
ItemGroupIdFilter::getITEMGROUPID()
{
	return iTEM_GROUP_ID;
}

void
ItemGroupIdFilter::setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria  iTEM_GROUP_ID)
{
	this->iTEM_GROUP_ID = iTEM_GROUP_ID;
}



