#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEvents_data_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEvents_data_inner::ConversionEvents_data_inner()
{
	//__init();
}

ConversionEvents_data_inner::~ConversionEvents_data_inner()
{
	//__cleanup();
}

void
ConversionEvents_data_inner::__init()
{
	//event_name = std::string();
	//action_source = std::string();
	//event_time = long(0);
	//event_id = std::string();
	//event_source_url = std::string();
	//opt_out = bool(false);
	//partner_name = std::string();
	//user_data = new ConversionEventsUserData();
	//custom_data = new ConversionEvents_data_inner_custom_data();
	//app_id = std::string();
	//app_name = std::string();
	//app_version = std::string();
	//device_brand = std::string();
	//device_carrier = std::string();
	//device_model = std::string();
	//device_type = std::string();
	//os_version = std::string();
	//wifi = bool(false);
	//language = std::string();
}

void
ConversionEvents_data_inner::__cleanup()
{
	//if(event_name != NULL) {
	//
	//delete event_name;
	//event_name = NULL;
	//}
	//if(action_source != NULL) {
	//
	//delete action_source;
	//action_source = NULL;
	//}
	//if(event_time != NULL) {
	//
	//delete event_time;
	//event_time = NULL;
	//}
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
	//if(event_source_url != NULL) {
	//
	//delete event_source_url;
	//event_source_url = NULL;
	//}
	//if(opt_out != NULL) {
	//
	//delete opt_out;
	//opt_out = NULL;
	//}
	//if(partner_name != NULL) {
	//
	//delete partner_name;
	//partner_name = NULL;
	//}
	//if(user_data != NULL) {
	//
	//delete user_data;
	//user_data = NULL;
	//}
	//if(custom_data != NULL) {
	//
	//delete custom_data;
	//custom_data = NULL;
	//}
	//if(app_id != NULL) {
	//
	//delete app_id;
	//app_id = NULL;
	//}
	//if(app_name != NULL) {
	//
	//delete app_name;
	//app_name = NULL;
	//}
	//if(app_version != NULL) {
	//
	//delete app_version;
	//app_version = NULL;
	//}
	//if(device_brand != NULL) {
	//
	//delete device_brand;
	//device_brand = NULL;
	//}
	//if(device_carrier != NULL) {
	//
	//delete device_carrier;
	//device_carrier = NULL;
	//}
	//if(device_model != NULL) {
	//
	//delete device_model;
	//device_model = NULL;
	//}
	//if(device_type != NULL) {
	//
	//delete device_type;
	//device_type = NULL;
	//}
	//if(os_version != NULL) {
	//
	//delete os_version;
	//os_version = NULL;
	//}
	//if(wifi != NULL) {
	//
	//delete wifi;
	//wifi = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//
}

