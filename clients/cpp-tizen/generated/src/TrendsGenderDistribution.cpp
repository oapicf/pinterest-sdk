#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendsGenderDistribution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendsGenderDistribution::TrendsGenderDistribution()
{
	//__init();
}

TrendsGenderDistribution::~TrendsGenderDistribution()
{
	//__cleanup();
}

void
TrendsGenderDistribution::__init()
{
	//gender_distribution = new TrendsGender();
}

void
TrendsGenderDistribution::__cleanup()
{
	//if(gender_distribution != NULL) {
	//
	//delete gender_distribution;
	//gender_distribution = NULL;
	//}
	//
}

void
TrendsGenderDistribution::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gender_distributionKey = "gender_distribution";
	node = json_object_get_member(pJsonObject, gender_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendsGender")) {
			jsonToValue(&gender_distribution, node, "TrendsGender", "TrendsGender");
		} else {
			
			TrendsGender* obj = static_cast<TrendsGender*> (&gender_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendsGenderDistribution::TrendsGenderDistribution(char* json)
{
	this->fromJson(json);
}

char*
TrendsGenderDistribution::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendsGender")) {
		TrendsGender obj = getGenderDistribution();
		node = converttoJson(&obj, "TrendsGender", "");
	}
	else {
		
		TrendsGender obj = static_cast<TrendsGender> (getGenderDistribution());
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

TrendsGender
TrendsGenderDistribution::getGenderDistribution()
{
	return gender_distribution;
}

void
TrendsGenderDistribution::setGenderDistribution(TrendsGender  gender_distribution)
{
	this->gender_distribution = gender_distribution;
}


