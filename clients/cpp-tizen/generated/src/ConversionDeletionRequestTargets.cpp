#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionDeletionRequestTargets.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionDeletionRequestTargets::ConversionDeletionRequestTargets()
{
	//__init();
}

ConversionDeletionRequestTargets::~ConversionDeletionRequestTargets()
{
	//__cleanup();
}

void
ConversionDeletionRequestTargets::__init()
{
	//new std::list()std::list> user_emails;
	//new std::list()std::list> epiks;
}

void
ConversionDeletionRequestTargets::__cleanup()
{
	//if(user_emails != NULL) {
	//user_emails.RemoveAll(true);
	//delete user_emails;
	//user_emails = NULL;
	//}
	//if(epiks != NULL) {
	//epiks.RemoveAll(true);
	//delete epiks;
	//epiks = NULL;
	//}
	//
}

void
ConversionDeletionRequestTargets::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *user_emailsKey = "user_emails";
	node = json_object_get_member(pJsonObject, user_emailsKey);
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
			user_emails = new_list;
		}
		
	}
	const gchar *epiksKey = "epiks";
	node = json_object_get_member(pJsonObject, epiksKey);
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
			epiks = new_list;
		}
		
	}
}

ConversionDeletionRequestTargets::ConversionDeletionRequestTargets(char* json)
{
	this->fromJson(json);
}

char*
ConversionDeletionRequestTargets::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUserEmails());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUserEmails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *user_emailsKey = "user_emails";
	json_object_set_member(pJsonObject, user_emailsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEpiks());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEpiks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *epiksKey = "epiks";
	json_object_set_member(pJsonObject, epiksKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionDeletionRequestTargets::getUserEmails()
{
	return user_emails;
}

void
ConversionDeletionRequestTargets::setUserEmails(std::list <std::string> user_emails)
{
	this->user_emails = user_emails;
}

std::list<std::string>
ConversionDeletionRequestTargets::getEpiks()
{
	return epiks;
}

void
ConversionDeletionRequestTargets::setEpiks(std::list <std::string> epiks)
{
	this->epiks = epiks;
}


