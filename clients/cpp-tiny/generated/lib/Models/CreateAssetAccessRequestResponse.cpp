

#include "CreateAssetAccessRequestResponse.h"

using namespace Tiny;

CreateAssetAccessRequestResponse::CreateAssetAccessRequestResponse()
{
	exceptions = std::list<CreateAssetAccessRequestErrorMessage_inner>();
	invites = null<std::string>();
}

CreateAssetAccessRequestResponse::CreateAssetAccessRequestResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateAssetAccessRequestResponse::~CreateAssetAccessRequestResponse()
{

}

void
CreateAssetAccessRequestResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<CreateAssetAccessRequestErrorMessage_inner> exceptions_list;
        CreateAssetAccessRequestErrorMessage_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }

    const char *invitesKey = "invites";

    if(object.has_key(invitesKey))
    {
        bourne::json value = object[invitesKey];


    }


}

bourne::json
CreateAssetAccessRequestResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CreateAssetAccessRequestErrorMessage_inner> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        CreateAssetAccessRequestErrorMessage_inner obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;







    return object;

}

std::list<CreateAssetAccessRequestErrorMessage_inner>
CreateAssetAccessRequestResponse::getExceptions()
{
	return exceptions;
}

void
CreateAssetAccessRequestResponse::setExceptions(std::list <CreateAssetAccessRequestErrorMessage_inner> exceptions)
{
	this->exceptions = exceptions;
}

Map<string, string>
CreateAssetAccessRequestResponse::getInvites()
{
	return invites;
}

void
CreateAssetAccessRequestResponse::setInvites(Map <string, string> invites)
{
	this->invites = invites;
}



