

#include "CatalogsFeed.h"

using namespace Tiny;

CatalogsFeed::CatalogsFeed()
{
	created_at = std::string();
	id = std::string();
	updated_at = std::string();
	catalog_type = CatalogsType();
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_country = Country();
	default_currency = NullableCurrency();
	default_locale = std::string();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = CatalogsStatus();
	catalog_id = std::string();
}

CatalogsFeed::CatalogsFeed(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsFeed::~CatalogsFeed()
{

}

void
CatalogsFeed::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "std::string");


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



        jsonToValue(&default_locale, value, "std::string");


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

    const char *catalog_idKey = "catalog_id";

    if(object.has_key(catalog_idKey))
    {
        bourne::json value = object[catalog_idKey];



        jsonToValue(&catalog_id, value, "std::string");


    }


}

bourne::json
CatalogsFeed::toJson()
{
    bourne::json object = bourne::json::object();





    object["created_at"] = getCreatedAt();






    object["id"] = getId();






    object["updated_at"] = getUpdatedAt();







	object["catalog_type"] = getCatalogType().toJson();






	object["credentials"] = getCredentials().toJson();






	object["default_availability"] = getDefaultAvailability().toJson();






	object["default_country"] = getDefaultCountry().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();





    object["default_locale"] = getDefaultLocale();







	object["format"] = getFormat().toJson();





    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();





    object["catalog_id"] = getCatalogId();



    return object;

}

std::string
CatalogsFeed::getCreatedAt()
{
	return created_at;
}

void
CatalogsFeed::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsFeed::getId()
{
	return id;
}

void
CatalogsFeed::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsFeed::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsFeed::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}

CatalogsType
CatalogsFeed::getCatalogType()
{
	return catalog_type;
}

void
CatalogsFeed::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsFeed::getCredentials()
{
	return credentials;
}

void
CatalogsFeed::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsFeed::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsFeed::setDefaultAvailability(ProductAvailabilityType  default_availability)
{
	this->default_availability = default_availability;
}

Country
CatalogsFeed::getDefaultCountry()
{
	return default_country;
}

void
CatalogsFeed::setDefaultCountry(Country  default_country)
{
	this->default_country = default_country;
}

NullableCurrency
CatalogsFeed::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsFeed::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

std::string
CatalogsFeed::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsFeed::setDefaultLocale(std::string  default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsFeed::getFormat()
{
	return format;
}

void
CatalogsFeed::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

std::string
CatalogsFeed::getLocation()
{
	return location;
}

void
CatalogsFeed::setLocation(std::string  location)
{
	this->location = location;
}

std::string
CatalogsFeed::getName()
{
	return name;
}

void
CatalogsFeed::setName(std::string  name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsFeed::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsFeed::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsFeed::getStatus()
{
	return status;
}

void
CatalogsFeed::setStatus(CatalogsStatus  status)
{
	this->status = status;
}

std::string
CatalogsFeed::getCatalogId()
{
	return catalog_id;
}

void
CatalogsFeed::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}



