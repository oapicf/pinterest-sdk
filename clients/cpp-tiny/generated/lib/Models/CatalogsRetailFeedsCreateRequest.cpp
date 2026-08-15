

#include "CatalogsRetailFeedsCreateRequest.h"

using namespace Tiny;

CatalogsRetailFeedsCreateRequest::CatalogsRetailFeedsCreateRequest()
{
	catalog_id = std::string();
	catalog_type = CatalogsType();
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_country = Country();
	default_currency = NullableCurrency();
	default_locale = CatalogsFeedsCreateRequest_default_locale();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = std::string();
}

CatalogsRetailFeedsCreateRequest::CatalogsRetailFeedsCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailFeedsCreateRequest::~CatalogsRetailFeedsCreateRequest()
{

}

void
CatalogsRetailFeedsCreateRequest::fromJson(std::string jsonObj)
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




        CatalogsFeedsCreateRequest_default_locale* obj = &default_locale;
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
CatalogsRetailFeedsCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();







	object["catalog_type"] = getCatalogType().toJson();






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

std::string
CatalogsRetailFeedsCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailFeedsCreateRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

CatalogsType
CatalogsRetailFeedsCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailFeedsCreateRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsRetailFeedsCreateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsRetailFeedsCreateRequest::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsRetailFeedsCreateRequest::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsRetailFeedsCreateRequest::setDefaultAvailability(ProductAvailabilityType  default_availability)
{
	this->default_availability = default_availability;
}

Country
CatalogsRetailFeedsCreateRequest::getDefaultCountry()
{
	return default_country;
}

void
CatalogsRetailFeedsCreateRequest::setDefaultCountry(Country  default_country)
{
	this->default_country = default_country;
}

NullableCurrency
CatalogsRetailFeedsCreateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsRetailFeedsCreateRequest::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

CatalogsFeedsCreateRequest_default_locale
CatalogsRetailFeedsCreateRequest::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsRetailFeedsCreateRequest::setDefaultLocale(CatalogsFeedsCreateRequest_default_locale  default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsRetailFeedsCreateRequest::getFormat()
{
	return format;
}

void
CatalogsRetailFeedsCreateRequest::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

std::string
CatalogsRetailFeedsCreateRequest::getLocation()
{
	return location;
}

void
CatalogsRetailFeedsCreateRequest::setLocation(std::string  location)
{
	this->location = location;
}

std::string
CatalogsRetailFeedsCreateRequest::getName()
{
	return name;
}

void
CatalogsRetailFeedsCreateRequest::setName(std::string  name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsRetailFeedsCreateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsRetailFeedsCreateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsRetailFeedsCreateRequest::getStatus()
{
	return status;
}

void
CatalogsRetailFeedsCreateRequest::setStatus(CatalogsStatus  status)
{
	this->status = status;
}



