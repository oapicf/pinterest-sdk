

#include "CatalogsCreativeAssetsProductGroupFiltersAllOf.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupFiltersAllOf::CatalogsCreativeAssetsProductGroupFiltersAllOf()
{
	all_of = std::list<CatalogsCreativeAssetsProductGroupFilterKeys>();
}

CatalogsCreativeAssetsProductGroupFiltersAllOf::CatalogsCreativeAssetsProductGroupFiltersAllOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupFiltersAllOf::~CatalogsCreativeAssetsProductGroupFiltersAllOf()
{

}

void
CatalogsCreativeAssetsProductGroupFiltersAllOf::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CatalogsCreativeAssetsProductGroupFiltersAllOf::toJson()
{
    bourne::json object = bourne::json::object();




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
CatalogsCreativeAssetsProductGroupFiltersAllOf::getAllOf()
{
	return all_of;
}

void
CatalogsCreativeAssetsProductGroupFiltersAllOf::setAllOf(std::list<CatalogsCreativeAssetsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



