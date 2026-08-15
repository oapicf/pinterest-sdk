

#include "CatalogsCreativeAssetsProductMetadata.h"

using namespace Tiny;

CatalogsCreativeAssetsProductMetadata::CatalogsCreativeAssetsProductMetadata()
{
	creative_assets_id = std::string();
	visibility = CreativeAssetsVisibilityType();
}

CatalogsCreativeAssetsProductMetadata::CatalogsCreativeAssetsProductMetadata(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsProductMetadata::~CatalogsCreativeAssetsProductMetadata()
{

}

void
CatalogsCreativeAssetsProductMetadata::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *creative_assets_idKey = "creative_assets_id";

    if(object.has_key(creative_assets_idKey))
    {
        bourne::json value = object[creative_assets_idKey];



        jsonToValue(&creative_assets_id, value, "std::string");


    }

    const char *visibilityKey = "visibility";

    if(object.has_key(visibilityKey))
    {
        bourne::json value = object[visibilityKey];




        CreativeAssetsVisibilityType* obj = &visibility;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsCreativeAssetsProductMetadata::toJson()
{
    bourne::json object = bourne::json::object();





    object["creative_assets_id"] = getCreativeAssetsId();







	object["visibility"] = getVisibility().toJson();


    return object;

}

std::string
CatalogsCreativeAssetsProductMetadata::getCreativeAssetsId()
{
	return creative_assets_id;
}

void
CatalogsCreativeAssetsProductMetadata::setCreativeAssetsId(std::string  creative_assets_id)
{
	this->creative_assets_id = creative_assets_id;
}

CreativeAssetsVisibilityType
CatalogsCreativeAssetsProductMetadata::getVisibility()
{
	return visibility;
}

void
CatalogsCreativeAssetsProductMetadata::setVisibility(CreativeAssetsVisibilityType  visibility)
{
	this->visibility = visibility;
}



