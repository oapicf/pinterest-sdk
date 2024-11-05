#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PlacementMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PlacementMultipliers::PlacementMultipliers()
{
	//__init();
}

PlacementMultipliers::~PlacementMultipliers()
{
	//__cleanup();
}

void
PlacementMultipliers::__init()
{
	//pLACEMENT = std::string();
}

void
PlacementMultipliers::__cleanup()
{
	//if(pLACEMENT != NULL) {
	//
	//delete pLACEMENT;
	//pLACEMENT = NULL;
	//}
	//
}

void
PlacementMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pLACEMENTKey = "PLACEMENT";
	node = json_object_get_member(pJsonObject, pLACEMENTKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pLACEMENT, node, "std::string", "");
		} else {
			
		}
	}
}

PlacementMultipliers::PlacementMultipliers(char* json)
{
	this->fromJson(json);
}

char*
PlacementMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPLACEMENT();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pLACEMENTKey = "PLACEMENT";
	json_object_set_member(pJsonObject, pLACEMENTKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PlacementMultipliers::getPLACEMENT()
{
	return pLACEMENT;
}

void
PlacementMultipliers::setPLACEMENT(std::string  pLACEMENT)
{
	this->pLACEMENT = pLACEMENT;
}


