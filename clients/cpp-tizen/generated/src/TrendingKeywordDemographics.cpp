#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeyword_demographics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeyword_demographics::TrendingKeyword_demographics()
{
	//__init();
}

TrendingKeyword_demographics::~TrendingKeyword_demographics()
{
	//__cleanup();
}

void
TrendingKeyword_demographics::__init()
{
	//age_distribution = new TrendingKeyword_demographics_age_distribution();
	//gender_distribution = new TrendingKeyword_demographics_gender_distribution();
}

void
TrendingKeyword_demographics::__cleanup()
{
	//if(age_distribution != NULL) {
	//
	//delete age_distribution;
	//age_distribution = NULL;
	//}
	//if(gender_distribution != NULL) {
	//
	//delete gender_distribution;
	//gender_distribution = NULL;
	//}
	//
}

void
TrendingKeyword_demographics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_distributionKey = "age_distribution";
	node = json_object_get_member(pJsonObject, age_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendingKeyword_demographics_age_distribution")) {
			jsonToValue(&age_distribution, node, "TrendingKeyword_demographics_age_distribution", "TrendingKeyword_demographics_age_distribution");
		} else {
			
			TrendingKeyword_demographics_age_distribution* obj = static_cast<TrendingKeyword_demographics_age_distribution*> (&age_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gender_distributionKey = "gender_distribution";
	node = json_object_get_member(pJsonObject, gender_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendingKeyword_demographics_gender_distribution")) {
			jsonToValue(&gender_distribution, node, "TrendingKeyword_demographics_gender_distribution", "TrendingKeyword_demographics_gender_distribution");
		} else {
			
			TrendingKeyword_demographics_gender_distribution* obj = static_cast<TrendingKeyword_demographics_gender_distribution*> (&gender_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendingKeyword_demographics::TrendingKeyword_demographics(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeyword_demographics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendingKeyword_demographics_age_distribution")) {
		TrendingKeyword_demographics_age_distribution obj = getAgeDistribution();
		node = converttoJson(&obj, "TrendingKeyword_demographics_age_distribution", "");
	}
	else {
		
		TrendingKeyword_demographics_age_distribution obj = static_cast<TrendingKeyword_demographics_age_distribution> (getAgeDistribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *age_distributionKey = "age_distribution";
	json_object_set_member(pJsonObject, age_distributionKey, node);
	if (isprimitive("TrendingKeyword_demographics_gender_distribution")) {
		TrendingKeyword_demographics_gender_distribution obj = getGenderDistribution();
		node = converttoJson(&obj, "TrendingKeyword_demographics_gender_distribution", "");
	}
	else {
		
		TrendingKeyword_demographics_gender_distribution obj = static_cast<TrendingKeyword_demographics_gender_distribution> (getGenderDistribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gender_distributionKey = "gender_distribution";
	json_object_set_member(pJsonObject, gender_distributionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TrendingKeyword_demographics_age_distribution
TrendingKeyword_demographics::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeyword_demographics::setAgeDistribution(TrendingKeyword_demographics_age_distribution  age_distribution)
{
	this->age_distribution = age_distribution;
}

TrendingKeyword_demographics_gender_distribution
TrendingKeyword_demographics::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendingKeyword_demographics::setGenderDistribution(TrendingKeyword_demographics_gender_distribution  gender_distribution)
{
	this->gender_distribution = gender_distribution;
}


