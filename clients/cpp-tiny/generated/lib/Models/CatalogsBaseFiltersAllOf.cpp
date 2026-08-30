

#include "CatalogsBaseFiltersAllOf.h"

using namespace Tiny;

CatalogsBaseFiltersAllOf::CatalogsBaseFiltersAllOf()
{
	all_of = std::list<CatalogsBaseFilterKeys>();
}

CatalogsBaseFiltersAllOf::CatalogsBaseFiltersAllOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsBaseFiltersAllOf::~CatalogsBaseFiltersAllOf()
{

}

void
CatalogsBaseFiltersAllOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *all_ofKey = "all_of";

    if(object.has_key(all_ofKey))
    {
        bourne::json value = object[all_ofKey];


        std::list<CatalogsBaseFilterKeys> all_of_list;
        CatalogsBaseFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            all_of_list.push_back(element);
        }
        all_of = all_of_list;


    }


}

bourne::json
CatalogsBaseFiltersAllOf::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsBaseFilterKeys> all_of_list = getAllOf();
    bourne::json all_of_arr = bourne::json::array();

    for(auto& var : all_of_list)
    {
        CatalogsBaseFilterKeys obj = var;
        all_of_arr.append(obj.toJson());
    }
    object["all_of"] = all_of_arr;




    return object;

}

std::list<CatalogsBaseFilterKeys>
CatalogsBaseFiltersAllOf::getAllOf()
{
	return all_of;
}

void
CatalogsBaseFiltersAllOf::setAllOf(std::list<CatalogsBaseFilterKeys> all_of)
{
	this->all_of = all_of;
}



