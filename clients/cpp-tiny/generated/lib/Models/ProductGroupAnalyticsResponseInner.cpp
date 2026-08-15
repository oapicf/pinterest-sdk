

#include "ProductGroupAnalyticsResponse_inner.h"

using namespace Tiny;

ProductGroupAnalyticsResponse_inner::ProductGroupAnalyticsResponse_inner()
{
	dATE = std::string();
	pRODUCT_GROUP_ID = std::string();
}

ProductGroupAnalyticsResponse_inner::ProductGroupAnalyticsResponse_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupAnalyticsResponse_inner::~ProductGroupAnalyticsResponse_inner()
{

}

void
ProductGroupAnalyticsResponse_inner::fromJson(std::string jsonObj)
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
ProductGroupAnalyticsResponse_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["dATE"] = getDATE().toJson();





    object["pRODUCT_GROUP_ID"] = getPRODUCTGROUPID();



    return object;

}

Date
ProductGroupAnalyticsResponse_inner::getDATE()
{
	return dATE;
}

void
ProductGroupAnalyticsResponse_inner::setDATE(Date  dATE)
{
	this->dATE = dATE;
}

std::string
ProductGroupAnalyticsResponse_inner::getPRODUCTGROUPID()
{
	return pRODUCT_GROUP_ID;
}

void
ProductGroupAnalyticsResponse_inner::setPRODUCTGROUPID(std::string  pRODUCT_GROUP_ID)
{
	this->pRODUCT_GROUP_ID = pRODUCT_GROUP_ID;
}



