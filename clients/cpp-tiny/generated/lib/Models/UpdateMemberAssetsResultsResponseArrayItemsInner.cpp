

#include "UpdateMemberAssetsResultsResponseArray_items_inner.h"

using namespace Tiny;

UpdateMemberAssetsResultsResponseArray_items_inner::UpdateMemberAssetsResultsResponseArray_items_inner()
{
	response = UsersForIndividualAssetResponse();
}

UpdateMemberAssetsResultsResponseArray_items_inner::UpdateMemberAssetsResultsResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetsResultsResponseArray_items_inner::~UpdateMemberAssetsResultsResponseArray_items_inner()
{

}

void
UpdateMemberAssetsResultsResponseArray_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *responseKey = "response";

    if(object.has_key(responseKey))
    {
        bourne::json value = object[responseKey];




        UsersForIndividualAssetResponse* obj = &response;
		obj->fromJson(value.dump());

    }


}

bourne::json
UpdateMemberAssetsResultsResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["response"] = getResponse().toJson();


    return object;

}

UsersForIndividualAssetResponse
UpdateMemberAssetsResultsResponseArray_items_inner::getResponse()
{
	return response;
}

void
UpdateMemberAssetsResultsResponseArray_items_inner::setResponse(UsersForIndividualAssetResponse  response)
{
	this->response = response;
}



