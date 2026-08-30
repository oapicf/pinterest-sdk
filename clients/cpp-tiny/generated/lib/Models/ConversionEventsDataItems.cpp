

#include "ConversionEventsDataItems.h"

using namespace Tiny;

ConversionEventsDataItems::ConversionEventsDataItems()
{
	action_source = std::string();
	app_id = std::string();
	app_info = ConversionEventAppInfo();
	app_name = std::string();
	app_version = std::string();
	custom_data = ConversionEventsDataItemsCustomData();
	device_brand = std::string();
	device_carrier = std::string();
	device_info = ConversionEventDeviceInfo();
	device_model = std::string();
	device_type = std::string();
	event_id = std::string();
	event_name = std::string();
	event_source_url = std::string();
	event_time = long(0);
	language = std::string();
	opt_out = bool(false);
	os_version = std::string();
	partner_name = std::string();
	user_data = null;
	wifi = bool(false);
}

ConversionEventsDataItems::ConversionEventsDataItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventsDataItems::~ConversionEventsDataItems()
{

}

void
ConversionEventsDataItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *action_sourceKey = "action_source";

    if(object.has_key(action_sourceKey))
    {
        bourne::json value = object[action_sourceKey];



        jsonToValue(&action_source, value, "std::string");


    }

    const char *app_idKey = "app_id";

    if(object.has_key(app_idKey))
    {
        bourne::json value = object[app_idKey];



        jsonToValue(&app_id, value, "std::string");


    }

    const char *app_infoKey = "app_info";

    if(object.has_key(app_infoKey))
    {
        bourne::json value = object[app_infoKey];




        ConversionEventAppInfo* obj = &app_info;
		obj->fromJson(value.dump());

    }

    const char *app_nameKey = "app_name";

    if(object.has_key(app_nameKey))
    {
        bourne::json value = object[app_nameKey];



        jsonToValue(&app_name, value, "std::string");


    }

    const char *app_versionKey = "app_version";

    if(object.has_key(app_versionKey))
    {
        bourne::json value = object[app_versionKey];



        jsonToValue(&app_version, value, "std::string");


    }

    const char *custom_dataKey = "custom_data";

    if(object.has_key(custom_dataKey))
    {
        bourne::json value = object[custom_dataKey];




        ConversionEventsDataItemsCustomData* obj = &custom_data;
		obj->fromJson(value.dump());

    }

    const char *device_brandKey = "device_brand";

    if(object.has_key(device_brandKey))
    {
        bourne::json value = object[device_brandKey];



        jsonToValue(&device_brand, value, "std::string");


    }

    const char *device_carrierKey = "device_carrier";

    if(object.has_key(device_carrierKey))
    {
        bourne::json value = object[device_carrierKey];



        jsonToValue(&device_carrier, value, "std::string");


    }

    const char *device_infoKey = "device_info";

    if(object.has_key(device_infoKey))
    {
        bourne::json value = object[device_infoKey];




        ConversionEventDeviceInfo* obj = &device_info;
		obj->fromJson(value.dump());

    }

    const char *device_modelKey = "device_model";

    if(object.has_key(device_modelKey))
    {
        bourne::json value = object[device_modelKey];



        jsonToValue(&device_model, value, "std::string");


    }

    const char *device_typeKey = "device_type";

    if(object.has_key(device_typeKey))
    {
        bourne::json value = object[device_typeKey];



        jsonToValue(&device_type, value, "std::string");


    }

    const char *event_idKey = "event_id";

    if(object.has_key(event_idKey))
    {
        bourne::json value = object[event_idKey];



        jsonToValue(&event_id, value, "std::string");


    }

    const char *event_nameKey = "event_name";

    if(object.has_key(event_nameKey))
    {
        bourne::json value = object[event_nameKey];



        jsonToValue(&event_name, value, "std::string");


    }

    const char *event_source_urlKey = "event_source_url";

    if(object.has_key(event_source_urlKey))
    {
        bourne::json value = object[event_source_urlKey];



        jsonToValue(&event_source_url, value, "std::string");


    }

    const char *event_timeKey = "event_time";

    if(object.has_key(event_timeKey))
    {
        bourne::json value = object[event_timeKey];



        jsonToValue(&event_time, value, "long");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];



        jsonToValue(&language, value, "std::string");


    }

    const char *opt_outKey = "opt_out";

    if(object.has_key(opt_outKey))
    {
        bourne::json value = object[opt_outKey];



        jsonToValue(&opt_out, value, "bool");


    }

    const char *os_versionKey = "os_version";

    if(object.has_key(os_versionKey))
    {
        bourne::json value = object[os_versionKey];



        jsonToValue(&os_version, value, "std::string");


    }

    const char *partner_nameKey = "partner_name";

    if(object.has_key(partner_nameKey))
    {
        bourne::json value = object[partner_nameKey];



        jsonToValue(&partner_name, value, "std::string");


    }

    const char *user_dataKey = "user_data";

    if(object.has_key(user_dataKey))
    {
        bourne::json value = object[user_dataKey];




        ConversionEventsUserDataProperties* obj = &user_data;
		obj->fromJson(value.dump());

    }

    const char *wifiKey = "wifi";

    if(object.has_key(wifiKey))
    {
        bourne::json value = object[wifiKey];



        jsonToValue(&wifi, value, "bool");


    }


}

