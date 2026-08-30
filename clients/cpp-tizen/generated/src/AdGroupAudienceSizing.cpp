#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupAudienceSizing.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupAudienceSizing::AdGroupAudienceSizing()
{
	//__init();
}

AdGroupAudienceSizing::~AdGroupAudienceSizing()
{
	//__cleanup();
}

void
AdGroupAudienceSizing::__init()
{
	//audience_size_lower_bound = double(0);
	//audience_size_upper_bound = double(0);
}

void
AdGroupAudienceSizing::__cleanup()
{
	//if(audience_size_lower_bound != NULL) {
	//
	//delete audience_size_lower_bound;
	//audience_size_lower_bound = NULL;
	//}
	//if(audience_size_upper_bound != NULL) {
	//
	//delete audience_size_upper_bound;
	//audience_size_upper_bound = NULL;
	//}
	//
}

void
AdGroupAudienceSizing::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_size_lower_boundKey = "audience_size_lower_bound";
	node = json_object_get_member(pJsonObject, audience_size_lower_boundKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&audience_size_lower_bound, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&audience_size_lower_bound);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *audience_size_upper_boundKey = "audience_size_upper_bound";
	node = json_object_get_member(pJsonObject, audience_size_upper_boundKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&audience_size_upper_bound, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&audience_size_upper_bound);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupAudienceSizing::AdGroupAudienceSizing(char* json)
{
	this->fromJson(json);
}

char*
AdGroupAudienceSizing::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAudienceSizeLowerBound();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAudienceSizeLowerBound());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audience_size_lower_boundKey = "audience_size_lower_bound";
	json_object_set_member(pJsonObject, audience_size_lower_boundKey, node);
	if (isprimitive("long long")) {
		long long obj = getAudienceSizeUpperBound();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAudienceSizeUpperBound());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *audience_size_upper_boundKey = "audience_size_upper_bound";
	json_object_set_member(pJsonObject, audience_size_upper_boundKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AdGroupAudienceSizing::getAudienceSizeLowerBound()
{
	return audience_size_lower_bound;
}

void
AdGroupAudienceSizing::setAudienceSizeLowerBound(long long  audience_size_lower_bound)
{
	this->audience_size_lower_bound = audience_size_lower_bound;
}

long long
AdGroupAudienceSizing::getAudienceSizeUpperBound()
{
	return audience_size_upper_bound;
}

void
AdGroupAudienceSizing::setAudienceSizeUpperBound(long long  audience_size_upper_bound)
{
	this->audience_size_upper_bound = audience_size_upper_bound;
}


