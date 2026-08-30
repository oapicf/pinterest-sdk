

#include "CatalogsCreativeAssetsFeedsCreateRequest_default_locale.h"

using namespace Tiny;

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::CatalogsCreativeAssetsFeedsCreateRequest_default_locale()
{
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::CatalogsCreativeAssetsFeedsCreateRequest_default_locale(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale::~CatalogsCreativeAssetsFeedsCreateRequest_default_locale()
{

}

void
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsCreativeAssetsFeedsCreateRequest_default_locale::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



