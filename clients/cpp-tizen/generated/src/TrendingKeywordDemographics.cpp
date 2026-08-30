#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeywordDemographics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeywordDemographics::TrendingKeywordDemographics()
{
	//__init();
}

TrendingKeywordDemographics::~TrendingKeywordDemographics()
{
	//__cleanup();
}

void
TrendingKeywordDemographics::__init()
{
	//age_distribution = new TrendsAgeDistribution();
	//gender_distribution = new TrendsGenderDistribution();
}

void
TrendingKeywordDemographics::__cleanup()
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
TrendingKeywordDemographics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_distributionKey = "age_distribution";
	node = json_object_get_member(pJsonObject, age_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendsAgeDistribution")) {
			jsonToValue(&age_distribution, node, "TrendsAgeDistribution", "TrendsAgeDistribution");
		} else {
			
			TrendsAgeDistribution* obj = static_cast<TrendsAgeDistribution*> (&age_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gender_distributionKey = "gender_distribution";
	node = json_object_get_member(pJsonObject, gender_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendsGenderDistribution")) {
			jsonToValue(&gender_distribution, node, "TrendsGenderDistribution", "TrendsGenderDistribution");
		} else {
			
			TrendsGenderDistribution* obj = static_cast<TrendsGenderDistribution*> (&gender_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendingKeywordDemographics::TrendingKeywordDemographics(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeywordDemographics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendsAgeDistribution")) {
		TrendsAgeDistribution obj = getAgeDistribution();
		node = converttoJson(&obj, "TrendsAgeDistribution", "");
	}
	else {
		
		TrendsAgeDistribution obj = static_cast<TrendsAgeDistribution> (getAgeDistribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *age_distributionKey = "age_distribution";
	json_object_set_member(pJsonObject, age_distributionKey, node);
	if (isprimitive("TrendsGenderDistribution")) {
		TrendsGenderDistribution obj = getGenderDistribution();
		node = converttoJson(&obj, "TrendsGenderDistribution", "");
	}
	else {
		
		TrendsGenderDistribution obj = static_cast<TrendsGenderDistribution> (getGenderDistribution());
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

TrendsAgeDistribution
TrendingKeywordDemographics::getAgeDistribution()
{
	return age_distribution;
}

void
TrendingKeywordDemographics::setAgeDistribution(TrendsAgeDistribution  age_distribution)
{
	this->age_distribution = age_distribution;
}

TrendsGenderDistribution
TrendingKeywordDemographics::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendingKeywordDemographics::setGenderDistribution(TrendsGenderDistribution  gender_distribution)
{
	this->gender_distribution = gender_distribution;
}


