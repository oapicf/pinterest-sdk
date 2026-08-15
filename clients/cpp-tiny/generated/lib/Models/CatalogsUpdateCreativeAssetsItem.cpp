

#include "CatalogsUpdateCreativeAssetsItem.h"

using namespace Tiny;

CatalogsUpdateCreativeAssetsItem::CatalogsUpdateCreativeAssetsItem()
{
	attributes = CatalogsUpdatableCreativeAssetsAttributes();
	creative_assets_id = std::string();
	operation = std::string();
}

CatalogsUpdateCreativeAssetsItem::CatalogsUpdateCreativeAssetsItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpdateCreativeAssetsItem::~CatalogsUpdateCreativeAssetsItem()
{

}

void
CatalogsUpdateCreativeAssetsItem::fromJson(std::string jsonObj)
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
CatalogsUpdateCreativeAssetsItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["creative_assets_id"] = getCreativeAssetsId();






    object["operation"] = getOperation();



    return object;

}

CatalogsUpdatableCreativeAssetsAttributes
CatalogsUpdateCreativeAssetsItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpdateCreativeAssetsItem::setAttributes(CatalogsUpdatableCreativeAssetsAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpdateCreativeAssetsItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsUpdateCreativeAssetsItem::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsUpdateCreativeAssetsItem::getOperation()
{
	return operation;
}

void
CatalogsUpdateCreativeAssetsItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



