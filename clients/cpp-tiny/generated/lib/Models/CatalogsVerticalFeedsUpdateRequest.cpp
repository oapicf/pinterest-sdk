

#include "CatalogsVerticalFeedsUpdateRequest.h"

using namespace Tiny;

CatalogsVerticalFeedsUpdateRequest::CatalogsVerticalFeedsUpdateRequest()
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

CatalogsVerticalFeedsUpdateRequest::CatalogsVerticalFeedsUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsVerticalFeedsUpdateRequest::~CatalogsVerticalFeedsUpdateRequest()
{

}

void
CatalogsVerticalFeedsUpdateRequest::fromJson(std::string jsonObj)
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
CatalogsVerticalFeedsUpdateRequest::toJson()
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
CatalogsVerticalFeedsUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsVerticalFeedsUpdateRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsVerticalFeedsUpdateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsVerticalFeedsUpdateRequest::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsVerticalFeedsUpdateRequest::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsVerticalFeedsUpdateRequest::setDefaultAvailability(ProductAvailabilityType  default_availability)
{
	this->default_availability = default_availability;
}

NullableCurrency
CatalogsVerticalFeedsUpdateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsVerticalFeedsUpdateRequest::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

CatalogsFormat
CatalogsVerticalFeedsUpdateRequest::getFormat()
{
	return format;
}

void
CatalogsVerticalFeedsUpdateRequest::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

std::string
CatalogsVerticalFeedsUpdateRequest::getLocation()
{
	return location;
}

void
CatalogsVerticalFeedsUpdateRequest::setLocation(std::string  location)
{
	this->location = location;
}

std::string
CatalogsVerticalFeedsUpdateRequest::getName()
{
	return name;
}

void
CatalogsVerticalFeedsUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsVerticalFeedsUpdateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsVerticalFeedsUpdateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsVerticalFeedsUpdateRequest::getStatus()
{
	return status;
}

void
CatalogsVerticalFeedsUpdateRequest::setStatus(CatalogsStatus  status)
{
	this->status = status;
}



