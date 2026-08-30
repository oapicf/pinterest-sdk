

#include "CatalogsHotelFeed.h"

using namespace Tiny;

CatalogsHotelFeed::CatalogsHotelFeed()
{
	catalog_id = std::string();
	catalog_type = std::string();
	created_at = std::string();
	credentials = CatalogsFeedCredentials();
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

CatalogsHotelFeed::CatalogsHotelFeed(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelFeed::~CatalogsHotelFeed()
{

}

void
CatalogsHotelFeed::fromJson(std::string jsonObj)
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
CatalogsHotelFeed::toJson()
{
    bourne::json object = bourne::json::object();





    object["catalog_id"] = getCatalogId();






    object["catalog_type"] = getCatalogType();






    object["created_at"] = getCreatedAt();







	object["credentials"] = getCredentials().toJson();






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
CatalogsHotelFeed::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelFeed::setCatalogId(std::string catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsHotelFeed::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelFeed::setCatalogType(std::string catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelFeed::getCreatedAt()
{
	return created_at;
}

void
CatalogsHotelFeed::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

CatalogsFeedCredentials
CatalogsHotelFeed::getCredentials()
{
	return credentials;
}

void
CatalogsHotelFeed::setCredentials(CatalogsFeedCredentials credentials)
{
	this->credentials = credentials;
}

NullableCurrency
CatalogsHotelFeed::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsHotelFeed::setDefaultCurrency(NullableCurrency default_currency)
{
	this->default_currency = default_currency;
}

std::string
CatalogsHotelFeed::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsHotelFeed::setDefaultLocale(std::string default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFormat
CatalogsHotelFeed::getFormat()
{
	return format;
}

void
CatalogsHotelFeed::setFormat(CatalogsFormat format)
{
	this->format = format;
}

std::string
CatalogsHotelFeed::getId()
{
	return id;
}

void
CatalogsHotelFeed::setId(std::string id)
{
	this->id = id;
}

std::string
CatalogsHotelFeed::getLocation()
{
	return location;
}

void
CatalogsHotelFeed::setLocation(std::string location)
{
	this->location = location;
}

std::string
CatalogsHotelFeed::getName()
{
	return name;
}

void
CatalogsHotelFeed::setName(std::string name)
{
	this->name = name;
}

CatalogsFeedProcessingSchedule
CatalogsHotelFeed::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsHotelFeed::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsStatus
CatalogsHotelFeed::getStatus()
{
	return status;
}

void
CatalogsHotelFeed::setStatus(CatalogsStatus status)
{
	this->status = status;
}

std::string
CatalogsHotelFeed::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsHotelFeed::setUpdatedAt(std::string updated_at)
{
	this->updated_at = updated_at;
}



