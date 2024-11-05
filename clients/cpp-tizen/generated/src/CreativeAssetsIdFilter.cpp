#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreativeAssetsIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreativeAssetsIdFilter::CreativeAssetsIdFilter()
{
	//__init();
}

CreativeAssetsIdFilter::~CreativeAssetsIdFilter()
{
	//__cleanup();
}

void
CreativeAssetsIdFilter::__init()
{
	//cREATIVE_ASSETS_ID = new CatalogsProductGroupMultipleStringCriteria();
}

void
CreativeAssetsIdFilter::__cleanup()
{
	//if(cREATIVE_ASSETS_ID != NULL) {
	//
	//delete cREATIVE_ASSETS_ID;
	//cREATIVE_ASSETS_ID = NULL;
	//}
	//
}

void
CreativeAssetsIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";
	node = json_object_get_member(pJsonObject, cREATIVE_ASSETS_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cREATIVE_ASSETS_ID, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cREATIVE_ASSETS_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreativeAssetsIdFilter::CreativeAssetsIdFilter(char* json)
{
	this->fromJson(json);
}

char*
CreativeAssetsIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCREATIVEASSETSID();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCREATIVEASSETSID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";
	json_object_set_member(pJsonObject, cREATIVE_ASSETS_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CreativeAssetsIdFilter::getCREATIVEASSETSID()
{
	return cREATIVE_ASSETS_ID;
}

void
CreativeAssetsIdFilter::setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID)
{
	this->cREATIVE_ASSETS_ID = cREATIVE_ASSETS_ID;
}


