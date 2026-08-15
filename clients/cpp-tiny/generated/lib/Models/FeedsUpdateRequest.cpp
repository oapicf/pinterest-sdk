

#include "Feeds_update_request.h"

using namespace Tiny;

Feeds_update_request::Feeds_update_request()
{
	catalog_type = CatalogsType();
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_currency = NullableCurrency();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = CatalogsStatus();
}

Feeds_update_request::Feeds_update_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Feeds_update_request::~Feeds_update_request()
{

}

void
Feeds_update_request::fromJson(std::string jsonObj)
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

    const char *default_availabilityKey = "default_availability";

    if(object.has_key(default_availabilityKey))
    {
        bourne::json value = object[default_availabilityKey];




        ProductAvailabilityType* obj = &default_availability;
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
Feeds_update_request::toJson()
{
    bourne::json object = bourne::json::object();






	object["catalog_type"] = getCatalogType().toJson();






	object["credentials"] = getCredentials().toJson();






	object["default_availability"] = getDefaultAvailability().toJson();






	object["default_currency"] = getDefaultCurrency().toJson();






	object["format"] = getFormat().toJson();





    object["location"] = getLocation();






    object["name"] = getName();







	object["preferred_processing_schedule"] = getPreferredProcessingSchedule().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

CatalogsType
Feeds_update_request::getCatalogType()
{
	return catalog_type;
}

void
Feeds_update_request::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
Feeds_update_request::getCredentials()
{
	return credentials;
}

void
Feeds_update_request::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
Feeds_update_request::getDefaultAvailability()
{
	return default_availability;
}

void
Feeds_update_request::setDefaultAvailability(ProductAvailabilityType  default_availability)
{
	this->default_availability = default_availability;
}

NullableCurrency
Feeds_update_request::getDefaultCurrency()
{
	return default_currency;
}

void
Feeds_update_request::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

CatalogsFormat
Feeds_update_request::getFormat()
{
	return format;
}

void
Feeds_update_request::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

std::string
Feeds_update_request::getLocation()
{
	return location;
}

void
Feeds_update_request::setLocation(std::string  location)
{
	this->location = location;
}

std::string
Feeds_update_request::getName()
{
	return name;
}

void
Feeds_update_request::setName(std::string  name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
Feeds_update_request::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
Feeds_update_request::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
Feeds_update_request::getStatus()
{
	return status;
}

void
Feeds_update_request::setStatus(CatalogsStatus  status)
{
	this->status = status;
}