bourne::json
ConversionEventsDataItems::toJson()
{
    bourne::json object = bourne::json::object();





    object["action_source"] = getActionSource();






    object["app_id"] = getAppId();







	object["app_info"] = getAppInfo().toJson();





    object["app_name"] = getAppName();






    object["app_version"] = getAppVersion();







	object["custom_data"] = getCustomData().toJson();





    object["device_brand"] = getDeviceBrand();






    object["device_carrier"] = getDeviceCarrier();







	object["device_info"] = getDeviceInfo().toJson();





    object["device_model"] = getDeviceModel();






    object["device_type"] = getDeviceType();






    object["event_id"] = getEventId();






    object["event_name"] = getEventName();






    object["event_source_url"] = getEventSourceUrl();






    object["event_time"] = getEventTime();






    object["language"] = getLanguage();






    object["opt_out"] = isOptOut();






    object["os_version"] = getOsVersion();






    object["partner_name"] = getPartnerName();







	object["user_data"] = getUserData().toJson();





    object["wifi"] = isWifi();



    return object;

}

std::string
ConversionEventsDataItems::getActionSource()
{
	return action_source;
}

void
ConversionEventsDataItems::setActionSource(std::string action_source)
{
	this->action_source = action_source;
}

std::string
ConversionEventsDataItems::getAppId()
{
	return app_id;
}

void
ConversionEventsDataItems::setAppId(std::string app_id)
{
	this->app_id = app_id;
}

ConversionEventAppInfo
ConversionEventsDataItems::getAppInfo()
{
	return app_info;
}

void
ConversionEventsDataItems::setAppInfo(ConversionEventAppInfo app_info)
{
	this->app_info = app_info;
}

std::string
ConversionEventsDataItems::getAppName()
{
	return app_name;
}

void
ConversionEventsDataItems::setAppName(std::string app_name)
{
	this->app_name = app_name;
}

std::string
ConversionEventsDataItems::getAppVersion()
{
	return app_version;
}

void
ConversionEventsDataItems::setAppVersion(std::string app_version)
{
	this->app_version = app_version;
}

ConversionEventsDataItemsCustomData
ConversionEventsDataItems::getCustomData()
{
	return custom_data;
}

void
ConversionEventsDataItems::setCustomData(ConversionEventsDataItemsCustomData custom_data)
{
	this->custom_data = custom_data;
}

std::string
ConversionEventsDataItems::getDeviceBrand()
{
	return device_brand;
}

void
ConversionEventsDataItems::setDeviceBrand(std::string device_brand)
{
	this->device_brand = device_brand;
}

std::string
ConversionEventsDataItems::getDeviceCarrier()
{
	return device_carrier;
}

void
ConversionEventsDataItems::setDeviceCarrier(std::string device_carrier)
{
	this->device_carrier = device_carrier;
}

ConversionEventDeviceInfo
ConversionEventsDataItems::getDeviceInfo()
{
	return device_info;
}

void
ConversionEventsDataItems::setDeviceInfo(ConversionEventDeviceInfo device_info)
{
	this->device_info = device_info;
}

std::string
ConversionEventsDataItems::getDeviceModel()
{
	return device_model;
}

void
ConversionEventsDataItems::setDeviceModel(std::string device_model)
{
	this->device_model = device_model;
}

std::string
ConversionEventsDataItems::getDeviceType()
{
	return device_type;
}

void
ConversionEventsDataItems::setDeviceType(std::string device_type)
{
	this->device_type = device_type;
}

std::string
ConversionEventsDataItems::getEventId()
{
	return event_id;
}

void
ConversionEventsDataItems::setEventId(std::string event_id)
{
	this->event_id = event_id;
}

std::string
ConversionEventsDataItems::getEventName()
{
	return event_name;
}

void
ConversionEventsDataItems::setEventName(std::string event_name)
{
	this->event_name = event_name;
}

std::string
ConversionEventsDataItems::getEventSourceUrl()
{
	return event_source_url;
}

void
ConversionEventsDataItems::setEventSourceUrl(std::string event_source_url)
{
	this->event_source_url = event_source_url;
}

long
ConversionEventsDataItems::getEventTime()
{
	return event_time;
}

void
ConversionEventsDataItems::setEventTime(long event_time)
{
	this->event_time = event_time;
}

std::string
ConversionEventsDataItems::getLanguage()
{
	return language;
}

void
ConversionEventsDataItems::setLanguage(std::string language)
{
	this->language = language;
}

bool
ConversionEventsDataItems::isOptOut()
{
	return opt_out;
}

void
ConversionEventsDataItems::setOptOut(bool opt_out)
{
	this->opt_out = opt_out;
}

std::string
ConversionEventsDataItems::getOsVersion()
{
	return os_version;
}

void
ConversionEventsDataItems::setOsVersion(std::string os_version)
{
	this->os_version = os_version;
}

std::string
ConversionEventsDataItems::getPartnerName()
{
	return partner_name;
}

void
ConversionEventsDataItems::setPartnerName(std::string partner_name)
{
	this->partner_name = partner_name;
}

ConversionEventsUserDataProperties
ConversionEventsDataItems::getUserData()
{
	return user_data;
}

void
ConversionEventsDataItems::setUserData(ConversionEventsUserDataProperties user_data)
{
	this->user_data = user_data;
}

bool
ConversionEventsDataItems::isWifi()
{
	return wifi;
}

void
ConversionEventsDataItems::setWifi(bool wifi)
{
	this->wifi = wifi;
}



