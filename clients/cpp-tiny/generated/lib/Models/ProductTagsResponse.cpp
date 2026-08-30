

#include "ProductTagsResponse.h"

using namespace Tiny;

ProductTagsResponse::ProductTagsResponse()
{
	product_tags = std::list<ProductTagItem>();
}

ProductTagsResponse::ProductTagsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductTagsResponse::~ProductTagsResponse()
{

}

void
ProductTagsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *product_tagsKey = "product_tags";

    if(object.has_key(product_tagsKey))
    {
        bourne::json value = object[product_tagsKey];


        std::list<ProductTagItem> product_tags_list;
        ProductTagItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_tags_list.push_back(element);
        }
        product_tags = product_tags_list;


    }


}

bourne::json
ProductTagsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ProductTagItem> product_tags_list = getProductTags();
    bourne::json product_tags_arr = bourne::json::array();

    for(auto& var : product_tags_list)
    {
        ProductTagItem obj = var;
        product_tags_arr.append(obj.toJson());
    }
    object["product_tags"] = product_tags_arr;




    return object;

}

std::list<ProductTagItem>
ProductTagsResponse::getProductTags()
{
	return product_tags;
}

void
ProductTagsResponse::setProductTags(std::list<ProductTagItem> product_tags)
{
	this->product_tags = product_tags;
}



