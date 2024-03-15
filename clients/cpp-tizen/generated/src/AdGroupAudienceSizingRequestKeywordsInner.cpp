#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupAudienceSizingRequest_keywords_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupAudienceSizingRequest_keywords_inner::AdGroupAudienceSizingRequest_keywords_inner()
{
	//__init();
}

AdGroupAudienceSizingRequest_keywords_inner::~AdGroupAudienceSizingRequest_keywords_inner()
{
	//__cleanup();
}

void
AdGroupAudienceSizingRequest_keywords_inner::__init()
{
	//match_type = new MatchTypeResponse();
	//value = std::string();
}

void
AdGroupAudienceSizingRequest_keywords_inner::__cleanup()
{
	//if(match_type != NULL) {
	//
	//delete match_type;
	//match_type = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
AdGroupAudienceSizingRequest_keywords_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *match_typeKey = "match_type";
	node = json_object_get_member(pJsonObject, match_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MatchTypeResponse")) {
			jsonToValue(&match_type, node, "MatchTypeResponse", "MatchTypeResponse");
		} else {
			
			MatchTypeResponse* obj = static_cast<MatchTypeResponse*> (&match_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

AdGroupAudienceSizingRequest_keywords_inner::AdGroupAudienceSizingRequest_keywords_inner(char* json)
{
	this->fromJson(json);
}

char*
AdGroupAudienceSizingRequest_keywords_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MatchTypeResponse")) {
		MatchTypeResponse obj = getMatchType();
		node = converttoJson(&obj, "MatchTypeResponse", "");
	}
	else {
		
		MatchTypeResponse obj = static_cast<MatchTypeResponse> (getMatchType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *match_typeKey = "match_type";
	json_object_set_member(pJsonObject, match_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MatchTypeResponse
AdGroupAudienceSizingRequest_keywords_inner::getMatchType()
{
	return match_type;
}

void
AdGroupAudienceSizingRequest_keywords_inner::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupAudienceSizingRequest_keywords_inner::getValue()
{
	return value;
}

void
AdGroupAudienceSizingRequest_keywords_inner::setValue(std::string  value)
{
	this->value = value;
}


