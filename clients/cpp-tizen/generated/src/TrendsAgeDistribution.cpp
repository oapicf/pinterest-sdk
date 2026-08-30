#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendsAgeDistribution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendsAgeDistribution::TrendsAgeDistribution()
{
	//__init();
}

TrendsAgeDistribution::~TrendsAgeDistribution()
{
	//__cleanup();
}

void
TrendsAgeDistribution::__init()
{
	//age_distribution = new TrendsAgeBucket();
}

void
TrendsAgeDistribution::__cleanup()
{
	//if(age_distribution != NULL) {
	//
	//delete age_distribution;
	//age_distribution = NULL;
	//}
	//
}

void
TrendsAgeDistribution::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *age_distributionKey = "age_distribution";
	node = json_object_get_member(pJsonObject, age_distributionKey);
	if (node !=NULL) {
	

		if (isprimitive("TrendsAgeBucket")) {
			jsonToValue(&age_distribution, node, "TrendsAgeBucket", "TrendsAgeBucket");
		} else {
			
			TrendsAgeBucket* obj = static_cast<TrendsAgeBucket*> (&age_distribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TrendsAgeDistribution::TrendsAgeDistribution(char* json)
{
	this->fromJson(json);
}

char*
TrendsAgeDistribution::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendsAgeBucket")) {
		TrendsAgeBucket obj = getAgeDistribution();
		node = converttoJson(&obj, "TrendsAgeBucket", "");
	}
	else {
		
		TrendsAgeBucket obj = static_cast<TrendsAgeBucket> (getAgeDistribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

TrendsAgeBucket
TrendsAgeDistribution::getAgeDistribution()
{
	return age_distribution;
}

void
TrendsAgeDistribution::setAgeDistribution(TrendsAgeBucket  age_distribution)
{
	this->age_distribution = age_distribution;
}


