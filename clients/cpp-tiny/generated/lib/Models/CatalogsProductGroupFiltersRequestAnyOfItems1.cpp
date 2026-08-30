

#include "CatalogsProductGroupFiltersRequestAnyOfItems1.h"

using namespace Tiny;

CatalogsProductGroupFiltersRequestAnyOfItems1::CatalogsProductGroupFiltersRequestAnyOfItems1()
{
	all_of = std::list<CatalogsProductGroupFilterKeys>();
}

CatalogsProductGroupFiltersRequestAnyOfItems1::CatalogsProductGroupFiltersRequestAnyOfItems1(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFiltersRequestAnyOfItems1::~CatalogsProductGroupFiltersRequestAnyOfItems1()
{

}

void
CatalogsProductGroupFiltersRequestAnyOfItems1::fromJson(std::string jsonObj)
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
CatalogsProductGroupFiltersRequestAnyOfItems1::toJson()
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
CatalogsProductGroupFiltersRequestAnyOfItems1::getAllOf()
{
	return all_of;
}

void
CatalogsProductGroupFiltersRequestAnyOfItems1::setAllOf(std::list<CatalogsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



