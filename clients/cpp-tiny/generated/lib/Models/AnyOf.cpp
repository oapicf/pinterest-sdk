

#include "Any_of.h"

using namespace Tiny;

Any_of::Any_of()
{
	any_of = std::list<CatalogsProductGroupFilterKeys>();
}

Any_of::Any_of(std::string jsonString)
{
	this->fromJson(jsonString);
}

Any_of::~Any_of()
{

}

void
Any_of::fromJson(std::string jsonObj)
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
Any_of::toJson()
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
Any_of::getAnyOf()
{
	return any_of;
}

void
Any_of::setAnyOf(std::list <CatalogsProductGroupFilterKeys> any_of)
{
	this->any_of = any_of;
}



