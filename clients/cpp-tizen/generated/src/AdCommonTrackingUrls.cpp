#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdCommon_tracking_urls.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdCommon_tracking_urls::AdCommon_tracking_urls()
{
	//__init();
}

AdCommon_tracking_urls::~AdCommon_tracking_urls()
{
	//__cleanup();
}

void
AdCommon_tracking_urls::__init()
{
	//new std::list()std::list> impression;
	//new std::list()std::list> click;
	//new std::list()std::list> engagement;
	//new std::list()std::list> buyable_button;
	//new std::list()std::list> audience_verification;
}

void
AdCommon_tracking_urls::__cleanup()
{
	//if(impression != NULL) {
	//impression.RemoveAll(true);
	//delete impression;
	//impression = NULL;
	//}
	//if(click != NULL) {
	//click.RemoveAll(true);
	//delete click;
	//click = NULL;
	//}
	//if(engagement != NULL) {
	//engagement.RemoveAll(true);
	//delete engagement;
	//engagement = NULL;
	//}
	//if(buyable_button != NULL) {
	//buyable_button.RemoveAll(true);
	//delete buyable_button;
	//buyable_button = NULL;
	//}
	//if(audience_verification != NULL) {
	//audience_verification.RemoveAll(true);
	//delete audience_verification;
	//audience_verification = NULL;
	//}
	//
}

void
AdCommon_tracking_urls::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *impressionKey = "impression";
	node = json_object_get_member(pJsonObject, impressionKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			impression = new_list;
		}
		
	}
	const gchar *clickKey = "click";
	node = json_object_get_member(pJsonObject, clickKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			click = new_list;
		}
		
	}
	const gchar *engagementKey = "engagement";
	node = json_object_get_member(pJsonObject, engagementKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			engagement = new_list;
		}
		
	}
	const gchar *buyable_buttonKey = "buyable_button";
	node = json_object_get_member(pJsonObject, buyable_buttonKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			buyable_button = new_list;
		}
		
	}
	const gchar *audience_verificationKey = "audience_verification";
	node = json_object_get_member(pJsonObject, audience_verificationKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			audience_verification = new_list;
		}
		
	}
}

AdCommon_tracking_urls::AdCommon_tracking_urls(char* json)
{
	this->fromJson(json);
}

char*
AdCommon_tracking_urls::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getImpression());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getImpression());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *impressionKey = "impression";
	json_object_set_member(pJsonObject, impressionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getClick());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getClick());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *clickKey = "click";
	json_object_set_member(pJsonObject, clickKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEngagement());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEngagement());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *engagementKey = "engagement";
	json_object_set_member(pJsonObject, engagementKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getBuyableButton());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getBuyableButton());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *buyable_buttonKey = "buyable_button";
	json_object_set_member(pJsonObject, buyable_buttonKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceVerification());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceVerification());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *audience_verificationKey = "audience_verification";
	json_object_set_member(pJsonObject, audience_verificationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
AdCommon_tracking_urls::getImpression()
{
	return impression;
}

void
AdCommon_tracking_urls::setImpression(std::list <std::string> impression)
{
	this->impression = impression;
}

std::list<std::string>
AdCommon_tracking_urls::getClick()
{
	return click;
}

void
AdCommon_tracking_urls::setClick(std::list <std::string> click)
{
	this->click = click;
}

std::list<std::string>
AdCommon_tracking_urls::getEngagement()
{
	return engagement;
}

void
AdCommon_tracking_urls::setEngagement(std::list <std::string> engagement)
{
	this->engagement = engagement;
}

std::list<std::string>
AdCommon_tracking_urls::getBuyableButton()
{
	return buyable_button;
}

void
AdCommon_tracking_urls::setBuyableButton(std::list <std::string> buyable_button)
{
	this->buyable_button = buyable_button;
}

std::list<std::string>
AdCommon_tracking_urls::getAudienceVerification()
{
	return audience_verification;
}

void
AdCommon_tracking_urls::setAudienceVerification(std::list <std::string> audience_verification)
{
	this->audience_verification = audience_verification;
}


