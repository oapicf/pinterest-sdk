#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupAudienceSizingKeyword.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupAudienceSizingKeyword::AdGroupAudienceSizingKeyword()
{
	//__init();
}

AdGroupAudienceSizingKeyword::~AdGroupAudienceSizingKeyword()
{
	//__cleanup();
}

void
AdGroupAudienceSizingKeyword::__init()
{
	//match_type = new MatchType();
	//value = std::string();
}

void
AdGroupAudienceSizingKeyword::__cleanup()
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
AdGroupAudienceSizingKeyword::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *match_typeKey = "match_type";
	node = json_object_get_member(pJsonObject, match_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("MatchType")) {
			jsonToValue(&match_type, node, "MatchType", "MatchType");
		} else {
			
			MatchType* obj = static_cast<MatchType*> (&match_type);
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

AdGroupAudienceSizingKeyword::AdGroupAudienceSizingKeyword(char* json)
{
	this->fromJson(json);
}

char*
AdGroupAudienceSizingKeyword::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MatchType")) {
		MatchType obj = getMatchType();
		node = converttoJson(&obj, "MatchType", "");
	}
	else {
		
		MatchType obj = static_cast<MatchType> (getMatchType());
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

MatchType
AdGroupAudienceSizingKeyword::getMatchType()
{
	return match_type;
}

void
AdGroupAudienceSizingKeyword::setMatchType(MatchType  match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupAudienceSizingKeyword::getValue()
{
	return value;
}

void
AdGroupAudienceSizingKeyword::setValue(std::string  value)
{
	this->value = value;
}


