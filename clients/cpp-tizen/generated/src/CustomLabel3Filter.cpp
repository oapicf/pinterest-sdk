#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomLabel3Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomLabel3Filter::CustomLabel3Filter()
{
	//__init();
}

CustomLabel3Filter::~CustomLabel3Filter()
{
	//__cleanup();
}

void
CustomLabel3Filter::__init()
{
	//cUSTOM_LABEL_3 = new CatalogsProductGroupFilterOperatorTypeCriteria();
}

void
CustomLabel3Filter::__cleanup()
{
	//if(cUSTOM_LABEL_3 != NULL) {
	//
	//delete cUSTOM_LABEL_3;
	//cUSTOM_LABEL_3 = NULL;
	//}
	//
}

void
CustomLabel3Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
			jsonToValue(&cUSTOM_LABEL_3, node, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
		} else {
			
			CatalogsProductGroupFilterOperatorTypeCriteria* obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria*> (&cUSTOM_LABEL_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomLabel3Filter::CustomLabel3Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomLabel3Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupFilterOperatorTypeCriteria")) {
		CatalogsProductGroupFilterOperatorTypeCriteria obj = getCUSTOMLABEL3();
		node = converttoJson(&obj, "CatalogsProductGroupFilterOperatorTypeCriteria", "");
	}
	else {
		
		CatalogsProductGroupFilterOperatorTypeCriteria obj = static_cast<CatalogsProductGroupFilterOperatorTypeCriteria> (getCUSTOMLABEL3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_3Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupFilterOperatorTypeCriteria
CustomLabel3Filter::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CustomLabel3Filter::setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria  cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}


