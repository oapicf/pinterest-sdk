

#include "AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.h"

using namespace Tiny;

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody()
{
	audience_id = null;
	operation_type = OperationType();
	recipient_account_ids = std::list<std::string>();
}

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::~AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody()
{

}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::fromJson(std::string jsonObj)
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
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::toJson()
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
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getAudienceId()
{
	return audience_id;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setAudienceId(std::string audience_id)
{
	this->audience_id = audience_id;
}

OperationType
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setOperationType(OperationType operation_type)
{
	this->operation_type = operation_type;
}

std::list<std::string>
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getRecipientAccountIds()
{
	return recipient_account_ids;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setRecipientAccountIds(std::list<std::string> recipient_account_ids)
{
	this->recipient_account_ids = recipient_account_ids;
}



