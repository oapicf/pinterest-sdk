

#include "AdShoppingPreviewCreativeType.h"

using namespace Tiny;

AdShoppingPreviewCreativeType::AdShoppingPreviewCreativeType()
{
}

AdShoppingPreviewCreativeType::AdShoppingPreviewCreativeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdShoppingPreviewCreativeType::~AdShoppingPreviewCreativeType()
{

}

void
AdShoppingPreviewCreativeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdShoppingPreviewCreativeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



