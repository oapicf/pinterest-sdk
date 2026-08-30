

#include "CatalogsDeleteCreativeAssetsItem.h"

using namespace Tiny;

CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem()
{
	creative_assets_id = std::string();
	operation = std::string();
}

CatalogsDeleteCreativeAssetsItem::CatalogsDeleteCreativeAssetsItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsDeleteCreativeAssetsItem::~CatalogsDeleteCreativeAssetsItem()
{

}

void
CatalogsDeleteCreativeAssetsItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creative_assets_idKey = "creative_assets_id";

    if(object.has_key(creative_assets_idKey))
    {
        bourne::json value = object[creative_assets_idKey];



        jsonToValue(&creative_assets_id, value, "std::string");


    }

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }


}

bourne::json
CatalogsDeleteCreativeAssetsItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["creative_assets_id"] = getCreativeAssetsId();






    object["operation"] = getOperation();



    return object;

}

std::string
CatalogsDeleteCreativeAssetsItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsDeleteCreativeAssetsItem::setCreativeAssetsId(std::string creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsDeleteCreativeAssetsItem::getOperation()
{
	return operation;
}

void
CatalogsDeleteCreativeAssetsItem::setOperation(std::string operation)
{
	this->operation = operation;
}



