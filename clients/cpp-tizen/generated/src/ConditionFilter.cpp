#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConditionFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConditionFilter::ConditionFilter()
{
	//__init();
}

ConditionFilter::~ConditionFilter()
{
	//__cleanup();
}

void
ConditionFilter::__init()
{
	//cONDITION = new CatalogsProductGroupMultipleStringCriteria();
}

void
ConditionFilter::__cleanup()
{
	//if(cONDITION != NULL) {
	//
	//delete cONDITION;
	//cONDITION = NULL;
	//}
	//
}

void
ConditionFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cONDITIONKey = "CONDITION";
	node = json_object_get_member(pJsonObject, cONDITIONKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cONDITION, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cONDITION);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ConditionFilter::ConditionFilter(char* json)
{
	this->fromJson(json);
}

char*
ConditionFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCONDITION();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCONDITION());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cONDITIONKey = "CONDITION";
	json_object_set_member(pJsonObject, cONDITIONKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
ConditionFilter::getCONDITION()
{
	return cONDITION;
}

void
ConditionFilter::setCONDITION(CatalogsProductGroupMultipleStringCriteria  cONDITION)
{
	this->cONDITION = cONDITION;
}


