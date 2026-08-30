

#include "CatalogsBaseFiltersAnyOf.h"

using namespace Tiny;

CatalogsBaseFiltersAnyOf::CatalogsBaseFiltersAnyOf()
{
	any_of = std::list<CatalogsBaseFilterKeys>();
}

CatalogsBaseFiltersAnyOf::CatalogsBaseFiltersAnyOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsBaseFiltersAnyOf::~CatalogsBaseFiltersAnyOf()
{

}

void
CatalogsBaseFiltersAnyOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *any_ofKey = "any_of";

    if(object.has_key(any_ofKey))
    {
        bourne::json value = object[any_ofKey];


        std::list<CatalogsBaseFilterKeys> any_of_list;
        CatalogsBaseFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            any_of_list.push_back(element);
        }
        any_of = any_of_list;


    }


}

bourne::json
CatalogsBaseFiltersAnyOf::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsBaseFilterKeys> any_of_list = getAnyOf();
    bourne::json any_of_arr = bourne::json::array();

    for(auto& var : any_of_list)
    {
        CatalogsBaseFilterKeys obj = var;
        any_of_arr.append(obj.toJson());
    }
    object["any_of"] = any_of_arr;




    return object;

}

std::list<CatalogsBaseFilterKeys>
CatalogsBaseFiltersAnyOf::getAnyOf()
{
	return any_of;
}

void
CatalogsBaseFiltersAnyOf::setAnyOf(std::list<CatalogsBaseFilterKeys> any_of)
{
	this->any_of = any_of;
}



