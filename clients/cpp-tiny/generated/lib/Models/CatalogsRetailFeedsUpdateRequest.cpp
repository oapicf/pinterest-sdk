

#include "CatalogsRetailFeedsUpdateRequest.h"

using namespace Tiny;

CatalogsRetailFeedsUpdateRequest::CatalogsRetailFeedsUpdateRequest()
{
	catalog_type = std::string();
	credentials = CatalogsFeedCredentials();
	default_availability = ProductAvailabilityType();
	default_currency = NullableCurrency();
	format = CatalogsFormat();
	location = std::string();
	name = std::string();
	preferred_processing_schedule = CatalogsFeedProcessingSchedule();
	status = CatalogsStatus();
}

CatalogsRetailFeedsUpdateRequest::CatalogsRetailFeedsUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailFeedsUpdateRequest::~CatalogsRetailFeedsUpdateRequest()
{

}

void
CatalogsRetailFeedsUpdateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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
CatalogsRetailFeedsUpdateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_type"] = getCatalogType();







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

std::string
CatalogsRetailFeedsUpdateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailFeedsUpdateRequest::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsFeedCredentials
CatalogsRetailFeedsUpdateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsRetailFeedsUpdateRequest::setCredentials(CatalogsFeedCredentials credentials)
{
	this->credentials = credentials;
}

ProductAvailabilityType
CatalogsRetailFeedsUpdateRequest::getDefaultAvailability()
{
	return default_availability;
}

void
CatalogsRetailFeedsUpdateRequest::setDefaultAvailability(ProductAvailabilityType default_availability)
{
	this->default_availability = default_availability;
}

NullableCurrency
CatalogsRetailFeedsUpdateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsRetailFeedsUpdateRequest::setDefaultCurrency(NullableCurrency default_currency)
{
	this->default_currency = default_currency;
}

CatalogsFormat
CatalogsRetailFeedsUpdateRequest::getFormat()
{
	return format;
}

void
CatalogsRetailFeedsUpdateRequest::setFormat(CatalogsFormat format)
{
	this->format = format;
}

std::string
CatalogsRetailFeedsUpdateRequest::getLocation()
{
	return location;
}

void
CatalogsRetailFeedsUpdateRequest::setLocation(std::string location)
{
	this->location = location;
}

std::string
CatalogsRetailFeedsUpdateRequest::getName()
{
	return name;
}

void
CatalogsRetailFeedsUpdateRequest::setName(std::string name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsRetailFeedsUpdateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsRetailFeedsUpdateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsRetailFeedsUpdateRequest::getStatus()
{
	return status;
}

void
CatalogsRetailFeedsUpdateRequest::setStatus(CatalogsStatus status)
{
	this->status = status;
}



