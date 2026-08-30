

#include "CatalogsCreativeAssetsProductGroupFiltersAnyOf.h"

using namespace Tiny;

CatalogsCreativeAssetsProductGroupFiltersAnyOf::CatalogsCreativeAssetsProductGroupFiltersAnyOf()
{
	any_of = std::list<CatalogsCreativeAssetsProductGroupFilterKeys>();
}

CatalogsCreativeAssetsProductGroupFiltersAnyOf::CatalogsCreativeAssetsProductGroupFiltersAnyOf(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductGroupFiltersAnyOf::~CatalogsCreativeAssetsProductGroupFiltersAnyOf()
{

}

void
CatalogsCreativeAssetsProductGroupFiltersAnyOf::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsCreativeAssetsProductGroupFiltersAnyOf::toJson()
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




    return object;

}

std::list<CatalogsCreativeAssetsProductGroupFilterKeys>
CatalogsCreativeAssetsProductGroupFiltersAnyOf::getAnyOf()
{
	return any_of;
}

void
CatalogsCreativeAssetsProductGroupFiltersAnyOf::setAnyOf(std::list<CatalogsCreativeAssetsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}



