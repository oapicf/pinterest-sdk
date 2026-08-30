#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsDataItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsDataItems::ConversionEventsDataItems()
{
	//__init();
}

ConversionEventsDataItems::~ConversionEventsDataItems()
{
	//__cleanup();
}

void
ConversionEventsDataItems::__init()
{
	//action_source = std::string();
	//app_id = std::string();
	//app_info = new ConversionEventAppInfo();
	//app_name = std::string();
	//app_version = std::string();
	//custom_data = new ConversionEventsDataItemsCustomData();
	//device_brand = std::string();
	//device_carrier = std::string();
	//device_info = new ConversionEventDeviceInfo();
	//device_model = std::string();
	//device_type = std::string();
	//event_id = std::string();
	//event_name = std::string();
	//event_source_url = std::string();
	//event_time = long(0);
	//language = std::string();
	//opt_out = bool(false);
	//os_version = std::string();
	//partner_name = std::string();
	//user_data = null;
	//wifi = bool(false);
}

void
ConversionEventsDataItems::__cleanup()
{
	//if(action_source != NULL) {
	//
	//delete action_source;
	//action_source = NULL;
	//}
	//if(app_id != NULL) {
	//
	//delete app_id;
	//app_id = NULL;
	//}
	//if(app_info != NULL) {
	//
	//delete app_info;
	//app_info = NULL;
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
	//if(custom_data != NULL) {
	//
	//delete custom_data;
	//custom_data = NULL;
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
	//if(device_info != NULL) {
	//
	//delete device_info;
	//device_info = NULL;
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
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
	//if(event_name != NULL) {
	//
	//delete event_name;
	//event_name = NULL;
	//}
	//if(event_source_url != NULL) {
	//
	//delete event_source_url;
	//event_source_url = NULL;
	//}
	//if(event_time != NULL) {
	//
	//delete event_time;
	//event_time = NULL;
	//}
	//if(language != NULL) {
	//
	//delete language;
	//language = NULL;
	//}
	//if(opt_out != NULL) {
	//
	//delete opt_out;
	//opt_out = NULL;
	//}
	//if(os_version != NULL) {
	//
	//delete os_version;
	//os_version = NULL;
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
	//if(wifi != NULL) {
	//
	//delete wifi;
	//wifi = NULL;
	//}
	//
}

