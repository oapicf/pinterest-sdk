

#include "SharedAudience.h"

using namespace Tiny;

SharedAudience::SharedAudience()
{
	audience_id = std::string();
	operation_type = OperationType();
	recipient_account_ids = std::list<std::string>();
}

SharedAudience::SharedAudience(std::string jsonString)
{
	this->fromJson(jsonString);
}

SharedAudience::~SharedAudience()
{

}

void
SharedAudience::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *audience_idKey = "audience_id";

    if(object.has_key(audience_idKey))
    {
        bourne::json value = object[audience_idKey];



        jsonToValue(&audience_id, value, "std::string");


    }

    const char *operation_typeKey = "operation_type";

    if(object.has_key(operation_typeKey))
    {
        bourne::json value = object[operation_typeKey];




        OperationType* obj = &operation_type;
		obj->fromJson(value.dump());

    }

    const char *recipient_account_idsKey = "recipient_account_ids";

    if(object.has_key(recipient_account_idsKey))
    {
        bourne::json value = object[recipient_account_idsKey];


        std::list<std::string> recipient_account_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            recipient_account_ids_list.push_back(element);
        }
        recipient_account_ids = recipient_account_ids_list;


    }


}

bourne::json
SharedAudience::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_id"] = getAudienceId();







	object["operation_type"] = getOperationType().toJson();




    std::list<std::string> recipient_account_ids_list = getRecipientAccountIds();
    bourne::json recipient_account_ids_arr = bourne::json::array();

    for(auto& var : recipient_account_ids_list)
    {
        recipient_account_ids_arr.append(var);
    }
    object["recipient_account_ids"] = recipient_account_ids_arr;






    return object;

}

std::string
SharedAudience::getAudienceId()
{
	return audience_id;
}

void
SharedAudience::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

OperationType
SharedAudience::getOperationType()
{
	return operation_type;
}

void
SharedAudience::setOperationType(OperationType  operation_type)
{
	this->operation_type = operation_type;
}

std::list<std::string>
SharedAudience::getRecipientAccountIds()
{
	return recipient_account_ids;
}

void
SharedAudience::setRecipientAccountIds(std::list <std::string> recipient_account_ids)
{
	this->recipient_account_ids = recipient_account_ids;
}



