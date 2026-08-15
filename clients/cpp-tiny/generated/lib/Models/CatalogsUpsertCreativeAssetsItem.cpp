

#include "CatalogsUpsertCreativeAssetsItem.h"

using namespace Tiny;

CatalogsUpsertCreativeAssetsItem::CatalogsUpsertCreativeAssetsItem()
{
	attributes = CatalogsCreativeAssetsAttributes();
	creative_assets_id = std::string();
	operation = std::string();
}

CatalogsUpsertCreativeAssetsItem::CatalogsUpsertCreativeAssetsItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpsertCreativeAssetsItem::~CatalogsUpsertCreativeAssetsItem()
{

}

void
CatalogsUpsertCreativeAssetsItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];




        CatalogsCreativeAssetsAttributes* obj = &attributes;
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
CatalogsUpsertCreativeAssetsItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["attributes"] = getAttributes().toJson();





    object["creative_assets_id"] = getCreativeAssetsId();






    object["operation"] = getOperation();



    return object;

}

CatalogsCreativeAssetsAttributes
CatalogsUpsertCreativeAssetsItem::getAttributes()
{
	return attributes;
}

void
CatalogsUpsertCreativeAssetsItem::setAttributes(CatalogsCreativeAssetsAttributes  attributes)
{
	this->attributes = attributes;
}

std::string
CatalogsUpsertCreativeAssetsItem::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsUpsertCreativeAssetsItem::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

std::string
CatalogsUpsertCreativeAssetsItem::getOperation()
{
	return operation;
}

void
CatalogsUpsertCreativeAssetsItem::setOperation(std::string  operation)
{
	this->operation = operation;
}



