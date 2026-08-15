

#include "ProductGroupPromotionCreateRequest.h"

using namespace Tiny;

ProductGroupPromotionCreateRequest::ProductGroupPromotionCreateRequest()
{
	ad_group_id = std::string();
	product_group_promotion = std::list<ProductGroupPromotion>();
}

ProductGroupPromotionCreateRequest::ProductGroupPromotionCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupPromotionCreateRequest::~ProductGroupPromotionCreateRequest()
{

}

void
ProductGroupPromotionCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_group_idKey = "ad_group_id";

    if(object.has_key(ad_group_idKey))
    {
        bourne::json value = object[ad_group_idKey];



        jsonToValue(&ad_group_id, value, "std::string");


    }

    const char *product_group_promotionKey = "product_group_promotion";

    if(object.has_key(product_group_promotionKey))
    {
        bourne::json value = object[product_group_promotionKey];


        std::list<ProductGroupPromotion> product_group_promotion_list;
        ProductGroupPromotion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_group_promotion_list.push_back(element);
        }
        product_group_promotion = product_group_promotion_list;


    }


}

bourne::json
ProductGroupPromotionCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_group_id"] = getAdGroupId();





    std::list<ProductGroupPromotion> product_group_promotion_list = getProductGroupPromotion();
    bourne::json product_group_promotion_arr = bourne::json::array();

    for(auto& var : product_group_promotion_list)
    {
        ProductGroupPromotion obj = var;
        product_group_promotion_arr.append(obj.toJson());
    }
    object["product_group_promotion"] = product_group_promotion_arr;




    return object;

}

std::string
ProductGroupPromotionCreateRequest::getAdGroupId()
{
	return ad_group_id;
}

void
ProductGroupPromotionCreateRequest::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::list<ProductGroupPromotion>
ProductGroupPromotionCreateRequest::getProductGroupPromotion()
{
	return product_group_promotion;
}

void
ProductGroupPromotionCreateRequest::setProductGroupPromotion(std::list <ProductGroupPromotion> product_group_promotion)
{
	this->product_group_promotion = product_group_promotion;
}



