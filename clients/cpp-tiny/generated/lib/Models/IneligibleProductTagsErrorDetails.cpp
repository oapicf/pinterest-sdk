

#include "IneligibleProductTagsErrorDetails.h"

using namespace Tiny;

IneligibleProductTagsErrorDetails::IneligibleProductTagsErrorDetails()
{
	product_tags = std::list<IneligibleProductTagErrorItem>();
}

IneligibleProductTagsErrorDetails::IneligibleProductTagsErrorDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

IneligibleProductTagsErrorDetails::~IneligibleProductTagsErrorDetails()
{

}

void
IneligibleProductTagsErrorDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *product_tagsKey = "product_tags";

    if(object.has_key(product_tagsKey))
    {
        bourne::json value = object[product_tagsKey];


        std::list<IneligibleProductTagErrorItem> product_tags_list;
        IneligibleProductTagErrorItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_tags_list.push_back(element);
        }
        product_tags = product_tags_list;


    }


}

bourne::json
IneligibleProductTagsErrorDetails::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<IneligibleProductTagErrorItem> product_tags_list = getProductTags();
    bourne::json product_tags_arr = bourne::json::array();

    for(auto& var : product_tags_list)
    {
        IneligibleProductTagErrorItem obj = var;
        product_tags_arr.append(obj.toJson());
    }
    object["product_tags"] = product_tags_arr;




    return object;

}

std::list<IneligibleProductTagErrorItem>
IneligibleProductTagsErrorDetails::getProductTags()
{
	return product_tags;
}

void
IneligibleProductTagsErrorDetails::setProductTags(std::list<IneligibleProductTagErrorItem> product_tags)
{
	this->product_tags = product_tags;
}



