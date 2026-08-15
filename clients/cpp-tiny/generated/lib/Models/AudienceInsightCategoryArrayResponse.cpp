

#include "AudienceInsightCategoryArrayResponse.h"

using namespace Tiny;

AudienceInsightCategoryArrayResponse::AudienceInsightCategoryArrayResponse()
{
	items = std::list<AudienceInsightCategoryCommon>();
}

AudienceInsightCategoryArrayResponse::AudienceInsightCategoryArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceInsightCategoryArrayResponse::~AudienceInsightCategoryArrayResponse()
{

}

void
AudienceInsightCategoryArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AudienceInsightCategoryCommon> items_list;
        AudienceInsightCategoryCommon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AudienceInsightCategoryArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AudienceInsightCategoryCommon> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AudienceInsightCategoryCommon obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AudienceInsightCategoryCommon>
AudienceInsightCategoryArrayResponse::getItems()
{
	return items;
}

void
AudienceInsightCategoryArrayResponse::setItems(std::list <AudienceInsightCategoryCommon> items)
{
	this->items = items;
}



