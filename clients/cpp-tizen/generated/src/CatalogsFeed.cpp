#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeed.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeed::CatalogsFeed()
{
	//__init();
}

CatalogsFeed::~CatalogsFeed()
{
	//__cleanup();
}

void
CatalogsFeed::__init()
{
	//created_at = null;
	//id = std::string();
	//updated_at = null;
	//default_country = new Country();
	//default_availability = new ProductAvailabilityType();
	//default_currency = new NullableCurrency();
	//name = std::string();
	//format = new CatalogsFormat();
	//default_locale = std::string();
	//credentials = new CatalogsFeedCredentials();
	//location = std::string();
	//preferred_processing_schedule = new CatalogsFeedProcessingSchedule();
	//status = new CatalogsStatus();
}

void
CatalogsFeed::__cleanup()
{
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//if(default_country != NULL) {
	//
	//delete default_country;
	//default_country = NULL;
	//}
	//if(default_availability != NULL) {
	//
	//delete default_availability;
	//default_availability = NULL;
	//}
	//if(default_currency != NULL) {
	//
	//delete default_currency;
	//default_currency = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(format != NULL) {
	//
	//delete format;
	//format = NULL;
	//}
	//if(default_locale != NULL) {
	//
	//delete default_locale;
	//default_locale = NULL;
	//}
	//if(credentials != NULL) {
	//
	//delete credentials;
	//credentials = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//if(preferred_processing_schedule != NULL) {
	//
	//delete preferred_processing_schedule;
	//preferred_processing_schedule = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
CatalogsFeed::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updated_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *default_countryKey = "default_country";
	node = json_object_get_member(pJsonObject, default_countryKey);
	if (node !=NULL) {
	

		if (isprimitive("Country")) {
			jsonToValue(&default_country, node, "Country", "Country");
		} else {
			
			Country* obj = static_cast<Country*> (&default_country);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_availabilityKey = "default_availability";
	node = json_object_get_member(pJsonObject, default_availabilityKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductAvailabilityType")) {
			jsonToValue(&default_availability, node, "ProductAvailabilityType", "ProductAvailabilityType");
		} else {
			
			ProductAvailabilityType* obj = static_cast<ProductAvailabilityType*> (&default_availability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_currencyKey = "default_currency";
	node = json_object_get_member(pJsonObject, default_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("NullableCurrency")) {
			jsonToValue(&default_currency, node, "NullableCurrency", "NullableCurrency");
		} else {
			
			NullableCurrency* obj = static_cast<NullableCurrency*> (&default_currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *formatKey = "format";
	node = json_object_get_member(pJsonObject, formatKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFormat")) {
			jsonToValue(&format, node, "CatalogsFormat", "CatalogsFormat");
		} else {
			
			CatalogsFormat* obj = static_cast<CatalogsFormat*> (&format);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *default_localeKey = "default_locale";
	node = json_object_get_member(pJsonObject, default_localeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&default_locale, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *credentialsKey = "credentials";
	node = json_object_get_member(pJsonObject, credentialsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedCredentials")) {
			jsonToValue(&credentials, node, "CatalogsFeedCredentials", "CatalogsFeedCredentials");
		} else {
			
			CatalogsFeedCredentials* obj = static_cast<CatalogsFeedCredentials*> (&credentials);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&location, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *preferred_processing_scheduleKey = "preferred_processing_schedule";
	node = json_object_get_member(pJsonObject, preferred_processing_scheduleKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedProcessingSchedule")) {
			jsonToValue(&preferred_processing_schedule, node, "CatalogsFeedProcessingSchedule", "CatalogsFeedProcessingSchedule");
		} else {
			
			CatalogsFeedProcessingSchedule* obj = static_cast<CatalogsFeedProcessingSchedule*> (&preferred_processing_schedule);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsStatus")) {
			jsonToValue(&status, node, "CatalogsStatus", "CatalogsStatus");
		} else {
			
			CatalogsStatus* obj = static_cast<CatalogsStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeed::CatalogsFeed(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeed::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	if (isprimitive("Country")) {
		Country obj = getDefaultCountry();
		node = converttoJson(&obj, "Country", "");
	}
	else {
		
		Country obj = static_cast<Country> (getDefaultCountry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_countryKey = "default_country";
	json_object_set_member(pJsonObject, default_countryKey, node);
	if (isprimitive("ProductAvailabilityType")) {
		ProductAvailabilityType obj = getDefaultAvailability();
		node = converttoJson(&obj, "ProductAvailabilityType", "");
	}
	else {
		
		ProductAvailabilityType obj = static_cast<ProductAvailabilityType> (getDefaultAvailability());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_availabilityKey = "default_availability";
	json_object_set_member(pJsonObject, default_availabilityKey, node);
	if (isprimitive("NullableCurrency")) {
		NullableCurrency obj = getDefaultCurrency();
		node = converttoJson(&obj, "NullableCurrency", "");
	}
	else {
		
		NullableCurrency obj = static_cast<NullableCurrency> (getDefaultCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *default_currencyKey = "default_currency";
	json_object_set_member(pJsonObject, default_currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("CatalogsFormat")) {
		CatalogsFormat obj = getFormat();
		node = converttoJson(&obj, "CatalogsFormat", "");
	}
	else {
		
		CatalogsFormat obj = static_cast<CatalogsFormat> (getFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formatKey = "format";
	json_object_set_member(pJsonObject, formatKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDefaultLocale();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *default_localeKey = "default_locale";
	json_object_set_member(pJsonObject, default_localeKey, node);
	if (isprimitive("CatalogsFeedCredentials")) {
		CatalogsFeedCredentials obj = getCredentials();
		node = converttoJson(&obj, "CatalogsFeedCredentials", "");
	}
	else {
		
		CatalogsFeedCredentials obj = static_cast<CatalogsFeedCredentials> (getCredentials());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *credentialsKey = "credentials";
	json_object_set_member(pJsonObject, credentialsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLocation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("CatalogsFeedProcessingSchedule")) {
		CatalogsFeedProcessingSchedule obj = getPreferredProcessingSchedule();
		node = converttoJson(&obj, "CatalogsFeedProcessingSchedule", "");
	}
	else {
		
		CatalogsFeedProcessingSchedule obj = static_cast<CatalogsFeedProcessingSchedule> (getPreferredProcessingSchedule());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preferred_processing_scheduleKey = "preferred_processing_schedule";
	json_object_set_member(pJsonObject, preferred_processing_scheduleKey, node);
	if (isprimitive("CatalogsStatus")) {
		CatalogsStatus obj = getStatus();
		node = converttoJson(&obj, "CatalogsStatus", "");
	}
	else {
		
		CatalogsStatus obj = static_cast<CatalogsStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
CatalogsFeed::getName()
{
	return name;
}

void
CatalogsFeed::setName(std::string  name)
{
	this->name = name;
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
CatalogsFeed::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsFeed::setDefaultLocale(std::string  default_locale)
{
	this->default_locale = default_locale;
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


