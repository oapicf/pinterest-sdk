

#include "AudienceDefinitionResponse.h"

using namespace Tiny;

AudienceDefinitionResponse::AudienceDefinitionResponse()
{
	items = std::list<AudienceDefinition>();
}

AudienceDefinitionResponse::AudienceDefinitionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDefinitionResponse::~AudienceDefinitionResponse()
{

}

void
AudienceDefinitionResponse::fromJson(std::string jsonObj)
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
AudienceDefinitionResponse::toJson()
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
AudienceDefinitionResponse::getItems()
{
	return items;
}

void
AudienceDefinitionResponse::setItems(std::list <AudienceDefinition> items)
{
	this->items = items;
}



