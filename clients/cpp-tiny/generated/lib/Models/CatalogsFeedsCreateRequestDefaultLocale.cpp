

#include "CatalogsFeedsCreateRequest_default_locale.h"

using namespace Tiny;

CatalogsFeedsCreateRequest_default_locale::CatalogsFeedsCreateRequest_default_locale()
{
}

CatalogsFeedsCreateRequest_default_locale::CatalogsFeedsCreateRequest_default_locale(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedsCreateRequest_default_locale::~CatalogsFeedsCreateRequest_default_locale()
{

}

void
CatalogsFeedsCreateRequest_default_locale::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CatalogsFeedsCreateRequest_default_locale::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



