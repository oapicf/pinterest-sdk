#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingTopic.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingTopic::TrendingTopic()
{
	//__init();
}

TrendingTopic::~TrendingTopic()
{
	//__cleanup();
}

void
TrendingTopic::__init()
{
	//description = std::string();
	//percent_growth_mom = int(0);
	//new std::list()std::list> pins;
	//new std::list()std::list> related_interests;
	//new std::list()std::list> related_searches;
	//new std::map()std::map> time_series;
	//title = std::string();
}

void
TrendingTopic::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(percent_growth_mom != NULL) {
	//
	//delete percent_growth_mom;
	//percent_growth_mom = NULL;
	//}
	//if(pins != NULL) {
	//pins.RemoveAll(true);
	//delete pins;
	//pins = NULL;
	//}
	//if(related_interests != NULL) {
	//related_interests.RemoveAll(true);
	//delete related_interests;
	//related_interests = NULL;
	//}
	//if(related_searches != NULL) {
	//related_searches.RemoveAll(true);
	//delete related_searches;
	//related_searches = NULL;
	//}
	//if(time_series != NULL) {
	//time_series.RemoveAll(true);
	//delete time_series;
	//time_series = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//
}

void
TrendingTopic::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *percent_growth_momKey = "percent_growth_mom";
	node = json_object_get_member(pJsonObject, percent_growth_momKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&percent_growth_mom, node, "int", "");
		} else {
			
		}
	}
	const gchar *pinsKey = "pins";
	node = json_object_get_member(pJsonObject, pinsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TrendingPin> new_list;
			TrendingPin inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TrendingPin")) {
					jsonToValue(&inst, temp_json, "TrendingPin", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pins = new_list;
		}
		
	}
	const gchar *related_interestsKey = "related_interests";
	node = json_object_get_member(pJsonObject, related_interestsKey);
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
			related_interests = new_list;
		}
		
	}
	const gchar *related_searchesKey = "related_searches";
	node = json_object_get_member(pJsonObject, related_searchesKey);
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
			related_searches = new_list;
		}
		
	}
	const gchar *time_seriesKey = "time_series";
	node = json_object_get_member(pJsonObject, time_seriesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			time_series = new_map;
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

TrendingTopic::TrendingTopic(char* json)
{
	this->fromJson(json);
}

char*
TrendingTopic::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("int")) {
		int obj = getPercentGrowthMom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *percent_growth_momKey = "percent_growth_mom";
	json_object_set_member(pJsonObject, percent_growth_momKey, node);
	if (isprimitive("TrendingPin")) {
		list<TrendingPin> new_list = static_cast<list <TrendingPin> > (getPins());
		node = converttoJson(&new_list, "TrendingPin", "array");
	} else {
		node = json_node_alloc();
		list<TrendingPin> new_list = static_cast<list <TrendingPin> > (getPins());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TrendingPin>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TrendingPin obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pinsKey = "pins";
	json_object_set_member(pJsonObject, pinsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedInterests());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedInterests());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *related_interestsKey = "related_interests";
	json_object_set_member(pJsonObject, related_interestsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedSearches());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRelatedSearches());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *related_searchesKey = "related_searches";
	json_object_set_member(pJsonObject, related_searchesKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getTimeSeries());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *time_seriesKey = "time_series";
	json_object_set_member(pJsonObject, time_seriesKey, node);
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
TrendingTopic::getDescription()
{
	return description;
}

void
TrendingTopic::setDescription(std::string  description)
{
	this->description = description;
}

int
TrendingTopic::getPercentGrowthMom()
{
	return percent_growth_mom;
}

void
TrendingTopic::setPercentGrowthMom(int  percent_growth_mom)
{
	this->percent_growth_mom = percent_growth_mom;
}

std::list<TrendingPin>
TrendingTopic::getPins()
{
	return pins;
}

void
TrendingTopic::setPins(std::list <TrendingPin> pins)
{
	this->pins = pins;
}

std::list<std::string>
TrendingTopic::getRelatedInterests()
{
	return related_interests;
}

void
TrendingTopic::setRelatedInterests(std::list <std::string> related_interests)
{
	this->related_interests = related_interests;
}

std::list<std::string>
TrendingTopic::getRelatedSearches()
{
	return related_searches;
}

void
TrendingTopic::setRelatedSearches(std::list <std::string> related_searches)
{
	this->related_searches = related_searches;
}

std::map<string, string>
TrendingTopic::getTimeSeries()
{
	return time_series;
}

void
TrendingTopic::setTimeSeries(std::map <string, string> time_series)
{
	this->time_series = time_series;
}

std::string
TrendingTopic::getTitle()
{
	return title;
}

void
TrendingTopic::setTitle(std::string  title)
{
	this->title = title;
}


