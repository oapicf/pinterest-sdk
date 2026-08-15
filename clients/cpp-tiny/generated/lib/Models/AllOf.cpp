

#include "All_of.h"

using namespace Tiny;

All_of::All_of()
{
	all_of = std::list<CatalogsProductGroupFilterKeys>();
}

All_of::All_of(std::string jsonString)
{
	this->fromJson(jsonString);
}

All_of::~All_of()
{

}

void
All_of::fromJson(std::string jsonObj)
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
All_of::toJson()
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
All_of::getAllOf()
{
	return all_of;
}

void
All_of::setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of)
{
	this->all_of = all_of;
}



