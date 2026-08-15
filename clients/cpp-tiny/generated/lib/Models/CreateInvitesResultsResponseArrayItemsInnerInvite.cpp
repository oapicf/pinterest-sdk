

#include "CreateInvitesResultsResponseArray_items_inner_invite.h"

using namespace Tiny;

CreateInvitesResultsResponseArray_items_inner_invite::CreateInvitesResultsResponseArray_items_inner_invite()
{
	id = std::string();
	user = null;
}

CreateInvitesResultsResponseArray_items_inner_invite::CreateInvitesResultsResponseArray_items_inner_invite(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateInvitesResultsResponseArray_items_inner_invite::~CreateInvitesResultsResponseArray_items_inner_invite()
{

}

void
CreateInvitesResultsResponseArray_items_inner_invite::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *userKey = "user";

    if(object.has_key(userKey))
    {
        bourne::json value = object[userKey];




        BusinessAccessUserSummary* obj = &user;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateInvitesResultsResponseArray_items_inner_invite::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["user"] = getUser().toJson();


    return object;

}

std::string
CreateInvitesResultsResponseArray_items_inner_invite::getId()
{
	return id;
}

void
CreateInvitesResultsResponseArray_items_inner_invite::setId(std::string  id)
{
	this->id = id;
}

BusinessAccessUserSummary
CreateInvitesResultsResponseArray_items_inner_invite::getUser()
{
	return user;
}

void
CreateInvitesResultsResponseArray_items_inner_invite::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}



