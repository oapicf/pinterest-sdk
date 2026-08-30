#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LinkFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LinkFilter::LinkFilter()
{
	//__init();
}

LinkFilter::~LinkFilter()
{
	//__cleanup();
}

void
LinkFilter::__init()
{
	//lINK = new CatalogsProductGroupFilterOperatorTypeCriteria();
}

void
LinkFilter::__cleanup()
{
	//if(lINK != NULL) {
	//
	//delete lINK;
	//lINK = NULL;
	//}
	//
}

void
LinkFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *lINKKey = "LINK";
	node = json_object_get_member(pJsonObject, lINKKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&lINK, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "CatalogsProductGroupFilterOperatorTypeCriteria");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&lINK);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LinkFilter::LinkFilter(char* json)
{
	this->fromJson(json);
}

char*
LinkFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getLINK();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getLINK());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lINKKey = "LINK";
	json_object_set_member(pJsonObject, lINKKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupFilterOperatorTypeCriteria
LinkFilter::getLINK()
{
	return lINK;
}

void
LinkFilter::setLINK(CatalogsProductGroupFilterOperatorTypeCriteria  lINK)
{
	this->lINK = lINK;
}


