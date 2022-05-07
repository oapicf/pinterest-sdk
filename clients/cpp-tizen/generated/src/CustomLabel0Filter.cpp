#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomLabel0Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomLabel0Filter::CustomLabel0Filter()
{
	//__init();
}

CustomLabel0Filter::~CustomLabel0Filter()
{
	//__cleanup();
}

void
CustomLabel0Filter::__init()
{
	//cUSTOM_LABEL_0 = new CatalogsProductGroupMultipleStringCriteria();
}

void
CustomLabel0Filter::__cleanup()
{
	//if(cUSTOM_LABEL_0 != NULL) {
	//
	//delete cUSTOM_LABEL_0;
	//cUSTOM_LABEL_0 = NULL;
	//}
	//
}

void
CustomLabel0Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_0, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomLabel0Filter::CustomLabel0Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomLabel0Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_0Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CustomLabel0Filter::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CustomLabel0Filter::setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}


