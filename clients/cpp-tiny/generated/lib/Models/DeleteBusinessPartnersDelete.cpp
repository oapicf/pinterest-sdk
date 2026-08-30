

#include "DeleteBusinessPartnersDelete.h"

using namespace Tiny;

DeleteBusinessPartnersDelete::DeleteBusinessPartnersDelete()
{
	partner_ids = std::list<std::string>();
	partner_type = null;
}

DeleteBusinessPartnersDelete::DeleteBusinessPartnersDelete(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteBusinessPartnersDelete::~DeleteBusinessPartnersDelete()
{

}

void
DeleteBusinessPartnersDelete::fromJson(std::string jsonObj)
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




        NullablePartnerType* obj = &partner_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
DeleteBusinessPartnersDelete::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> partner_ids_list = getPartnerIds();
    bourne::json partner_ids_arr = bourne::json::array();

    for(auto& var : partner_ids_list)
    {
        partner_ids_arr.append(var);
    }
    object["partner_ids"] = partner_ids_arr;










	object["partner_type"] = getPartnerType().toJson();


    return object;

}

std::list<std::string>
DeleteBusinessPartnersDelete::getPartnerIds()
{
	return partner_ids;
}

void
DeleteBusinessPartnersDelete::setPartnerIds(std::list<std::string> partner_ids)
{
	this->partner_ids = partner_ids;
}

NullablePartnerType
DeleteBusinessPartnersDelete::getPartnerType()
{
	return partner_type;
}

void
DeleteBusinessPartnersDelete::setPartnerType(NullablePartnerType partner_type)
{
	this->partner_type = partner_type;
}



