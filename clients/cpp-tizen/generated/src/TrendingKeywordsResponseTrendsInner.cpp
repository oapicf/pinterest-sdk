#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeywordsResponse_trends_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeywordsResponse_trends_inner::TrendingKeywordsResponse_trends_inner()
{
	//__init();
}

TrendingKeywordsResponse_trends_inner::~TrendingKeywordsResponse_trends_inner()
{
	//__cleanup();
}

void
TrendingKeywordsResponse_trends_inner::__init()
{
	//keyword = std::string();
	//pct_growth_wow = int(0);
	//pct_growth_mom = int(0);
	//pct_growth_yoy = int(0);
	//time_series = new TrendingKeywordsResponse_trends_inner_time_series();
}

void
TrendingKeywordsResponse_trends_inner::__cleanup()
{
	//if(keyword != NULL) {
	//
	//delete keyword;
	//keyword = NULL;
	//}
	//if(pct_growth_wow != NULL) {
	//
	//delete pct_growth_wow;
	//pct_growth_wow = NULL;
	//}
	//if(pct_growth_mom != NULL) {
	//
	//delete pct_growth_mom;
	//pct_growth_mom = NULL;
	//}
	//if(pct_growth_yoy != NULL) {
	//
	//delete pct_growth_yoy;
	//pct_growth_yoy = NULL;
	//}
	//if(time_series != NULL) {
	//
	//delete time_series;
	//time_series = NULL;
	//}
	//
}

void
TrendingKeywordsResponse_trends_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keywordKey = "keyword";
	node = json_object_get_member(pJsonObject, keywordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&keyword, node, "std::string", "");
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
	const gchar *pct_growth_momKey = "pct_growth_mom";
	node = json_object_get_member(pJsonObject, pct_growth_momKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pct_growth_mom, node, "int", "");
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
	const gchar *time_seriesKey = "time_series";
	node = json_object_get_member(pJsonObject, time_seriesKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendingKeywordsResponse_trends_inner_time_series")) {
			jsonToValue(&time_series, node, "TrendingKeywordsResponse_trends_inner_time_series", "TrendingKeywordsResponse_trends_inner_time_series");
		} else {
			
			TrendingKeywordsResponse_trends_inner_time_series* obj = static_cast<TrendingKeywordsResponse_trends_inner_time_series*> (&time_series);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendingKeywordsResponse_trends_inner::TrendingKeywordsResponse_trends_inner(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeywordsResponse_trends_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKeyword();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keywordKey = "keyword";
	json_object_set_member(pJsonObject, keywordKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthWow();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_wowKey = "pct_growth_wow";
	json_object_set_member(pJsonObject, pct_growth_wowKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthMom();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_momKey = "pct_growth_mom";
	json_object_set_member(pJsonObject, pct_growth_momKey, node);
	if (isprimitive("int")) {
		int obj = getPctGrowthYoy();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pct_growth_yoyKey = "pct_growth_yoy";
	json_object_set_member(pJsonObject, pct_growth_yoyKey, node);
	if (isprimitive("TrendingKeywordsResponse_trends_inner_time_series")) {
		TrendingKeywordsResponse_trends_inner_time_series obj = getTimeSeries();
		node = converttoJson(&obj, "TrendingKeywordsResponse_trends_inner_time_series", "");
	}
	else {
		
		TrendingKeywordsResponse_trends_inner_time_series obj = static_cast<TrendingKeywordsResponse_trends_inner_time_series> (getTimeSeries());
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

std::string
TrendingKeywordsResponse_trends_inner::getKeyword()
{
	return keyword;
}

void
TrendingKeywordsResponse_trends_inner::setKeyword(std::string  keyword)
{
	this->keyword = keyword;
}

int
TrendingKeywordsResponse_trends_inner::getPctGrowthWow()
{
	return pct_growth_wow;
}

void
TrendingKeywordsResponse_trends_inner::setPctGrowthWow(int  pct_growth_wow)
{
	this->pct_growth_wow = pct_growth_wow;
}

int
TrendingKeywordsResponse_trends_inner::getPctGrowthMom()
{
	return pct_growth_mom;
}

void
TrendingKeywordsResponse_trends_inner::setPctGrowthMom(int  pct_growth_mom)
{
	this->pct_growth_mom = pct_growth_mom;
}

int
TrendingKeywordsResponse_trends_inner::getPctGrowthYoy()
{
	return pct_growth_yoy;
}

void
TrendingKeywordsResponse_trends_inner::setPctGrowthYoy(int  pct_growth_yoy)
{
	this->pct_growth_yoy = pct_growth_yoy;
}

TrendingKeywordsResponse_trends_inner_time_series
TrendingKeywordsResponse_trends_inner::getTimeSeries()
{
	return time_series;
}

void
TrendingKeywordsResponse_trends_inner::setTimeSeries(TrendingKeywordsResponse_trends_inner_time_series  time_series)
{
	this->time_series = time_series;
}


