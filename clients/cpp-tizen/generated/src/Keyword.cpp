#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Keyword.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Keyword::Keyword()
{
	//__init();
}

Keyword::~Keyword()
{
	//__cleanup();
}

void
Keyword::__init()
{
	//archived = bool(false);
	//id = std::string();
	//parent_id = std::string();
	//parent_type = std::string();
	//type = std::string();
	//bid = int(0);
	//match_type = new MatchTypeResponse();
	//value = std::string();
}

void
Keyword::__cleanup()
{
	//if(archived != NULL) {
	//
	//delete archived;
	//archived = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
	//}
	//if(parent_type != NULL) {
	//
	//delete parent_type;
	//parent_type = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
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
Keyword::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *parent_typeKey = "parent_type";
	node = json_object_get_member(pJsonObject, parent_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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

Keyword::Keyword(char* json)
{
	this->fromJson(json);
}

char*
Keyword::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_typeKey = "parent_type";
	json_object_set_member(pJsonObject, parent_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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

bool
Keyword::getArchived()
{
	return archived;
}

void
Keyword::setArchived(bool  archived)
{
	this->archived = archived;
}

std::string
Keyword::getId()
{
	return id;
}

void
Keyword::setId(std::string  id)
{
	this->id = id;
}

std::string
Keyword::getParentId()
{
	return parent_id;
}

void
Keyword::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
Keyword::getParentType()
{
	return parent_type;
}

void
Keyword::setParentType(std::string  parent_type)
{
	this->parent_type = parent_type;
}

std::string
Keyword::getType()
{
	return type;
}

void
Keyword::setType(std::string  type)
{
	this->type = type;
}

int
Keyword::getBid()
{
	return bid;
}

void
Keyword::setBid(int  bid)
{
	this->bid = bid;
}

MatchTypeResponse
Keyword::getMatchType()
{
	return match_type;
}

void
Keyword::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
Keyword::getValue()
{
	return value;
}

void
Keyword::setValue(std::string  value)
{
	this->value = value;
}


