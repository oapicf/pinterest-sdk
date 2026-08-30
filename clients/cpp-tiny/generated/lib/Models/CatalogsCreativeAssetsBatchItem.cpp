

#include "CatalogsCreativeAssetsBatchItem.h"

using namespace Tiny;

CatalogsCreativeAssetsBatchItem::CatalogsCreativeAssetsBatchItem()
{
	attributes = CatalogsUpdatableCreativeAssetsAttributes();
	creative_assets_id = std::string();
	operation = std::string();
}

CatalogsCreativeAssetsBatchItem::CatalogsCreativeAssetsBatchItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsBatchItem::~CatalogsCreativeAssetsBatchItem()
{

}

void
CatalogsCreativeAssetsBatchItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsUpdatableCreativeAssetsAttributes* obj = &attributes;
		obj->fromJson(value.dump());

    }

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
CatalogsCreativeAssetsBatchItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["creative_assets_id"] = getCreativeAssetsId();






    object["operation"] = getOperation();



    return object;

}

CatalogsUpdatableCreativeAssetsAttributes
CatalogsCreativeAssetsBatchItem::getAttributes()
{
	return attributes;
}

void
CatalogsCreativeAssetsBatchItem::setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsCreativeAssetsBatchItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsBatchItem::setCreativeAssetsId(std::string creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsCreativeAssetsBatchItem::getOperation()
{
	return operation;
}

void
CatalogsCreativeAssetsBatchItem::setOperation(std::string operation)
{
	this->operation = operation;
}



