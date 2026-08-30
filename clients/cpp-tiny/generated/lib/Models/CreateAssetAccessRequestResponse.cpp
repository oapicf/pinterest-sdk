

#include "CreateAssetAccessRequestResponse.h"

using namespace Tiny;

CreateAssetAccessRequestResponse::CreateAssetAccessRequestResponse()
{
	exceptions = std::list<AssetAccessRequestError>();
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


        std::list<AssetAccessRequestError> exceptions_list;
        AssetAccessRequestError element;
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




    std::list<AssetAccessRequestError> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        AssetAccessRequestError obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;







    return object;

}

std::list<AssetAccessRequestError>
CreateAssetAccessRequestResponse::getExceptions()
{
	return exceptions;
}

void
CreateAssetAccessRequestResponse::setExceptions(std::list<AssetAccessRequestError> exceptions)
{
	this->exceptions = exceptions;
}

std::map<std::string, std::string>
CreateAssetAccessRequestResponse::getInvites()
{
	return invites;
}

void
CreateAssetAccessRequestResponse::setInvites(std::map<std::string, std::string> invites)
{
	this->invites = invites;
}



