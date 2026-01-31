#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FeaturedTrend.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FeaturedTrend::FeaturedTrend()
{
	//__init();
}

FeaturedTrend::~FeaturedTrend()
{
	//__cleanup();
}

void
FeaturedTrend::__init()
{
	//interest = null;
	//market = null;
	//new std::list()std::list> trends;
}

void
FeaturedTrend::__cleanup()
{
	//if(interest != NULL) {
	//
	//delete interest;
	//interest = NULL;
	//}
	//if(market != NULL) {
	//
	//delete market;
	//market = NULL;
	//}
	//if(trends != NULL) {
	//trends.RemoveAll(true);
	//delete trends;
	//trends = NULL;
	//}
	//
}

void
FeaturedTrend::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *interestKey = "interest";
	node = json_object_get_member(pJsonObject, interestKey);
	if (node !=NULL) {
	

		if (isprimitive("InterestsEnum")) {
			jsonToValue(&interest, node, "InterestsEnum", "InterestsEnum");
		} else {
			
			InterestsEnum* obj = static_cast<InterestsEnum*> (&interest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *marketKey = "market";
	node = json_object_get_member(pJsonObject, marketKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductCategoryRegion")) {
			jsonToValue(&market, node, "ProductCategoryRegion", "ProductCategoryRegion");
		} else {
			
			ProductCategoryRegion* obj = static_cast<ProductCategoryRegion*> (&market);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *trendsKey = "trends";
	node = json_object_get_member(pJsonObject, trendsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TrendingTopic> new_list;
			TrendingTopic inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TrendingTopic")) {
					jsonToValue(&inst, temp_json, "TrendingTopic", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			trends = new_list;
		}
		
	}
}

FeaturedTrend::FeaturedTrend(char* json)
{
	this->fromJson(json);
}

char*
FeaturedTrend::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InterestsEnum")) {
		InterestsEnum obj = getInterest();
		node = converttoJson(&obj, "InterestsEnum", "");
	}
	else {
		
		InterestsEnum obj = static_cast<InterestsEnum> (getInterest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *interestKey = "interest";
	json_object_set_member(pJsonObject, interestKey, node);
	if (isprimitive("ProductCategoryRegion")) {
		ProductCategoryRegion obj = getMarket();
		node = converttoJson(&obj, "ProductCategoryRegion", "");
	}
	else {
		
		ProductCategoryRegion obj = static_cast<ProductCategoryRegion> (getMarket());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *marketKey = "market";
	json_object_set_member(pJsonObject, marketKey, node);
	if (isprimitive("TrendingTopic")) {
		list<TrendingTopic> new_list = static_cast<list <TrendingTopic> > (getTrends());
		node = converttoJson(&new_list, "TrendingTopic", "array");
	} else {
		node = json_node_alloc();
		list<TrendingTopic> new_list = static_cast<list <TrendingTopic> > (getTrends());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TrendingTopic>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TrendingTopic obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *trendsKey = "trends";
	json_object_set_member(pJsonObject, trendsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

InterestsEnum
FeaturedTrend::getInterest()
{
	return interest;
}

void
FeaturedTrend::setInterest(InterestsEnum  interest)
{
	this->interest = interest;
}

ProductCategoryRegion
FeaturedTrend::getMarket()
{
	return market;
}

void
FeaturedTrend::setMarket(ProductCategoryRegion  market)
{
	this->market = market;
}

std::list<TrendingTopic>
FeaturedTrend::getTrends()
{
	return trends;
}

void
FeaturedTrend::setTrends(std::list <TrendingTopic> trends)
{
	this->trends = trends;
}


