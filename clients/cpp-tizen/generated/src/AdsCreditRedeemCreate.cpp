#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsCreditRedeemCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsCreditRedeemCreate::AdsCreditRedeemCreate()
{
	//__init();
}

AdsCreditRedeemCreate::~AdsCreditRedeemCreate()
{
	//__cleanup();
}

void
AdsCreditRedeemCreate::__init()
{
	//offerCodeHash = std::string();
	//validateOnly = bool(false);
}

void
AdsCreditRedeemCreate::__cleanup()
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
AdsCreditRedeemCreate::fromJson(char* jsonStr)
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

AdsCreditRedeemCreate::AdsCreditRedeemCreate(char* json)
{
	this->fromJson(json);
}

char*
AdsCreditRedeemCreate::toJson()
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
AdsCreditRedeemCreate::getOfferCodeHash()
{
	return offerCodeHash;
}

void
AdsCreditRedeemCreate::setOfferCodeHash(std::string  offerCodeHash)
{
	this->offerCodeHash = offerCodeHash;
}

bool
AdsCreditRedeemCreate::getValidateOnly()
{
	return validateOnly;
}

void
AdsCreditRedeemCreate::setValidateOnly(bool  validateOnly)
{
	this->validateOnly = validateOnly;
}


