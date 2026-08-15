

#include "ConversionEventAppInfo.h"

using namespace Tiny;

ConversionEventAppInfo::ConversionEventAppInfo()
{
	app_id = std::string();
	app_name = std::string();
	app_package_name = std::string();
	app_store = std::string();
	app_version = std::string();
	install_time = int(0);
	user_agent = std::string();
	window_height = int(0);
	window_width = int(0);
}

ConversionEventAppInfo::ConversionEventAppInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventAppInfo::~ConversionEventAppInfo()
{

}

void
ConversionEventAppInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *app_idKey = "app_id";

    if(object.has_key(app_idKey))
    {
        bourne::json value = object[app_idKey];



        jsonToValue(&app_id, value, "std::string");


    }

    const char *app_nameKey = "app_name";

    if(object.has_key(app_nameKey))
    {
        bourne::json value = object[app_nameKey];



        jsonToValue(&app_name, value, "std::string");


    }

    const char *app_package_nameKey = "app_package_name";

    if(object.has_key(app_package_nameKey))
    {
        bourne::json value = object[app_package_nameKey];



        jsonToValue(&app_package_name, value, "std::string");


    }

    const char *app_storeKey = "app_store";

    if(object.has_key(app_storeKey))
    {
        bourne::json value = object[app_storeKey];



        jsonToValue(&app_store, value, "std::string");


    }

    const char *app_versionKey = "app_version";

    if(object.has_key(app_versionKey))
    {
        bourne::json value = object[app_versionKey];



        jsonToValue(&app_version, value, "std::string");


    }

    const char *install_timeKey = "install_time";

    if(object.has_key(install_timeKey))
    {
        bourne::json value = object[install_timeKey];



        jsonToValue(&install_time, value, "int");


    }

    const char *user_agentKey = "user_agent";

    if(object.has_key(user_agentKey))
    {
        bourne::json value = object[user_agentKey];



        jsonToValue(&user_agent, value, "std::string");


    }

    const char *window_heightKey = "window_height";

    if(object.has_key(window_heightKey))
    {
        bourne::json value = object[window_heightKey];



        jsonToValue(&window_height, value, "int");


    }

    const char *window_widthKey = "window_width";

    if(object.has_key(window_widthKey))
    {
        bourne::json value = object[window_widthKey];



        jsonToValue(&window_width, value, "int");


    }


}

bourne::json
ConversionEventAppInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["app_id"] = getAppId();






    object["app_name"] = getAppName();






    object["app_package_name"] = getAppPackageName();






    object["app_store"] = getAppStore();






    object["app_version"] = getAppVersion();






    object["install_time"] = getInstallTime();






    object["user_agent"] = getUserAgent();






    object["window_height"] = getWindowHeight();






    object["window_width"] = getWindowWidth();



    return object;

}

std::string
ConversionEventAppInfo::getAppId()
{
	return app_id;
}

void
ConversionEventAppInfo::setAppId(std::string  app_id)
{
	this->app_id = app_id;
}

std::string
ConversionEventAppInfo::getAppName()
{
	return app_name;
}

void
ConversionEventAppInfo::setAppName(std::string  app_name)
{
	this->app_name = app_name;
}

std::string
ConversionEventAppInfo::getAppPackageName()
{
	return app_package_name;
}

void
ConversionEventAppInfo::setAppPackageName(std::string  app_package_name)
{
	this->app_package_name = app_package_name;
}

std::string
ConversionEventAppInfo::getAppStore()
{
	return app_store;
}

void
ConversionEventAppInfo::setAppStore(std::string  app_store)
{
	this->app_store = app_store;
}

std::string
ConversionEventAppInfo::getAppVersion()
{
	return app_version;
}

void
ConversionEventAppInfo::setAppVersion(std::string  app_version)
{
	this->app_version = app_version;
}

int
ConversionEventAppInfo::getInstallTime()
{
	return install_time;
}

void
ConversionEventAppInfo::setInstallTime(int  install_time)
{
	this->install_time = install_time;
}

std::string
ConversionEventAppInfo::getUserAgent()
{
	return user_agent;
}

void
ConversionEventAppInfo::setUserAgent(std::string  user_agent)
{
	this->user_agent = user_agent;
}

int
ConversionEventAppInfo::getWindowHeight()
{
	return window_height;
}

void
ConversionEventAppInfo::setWindowHeight(int  window_height)
{
	this->window_height = window_height;
}

int
ConversionEventAppInfo::getWindowWidth()
{
	return window_width;
}

void
ConversionEventAppInfo::setWindowWidth(int  window_width)
{
	this->window_width = window_width;
}



