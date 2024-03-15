#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinMediaSourcePinURL.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinMediaSourcePinURL::PinMediaSourcePinURL()
{
	//__init();
}

PinMediaSourcePinURL::~PinMediaSourcePinURL()
{
	//__cleanup();
}

void
PinMediaSourcePinURL::__init()
{
	//source_type = std::string();
	//is_affiliate_link = bool(false);
}

void
PinMediaSourcePinURL::__cleanup()
{
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(is_affiliate_link != NULL) {
	//
	//delete is_affiliate_link;
	//is_affiliate_link = NULL;
	//}
	//
}

void
PinMediaSourcePinURL::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_affiliate_linkKey = "is_affiliate_link";
	node = json_object_get_member(pJsonObject, is_affiliate_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_affiliate_link, node, "bool", "");
		} else {
			
		}
	}
}

PinMediaSourcePinURL::PinMediaSourcePinURL(char* json)
{
	this->fromJson(json);
}

char*
PinMediaSourcePinURL::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAffiliateLink();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_affiliate_linkKey = "is_affiliate_link";
	json_object_set_member(pJsonObject, is_affiliate_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PinMediaSourcePinURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourcePinURL::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

bool
PinMediaSourcePinURL::getIsAffiliateLink()
{
	return is_affiliate_link;
}

void
PinMediaSourcePinURL::setIsAffiliateLink(bool  is_affiliate_link)
{
	this->is_affiliate_link = is_affiliate_link;
}


