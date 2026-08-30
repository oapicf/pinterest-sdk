

#include "ProductGroupAnalyticsItems.h"

using namespace Tiny;

ProductGroupAnalyticsItems::ProductGroupAnalyticsItems()
{
	dATE = std::string();
	pRODUCT_GROUP_ID = std::string();
}

ProductGroupAnalyticsItems::ProductGroupAnalyticsItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupAnalyticsItems::~ProductGroupAnalyticsItems()
{

}

void
ProductGroupAnalyticsItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dATEKey = "DATE";

    if(object.has_key(dATEKey))
    {
        bourne::json value = object[dATEKey];




        Date* obj = &dATE;
		obj->fromJson(value.dump());

    }

    const char *pRODUCT_GROUP_IDKey = "PRODUCT_GROUP_ID";

    if(object.has_key(pRODUCT_GROUP_IDKey))
    {
        bourne::json value = object[pRODUCT_GROUP_IDKey];



        jsonToValue(&pRODUCT_GROUP_ID, value, "std::string");


    }


}

bourne::json
ProductGroupAnalyticsItems::toJson()
{
    bourne::json object = bourne::json::object();






	object["dATE"] = getDATE().toJson();





    object["pRODUCT_GROUP_ID"] = getPRODUCTGROUPID();



    return object;

}

Date
ProductGroupAnalyticsItems::getDATE()
{
	return dATE;
}

void
ProductGroupAnalyticsItems::setDATE(Date dATE)
{
	this->dATE = dATE;
}

std::string
ProductGroupAnalyticsItems::getPRODUCTGROUPID()
{
	return pRODUCT_GROUP_ID;
}

void
ProductGroupAnalyticsItems::setPRODUCTGROUPID(std::string pRODUCT_GROUP_ID)
{
	this->pRODUCT_GROUP_ID = pRODUCT_GROUP_ID;
}



