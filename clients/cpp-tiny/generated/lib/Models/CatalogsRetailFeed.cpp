

#include "CatalogsRetailFeed.h"

using namespace Tiny;

CatalogsRetailFeed::CatalogsRetailFeed()
{
	catalog_type = std::string();
	created_at = std::string();
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_country = Country();
	default_currency = NullableCurrency();
	default_locale = std::string();
	format = CatalogsFormat();
	id = std::string();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = CatalogsStatus();
	updated_at = std::string();
}

CatalogsRetailFeed::CatalogsRetailFeed(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailFeed::~CatalogsRetailFeed()
{

}

void
CatalogsRetailFeed::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *catalog_typeKey = "catalog_type";

    if(object.has_key(catalog_typeKey))
    {
        bourne::json value = object[catalog_typeKey];



        jsonToValue(&catalog_type, value, "std::string");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


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

    const char *updated_atKey = "updated_at";

    if(object.has_key(updated_atKey))
    {
        bourne::json value = object[updated_atKey];



        jsonToValue(&updated_at, value, "std::string");


    }


}

bourne::json
CatalogsRetailFeed::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();






    object["created_at"] = getCreatedAt();







	object["credentials"] = getCredentials().toJson();






	object["default_availability"] = getDefaultAvailability().toJson();






	object["default_country"] = getDefaultCountry().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();





    object["default_locale"] = getDefaultLocale();







	object["format"] = getFormat().toJson();





    object["id"] = getId();






    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();





    object["updated_at"] = getUpdatedAt();



    return object;

}

std::string
CatalogsRetailFeed::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailFeed::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsRetailFeed::getCreatedAt()
{
	return created_at;
}

void
CatalogsRetailFeed::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

CatalogsFeedCredentials
CatalogsRetailFeed::getCredentials()
{
	return credentials;
}

void
CatalogsRetailFeed::setCredentials(CatalogsFeedCredentials credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsRetailFeed::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsRetailFeed::setDefaultAvailability(ProductAvailabilityType default_availability)
{
	this->default_availability = default_availability;
}

Country
CatalogsRetailFeed::getDefaultCountry()
{
	return default_country;
}

void
CatalogsRetailFeed::setDefaultCountry(Country default_country)
{
	this->default_country = default_country;
}

NullableCurrency
CatalogsRetailFeed::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsRetailFeed::setDefaultCurrency(NullableCurrency default_currency)
{
	this->default_currency = default_currency;
}

std::string
CatalogsRetailFeed::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsRetailFeed::setDefaultLocale(std::string default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsRetailFeed::getFormat()
{
	return format;
}

void
CatalogsRetailFeed::setFormat(CatalogsFormat format)
{
	this->format = format;
}

std::string
CatalogsRetailFeed::getId()
{
	return id;
}

void
CatalogsRetailFeed::setId(std::string id)
{
	this->id = id;
}

std::string
CatalogsRetailFeed::getLocation()
{
	return location;
}

void
CatalogsRetailFeed::setLocation(std::string location)
{
	this->location = location;
}

std::string
CatalogsRetailFeed::getName()
{
	return name;
}

void
CatalogsRetailFeed::setName(std::string name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsRetailFeed::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsRetailFeed::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsRetailFeed::getStatus()
{
	return status;
}

void
CatalogsRetailFeed::setStatus(CatalogsStatus status)
{
	this->status = status;
}

std::string
CatalogsRetailFeed::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsRetailFeed::setUpdatedAt(std::string updated_at)
{
	this->updated_at = updated_at;
}



