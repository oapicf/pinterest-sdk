#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelFeedsCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelFeedsCreateRequest::CatalogsHotelFeedsCreateRequest()
{
	//__init();
}

CatalogsHotelFeedsCreateRequest::~CatalogsHotelFeedsCreateRequest()
{
	//__cleanup();
}

void
CatalogsHotelFeedsCreateRequest::__init()
{
	//default_currency = new NullableCurrency();
	//name = std::string();
	//format = new CatalogsFormat();
	//default_locale = new CatalogsFeedsCreateRequest_default_locale();
	//credentials = new CatalogsFeedCredentials();
	//location = std::string();
	//preferred_processing_schedule = new CatalogsFeedProcessingSchedule();
	//catalog_type = new CatalogsType();
	//catalog_id = std::string();
}

void
CatalogsHotelFeedsCreateRequest::__cleanup()
{
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
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsHotelFeedsCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("CatalogsFeedsCreateRequest_default_locale")) {
			jsonToValue(&default_locale, node, "CatalogsFeedsCreateRequest_default_locale", "CatalogsFeedsCreateRequest_default_locale");
		} else {
			
			CatalogsFeedsCreateRequest_default_locale* obj = static_cast<CatalogsFeedsCreateRequest_default_locale*> (&default_locale);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsType")) {
			jsonToValue(&catalog_type, node, "CatalogsType", "CatalogsType");
		} else {
			
			CatalogsType* obj = static_cast<CatalogsType*> (&catalog_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsHotelFeedsCreateRequest::CatalogsHotelFeedsCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelFeedsCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("CatalogsFeedsCreateRequest_default_locale")) {
		CatalogsFeedsCreateRequest_default_locale obj = getDefaultLocale();
		node = converttoJson(&obj, "CatalogsFeedsCreateRequest_default_locale", "");
	}
	else {
		
		CatalogsFeedsCreateRequest_default_locale obj = static_cast<CatalogsFeedsCreateRequest_default_locale> (getDefaultLocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
	if (isprimitive("CatalogsType")) {
		CatalogsType obj = getCatalogType();
		node = converttoJson(&obj, "CatalogsType", "");
	}
	else {
		
		CatalogsType obj = static_cast<CatalogsType> (getCatalogType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

NullableCurrency
CatalogsHotelFeedsCreateRequest::getDefaultCurrency()
{
	return default_currency;
}

void
CatalogsHotelFeedsCreateRequest::setDefaultCurrency(NullableCurrency  default_currency)
{
	this->default_currency = default_currency;
}

std::string
CatalogsHotelFeedsCreateRequest::getName()
{
	return name;
}

void
CatalogsHotelFeedsCreateRequest::setName(std::string  name)
{
	this->name = name;
}

CatalogsFormat
CatalogsHotelFeedsCreateRequest::getFormat()
{
	return format;
}

void
CatalogsHotelFeedsCreateRequest::setFormat(CatalogsFormat  format)
{
	this->format = format;
}

CatalogsFeedsCreateRequest_default_locale
CatalogsHotelFeedsCreateRequest::getDefaultLocale()
{
	return default_locale;
}

void
CatalogsHotelFeedsCreateRequest::setDefaultLocale(CatalogsFeedsCreateRequest_default_locale  default_locale)
{
	this->default_locale = default_locale;
}

CatalogsFeedCredentials
CatalogsHotelFeedsCreateRequest::getCredentials()
{
	return credentials;
}

void
CatalogsHotelFeedsCreateRequest::setCredentials(CatalogsFeedCredentials  credentials)
{
	this->credentials = credentials;
}

std::string
CatalogsHotelFeedsCreateRequest::getLocation()
{
	return location;
}

void
CatalogsHotelFeedsCreateRequest::setLocation(std::string  location)
{
	this->location = location;
}

CatalogsFeedProcessingSchedule
CatalogsHotelFeedsCreateRequest::getPreferredProcessingSchedule()
{
	return preferred_processing_schedule;
}

void
CatalogsHotelFeedsCreateRequest::setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule  preferred_processing_schedule)
{
	this->preferred_processing_schedule = preferred_processing_schedule;
}

CatalogsType
CatalogsHotelFeedsCreateRequest::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelFeedsCreateRequest::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

std::string
CatalogsHotelFeedsCreateRequest::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelFeedsCreateRequest::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