void
ConversionEvents_data_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *event_nameKey = "event_name";
	node = json_object_get_member(pJsonObject, event_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *action_sourceKey = "action_source";
	node = json_object_get_member(pJsonObject, action_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&action_source, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_timeKey = "event_time";
	node = json_object_get_member(pJsonObject, event_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&event_time, node, "long long", "");
		} else {
			
		}
	}
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_source_urlKey = "event_source_url";
	node = json_object_get_member(pJsonObject, event_source_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_source_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *opt_outKey = "opt_out";
	node = json_object_get_member(pJsonObject, opt_outKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&opt_out, node, "bool", "");
		} else {
			
		}
	}
	const gchar *partner_nameKey = "partner_name";
	node = json_object_get_member(pJsonObject, partner_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_dataKey = "user_data";
	node = json_object_get_member(pJsonObject, user_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEventsUserData")) {
			jsonToValue(&user_data, node, "ConversionEventsUserData", "ConversionEventsUserData");
		} else {
			
			ConversionEventsUserData* obj = static_cast<ConversionEventsUserData*> (&user_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_dataKey = "custom_data";
	node = json_object_get_member(pJsonObject, custom_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEvents_data_inner_custom_data")) {
			jsonToValue(&custom_data, node, "ConversionEvents_data_inner_custom_data", "ConversionEvents_data_inner_custom_data");
		} else {
			
			ConversionEvents_data_inner_custom_data* obj = static_cast<ConversionEvents_data_inner_custom_data*> (&custom_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *app_idKey = "app_id";
	node = json_object_get_member(pJsonObject, app_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_nameKey = "app_name";
	node = json_object_get_member(pJsonObject, app_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_versionKey = "app_version";
	node = json_object_get_member(pJsonObject, app_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *device_brandKey = "device_brand";
	node = json_object_get_member(pJsonObject, device_brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&device_brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *device_carrierKey = "device_carrier";
	node = json_object_get_member(pJsonObject, device_carrierKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&device_carrier, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *device_modelKey = "device_model";
	node = json_object_get_member(pJsonObject, device_modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&device_model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *device_typeKey = "device_type";
	node = json_object_get_member(pJsonObject, device_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&device_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *os_versionKey = "os_version";
	node = json_object_get_member(pJsonObject, os_versionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&os_version, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *wifiKey = "wifi";
	node = json_object_get_member(pJsonObject, wifiKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&wifi, node, "bool", "");
		} else {
			
		}
	}
	const gchar *languageKey = "language";
	node = json_object_get_member(pJsonObject, languageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&language, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEvents_data_inner::ConversionEvents_data_inner(char* json)
{
	this->fromJson(json);
}

char*
ConversionEvents_data_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEventName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_nameKey = "event_name";
	json_object_set_member(pJsonObject, event_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getActionSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *action_sourceKey = "action_source";
	json_object_set_member(pJsonObject, action_sourceKey, node);
	if (isprimitive("long long")) {
		long long obj = getEventTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *event_timeKey = "event_time";
	json_object_set_member(pJsonObject, event_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventSourceUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_source_urlKey = "event_source_url";
	json_object_set_member(pJsonObject, event_source_urlKey, node);
	if (isprimitive("bool")) {
		bool obj = getOptOut();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *opt_outKey = "opt_out";
	json_object_set_member(pJsonObject, opt_outKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_nameKey = "partner_name";
	json_object_set_member(pJsonObject, partner_nameKey, node);
	if (isprimitive("ConversionEventsUserData")) {
		ConversionEventsUserData obj = getUserData();
		node = converttoJson(&obj, "ConversionEventsUserData", "");
	}
	else {
		
		ConversionEventsUserData obj = static_cast<ConversionEventsUserData> (getUserData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *user_dataKey = "user_data";
	json_object_set_member(pJsonObject, user_dataKey, node);
	if (isprimitive("ConversionEvents_data_inner_custom_data")) {
		ConversionEvents_data_inner_custom_data obj = getCustomData();
		node = converttoJson(&obj, "ConversionEvents_data_inner_custom_data", "");
	}
	else {
		
		ConversionEvents_data_inner_custom_data obj = static_cast<ConversionEvents_data_inner_custom_data> (getCustomData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *custom_dataKey = "custom_data";
	json_object_set_member(pJsonObject, custom_dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_idKey = "app_id";
	json_object_set_member(pJsonObject, app_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_nameKey = "app_name";
	json_object_set_member(pJsonObject, app_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_versionKey = "app_version";
	json_object_set_member(pJsonObject, app_versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeviceBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *device_brandKey = "device_brand";
	json_object_set_member(pJsonObject, device_brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeviceCarrier();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *device_carrierKey = "device_carrier";
	json_object_set_member(pJsonObject, device_carrierKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeviceModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *device_modelKey = "device_model";
	json_object_set_member(pJsonObject, device_modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDeviceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *device_typeKey = "device_type";
	json_object_set_member(pJsonObject, device_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_versionKey = "os_version";
	json_object_set_member(pJsonObject, os_versionKey, node);
	if (isprimitive("bool")) {
		bool obj = getWifi();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *wifiKey = "wifi";
	json_object_set_member(pJsonObject, wifiKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionEvents_data_inner::getEventName()
{
	return event_name;
}

void
ConversionEvents_data_inner::setEventName(std::string  event_name)
{
	this->event_name = event_name;
}

std::string
ConversionEvents_data_inner::getActionSource()
{
	return action_source;
}

void
ConversionEvents_data_inner::setActionSource(std::string  action_source)
{
	this->action_source = action_source;
}

long long
ConversionEvents_data_inner::getEventTime()
{
	return event_time;
}

void
ConversionEvents_data_inner::setEventTime(long long  event_time)
{
	this->event_time = event_time;
}

std::string
ConversionEvents_data_inner::getEventId()
{
	return event_id;
}

void
ConversionEvents_data_inner::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
ConversionEvents_data_inner::getEventSourceUrl()
{
	return event_source_url;
}

void
ConversionEvents_data_inner::setEventSourceUrl(std::string  event_source_url)
{
	this->event_source_url = event_source_url;
}

bool
ConversionEvents_data_inner::getOptOut()
{
	return opt_out;
}

void
ConversionEvents_data_inner::setOptOut(bool  opt_out)
{
	this->opt_out = opt_out;
}

std::string
ConversionEvents_data_inner::getPartnerName()
{
	return partner_name;
}

void
ConversionEvents_data_inner::setPartnerName(std::string  partner_name)
{
	this->partner_name = partner_name;
}

ConversionEventsUserData
ConversionEvents_data_inner::getUserData()
{
	return user_data;
}

void
ConversionEvents_data_inner::setUserData(ConversionEventsUserData  user_data)
{
	this->user_data = user_data;
}

ConversionEvents_data_inner_custom_data
ConversionEvents_data_inner::getCustomData()
{
	return custom_data;
}

void
ConversionEvents_data_inner::setCustomData(ConversionEvents_data_inner_custom_data  custom_data)
{
	this->custom_data = custom_data;
}

std::string
ConversionEvents_data_inner::getAppId()
{
	return app_id;
}

void
ConversionEvents_data_inner::setAppId(std::string  app_id)
{
	this->app_id = app_id;
}

std::string
ConversionEvents_data_inner::getAppName()
{
	return app_name;
}

void
ConversionEvents_data_inner::setAppName(std::string  app_name)
{
	this->app_name = app_name;
}

std::string
ConversionEvents_data_inner::getAppVersion()
{
	return app_version;
}

void
ConversionEvents_data_inner::setAppVersion(std::string  app_version)
{
	this->app_version = app_version;
}

std::string
ConversionEvents_data_inner::getDeviceBrand()
{
	return device_brand;
}

void
ConversionEvents_data_inner::setDeviceBrand(std::string  device_brand)
{
	this->device_brand = device_brand;
}

std::string
ConversionEvents_data_inner::getDeviceCarrier()
{
	return device_carrier;
}

void
ConversionEvents_data_inner::setDeviceCarrier(std::string  device_carrier)
{
	this->device_carrier = device_carrier;
}

std::string
ConversionEvents_data_inner::getDeviceModel()
{
	return device_model;
}

void
ConversionEvents_data_inner::setDeviceModel(std::string  device_model)
{
	this->device_model = device_model;
}

std::string
ConversionEvents_data_inner::getDeviceType()
{
	return device_type;
}

void
ConversionEvents_data_inner::setDeviceType(std::string  device_type)
{
	this->device_type = device_type;
}

std::string
ConversionEvents_data_inner::getOsVersion()
{
	return os_version;
}

void
ConversionEvents_data_inner::setOsVersion(std::string  os_version)
{
	this->os_version = os_version;
}

bool
ConversionEvents_data_inner::getWifi()
{
	return wifi;
}

void
ConversionEvents_data_inner::setWifi(bool  wifi)
{
	this->wifi = wifi;
}

std::string
ConversionEvents_data_inner::getLanguage()
{
	return language;
}

void
ConversionEvents_data_inner::setLanguage(std::string  language)
{
	this->language = language;
}


