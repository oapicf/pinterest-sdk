

#include "ItemAttributesRequest_allOf_image_link.h"

using namespace Tiny;

ItemAttributesRequest_allOf_image_link::ItemAttributesRequest_allOf_image_link()
{
}

ItemAttributesRequest_allOf_image_link::ItemAttributesRequest_allOf_image_link(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributesRequest_allOf_image_link::~ItemAttributesRequest_allOf_image_link()
{

}

void
ItemAttributesRequest_allOf_image_link::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ItemAttributesRequest_allOf_image_link::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



