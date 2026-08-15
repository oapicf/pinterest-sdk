

#include "CatalogsHotelProductGroupFiltersAllOf.h"

using namespace Tiny;

CatalogsHotelProductGroupFiltersAllOf::CatalogsHotelProductGroupFiltersAllOf()
{
	all_of = std::list<CatalogsHotelProductGroupFilterKeys>();
}

CatalogsHotelProductGroupFiltersAllOf::CatalogsHotelProductGroupFiltersAllOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupFiltersAllOf::~CatalogsHotelProductGroupFiltersAllOf()
{

}

void
CatalogsHotelProductGroupFiltersAllOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *all_ofKey = "all_of";

    if(object.has_key(all_ofKey))
    {
        bourne::json value = object[all_ofKey];


        std::list<CatalogsHotelProductGroupFilterKeys> all_of_list;
        CatalogsHotelProductGroupFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            all_of_list.push_back(element);
        }
        all_of = all_of_list;


    }


}

bourne::json
CatalogsHotelProductGroupFiltersAllOf::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsHotelProductGroupFilterKeys> all_of_list = getAllOf();
    bourne::json all_of_arr = bourne::json::array();

    for(auto& var : all_of_list)
    {
        CatalogsHotelProductGroupFilterKeys obj = var;
        all_of_arr.append(obj.toJson());
    }
    object["all_of"] = all_of_arr;




    return object;

}

std::list<CatalogsHotelProductGroupFilterKeys>
CatalogsHotelProductGroupFiltersAllOf::getAllOf()
{
	return all_of;
}

void
CatalogsHotelProductGroupFiltersAllOf::setAllOf(std::list <CatalogsHotelProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



