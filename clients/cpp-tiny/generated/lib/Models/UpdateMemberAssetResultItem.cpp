

#include "UpdateMemberAssetResultItem.h"

using namespace Tiny;

UpdateMemberAssetResultItem::UpdateMemberAssetResultItem()
{
	response = UsersForIndividualAssetResponse();
}

UpdateMemberAssetResultItem::UpdateMemberAssetResultItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetResultItem::~UpdateMemberAssetResultItem()
{

}

void
UpdateMemberAssetResultItem::fromJson(std::string jsonObj)
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
UpdateMemberAssetResultItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["response"] = getResponse().toJson();


    return object;

}

UsersForIndividualAssetResponse
UpdateMemberAssetResultItem::getResponse()
{
	return response;
}

void
UpdateMemberAssetResultItem::setResponse(UsersForIndividualAssetResponse response)
{
	this->response = response;
}



