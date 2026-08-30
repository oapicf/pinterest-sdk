#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FrequencyMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FrequencyMultipliers::FrequencyMultipliers()
{
	//__init();
}

FrequencyMultipliers::~FrequencyMultipliers()
{
	//__cleanup();
}

void
FrequencyMultipliers::__init()
{
	//iMPRESSION_COUNT = std::string();
}

void
FrequencyMultipliers::__cleanup()
{
	//if(iMPRESSION_COUNT != NULL) {
	//
	//delete iMPRESSION_COUNT;
	//iMPRESSION_COUNT = NULL;
	//}
	//
}

void
FrequencyMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *iMPRESSION_COUNTKey = "IMPRESSION_COUNT";
	node = json_object_get_member(pJsonObject, iMPRESSION_COUNTKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&iMPRESSION_COUNT, node, "std::string", "");
		} else {
			
		}
	}
}

FrequencyMultipliers::FrequencyMultipliers(char* json)
{
	this->fromJson(json);
}

char*
FrequencyMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getIMPRESSIONCOUNT();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *iMPRESSION_COUNTKey = "IMPRESSION_COUNT";
	json_object_set_member(pJsonObject, iMPRESSION_COUNTKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FrequencyMultipliers::getIMPRESSIONCOUNT()
{
	return iMPRESSION_COUNT;
}

void
FrequencyMultipliers::setIMPRESSIONCOUNT(std::string  iMPRESSION_COUNT)
{
	this->iMPRESSION_COUNT = iMPRESSION_COUNT;
}


