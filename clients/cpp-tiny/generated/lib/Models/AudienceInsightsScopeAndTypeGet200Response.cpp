

#include "Audience_insights_scope_and_type_get_200_response.h"

using namespace Tiny;

Audience_insights_scope_and_type_get_200_response::Audience_insights_scope_and_type_get_200_response()
{
	items = std::list<AudienceDefinition>();
}

Audience_insights_scope_and_type_get_200_response::Audience_insights_scope_and_type_get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Audience_insights_scope_and_type_get_200_response::~Audience_insights_scope_and_type_get_200_response()
{

}

void
Audience_insights_scope_and_type_get_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AudienceDefinition> items_list;
        AudienceDefinition element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Audience_insights_scope_and_type_get_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AudienceDefinition> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AudienceDefinition obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AudienceDefinition>
Audience_insights_scope_and_type_get_200_response::getItems()
{
	return items;
}

void
Audience_insights_scope_and_type_get_200_response::setItems(std::list<AudienceDefinition> items)
{
	this->items = items;
}



