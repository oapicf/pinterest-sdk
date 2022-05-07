#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AvailabilityFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AvailabilityFilter::AvailabilityFilter()
{
	//__init();
}

AvailabilityFilter::~AvailabilityFilter()
{
	//__cleanup();
}

void
AvailabilityFilter::__init()
{
	//aVAILABILITY = new CatalogsProductGroupMultipleStringCriteria();
}

void
AvailabilityFilter::__cleanup()
{
	//if(aVAILABILITY != NULL) {
	//
	//delete aVAILABILITY;
	//aVAILABILITY = NULL;
	//}
	//
}

void
AvailabilityFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aVAILABILITYKey = "AVAILABILITY";
	node = json_object_get_member(pJsonObject, aVAILABILITYKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&aVAILABILITY, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&aVAILABILITY);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AvailabilityFilter::AvailabilityFilter(char* json)
{
	this->fromJson(json);
}

char*
AvailabilityFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getAVAILABILITY();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getAVAILABILITY());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aVAILABILITYKey = "AVAILABILITY";
	json_object_set_member(pJsonObject, aVAILABILITYKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
AvailabilityFilter::getAVAILABILITY()
{
	return aVAILABILITY;
}

void
AvailabilityFilter::setAVAILABILITY(CatalogsProductGroupMultipleStringCriteria  aVAILABILITY)
{
	this->aVAILABILITY = aVAILABILITY;
}


