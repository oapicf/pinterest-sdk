#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsCreditRedeemRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsCreditRedeemRequest::AdsCreditRedeemRequest()
{
	//__init();
}

AdsCreditRedeemRequest::~AdsCreditRedeemRequest()
{
	//__cleanup();
}

void
AdsCreditRedeemRequest::__init()
{
	//offerCodeHash = std::string();
	//validateOnly = bool(false);
}

void
AdsCreditRedeemRequest::__cleanup()
{
	//if(offerCodeHash != NULL) {
	//
	//delete offerCodeHash;
	//offerCodeHash = NULL;
	//}
	//if(validateOnly != NULL) {
	//
	//delete validateOnly;
	//validateOnly = NULL;
	//}
	//
}

void
AdsCreditRedeemRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offerCodeHashKey = "offerCodeHash";
	node = json_object_get_member(pJsonObject, offerCodeHashKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&offerCodeHash, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *validateOnlyKey = "validateOnly";
	node = json_object_get_member(pJsonObject, validateOnlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&validateOnly, node, "bool", "");
		} else {
			
		}
	}
}

AdsCreditRedeemRequest::AdsCreditRedeemRequest(char* json)
{
	this->fromJson(json);
}

char*
AdsCreditRedeemRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOfferCodeHash();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *offerCodeHashKey = "offerCodeHash";
	json_object_set_member(pJsonObject, offerCodeHashKey, node);
	if (isprimitive("bool")) {
		bool obj = getValidateOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *validateOnlyKey = "validateOnly";
	json_object_set_member(pJsonObject, validateOnlyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdsCreditRedeemRequest::getOfferCodeHash()
{
	return offerCodeHash;
}

void
AdsCreditRedeemRequest::setOfferCodeHash(std::string  offerCodeHash)
{
	this->offerCodeHash = offerCodeHash;
}

bool
AdsCreditRedeemRequest::getValidateOnly()
{
	return validateOnly;
}

void
AdsCreditRedeemRequest::setValidateOnly(bool  validateOnly)
{
	this->validateOnly = validateOnly;
}


