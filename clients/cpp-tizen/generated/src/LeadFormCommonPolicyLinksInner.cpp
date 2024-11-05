#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormCommon_policy_links_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormCommon_policy_links_inner::LeadFormCommon_policy_links_inner()
{
	//__init();
}

LeadFormCommon_policy_links_inner::~LeadFormCommon_policy_links_inner()
{
	//__cleanup();
}

void
LeadFormCommon_policy_links_inner::__init()
{
	//label = std::string();
	//link = std::string();
}

void
LeadFormCommon_policy_links_inner::__cleanup()
{
	//if(label != NULL) {
	//
	//delete label;
	//label = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//
}

void
LeadFormCommon_policy_links_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelKey = "label";
	node = json_object_get_member(pJsonObject, labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
}

LeadFormCommon_policy_links_inner::LeadFormCommon_policy_links_inner(char* json)
{
	this->fromJson(json);
}

char*
LeadFormCommon_policy_links_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *labelKey = "label";
	json_object_set_member(pJsonObject, labelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadFormCommon_policy_links_inner::getLabel()
{
	return label;
}

void
LeadFormCommon_policy_links_inner::setLabel(std::string  label)
{
	this->label = label;
}

std::string
LeadFormCommon_policy_links_inner::getLink()
{
	return link;
}

void
LeadFormCommon_policy_links_inner::setLink(std::string  link)
{
	this->link = link;
}