void
ConversionEventsDataItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *action_sourceKey = "action_source";
	node = json_object_get_member(pJsonObject, action_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&action_source, node, "std::string", "");
		} else {
			
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
	const gchar *app_infoKey = "app_info";
	node = json_object_get_member(pJsonObject, app_infoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEventAppInfo")) {
			jsonToValue(&app_info, node, "ConversionEventAppInfo", "ConversionEventAppInfo");
		} else {
			
			ConversionEventAppInfo* obj = static_cast<ConversionEventAppInfo*> (&app_info);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *custom_dataKey = "custom_data";
	node = json_object_get_member(pJsonObject, custom_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEventsDataItemsCustomData")) {
			jsonToValue(&custom_data, node, "ConversionEventsDataItemsCustomData", "ConversionEventsDataItemsCustomData");
		} else {
			
			ConversionEventsDataItemsCustomData* obj = static_cast<ConversionEventsDataItemsCustomData*> (&custom_data);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *device_infoKey = "device_info";
	node = json_object_get_member(pJsonObject, device_infoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionEventDeviceInfo")) {
			jsonToValue(&device_info, node, "ConversionEventDeviceInfo", "ConversionEventDeviceInfo");
		} else {
			
			ConversionEventDeviceInfo* obj = static_cast<ConversionEventDeviceInfo*> (&device_info);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_nameKey = "event_name";
	node = json_object_get_member(pJsonObject, event_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_name, node, "std::string", "");
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
	const gchar *event_timeKey = "event_time";
	node = json_object_get_member(pJsonObject, event_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&event_time, node, "long long", "");
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
	const gchar *opt_outKey = "opt_out";
	node = json_object_get_member(pJsonObject, opt_outKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&opt_out, node, "bool", "");
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
	

		if (isprimitive("ConversionEventsUserDataProperties")) {
			jsonToValue(&user_data, node, "ConversionEventsUserDataProperties", "ConversionEventsUserDataProperties");
		} else {
			
			ConversionEventsUserDataProperties* obj = static_cast<ConversionEventsUserDataProperties*> (&user_data);
			obj->fromJson(json_to_string(node, false));
			
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
}

ConversionEventsDataItems::ConversionEventsDataItems(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsDataItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getActionSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *action_sourceKey = "action_source";
	json_object_set_member(pJsonObject, action_sourceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_idKey = "app_id";
	json_object_set_member(pJsonObject, app_idKey, node);
	if (isprimitive("ConversionEventAppInfo")) {
		ConversionEventAppInfo obj = getAppInfo();
		node = converttoJson(&obj, "ConversionEventAppInfo", "");
	}
	else {
		
		ConversionEventAppInfo obj = static_cast<ConversionEventAppInfo> (getAppInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_infoKey = "app_info";
	json_object_set_member(pJsonObject, app_infoKey, node);
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
	if (isprimitive("ConversionEventsDataItemsCustomData")) {
		ConversionEventsDataItemsCustomData obj = getCustomData();
		node = converttoJson(&obj, "ConversionEventsDataItemsCustomData", "");
	}
	else {
		
		ConversionEventsDataItemsCustomData obj = static_cast<ConversionEventsDataItemsCustomData> (getCustomData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *custom_dataKey = "custom_data";
	json_object_set_member(pJsonObject, custom_dataKey, node);
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
	if (isprimitive("ConversionEventDeviceInfo")) {
		ConversionEventDeviceInfo obj = getDeviceInfo();
		node = converttoJson(&obj, "ConversionEventDeviceInfo", "");
	}
	else {
		
		ConversionEventDeviceInfo obj = static_cast<ConversionEventDeviceInfo> (getDeviceInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *device_infoKey = "device_info";
	json_object_set_member(pJsonObject, device_infoKey, node);
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
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_nameKey = "event_name";
	json_object_set_member(pJsonObject, event_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventSourceUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_source_urlKey = "event_source_url";
	json_object_set_member(pJsonObject, event_source_urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getEventTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *event_timeKey = "event_time";
	json_object_set_member(pJsonObject, event_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *languageKey = "language";
	json_object_set_member(pJsonObject, languageKey, node);
	if (isprimitive("bool")) {
		bool obj = getOptOut();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *opt_outKey = "opt_out";
	json_object_set_member(pJsonObject, opt_outKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOsVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *os_versionKey = "os_version";
	json_object_set_member(pJsonObject, os_versionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_nameKey = "partner_name";
	json_object_set_member(pJsonObject, partner_nameKey, node);
	if (isprimitive("ConversionEventsUserDataProperties")) {
		ConversionEventsUserDataProperties obj = getUserData();
		node = converttoJson(&obj, "ConversionEventsUserDataProperties", "");
	}
	else {
		
		ConversionEventsUserDataProperties obj = static_cast<ConversionEventsUserDataProperties> (getUserData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *user_dataKey = "user_data";
	json_object_set_member(pJsonObject, user_dataKey, node);
	if (isprimitive("bool")) {
		bool obj = getWifi();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *wifiKey = "wifi";
	json_object_set_member(pJsonObject, wifiKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionEventsDataItems::getActionSource()
{
	return action_source;
}

void
ConversionEventsDataItems::setActionSource(std::string  action_source)
{
	this->action_source = action_source;
}

std::string
ConversionEventsDataItems::getAppId()
{
	return app_id;
}

void
ConversionEventsDataItems::setAppId(std::string  app_id)
{
	this->app_id = app_id;
}

ConversionEventAppInfo
ConversionEventsDataItems::getAppInfo()
{
	return app_info;
}

void
ConversionEventsDataItems::setAppInfo(ConversionEventAppInfo  app_info)
{
	this->app_info = app_info;
}

std::string
ConversionEventsDataItems::getAppName()
{
	return app_name;
}

void
ConversionEventsDataItems::setAppName(std::string  app_name)
{
	this->app_name = app_name;
}

std::string
ConversionEventsDataItems::getAppVersion()
{
	return app_version;
}

void
ConversionEventsDataItems::setAppVersion(std::string  app_version)
{
	this->app_version = app_version;
}

ConversionEventsDataItemsCustomData
ConversionEventsDataItems::getCustomData()
{
	return custom_data;
}

void
ConversionEventsDataItems::setCustomData(ConversionEventsDataItemsCustomData  custom_data)
{
	this->custom_data = custom_data;
}

std::string
ConversionEventsDataItems::getDeviceBrand()
{
	return device_brand;
}

void
ConversionEventsDataItems::setDeviceBrand(std::string  device_brand)
{
	this->device_brand = device_brand;
}

std::string
ConversionEventsDataItems::getDeviceCarrier()
{
	return device_carrier;
}

void
ConversionEventsDataItems::setDeviceCarrier(std::string  device_carrier)
{
	this->device_carrier = device_carrier;
}

ConversionEventDeviceInfo
ConversionEventsDataItems::getDeviceInfo()
{
	return device_info;
}

void
ConversionEventsDataItems::setDeviceInfo(ConversionEventDeviceInfo  device_info)
{
	this->device_info = device_info;
}

std::string
ConversionEventsDataItems::getDeviceModel()
{
	return device_model;
}

void
ConversionEventsDataItems::setDeviceModel(std::string  device_model)
{
	this->device_model = device_model;
}

std::string
ConversionEventsDataItems::getDeviceType()
{
	return device_type;
}

void
ConversionEventsDataItems::setDeviceType(std::string  device_type)
{
	this->device_type = device_type;
}

std::string
ConversionEventsDataItems::getEventId()
{
	return event_id;
}

void
ConversionEventsDataItems::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
ConversionEventsDataItems::getEventName()
{
	return event_name;
}

void
ConversionEventsDataItems::setEventName(std::string  event_name)
{
	this->event_name = event_name;
}

std::string
ConversionEventsDataItems::getEventSourceUrl()
{
	return event_source_url;
}

void
ConversionEventsDataItems::setEventSourceUrl(std::string  event_source_url)
{
	this->event_source_url = event_source_url;
}

long long
ConversionEventsDataItems::getEventTime()
{
	return event_time;
}

void
ConversionEventsDataItems::setEventTime(long long  event_time)
{
	this->event_time = event_time;
}

std::string
ConversionEventsDataItems::getLanguage()
{
	return language;
}

void
ConversionEventsDataItems::setLanguage(std::string  language)
{
	this->language = language;
}

bool
ConversionEventsDataItems::getOptOut()
{
	return opt_out;
}

void
ConversionEventsDataItems::setOptOut(bool  opt_out)
{
	this->opt_out = opt_out;
}

std::string
ConversionEventsDataItems::getOsVersion()
{
	return os_version;
}

void
ConversionEventsDataItems::setOsVersion(std::string  os_version)
{
	this->os_version = os_version;
}

std::string
ConversionEventsDataItems::getPartnerName()
{
	return partner_name;
}

void
ConversionEventsDataItems::setPartnerName(std::string  partner_name)
{
	this->partner_name = partner_name;
}

ConversionEventsUserDataProperties
ConversionEventsDataItems::getUserData()
{
	return user_data;
}

void
ConversionEventsDataItems::setUserData(ConversionEventsUserDataProperties  user_data)
{
	this->user_data = user_data;
}

bool
ConversionEventsDataItems::getWifi()
{
	return wifi;
}

void
ConversionEventsDataItems::setWifi(bool  wifi)
{
	this->wifi = wifi;
}


