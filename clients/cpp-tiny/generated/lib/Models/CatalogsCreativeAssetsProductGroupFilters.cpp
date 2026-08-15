

#include "CatalogsCreativeAssetsProductGroupFilters.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupFilters::CatalogsCreativeAssetsProductGroupFilters()
{
	any_of = std::list<CatalogsCreativeAssetsProductGroupFilterKeys>();
	all_of = std::list<CatalogsCreativeAssetsProductGroupFilterKeys>();
}

CatalogsCreativeAssetsProductGroupFilters::CatalogsCreativeAssetsProductGroupFilters(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupFilters::~CatalogsCreativeAssetsProductGroupFilters()
{

}

void
CatalogsCreativeAssetsProductGroupFilters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *any_ofKey = "any_of";

    if(object.has_key(any_ofKey))
    {
        bourne::json value = object[any_ofKey];


        std::list<CatalogsCreativeAssetsProductGroupFilterKeys> any_of_list;
        CatalogsCreativeAssetsProductGroupFilterKeys element;
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


        std::list<CatalogsCreativeAssetsProductGroupFilterKeys> all_of_list;
        CatalogsCreativeAssetsProductGroupFilterKeys element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            all_of_list.push_back(element);
        }
        all_of = all_of_list;


    }


}

bourne::json
CatalogsCreativeAssetsProductGroupFilters::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> any_of_list = getAnyOf();
    bourne::json any_of_arr = bourne::json::array();

    for(auto& var : any_of_list)
    {
        CatalogsCreativeAssetsProductGroupFilterKeys obj = var;
        any_of_arr.append(obj.toJson());
    }
    object["any_of"] = any_of_arr;






    std::list<CatalogsCreativeAssetsProductGroupFilterKeys> all_of_list = getAllOf();
    bourne::json all_of_arr = bourne::json::array();

    for(auto& var : all_of_list)
    {
        CatalogsCreativeAssetsProductGroupFilterKeys obj = var;
        all_of_arr.append(obj.toJson());
    }
    object["all_of"] = all_of_arr;




    return object;

}

std::list<CatalogsCreativeAssetsProductGroupFilterKeys>
CatalogsCreativeAssetsProductGroupFilters::getAnyOf()
{
	return any_of;
}

void
CatalogsCreativeAssetsProductGroupFilters::setAnyOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}

std::list<CatalogsCreativeAssetsProductGroupFilterKeys>
CatalogsCreativeAssetsProductGroupFilters::getAllOf()
{
	return all_of;
}

void
CatalogsCreativeAssetsProductGroupFilters::setAllOf(std::list <CatalogsCreativeAssetsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



