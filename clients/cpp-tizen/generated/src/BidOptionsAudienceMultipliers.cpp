#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidOptionsAudienceMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidOptionsAudienceMultipliers::BidOptionsAudienceMultipliers()
{
	//__init();
}

BidOptionsAudienceMultipliers::~BidOptionsAudienceMultipliers()
{
	//__cleanup();
}

void
BidOptionsAudienceMultipliers::__init()
{
	//audience_id = std::string();
	//multiplier = double(0);
}

void
BidOptionsAudienceMultipliers::__cleanup()
{
	//if(audience_id != NULL) {
	//
	//delete audience_id;
	//audience_id = NULL;
	//}
	//if(multiplier != NULL) {
	//
	//delete multiplier;
	//multiplier = NULL;
	//}
	//
}

void
BidOptionsAudienceMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idKey = "audience_id";
	node = json_object_get_member(pJsonObject, audience_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audience_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *multiplierKey = "multiplier";
	node = json_object_get_member(pJsonObject, multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&multiplier, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&multiplier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidOptionsAudienceMultipliers::BidOptionsAudienceMultipliers(char* json)
{
	this->fromJson(json);
}

char*
BidOptionsAudienceMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAudienceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audience_idKey = "audience_id";
	json_object_set_member(pJsonObject, audience_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getMultiplier();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *multiplierKey = "multiplier";
	json_object_set_member(pJsonObject, multiplierKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BidOptionsAudienceMultipliers::getAudienceId()
{
	return audience_id;
}

void
BidOptionsAudienceMultipliers::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

long long
BidOptionsAudienceMultipliers::getMultiplier()
{
	return multiplier;
}

void
BidOptionsAudienceMultipliers::setMultiplier(long long  multiplier)
{
	this->multiplier = multiplier;
}


