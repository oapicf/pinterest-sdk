

#include "InviteExceptionResponse.h"

using namespace Tiny;

InviteExceptionResponse::InviteExceptionResponse()
{
	code = int(0);
	invite_or_request_id = std::string();
	message = std::string();
	users_or_partner_ids = std::list<std::string>();
}

InviteExceptionResponse::InviteExceptionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteExceptionResponse::~InviteExceptionResponse()
{

}

void
InviteExceptionResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *codeKey = "code";

    if(object.has_key(codeKey))
    {
        bourne::json value = object[codeKey];



        jsonToValue(&code, value, "int");


    }

    const char *invite_or_request_idKey = "invite_or_request_id";

    if(object.has_key(invite_or_request_idKey))
    {
        bourne::json value = object[invite_or_request_idKey];



        jsonToValue(&invite_or_request_id, value, "std::string");


    }

    const char *messageKey = "message";

    if(object.has_key(messageKey))
    {
        bourne::json value = object[messageKey];



        jsonToValue(&message, value, "std::string");


    }

    const char *users_or_partner_idsKey = "users_or_partner_ids";

    if(object.has_key(users_or_partner_idsKey))
    {
        bourne::json value = object[users_or_partner_idsKey];


        std::list<std::string> users_or_partner_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            users_or_partner_ids_list.push_back(element);
        }
        users_or_partner_ids = users_or_partner_ids_list;


    }


}

bourne::json
InviteExceptionResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["code"] = getCode();






    object["invite_or_request_id"] = getInviteOrRequestId();






    object["message"] = getMessage();





    std::list<std::string> users_or_partner_ids_list = getUsersOrPartnerIds();
    bourne::json users_or_partner_ids_arr = bourne::json::array();

    for(auto& var : users_or_partner_ids_list)
    {
        users_or_partner_ids_arr.append(var);
    }
    object["users_or_partner_ids"] = users_or_partner_ids_arr;






    return object;

}

int
InviteExceptionResponse::getCode()
{
	return code;
}

void
InviteExceptionResponse::setCode(int code)
{
	this->code = code;
}

std::string
InviteExceptionResponse::getInviteOrRequestId()
{
	return invite_or_request_id;
}

void
InviteExceptionResponse::setInviteOrRequestId(std::string invite_or_request_id)
{
	this->invite_or_request_id = invite_or_request_id;
}

std::string
InviteExceptionResponse::getMessage()
{
	return message;
}

void
InviteExceptionResponse::setMessage(std::string message)
{
	this->message = message;
}

std::list<std::string>
InviteExceptionResponse::getUsersOrPartnerIds()
{
	return users_or_partner_ids;
}

void
InviteExceptionResponse::setUsersOrPartnerIds(std::list<std::string> users_or_partner_ids)
{
	this->users_or_partner_ids = users_or_partner_ids;
}



