

#include "DeletePartnersRequest.h"

using namespace Tiny;

DeletePartnersRequest::DeletePartnersRequest()
{
	partner_ids = std::list<std::string>();
	partner_type = std::string();
}

DeletePartnersRequest::DeletePartnersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnersRequest::~DeletePartnersRequest()
{

}

void
DeletePartnersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *partner_idsKey = "partner_ids";

    if(object.has_key(partner_idsKey))
    {
        bourne::json value = object[partner_idsKey];


        std::list<std::string> partner_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            partner_ids_list.push_back(element);
        }
        partner_ids = partner_ids_list;


    }

    const char *partner_typeKey = "partner_type";

    if(object.has_key(partner_typeKey))
    {
        bourne::json value = object[partner_typeKey];



        jsonToValue(&partner_type, value, "std::string");


    }


}

bourne::json
DeletePartnersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> partner_ids_list = getPartnerIds();
    bourne::json partner_ids_arr = bourne::json::array();

    for(auto& var : partner_ids_list)
    {
        partner_ids_arr.append(var);
    }
    object["partner_ids"] = partner_ids_arr;









    object["partner_type"] = getPartnerType();



    return object;

}

std::list<std::string>
DeletePartnersRequest::getPartnerIds()
{
	return partner_ids;
}

void
DeletePartnersRequest::setPartnerIds(std::list <std::string> partner_ids)
{
	this->partner_ids = partner_ids;
}

std::string
DeletePartnersRequest::getPartnerType()
{
	return partner_type;
}

void
DeletePartnersRequest::setPartnerType(std::string  partner_type)
{
	this->partner_type = partner_type;
}



