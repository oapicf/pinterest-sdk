

#include "DeletePartnersResponse.h"

using namespace Tiny;

DeletePartnersResponse::DeletePartnersResponse()
{
	deleted_partners = std::list<std::string>();
}

DeletePartnersResponse::DeletePartnersResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnersResponse::~DeletePartnersResponse()
{

}

void
DeletePartnersResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deleted_partnersKey = "deleted_partners";

    if(object.has_key(deleted_partnersKey))
    {
        bourne::json value = object[deleted_partnersKey];


        std::list<std::string> deleted_partners_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            deleted_partners_list.push_back(element);
        }
        deleted_partners = deleted_partners_list;


    }


}

bourne::json
DeletePartnersResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> deleted_partners_list = getDeletedPartners();
    bourne::json deleted_partners_arr = bourne::json::array();

    for(auto& var : deleted_partners_list)
    {
        deleted_partners_arr.append(var);
    }
    object["deleted_partners"] = deleted_partners_arr;






    return object;

}

std::list<std::string>
DeletePartnersResponse::getDeletedPartners()
{
	return deleted_partners;
}

void
DeletePartnersResponse::setDeletedPartners(std::list <std::string> deleted_partners)
{
	this->deleted_partners = deleted_partners;
}



