#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidOptionsGenderMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidOptionsGenderMultipliers::BidOptionsGenderMultipliers()
{
	//__init();
}

BidOptionsGenderMultipliers::~BidOptionsGenderMultipliers()
{
	//__cleanup();
}

void
BidOptionsGenderMultipliers::__init()
{
	//female = double(0);
	//male = double(0);
}

void
BidOptionsGenderMultipliers::__cleanup()
{
	//if(female != NULL) {
	//
	//delete female;
	//female = NULL;
	//}
	//if(male != NULL) {
	//
	//delete male;
	//male = NULL;
	//}
	//
}

void
BidOptionsGenderMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *femaleKey = "female";
	node = json_object_get_member(pJsonObject, femaleKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&female, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&female);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maleKey = "male";
	node = json_object_get_member(pJsonObject, maleKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&male, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&male);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidOptionsGenderMultipliers::BidOptionsGenderMultipliers(char* json)
{
	this->fromJson(json);
}

char*
BidOptionsGenderMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getFemale();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getFemale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *femaleKey = "female";
	json_object_set_member(pJsonObject, femaleKey, node);
	if (isprimitive("long long")) {
		long long obj = getMale();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maleKey = "male";
	json_object_set_member(pJsonObject, maleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BidOptionsGenderMultipliers::getFemale()
{
	return female;
}

void
BidOptionsGenderMultipliers::setFemale(long long  female)
{
	this->female = female;
}

long long
BidOptionsGenderMultipliers::getMale()
{
	return male;
}

void
BidOptionsGenderMultipliers::setMale(long long  male)
{
	this->male = male;
}


