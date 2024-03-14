#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordUpdate::KeywordUpdate()
{
	//__init();
}

KeywordUpdate::~KeywordUpdate()
{
	//__cleanup();
}

void
KeywordUpdate::__init()
{
	//id = std::string();
	//archived = bool(false);
	//bid = int(0);
}

void
KeywordUpdate::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
	//
}

void
KeywordUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
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
}

KeywordUpdate::KeywordUpdate(char* json)
{
	this->fromJson(json);
}

char*
KeywordUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeywordUpdate::getId()
{
	return id;
}

void
KeywordUpdate::setId(std::string  id)
{
	this->id = id;
}

bool
KeywordUpdate::getArchived()
{
	return archived;
}

void
KeywordUpdate::setArchived(bool  archived)
{
	this->archived = archived;
}

int
KeywordUpdate::getBid()
{
	return bid;
}

void
KeywordUpdate::setBid(int  bid)
{
	this->bid = bid;
}


