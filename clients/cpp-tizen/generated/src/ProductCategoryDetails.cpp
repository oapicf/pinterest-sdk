#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductCategoryDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductCategoryDetails::ProductCategoryDetails()
{
	//__init();
}

ProductCategoryDetails::~ProductCategoryDetails()
{
	//__cleanup();
}

void
ProductCategoryDetails::__init()
{
	//demographics = new ProductCategoriesDemographic();
	//has_prediction = bool(false);
	//metrics_highlights = new ProductCategoriesMetricsHighlights();
	//new std::map()std::map> predicted_time_series;
	//product_category = new ProductCategoryEnum();
	//new std::list()std::list> related_searches;
	//new std::map()std::map> time_series;
}

void
ProductCategoryDetails::__cleanup()
{
	//if(demographics != NULL) {
	//
	//delete demographics;
	//demographics = NULL;
	//}
	//if(has_prediction != NULL) {
	//
	//delete has_prediction;
	//has_prediction = NULL;
	//}
	//if(metrics_highlights != NULL) {
	//
	//delete metrics_highlights;
	//metrics_highlights = NULL;
	//}
	//if(predicted_time_series != NULL) {
	//predicted_time_series.RemoveAll(true);
	//delete predicted_time_series;
	//predicted_time_series = NULL;
	//}
	//if(product_category != NULL) {
	//
	//delete product_category;
	//product_category = NULL;
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
	//
}

void
ProductCategoryDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *demographicsKey = "demographics";
	node = json_object_get_member(pJsonObject, demographicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductCategoriesDemographic")) {
			jsonToValue(&demographics, node, "ProductCategoriesDemographic", "ProductCategoriesDemographic");
		} else {
			
			ProductCategoriesDemographic* obj = static_cast<ProductCategoriesDemographic*> (&demographics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *has_predictionKey = "has_prediction";
	node = json_object_get_member(pJsonObject, has_predictionKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_prediction, node, "bool", "");
		} else {
			
		}
	}
	const gchar *metrics_highlightsKey = "metrics_highlights";
	node = json_object_get_member(pJsonObject, metrics_highlightsKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductCategoriesMetricsHighlights")) {
			jsonToValue(&metrics_highlights, node, "ProductCategoriesMetricsHighlights", "ProductCategoriesMetricsHighlights");
		} else {
			
			ProductCategoriesMetricsHighlights* obj = static_cast<ProductCategoriesMetricsHighlights*> (&metrics_highlights);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *predicted_time_seriesKey = "predicted_time_series";
	node = json_object_get_member(pJsonObject, predicted_time_seriesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			predicted_time_series = new_map;
		}
		
	}
	const gchar *product_categoryKey = "product_category";
	node = json_object_get_member(pJsonObject, product_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ProductCategoryEnum")) {
			jsonToValue(&product_category, node, "ProductCategoryEnum", "ProductCategoryEnum");
		} else {
			
			ProductCategoryEnum* obj = static_cast<ProductCategoryEnum*> (&product_category);
			obj->fromJson(json_to_string(node, false));
			
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
}

ProductCategoryDetails::ProductCategoryDetails(char* json)
{
	this->fromJson(json);
}

char*
ProductCategoryDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ProductCategoriesDemographic")) {
		ProductCategoriesDemographic obj = getDemographics();
		node = converttoJson(&obj, "ProductCategoriesDemographic", "");
	}
	else {
		
		ProductCategoriesDemographic obj = static_cast<ProductCategoriesDemographic> (getDemographics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *demographicsKey = "demographics";
	json_object_set_member(pJsonObject, demographicsKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasPrediction();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_predictionKey = "has_prediction";
	json_object_set_member(pJsonObject, has_predictionKey, node);
	if (isprimitive("ProductCategoriesMetricsHighlights")) {
		ProductCategoriesMetricsHighlights obj = getMetricsHighlights();
		node = converttoJson(&obj, "ProductCategoriesMetricsHighlights", "");
	}
	else {
		
		ProductCategoriesMetricsHighlights obj = static_cast<ProductCategoriesMetricsHighlights> (getMetricsHighlights());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metrics_highlightsKey = "metrics_highlights";
	json_object_set_member(pJsonObject, metrics_highlightsKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getPredictedTimeSeries());
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

	const gchar *predicted_time_seriesKey = "predicted_time_series";
	json_object_set_member(pJsonObject, predicted_time_seriesKey, node);
	if (isprimitive("ProductCategoryEnum")) {
		ProductCategoryEnum obj = getProductCategory();
		node = converttoJson(&obj, "ProductCategoryEnum", "");
	}
	else {
		
		ProductCategoryEnum obj = static_cast<ProductCategoryEnum> (getProductCategory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *product_categoryKey = "product_category";
	json_object_set_member(pJsonObject, product_categoryKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ProductCategoriesDemographic
ProductCategoryDetails::getDemographics()
{
	return demographics;
}

void
ProductCategoryDetails::setDemographics(ProductCategoriesDemographic  demographics)
{
	this->demographics = demographics;
}

bool
ProductCategoryDetails::getHasPrediction()
{
	return has_prediction;
}

void
ProductCategoryDetails::setHasPrediction(bool  has_prediction)
{
	this->has_prediction = has_prediction;
}

ProductCategoriesMetricsHighlights
ProductCategoryDetails::getMetricsHighlights()
{
	return metrics_highlights;
}

void
ProductCategoryDetails::setMetricsHighlights(ProductCategoriesMetricsHighlights  metrics_highlights)
{
	this->metrics_highlights = metrics_highlights;
}

std::map<string, string>
ProductCategoryDetails::getPredictedTimeSeries()
{
	return predicted_time_series;
}

void
ProductCategoryDetails::setPredictedTimeSeries(std::map <string, string> predicted_time_series)
{
	this->predicted_time_series = predicted_time_series;
}

ProductCategoryEnum
ProductCategoryDetails::getProductCategory()
{
	return product_category;
}

void
ProductCategoryDetails::setProductCategory(ProductCategoryEnum  product_category)
{
	this->product_category = product_category;
}

std::list<std::string>
ProductCategoryDetails::getRelatedSearches()
{
	return related_searches;
}

void
ProductCategoryDetails::setRelatedSearches(std::list <std::string> related_searches)
{
	this->related_searches = related_searches;
}

std::map<string, string>
ProductCategoryDetails::getTimeSeries()
{
	return time_series;
}

void
ProductCategoryDetails::setTimeSeries(std::map <string, string> time_series)
{
	this->time_series = time_series;
}


