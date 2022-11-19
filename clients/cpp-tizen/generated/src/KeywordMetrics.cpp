#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordMetrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordMetrics::KeywordMetrics()
{
	//__init();
}

KeywordMetrics::~KeywordMetrics()
{
	//__cleanup();
}

void
KeywordMetrics::__init()
{
	//avg_cpc_in_micro_currency = double(0);
	//keyword_query_volume = std::string();
}

void
KeywordMetrics::__cleanup()
{
	//if(avg_cpc_in_micro_currency != NULL) {
	//
	//delete avg_cpc_in_micro_currency;
	//avg_cpc_in_micro_currency = NULL;
	//}
	//if(keyword_query_volume != NULL) {
	//
	//delete keyword_query_volume;
	//keyword_query_volume = NULL;
	//}
	//
}

void
KeywordMetrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *avg_cpc_in_micro_currencyKey = "avg_cpc_in_micro_currency";
	node = json_object_get_member(pJsonObject, avg_cpc_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&avg_cpc_in_micro_currency, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&avg_cpc_in_micro_currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keyword_query_volumeKey = "keyword_query_volume";
	node = json_object_get_member(pJsonObject, keyword_query_volumeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&keyword_query_volume, node, "std::string", "");
		} else {
			
		}
	}
}

KeywordMetrics::KeywordMetrics(char* json)
{
	this->fromJson(json);
}

char*
KeywordMetrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAvgCpcInMicroCurrency();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAvgCpcInMicroCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *avg_cpc_in_micro_currencyKey = "avg_cpc_in_micro_currency";
	json_object_set_member(pJsonObject, avg_cpc_in_micro_currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKeywordQueryVolume();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyword_query_volumeKey = "keyword_query_volume";
	json_object_set_member(pJsonObject, keyword_query_volumeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
KeywordMetrics::getAvgCpcInMicroCurrency()
{
	return avg_cpc_in_micro_currency;
}

void
KeywordMetrics::setAvgCpcInMicroCurrency(long long  avg_cpc_in_micro_currency)
{
	this->avg_cpc_in_micro_currency = avg_cpc_in_micro_currency;
}

std::string
KeywordMetrics::getKeywordQueryVolume()
{
	return keyword_query_volume;
}

void
KeywordMetrics::setKeywordQueryVolume(std::string  keyword_query_volume)
{
	this->keyword_query_volume = keyword_query_volume;
}


