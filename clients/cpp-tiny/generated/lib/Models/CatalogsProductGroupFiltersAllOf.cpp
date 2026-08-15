

#include "CatalogsProductGroupFiltersAllOf.h"

using namespace Tiny;

CatalogsProductGroupFiltersAllOf::CatalogsProductGroupFiltersAllOf()
{
	all_of = std::list<CatalogsProductGroupFilterKeys>();
}

CatalogsProductGroupFiltersAllOf::CatalogsProductGroupFiltersAllOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFiltersAllOf::~CatalogsProductGroupFiltersAllOf()
{

}

void
CatalogsProductGroupFiltersAllOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *all_ofKey = "all_of";

    if(object.has_key(all_ofKey))
    {
        bourne::json value = object[all_ofKey];


        std::list<CatalogsProductGroupFilterKeys> all_of_list;
        CatalogsProductGroupFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            all_of_list.push_back(element);
        }
        all_of = all_of_list;


    }


}

bourne::json
CatalogsProductGroupFiltersAllOf::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsProductGroupFilterKeys> all_of_list = getAllOf();
    bourne::json all_of_arr = bourne::json::array();

    for(auto& var : all_of_list)
    {
        CatalogsProductGroupFilterKeys obj = var;
        all_of_arr.append(obj.toJson());
    }
    object["all_of"] = all_of_arr;




    return object;

}

std::list<CatalogsProductGroupFilterKeys>
CatalogsProductGroupFiltersAllOf::getAllOf()
{
	return all_of;
}

void
CatalogsProductGroupFiltersAllOf::setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



