

#include "CatalogsHotelProductGroupFiltersAnyOf.h"

using namespace Tiny;

CatalogsHotelProductGroupFiltersAnyOf::CatalogsHotelProductGroupFiltersAnyOf()
{
	any_of = std::list<CatalogsHotelProductGroupFilterKeys>();
}

CatalogsHotelProductGroupFiltersAnyOf::CatalogsHotelProductGroupFiltersAnyOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelProductGroupFiltersAnyOf::~CatalogsHotelProductGroupFiltersAnyOf()
{

}

void
CatalogsHotelProductGroupFiltersAnyOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *any_ofKey = "any_of";

    if(object.has_key(any_ofKey))
    {
        bourne::json value = object[any_ofKey];


        std::list<CatalogsHotelProductGroupFilterKeys> any_of_list;
        CatalogsHotelProductGroupFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            any_of_list.push_back(element);
        }
        any_of = any_of_list;


    }


}

bourne::json
CatalogsHotelProductGroupFiltersAnyOf::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsHotelProductGroupFilterKeys> any_of_list = getAnyOf();
    bourne::json any_of_arr = bourne::json::array();

    for(auto& var : any_of_list)
    {
        CatalogsHotelProductGroupFilterKeys obj = var;
        any_of_arr.append(obj.toJson());
    }
    object["any_of"] = any_of_arr;




    return object;

}

std::list<CatalogsHotelProductGroupFilterKeys>
CatalogsHotelProductGroupFiltersAnyOf::getAnyOf()
{
	return any_of;
}

void
CatalogsHotelProductGroupFiltersAnyOf::setAnyOf(std::list<CatalogsHotelProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}



