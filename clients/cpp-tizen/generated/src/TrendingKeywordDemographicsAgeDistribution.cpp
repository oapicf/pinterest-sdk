#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeyword_demographics_age_distribution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeyword_demographics_age_distribution::TrendingKeyword_demographics_age_distribution()
{
	//__init();
}

TrendingKeyword_demographics_age_distribution::~TrendingKeyword_demographics_age_distribution()
{
	//__cleanup();
}

void
TrendingKeyword_demographics_age_distribution::__init()
{
	//age_distribution = std::string();
}

void
TrendingKeyword_demographics_age_distribution::__cleanup()
{
	//if(age_distribution != NULL) {
	//
	//delete age_distribution;
	//age_distribution = NULL;
	//}
	//
}

void
TrendingKeyword_demographics_age_distribution::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_distributionKey = "age_distribution";
	node = json_object_get_member(pJsonObject, age_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&age_distribution, node, "std::string", "");
		} else {
			
		}
	}
}

TrendingKeyword_demographics_age_distribution::TrendingKeyword_demographics_age_distribution(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeyword_demographics_age_distribution::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAgeDistribution();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *age_distributionKey = "age_distribution";
	json_object_set_member(pJsonObject, age_distributionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TrendingKeyword_demographics_age_distribution::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeyword_demographics_age_distribution::setAgeDistribution(std::string  age_distribution)
{
	this->age_distribution = age_distribution;
}


