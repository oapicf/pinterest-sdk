#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SingleInterestTargetingOption.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SingleInterestTargetingOption::SingleInterestTargetingOption()
{
	//__init();
}

SingleInterestTargetingOption::~SingleInterestTargetingOption()
{
	//__cleanup();
}

void
SingleInterestTargetingOption::__init()
{
	//new std::list()std::list> child_interests;
	//id = std::string();
	//level = int(0);
	//name = std::string();
}

void
SingleInterestTargetingOption::__cleanup()
{
	//if(child_interests != NULL) {
	//child_interests.RemoveAll(true);
	//delete child_interests;
	//child_interests = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(level != NULL) {
	//
	//delete level;
	//level = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//
}

void
SingleInterestTargetingOption::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *child_interestsKey = "child_interests";
	node = json_object_get_member(pJsonObject, child_interestsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			child_interests = new_list;
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
	const gchar *levelKey = "level";
	node = json_object_get_member(pJsonObject, levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&level, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
}

SingleInterestTargetingOption::SingleInterestTargetingOption(char* json)
{
	this->fromJson(json);
}

char*
SingleInterestTargetingOption::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getChildInterests());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getChildInterests());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *child_interestsKey = "child_interests";
	json_object_set_member(pJsonObject, child_interestsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *levelKey = "level";
	json_object_set_member(pJsonObject, levelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
SingleInterestTargetingOption::getChildInterests()
{
	return child_interests;
}

void
SingleInterestTargetingOption::setChildInterests(std::list <std::string> child_interests)
{
	this->child_interests = child_interests;
}

std::string
SingleInterestTargetingOption::getId()
{
	return id;
}

void
SingleInterestTargetingOption::setId(std::string  id)
{
	this->id = id;
}

int
SingleInterestTargetingOption::getLevel()
{
	return level;
}

void
SingleInterestTargetingOption::setLevel(int  level)
{
	this->level = level;
}

std::string
SingleInterestTargetingOption::getName()
{
	return name;
}

void
SingleInterestTargetingOption::setName(std::string  name)
{
	this->name = name;
}


