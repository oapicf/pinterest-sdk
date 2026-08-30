#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendsEditorial.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendsEditorial::TrendsEditorial()
{
	//__init();
}

TrendsEditorial::~TrendsEditorial()
{
	//__cleanup();
}

void
TrendsEditorial::__init()
{
	//board_url = std::string();
	//description = std::string();
	//new std::list()std::list> interests;
	//new std::list()std::list> pins_url;
	//new std::list()std::list> related_keywords;
	//title = std::string();
}

void
TrendsEditorial::__cleanup()
{
	//if(board_url != NULL) {
	//
	//delete board_url;
	//board_url = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(interests != NULL) {
	//interests.RemoveAll(true);
	//delete interests;
	//interests = NULL;
	//}
	//if(pins_url != NULL) {
	//pins_url.RemoveAll(true);
	//delete pins_url;
	//pins_url = NULL;
	//}
	//if(related_keywords != NULL) {
	//related_keywords.RemoveAll(true);
	//delete related_keywords;
	//related_keywords = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
TrendsEditorial::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *board_urlKey = "board_url";
	node = json_object_get_member(pJsonObject, board_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *interestsKey = "interests";
	node = json_object_get_member(pJsonObject, interestsKey);
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
			interests = new_list;
		}
		
	}
	const gchar *pins_urlKey = "pins_url";
	node = json_object_get_member(pJsonObject, pins_urlKey);
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
			pins_url = new_list;
		}
		
	}
	const gchar *related_keywordsKey = "related_keywords";
	node = json_object_get_member(pJsonObject, related_keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordInfo> new_list;
			KeywordInfo inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordInfo")) {
					jsonToValue(&inst, temp_json, "KeywordInfo", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			related_keywords = new_list;
		}
		
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
}

TrendsEditorial::TrendsEditorial(char* json)
{
	this->fromJson(json);
}

char*
TrendsEditorial::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBoardUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_urlKey = "board_url";
	json_object_set_member(pJsonObject, board_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getInterests());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getInterests());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *interestsKey = "interests";
	json_object_set_member(pJsonObject, interestsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPinsUrl());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPinsUrl());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *pins_urlKey = "pins_url";
	json_object_set_member(pJsonObject, pins_urlKey, node);
	if (isprimitive("KeywordInfo")) {
		list<KeywordInfo> new_list = static_cast<list <KeywordInfo> > (getRelatedKeywords());
		node = converttoJson(&new_list, "KeywordInfo", "array");
	} else {
		node = json_node_alloc();
		list<KeywordInfo> new_list = static_cast<list <KeywordInfo> > (getRelatedKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordInfo>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordInfo obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *related_keywordsKey = "related_keywords";
	json_object_set_member(pJsonObject, related_keywordsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TrendsEditorial::getBoardUrl()
{
	return board_url;
}

void
TrendsEditorial::setBoardUrl(std::string  board_url)
{
	this->board_url = board_url;
}

std::string
TrendsEditorial::getDescription()
{
	return description;
}

void
TrendsEditorial::setDescription(std::string  description)
{
	this->description = description;
}

std::list<std::string>
TrendsEditorial::getInterests()
{
	return interests;
}

void
TrendsEditorial::setInterests(std::list <std::string> interests)
{
	this->interests = interests;
}

std::list<std::string>
TrendsEditorial::getPinsUrl()
{
	return pins_url;
}

void
TrendsEditorial::setPinsUrl(std::list <std::string> pins_url)
{
	this->pins_url = pins_url;
}

std::list<KeywordInfo>
TrendsEditorial::getRelatedKeywords()
{
	return related_keywords;
}

void
TrendsEditorial::setRelatedKeywords(std::list <KeywordInfo> related_keywords)
{
	this->related_keywords = related_keywords;
}

std::string
TrendsEditorial::getTitle()
{
	return title;
}

void
TrendsEditorial::setTitle(std::string  title)
{
	this->title = title;
}


