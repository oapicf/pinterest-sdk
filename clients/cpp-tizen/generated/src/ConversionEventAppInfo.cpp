#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventAppInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventAppInfo::ConversionEventAppInfo()
{
	//__init();
}

ConversionEventAppInfo::~ConversionEventAppInfo()
{
	//__cleanup();
}

void
ConversionEventAppInfo::__init()
{
	//app_id = std::string();
	//app_name = std::string();
	//app_package_name = std::string();
	//app_store = std::string();
	//app_version = std::string();
	//install_time = int(0);
	//user_agent = std::string();
	//window_height = int(0);
	//window_width = int(0);
}

void
ConversionEventAppInfo::__cleanup()
{
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
	//if(app_package_name != NULL) {
	//
	//delete app_package_name;
	//app_package_name = NULL;
	//}
	//if(app_store != NULL) {
	//
	//delete app_store;
	//app_store = NULL;
	//}
	//if(app_version != NULL) {
	//
	//delete app_version;
	//app_version = NULL;
	//}
	//if(install_time != NULL) {
	//
	//delete install_time;
	//install_time = NULL;
	//}
	//if(user_agent != NULL) {
	//
	//delete user_agent;
	//user_agent = NULL;
	//}
	//if(window_height != NULL) {
	//
	//delete window_height;
	//window_height = NULL;
	//}
	//if(window_width != NULL) {
	//
	//delete window_width;
	//window_width = NULL;
	//}
	//
}

void
ConversionEventAppInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *app_package_nameKey = "app_package_name";
	node = json_object_get_member(pJsonObject, app_package_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_package_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_storeKey = "app_store";
	node = json_object_get_member(pJsonObject, app_storeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_store, node, "std::string", "");
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
	const gchar *install_timeKey = "install_time";
	node = json_object_get_member(pJsonObject, install_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&install_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *user_agentKey = "user_agent";
	node = json_object_get_member(pJsonObject, user_agentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_agent, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *window_heightKey = "window_height";
	node = json_object_get_member(pJsonObject, window_heightKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&window_height, node, "int", "");
		} else {
			
		}
	}
	const gchar *window_widthKey = "window_width";
	node = json_object_get_member(pJsonObject, window_widthKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&window_width, node, "int", "");
		} else {
			
		}
	}
}

ConversionEventAppInfo::ConversionEventAppInfo(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventAppInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		std::string obj = getAppPackageName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_package_nameKey = "app_package_name";
	json_object_set_member(pJsonObject, app_package_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppStore();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_storeKey = "app_store";
	json_object_set_member(pJsonObject, app_storeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppVersion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_versionKey = "app_version";
	json_object_set_member(pJsonObject, app_versionKey, node);
	if (isprimitive("int")) {
		int obj = getInstallTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *install_timeKey = "install_time";
	json_object_set_member(pJsonObject, install_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserAgent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_agentKey = "user_agent";
	json_object_set_member(pJsonObject, user_agentKey, node);
	if (isprimitive("int")) {
		int obj = getWindowHeight();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *window_heightKey = "window_height";
	json_object_set_member(pJsonObject, window_heightKey, node);
	if (isprimitive("int")) {
		int obj = getWindowWidth();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *window_widthKey = "window_width";
	json_object_set_member(pJsonObject, window_widthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


