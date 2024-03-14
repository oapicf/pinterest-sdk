#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordsCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordsCommon::KeywordsCommon()
{
	//__init();
}

KeywordsCommon::~KeywordsCommon()
{
	//__cleanup();
}

void
KeywordsCommon::__init()
{
	//bid = int(0);
	//match_type = new MatchTypeResponse();
	//value = std::string();
}

void
KeywordsCommon::__cleanup()
{
	//if(bid != NULL) {
	//
	//delete bid;
	//bid = NULL;
	//}
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
KeywordsCommon::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bidKey = "bid";
	node = json_object_get_member(pJsonObject, bidKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid, node, "int", "");
		} else {
			
		}
	}
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

KeywordsCommon::KeywordsCommon(char* json)
{
	this->fromJson(json);
}

char*
KeywordsCommon::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bidKey = "bid";
	json_object_set_member(pJsonObject, bidKey, node);
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

int
KeywordsCommon::getBid()
{
	return bid;
}

void
KeywordsCommon::setBid(int  bid)
{
	this->bid = bid;
}

MatchTypeResponse
KeywordsCommon::getMatchType()
{
	return match_type;
}

void
KeywordsCommon::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
KeywordsCommon::getValue()
{
	return value;
}

void
KeywordsCommon::setValue(std::string  value)
{
	this->value = value;
}


