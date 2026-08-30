

#include "CatalogsHotelFeedsCreateRequest.h"

using namespace Tiny;

CatalogsHotelFeedsCreateRequest::CatalogsHotelFeedsCreateRequest()
{
	catalog_id = std::string();
	catalog_type = std::string();
	credentials = CatalogsFeedCredentials();
	default_currency = NullableCurrency();
	default_locale = CatalogsCreativeAssetsFeedsCreateRequest_default_locale();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = null;
}

CatalogsHotelFeedsCreateRequest::CatalogsHotelFeedsCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelFeedsCreateRequest::~CatalogsHotelFeedsCreateRequest()
{

}

void
CatalogsHotelFeedsCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


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

    const char *default_localeKey = "default_locale";

    if(object.has_key(default_localeKey))
    {
        bourne::json value = object[default_localeKey];




        CatalogsCreativeAssetsFeedsCreateRequest_default_locale* obj = &default_locale;
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
CatalogsHotelFeedsCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();







	object["credentials"] = getCredentials().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();






	object["default_locale"] = getDefaultLocale().toJson();






	object["format"] = getFormat().toJson();





    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

std::string
CatalogsHotelFeedsCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelFeedsCreateRequest::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelFeedsCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelFeedsCreateRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsHotelFeedsCreateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsHotelFeedsCreateRequest::setCredentials(CatalogsFeedCredentials credentials)
{
	this->credentials = credentials;
}

NullableCurrency
CatalogsHotelFeedsCreateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsHotelFeedsCreateRequest::setDefaultCurrency(NullableCurrency default_currency)
{
	this->default_currency = default_currency;
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale
CatalogsHotelFeedsCreateRequest::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsHotelFeedsCreateRequest::setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequest_default_locale default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsHotelFeedsCreateRequest::getFormat()
{
	return format;
}

void
CatalogsHotelFeedsCreateRequest::setFormat(CatalogsFormat format)
{
	this->format = format;
}

std::string
CatalogsHotelFeedsCreateRequest::getLocation()
{
	return location;
}

void
CatalogsHotelFeedsCreateRequest::setLocation(std::string location)
{
	this->location = location;
}

std::string
CatalogsHotelFeedsCreateRequest::getName()
{
	return name;
}

void
CatalogsHotelFeedsCreateRequest::setName(std::string name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsHotelFeedsCreateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsHotelFeedsCreateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsHotelFeedsCreateRequest::getStatus()
{
	return status;
}

void
CatalogsHotelFeedsCreateRequest::setStatus(CatalogsStatus status)
{
	this->status = status;
}



