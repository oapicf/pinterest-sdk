

#include "BusinessSharedAudience.h"

using namespace Tiny;

BusinessSharedAudience::BusinessSharedAudience()
{
	audience_id = std::string();
	operation_type = OperationType();
	recipient_business_ids = std::list<std::string>();
}

BusinessSharedAudience::BusinessSharedAudience(std::string jsonString)
{
	this->fromJson(jsonString);
}

BusinessSharedAudience::~BusinessSharedAudience()
{

}

void
BusinessSharedAudience::fromJson(std::string jsonObj)
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

    const char *recipient_business_idsKey = "recipient_business_ids";

    if(object.has_key(recipient_business_idsKey))
    {
        bourne::json value = object[recipient_business_idsKey];


        std::list<std::string> recipient_business_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            recipient_business_ids_list.push_back(element);
        }
        recipient_business_ids = recipient_business_ids_list;


    }


}

bourne::json
BusinessSharedAudience::toJson()
{
    bourne::json object = bourne::json::object();





    object["audience_id"] = getAudienceId();







	object["operation_type"] = getOperationType().toJson();




    std::list<std::string> recipient_business_ids_list = getRecipientBusinessIds();
    bourne::json recipient_business_ids_arr = bourne::json::array();

    for(auto& var : recipient_business_ids_list)
    {
        recipient_business_ids_arr.append(var);
    }
    object["recipient_business_ids"] = recipient_business_ids_arr;






    return object;

}

std::string
BusinessSharedAudience::getAudienceId()
{
	return audience_id;
}

void
BusinessSharedAudience::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

OperationType
BusinessSharedAudience::getOperationType()
{
	return operation_type;
}

void
BusinessSharedAudience::setOperationType(OperationType  operation_type)
{
	this->operation_type = operation_type;
}

std::list<std::string>
BusinessSharedAudience::getRecipientBusinessIds()
{
	return recipient_business_ids;
}

void
BusinessSharedAudience::setRecipientBusinessIds(std::list <std::string> recipient_business_ids)
{
	this->recipient_business_ids = recipient_business_ids;
}



