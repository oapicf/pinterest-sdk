#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomLabel1Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomLabel1Filter::CustomLabel1Filter()
{
	//__init();
}

CustomLabel1Filter::~CustomLabel1Filter()
{
	//__cleanup();
}

void
CustomLabel1Filter::__init()
{
	//cUSTOM_LABEL_1 = new CatalogsProductGroupMultipleStringCriteria();
}

void
CustomLabel1Filter::__cleanup()
{
	//if(cUSTOM_LABEL_1 != NULL) {
	//
	//delete cUSTOM_LABEL_1;
	//cUSTOM_LABEL_1 = NULL;
	//}
	//
}

void
CustomLabel1Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_1, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomLabel1Filter::CustomLabel1Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomLabel1Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CustomLabel1Filter::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CustomLabel1Filter::setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}


