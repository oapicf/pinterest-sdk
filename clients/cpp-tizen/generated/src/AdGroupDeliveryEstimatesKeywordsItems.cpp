#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupDeliveryEstimatesKeywordsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupDeliveryEstimatesKeywordsItems::AdGroupDeliveryEstimatesKeywordsItems()
{
	//__init();
}

AdGroupDeliveryEstimatesKeywordsItems::~AdGroupDeliveryEstimatesKeywordsItems()
{
	//__cleanup();
}

void
AdGroupDeliveryEstimatesKeywordsItems::__init()
{
	//match_type = null;
	//value = std::string();
}

void
AdGroupDeliveryEstimatesKeywordsItems::__cleanup()
{
	//if(match_type != NULL) {
	//
	//delete match_type;
	//match_type = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
AdGroupDeliveryEstimatesKeywordsItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *match_typeKey = "match_type";
	node = json_object_get_member(pJsonObject, match_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("NullalbleMatchType")) {
			jsonToValue(&match_type, node, "NullalbleMatchType", "NullalbleMatchType");
		} else {
			
			NullalbleMatchType* obj = static_cast<NullalbleMatchType*> (&match_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

AdGroupDeliveryEstimatesKeywordsItems::AdGroupDeliveryEstimatesKeywordsItems(char* json)
{
	this->fromJson(json);
}

char*
AdGroupDeliveryEstimatesKeywordsItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("NullalbleMatchType")) {
		NullalbleMatchType obj = getMatchType();
		node = converttoJson(&obj, "NullalbleMatchType", "");
	}
	else {
		
		NullalbleMatchType obj = static_cast<NullalbleMatchType> (getMatchType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *match_typeKey = "match_type";
	json_object_set_member(pJsonObject, match_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

NullalbleMatchType
AdGroupDeliveryEstimatesKeywordsItems::getMatchType()
{
	return match_type;
}

void
AdGroupDeliveryEstimatesKeywordsItems::setMatchType(NullalbleMatchType  match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupDeliveryEstimatesKeywordsItems::getValue()
{
	return value;
}

void
AdGroupDeliveryEstimatesKeywordsItems::setValue(std::string  value)
{
	this->value = value;
}


