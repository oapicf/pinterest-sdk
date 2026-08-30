

#include "ProductTagsBulkDeleteRequest.h"

using namespace Tiny;

ProductTagsBulkDeleteRequest::ProductTagsBulkDeleteRequest()
{
	product_tags = std::list<ProductTagItem>();
}

ProductTagsBulkDeleteRequest::ProductTagsBulkDeleteRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductTagsBulkDeleteRequest::~ProductTagsBulkDeleteRequest()
{

}

void
ProductTagsBulkDeleteRequest::fromJson(std::string jsonObj)
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
ProductTagsBulkDeleteRequest::toJson()
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
ProductTagsBulkDeleteRequest::getProductTags()
{
	return product_tags;
}

void
ProductTagsBulkDeleteRequest::setProductTags(std::list<ProductTagItem> product_tags)
{
	this->product_tags = product_tags;
}



