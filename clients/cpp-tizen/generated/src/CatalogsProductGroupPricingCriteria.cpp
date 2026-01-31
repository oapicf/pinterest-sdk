#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupPricingCriteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupPricingCriteria::CatalogsProductGroupPricingCriteria()
{
	//__init();
}

CatalogsProductGroupPricingCriteria::~CatalogsProductGroupPricingCriteria()
{
	//__cleanup();
}

void
CatalogsProductGroupPricingCriteria::__init()
{
	//inclusion = bool(false);
	//negated = bool(false);
	//values = double(0);
}

void
CatalogsProductGroupPricingCriteria::__cleanup()
{
	//if(inclusion != NULL) {
	//
	//delete inclusion;
	//inclusion = NULL;
	//}
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//if(values != NULL) {
	//
	//delete values;
	//values = NULL;
	//}
	//
}

void
CatalogsProductGroupPricingCriteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inclusionKey = "inclusion";
	node = json_object_get_member(pJsonObject, inclusionKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&inclusion, node, "bool", "");
		} else {
			
		}
	}
	const gchar *negatedKey = "negated";
	node = json_object_get_member(pJsonObject, negatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&negated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&values, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&values);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsProductGroupPricingCriteria::CatalogsProductGroupPricingCriteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupPricingCriteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getInclusion();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *inclusionKey = "inclusion";
	json_object_set_member(pJsonObject, inclusionKey, node);
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	if (isprimitive("long long")) {
		long long obj = getValues();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValues());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CatalogsProductGroupPricingCriteria::getInclusion()
{
	return inclusion;
}

void
CatalogsProductGroupPricingCriteria::setInclusion(bool  inclusion)
{
	this->inclusion = inclusion;
}

bool
CatalogsProductGroupPricingCriteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupPricingCriteria::setNegated(bool  negated)
{
	this->negated = negated;
}

long long
CatalogsProductGroupPricingCriteria::getValues()
{
	return values;
}

void
CatalogsProductGroupPricingCriteria::setValues(long long  values)
{
	this->values = values;
}


