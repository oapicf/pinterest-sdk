#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeyword.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeyword::TrendingKeyword()
{
	//__init();
}

TrendingKeyword::~TrendingKeyword()
{
	//__cleanup();
}

void
TrendingKeyword::__init()
{
	//demographics = new TrendingKeyword_demographics();
	//has_prediction = bool(false);
	//keyword = std::string();
	//pct_growth_mom = int(0);
	//pct_growth_wow = int(0);
	//pct_growth_yoy = int(0);
	//predicted_time_series = new PredictedTimeSeries();
	//time_series = new TimeSeries();
}

void
TrendingKeyword::__cleanup()
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
	//if(keyword != NULL) {
	//
	//delete keyword;
	//keyword = NULL;
	//}
	//if(pct_growth_mom != NULL) {
	//
	//delete pct_growth_mom;
	//pct_growth_mom = NULL;
	//}
	//if(pct_growth_wow != NULL) {
	//
	//delete pct_growth_wow;
	//pct_growth_wow = NULL;
	//}
	//if(pct_growth_yoy != NULL) {
	//
	//delete pct_growth_yoy;
	//pct_growth_yoy = NULL;
	//}
	//if(predicted_time_series != NULL) {
	//
	//delete predicted_time_series;
	//predicted_time_series = NULL;
	//}
	//if(time_series != NULL) {
	//
	//delete time_series;
	//time_series = NULL;
	//}
	//
}

void
TrendingKeyword::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *demographicsKey = "demographics";
	node = json_object_get_member(pJsonObject, demographicsKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendingKeyword_demographics")) {
			jsonToValue(&demographics, node, "TrendingKeyword_demographics", "TrendingKeyword_demographics");
		} else {
			
			TrendingKeyword_demographics* obj = static_cast<TrendingKeyword_demographics*> (&demographics);
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
	const gchar *keywordKey = "keyword";
	node = json_object_get_member(pJsonObject, keywordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&keyword, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pct_growth_momKey = "pct_growth_mom";
	node = json_object_get_member(pJsonObject, pct_growth_momKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pct_growth_mom, node, "int", "");
		} else {
			
		}
	}
	const gchar *pct_growth_wowKey = "pct_growth_wow";
	node = json_object_get_member(pJsonObject, pct_growth_wowKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pct_growth_wow, node, "int", "");
		} else {
			
		}
	}
	const gchar *pct_growth_yoyKey = "pct_growth_yoy";
	node = json_object_get_member(pJsonObject, pct_growth_yoyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pct_growth_yoy, node, "int", "");
		} else {
			
		}
	}
	const gchar *predicted_time_seriesKey = "predicted_time_series";
	node = json_object_get_member(pJsonObject, predicted_time_seriesKey);
	if (node !=NULL) {
	

		if (isprimitive("PredictedTimeSeries")) {
			jsonToValue(&predicted_time_series, node, "PredictedTimeSeries", "PredictedTimeSeries");
		} else {
			
			PredictedTimeSeries* obj = static_cast<PredictedTimeSeries*> (&predicted_time_series);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *time_seriesKey = "time_series";
	node = json_object_get_member(pJsonObject, time_seriesKey);
	if (node !=NULL) {
	

		if (isprimitive("TimeSeries")) {
			jsonToValue(&time_series, node, "TimeSeries", "TimeSeries");
		} else {
			
			TimeSeries* obj = static_cast<TimeSeries*> (&time_series);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendingKeyword::TrendingKeyword(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeyword::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendingKeyword_demographics")) {
		TrendingKeyword_demographics obj = getDemographics();
		node = converttoJson(&obj, "TrendingKeyword_demographics", "");
	}
	else {
		
		TrendingKeyword_demographics obj = static_cast<TrendingKeyword_demographics> (getDemographics());
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
	if (isprimitive("std::string")) {
		std::string obj = getKeyword();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keywordKey = "keyword";
	json_object_set_member(pJsonObject, keywordKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthMom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_momKey = "pct_growth_mom";
	json_object_set_member(pJsonObject, pct_growth_momKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthWow();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_wowKey = "pct_growth_wow";
	json_object_set_member(pJsonObject, pct_growth_wowKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthYoy();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_yoyKey = "pct_growth_yoy";
	json_object_set_member(pJsonObject, pct_growth_yoyKey, node);
	if (isprimitive("PredictedTimeSeries")) {
		PredictedTimeSeries obj = getPredictedTimeSeries();
		node = converttoJson(&obj, "PredictedTimeSeries", "");
	}
	else {
		
		PredictedTimeSeries obj = static_cast<PredictedTimeSeries> (getPredictedTimeSeries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *predicted_time_seriesKey = "predicted_time_series";
	json_object_set_member(pJsonObject, predicted_time_seriesKey, node);
	if (isprimitive("TimeSeries")) {
		TimeSeries obj = getTimeSeries();
		node = converttoJson(&obj, "TimeSeries", "");
	}
	else {
		
		TimeSeries obj = static_cast<TimeSeries> (getTimeSeries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

TrendingKeyword_demographics
TrendingKeyword::getDemographics()
{
	return demographics;
}

void
TrendingKeyword::setDemographics(TrendingKeyword_demographics  demographics)
{
	this->demographics = demographics;
}

bool
TrendingKeyword::getHasPrediction()
{
	return has_prediction;
}

void
TrendingKeyword::setHasPrediction(bool  has_prediction)
{
	this->has_prediction = has_prediction;
}

std::string
TrendingKeyword::getKeyword()
{
	return keyword;
}

void
TrendingKeyword::setKeyword(std::string  keyword)
{
	this->keyword = keyword;
}

int
TrendingKeyword::getPctGrowthMom()
{
	return pct_growth_mom;
}

void
TrendingKeyword::setPctGrowthMom(int  pct_growth_mom)
{
	this->pct_growth_mom = pct_growth_mom;
}

int
TrendingKeyword::getPctGrowthWow()
{
	return pct_growth_wow;
}

void
TrendingKeyword::setPctGrowthWow(int  pct_growth_wow)
{
	this->pct_growth_wow = pct_growth_wow;
}

int
TrendingKeyword::getPctGrowthYoy()
{
	return pct_growth_yoy;
}

void
TrendingKeyword::setPctGrowthYoy(int  pct_growth_yoy)
{
	this->pct_growth_yoy = pct_growth_yoy;
}

PredictedTimeSeries
TrendingKeyword::getPredictedTimeSeries()
{
	return predicted_time_series;
}

void
TrendingKeyword::setPredictedTimeSeries(PredictedTimeSeries  predicted_time_series)
{
	this->predicted_time_series = predicted_time_series;
}

TimeSeries
TrendingKeyword::getTimeSeries()
{
	return time_series;
}

void
TrendingKeyword::setTimeSeries(TimeSeries  time_series)
{
	this->time_series = time_series;
}


