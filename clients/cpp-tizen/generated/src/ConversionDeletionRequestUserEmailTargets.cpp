#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionDeletionRequestUserEmailTargets.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionDeletionRequestUserEmailTargets::ConversionDeletionRequestUserEmailTargets()
{
	//__init();
}

ConversionDeletionRequestUserEmailTargets::~ConversionDeletionRequestUserEmailTargets()
{
	//__cleanup();
}

void
ConversionDeletionRequestUserEmailTargets::__init()
{
	//new std::list()std::list> user_emails;
}

void
ConversionDeletionRequestUserEmailTargets::__cleanup()
{
	//if(user_emails != NULL) {
	//user_emails.RemoveAll(true);
	//delete user_emails;
	//user_emails = NULL;
	//}
	//
}

void
ConversionDeletionRequestUserEmailTargets::fromJson(char* jsonStr)
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
}

ConversionDeletionRequestUserEmailTargets::ConversionDeletionRequestUserEmailTargets(char* json)
{
	this->fromJson(json);
}

char*
ConversionDeletionRequestUserEmailTargets::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionDeletionRequestUserEmailTargets::getUserEmails()
{
	return user_emails;
}

void
ConversionDeletionRequestUserEmailTargets::setUserEmails(std::list <std::string> user_emails)
{
	this->user_emails = user_emails;
}


