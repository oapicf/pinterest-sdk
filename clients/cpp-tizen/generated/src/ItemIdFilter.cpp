#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemIdFilter::ItemIdFilter()
{
	//__init();
}

ItemIdFilter::~ItemIdFilter()
{
	//__cleanup();
}

void
ItemIdFilter::__init()
{
	//iTEM_ID = new CatalogsProductGroupCurrencyCriteria();
}

void
ItemIdFilter::__cleanup()
{
	//if(iTEM_ID != NULL) {
	//
	//delete iTEM_ID;
	//iTEM_ID = NULL;
	//}
	//
}

void
ItemIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *iTEM_IDKey = "ITEM_ID";
	node = json_object_get_member(pJsonObject, iTEM_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupCurrencyCriteria")) {
			jsonToValue(&iTEM_ID, node, "CatalogsProductGroupCurrencyCriteria", "");
		} else {
			
			CatalogsProductGroupCurrencyCriteria* obj = static_cast<CatalogsProductGroupCurrencyCriteria*> (&iTEM_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemIdFilter::ItemIdFilter(char* json)
{
	this->fromJson(json);
}

char*
ItemIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupCurrencyCriteria")) {
		CatalogsProductGroupCurrencyCriteria obj = getITEMID();
		node = converttoJson(&obj, "CatalogsProductGroupCurrencyCriteria", "");
	}
	else {
		
		CatalogsProductGroupCurrencyCriteria obj = static_cast<CatalogsProductGroupCurrencyCriteria> (getITEMID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iTEM_IDKey = "ITEM_ID";
	json_object_set_member(pJsonObject, iTEM_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupCurrencyCriteria
ItemIdFilter::getITEMID()
{
	return iTEM_ID;
}

void
ItemIdFilter::setITEMID(CatalogsProductGroupCurrencyCriteria  iTEM_ID)
{
	this->iTEM_ID = iTEM_ID;
}


