

#include "CatalogsProductGroupFiltersRequest.h"

using namespace Tiny;

CatalogsProductGroupFiltersRequest::CatalogsProductGroupFiltersRequest()
{
	any_of = std::list<CatalogsProductGroupFilterKeys>();
	all_of = std::list<CatalogsProductGroupFilterKeys>();
}

CatalogsProductGroupFiltersRequest::CatalogsProductGroupFiltersRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFiltersRequest::~CatalogsProductGroupFiltersRequest()
{

}

void
CatalogsProductGroupFiltersRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *any_ofKey = "any_of";

    if(object.has_key(any_ofKey))
    {
        bourne::json value = object[any_ofKey];


        std::list<CatalogsProductGroupFilterKeys> any_of_list;
        CatalogsProductGroupFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            any_of_list.push_back(element);
        }
        any_of = any_of_list;


    }

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
CatalogsProductGroupFiltersRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsProductGroupFilterKeys> any_of_list = getAnyOf();
    bourne::json any_of_arr = bourne::json::array();

    for(auto& var : any_of_list)
    {
        CatalogsProductGroupFilterKeys obj = var;
        any_of_arr.append(obj.toJson());
    }
    object["any_of"] = any_of_arr;






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
CatalogsProductGroupFiltersRequest::getAnyOf()
{
	return any_of;
}

void
CatalogsProductGroupFiltersRequest::setAnyOf(std::list<CatalogsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}

std::list<CatalogsProductGroupFilterKeys>
CatalogsProductGroupFiltersRequest::getAllOf()
{
	return all_of;
}

void
CatalogsProductGroupFiltersRequest::setAllOf(std::list<CatalogsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



