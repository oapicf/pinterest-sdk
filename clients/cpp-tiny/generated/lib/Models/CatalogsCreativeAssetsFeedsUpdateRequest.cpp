

#include "CatalogsCreativeAssetsFeedsUpdateRequest.h"

using namespace Tiny;

CatalogsCreativeAssetsFeedsUpdateRequest::CatalogsCreativeAssetsFeedsUpdateRequest()
{
	catalog_type = CatalogsType();
	credentials = CatalogsFeedCredentials();
	default_currency = NullableCurrency();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = CatalogsStatus();
}

CatalogsCreativeAssetsFeedsUpdateRequest::CatalogsCreativeAssetsFeedsUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsFeedsUpdateRequest::~CatalogsCreativeAssetsFeedsUpdateRequest()
{

}

void
CatalogsCreativeAssetsFeedsUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];




        CatalogsType* obj = &catalog_type;
		obj->fromJson(value.dump());

    }

    const char *credentialsKey = "credentials";

    if(object.has_key(credentialsKey))
    {
        bourne::json value = object[credentialsKey];




        CatalogsFeedCredentials* obj = &credentials;
		obj->fromJson(value.dump());

    }

    const char *default_currencyKey = "default_currency";

    if(object.has_key(default_currencyKey))
    {
        bourne::json value = object[default_currencyKey];




        NullableCurrency* obj = &default_currency;
		obj->fromJson(value.dump());

    }

    const char *formatKey = "format";

    if(object.has_key(formatKey))
    {
        bourne::json value = object[formatKey];




        CatalogsFormat* obj = &format;
		obj->fromJson(value.dump());

    }

    const char *locationKey = "location";

    if(object.has_key(locationKey))
    {
        bourne::json value = object[locationKey];



        jsonToValue(&location, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *preferred_processing_scheduleKey = "preferred_processing_schedule";

    if(object.has_key(preferred_processing_scheduleKey))
    {
        bourne::json value = object[preferred_processing_scheduleKey];




        CatalogsFeedProcessingSchedule* obj = &preferred_processing_schedule;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        CatalogsStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsCreativeAssetsFeedsUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["credentials"] = getCredentials().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();






	object["format"] = getFormat().toJson();





    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

CatalogsType
CatalogsCreativeAssetsFeedsUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsCreativeAssetsFeedsUpdateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

NullableCurrency
CatalogsCreativeAssetsFeedsUpdateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

CatalogsFormat
CatalogsCreativeAssetsFeedsUpdateRequest::getFormat()
{
	return format;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

std::string
CatalogsCreativeAssetsFeedsUpdateRequest::getLocation()
{
	return location;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setLocation(std::string  location)
{
	this->location = location;
}

std::string
CatalogsCreativeAssetsFeedsUpdateRequest::getName()
{
	return name;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsCreativeAssetsFeedsUpdateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsCreativeAssetsFeedsUpdateRequest::getStatus()
{
	return status;
}

void
CatalogsCreativeAssetsFeedsUpdateRequest::setStatus(CatalogsStatus  status)
{
	this->status = status;
}



