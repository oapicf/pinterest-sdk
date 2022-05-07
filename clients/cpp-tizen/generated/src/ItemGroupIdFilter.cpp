#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemGroupIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemGroupIdFilter::ItemGroupIdFilter()
{
	//__init();
}

ItemGroupIdFilter::~ItemGroupIdFilter()
{
	//__cleanup();
}

void
ItemGroupIdFilter::__init()
{
	//iTEM_GROUP_ID = new CatalogsProductGroupMultipleStringCriteria();
}

void
ItemGroupIdFilter::__cleanup()
{
	//if(iTEM_GROUP_ID != NULL) {
	//
	//delete iTEM_GROUP_ID;
	//iTEM_GROUP_ID = NULL;
	//}
	//
}

void
ItemGroupIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *iTEM_GROUP_IDKey = "ITEM_GROUP_ID";
	node = json_object_get_member(pJsonObject, iTEM_GROUP_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&iTEM_GROUP_ID, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&iTEM_GROUP_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemGroupIdFilter::ItemGroupIdFilter(char* json)
{
	this->fromJson(json);
}

char*
ItemGroupIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getITEMGROUPID();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getITEMGROUPID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iTEM_GROUP_IDKey = "ITEM_GROUP_ID";
	json_object_set_member(pJsonObject, iTEM_GROUP_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
ItemGroupIdFilter::getITEMGROUPID()
{
	return iTEM_GROUP_ID;
}

void
ItemGroupIdFilter::setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria  iTEM_GROUP_ID)
{
	this->iTEM_GROUP_ID = iTEM_GROUP_ID;
}


