

#include "CatalogsFeedsCreateRequest.h"

using namespace Tiny;

CatalogsFeedsCreateRequest::CatalogsFeedsCreateRequest()
{
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_country = Country();
	default_currency = NullableCurrency();
	default_locale = CatalogsCreativeAssetsFeedsCreateRequest_default_locale();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = null;
}

CatalogsFeedsCreateRequest::CatalogsFeedsCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeedsCreateRequest::~CatalogsFeedsCreateRequest()
{

}

void
CatalogsFeedsCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *credentialsKey = "credentials";

    if(object.has_key(credentialsKey))
    {
        bourne::json value = object[credentialsKey];




        CatalogsFeedCredentials* obj = &credentials;
		obj->fromJson(value.dump());

    }

    const char *default_availabilityKey = "default_availability";

    if(object.has_key(default_availabilityKey))
    {
        bourne::json value = object[default_availabilityKey];




        ProductAvailabilityType* obj = &default_availability;
		obj->fromJson(value.dump());

    }

    const char *default_countryKey = "default_country";

    if(object.has_key(default_countryKey))
    {
        bourne::json value = object[default_countryKey];




        Country* obj = &default_country;
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
CatalogsFeedsCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();






	object["credentials"] = getCredentials().toJson();






	object["default_availability"] = getDefaultAvailability().toJson();






	object["default_country"] = getDefaultCountry().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();






	object["default_locale"] = getDefaultLocale().toJson();






	object["format"] = getFormat().toJson();





    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

CatalogsFeedCredentials
CatalogsFeedsCreateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsFeedsCreateRequest::setCredentials(CatalogsFeedCredentials credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsFeedsCreateRequest::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsFeedsCreateRequest::setDefaultAvailability(ProductAvailabilityType default_availability)
{
	this->default_availability = default_availability;
}

Country
CatalogsFeedsCreateRequest::getDefaultCountry()
{
	return default_country;
}

void
CatalogsFeedsCreateRequest::setDefaultCountry(Country default_country)
{
	this->default_country = default_country;
}

NullableCurrency
CatalogsFeedsCreateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsFeedsCreateRequest::setDefaultCurrency(NullableCurrency default_currency)
{
	this->default_currency = default_currency;
}

CatalogsCreativeAssetsFeedsCreateRequest_default_locale
CatalogsFeedsCreateRequest::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsFeedsCreateRequest::setDefaultLocale(CatalogsCreativeAssetsFeedsCreateRequest_default_locale default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsFeedsCreateRequest::getFormat()
{
	return format;
}

void
CatalogsFeedsCreateRequest::setFormat(CatalogsFormat format)
{
	this->format = format;
}

std::string
CatalogsFeedsCreateRequest::getLocation()
{
	return location;
}

void
CatalogsFeedsCreateRequest::setLocation(std::string location)
{
	this->location = location;
}

std::string
CatalogsFeedsCreateRequest::getName()
{
	return name;
}

void
CatalogsFeedsCreateRequest::setName(std::string name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsFeedsCreateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsFeedsCreateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsFeedsCreateRequest::getStatus()
{
	return status;
}

void
CatalogsFeedsCreateRequest::setStatus(CatalogsStatus status)
{
	this->status = status;
}



