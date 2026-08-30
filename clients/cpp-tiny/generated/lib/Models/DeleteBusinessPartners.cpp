

#include "DeleteBusinessPartners.h"

using namespace Tiny;

DeleteBusinessPartners::DeleteBusinessPartners()
{
	deleted_partners = std::list<std::string>();
}

DeleteBusinessPartners::DeleteBusinessPartners(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteBusinessPartners::~DeleteBusinessPartners()
{

}

void
DeleteBusinessPartners::fromJson(std::string jsonObj)
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
DeleteBusinessPartners::toJson()
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
DeleteBusinessPartners::getDeletedPartners()
{
	return deleted_partners;
}

void
DeleteBusinessPartners::setDeletedPartners(std::list<std::string> deleted_partners)
{
	this->deleted_partners = deleted_partners;
}



