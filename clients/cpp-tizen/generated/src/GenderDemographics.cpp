#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenderDemographics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenderDemographics::GenderDemographics()
{
	//__init();
}

GenderDemographics::~GenderDemographics()
{
	//__cleanup();
}

void
GenderDemographics::__init()
{
	//female = double(0);
	//male = double(0);
	//unspecified = double(0);
}

void
GenderDemographics::__cleanup()
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
	//if(unspecified != NULL) {
	//
	//delete unspecified;
	//unspecified = NULL;
	//}
	//
}

void
GenderDemographics::fromJson(char* jsonStr)
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
	const gchar *unspecifiedKey = "unspecified";
	node = json_object_get_member(pJsonObject, unspecifiedKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&unspecified, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&unspecified);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GenderDemographics::GenderDemographics(char* json)
{
	this->fromJson(json);
}

char*
GenderDemographics::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getUnspecified();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getUnspecified());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *unspecifiedKey = "unspecified";
	json_object_set_member(pJsonObject, unspecifiedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
GenderDemographics::getFemale()
{
	return female;
}

void
GenderDemographics::setFemale(long long  female)
{
	this->female = female;
}

long long
GenderDemographics::getMale()
{
	return male;
}

void
GenderDemographics::setMale(long long  male)
{
	this->male = male;
}

long long
GenderDemographics::getUnspecified()
{
	return unspecified;
}

void
GenderDemographics::setUnspecified(long long  unspecified)
{
	this->unspecified = unspecified;
}


