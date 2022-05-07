#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomLabel2Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomLabel2Filter::CustomLabel2Filter()
{
	//__init();
}

CustomLabel2Filter::~CustomLabel2Filter()
{
	//__cleanup();
}

void
CustomLabel2Filter::__init()
{
	//cUSTOM_LABEL_2 = new CatalogsProductGroupMultipleStringCriteria();
}

void
CustomLabel2Filter::__cleanup()
{
	//if(cUSTOM_LABEL_2 != NULL) {
	//
	//delete cUSTOM_LABEL_2;
	//cUSTOM_LABEL_2 = NULL;
	//}
	//
}

void
CustomLabel2Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_2, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomLabel2Filter::CustomLabel2Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomLabel2Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CustomLabel2Filter::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CustomLabel2Filter::setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}


