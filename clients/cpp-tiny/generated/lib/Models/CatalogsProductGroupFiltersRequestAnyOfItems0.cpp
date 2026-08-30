

#include "CatalogsProductGroupFiltersRequestAnyOfItems0.h"

using namespace Tiny;

CatalogsProductGroupFiltersRequestAnyOfItems0::CatalogsProductGroupFiltersRequestAnyOfItems0()
{
	any_of = std::list<CatalogsProductGroupFilterKeys>();
}

CatalogsProductGroupFiltersRequestAnyOfItems0::CatalogsProductGroupFiltersRequestAnyOfItems0(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsProductGroupFiltersRequestAnyOfItems0::~CatalogsProductGroupFiltersRequestAnyOfItems0()
{

}

void
CatalogsProductGroupFiltersRequestAnyOfItems0::fromJson(std::string jsonObj)
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


}

bourne::json
CatalogsProductGroupFiltersRequestAnyOfItems0::toJson()
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




    return object;

}

std::list<CatalogsProductGroupFilterKeys>
CatalogsProductGroupFiltersRequestAnyOfItems0::getAnyOf()
{
	return any_of;
}

void
CatalogsProductGroupFiltersRequestAnyOfItems0::setAnyOf(std::list<CatalogsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}



