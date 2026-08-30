#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordUpdateGenerated.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordUpdateGenerated::KeywordUpdateGenerated()
{
	//__init();
}

KeywordUpdateGenerated::~KeywordUpdateGenerated()
{
	//__cleanup();
}

void
KeywordUpdateGenerated::__init()
{
	//archived = bool(false);
	//bid = int(0);
	//id = std::string();
}

void
KeywordUpdateGenerated::__cleanup()
{
	//if(archived != NULL) {
	//
	//delete archived;
	//archived = NULL;
	//}
	//if(bid != NULL) {
	//
	//delete bid;
	//bid = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
KeywordUpdateGenerated::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *archivedKey = "archived";
	node = json_object_get_member(pJsonObject, archivedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&archived, node, "bool", "");
		} else {
			
		}
	}
	const gchar *bidKey = "bid";
	node = json_object_get_member(pJsonObject, bidKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
}

KeywordUpdateGenerated::KeywordUpdateGenerated(char* json)
{
	this->fromJson(json);
}

char*
KeywordUpdateGenerated::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getArchived();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *archivedKey = "archived";
	json_object_set_member(pJsonObject, archivedKey, node);
	if (isprimitive("int")) {
		int obj = getBid();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bidKey = "bid";
	json_object_set_member(pJsonObject, bidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
KeywordUpdateGenerated::getArchived()
{
	return archived;
}

void
KeywordUpdateGenerated::setArchived(bool  archived)
{
	this->archived = archived;
}

int
KeywordUpdateGenerated::getBid()
{
	return bid;
}

void
KeywordUpdateGenerated::setBid(int  bid)
{
	this->bid = bid;
}

std::string
KeywordUpdateGenerated::getId()
{
	return id;
}

void
KeywordUpdateGenerated::setId(std::string  id)
{
	this->id = id;
}


