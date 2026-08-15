

#include "UpdatePartnerResultsResponseArray_items_inner.h"

using namespace Tiny;

UpdatePartnerResultsResponseArray_items_inner::UpdatePartnerResultsResponseArray_items_inner()
{
	exception = BusinessAccessError();
	member_or_partner_id = std::string();
}

UpdatePartnerResultsResponseArray_items_inner::UpdatePartnerResultsResponseArray_items_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerResultsResponseArray_items_inner::~UpdatePartnerResultsResponseArray_items_inner()
{

}

void
UpdatePartnerResultsResponseArray_items_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionKey = "exception";

    if(object.has_key(exceptionKey))
    {
        bourne::json value = object[exceptionKey];




        BusinessAccessError* obj = &exception;
		obj->fromJson(value.dump());

    }

    const char *member_or_partner_idKey = "member_or_partner_id";

    if(object.has_key(member_or_partner_idKey))
    {
        bourne::json value = object[member_or_partner_idKey];



        jsonToValue(&member_or_partner_id, value, "std::string");


    }


}

bourne::json
UpdatePartnerResultsResponseArray_items_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["exception"] = getException().toJson();





    object["member_or_partner_id"] = getMemberOrPartnerId();



    return object;

}

BusinessAccessError
UpdatePartnerResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
UpdatePartnerResultsResponseArray_items_inner::setException(BusinessAccessError  exception)
{
	this->exception = exception;
}

std::string
UpdatePartnerResultsResponseArray_items_inner::getMemberOrPartnerId()
{
	return member_or_partner_id;
}

void
UpdatePartnerResultsResponseArray_items_inner::setMemberOrPartnerId(std::string  member_or_partner_id)
{
	this->member_or_partner_id = member_or_partner_id;
}



