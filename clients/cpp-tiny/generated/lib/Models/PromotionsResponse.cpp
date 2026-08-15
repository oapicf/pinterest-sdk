

#include "PromotionsResponse.h"

using namespace Tiny;

PromotionsResponse::PromotionsResponse()
{
	promotions = std::list<PromotionArrayElement>();
}

PromotionsResponse::PromotionsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionsResponse::~PromotionsResponse()
{

}

void
PromotionsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *promotionsKey = "promotions";

    if(object.has_key(promotionsKey))
    {
        bourne::json value = object[promotionsKey];


        std::list<PromotionArrayElement> promotions_list;
        PromotionArrayElement element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            promotions_list.push_back(element);
        }
        promotions = promotions_list;


    }


}

bourne::json
PromotionsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PromotionArrayElement> promotions_list = getPromotions();
    bourne::json promotions_arr = bourne::json::array();

    for(auto& var : promotions_list)
    {
        PromotionArrayElement obj = var;
        promotions_arr.append(obj.toJson());
    }
    object["promotions"] = promotions_arr;




    return object;

}

std::list<PromotionArrayElement>
PromotionsResponse::getPromotions()
{
	return promotions;
}

void
PromotionsResponse::setPromotions(std::list <PromotionArrayElement> promotions)
{
	this->promotions = promotions;
}



