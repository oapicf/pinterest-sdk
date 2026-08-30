#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomNumber3Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomNumber3Filter::CustomNumber3Filter()
{
	//__init();
}

CustomNumber3Filter::~CustomNumber3Filter()
{
	//__cleanup();
}

void
CustomNumber3Filter::__init()
{
	//cUSTOM_NUMBER_3 = new CatalogsProductGroupUint32Criteria();
}

void
CustomNumber3Filter::__cleanup()
{
	//if(cUSTOM_NUMBER_3 != NULL) {
	//
	//delete cUSTOM_NUMBER_3;
	//cUSTOM_NUMBER_3 = NULL;
	//}
	//
}

void
CustomNumber3Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_NUMBER_3Key = "CUSTOM_NUMBER_3";
	node = json_object_get_member(pJsonObject, cUSTOM_NUMBER_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupUint32Criteria")) {
			jsonToValue(&cUSTOM_NUMBER_3, node, "CatalogsProductGroupUint32Criteria", "CatalogsProductGroupUint32Criteria");
		} else {
			
			CatalogsProductGroupUint32Criteria* obj = static_cast<CatalogsProductGroupUint32Criteria*> (&cUSTOM_NUMBER_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomNumber3Filter::CustomNumber3Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomNumber3Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupUint32Criteria")) {
		CatalogsProductGroupUint32Criteria obj = getCUSTOMNUMBER3();
		node = converttoJson(&obj, "CatalogsProductGroupUint32Criteria", "");
	}
	else {
		
		CatalogsProductGroupUint32Criteria obj = static_cast<CatalogsProductGroupUint32Criteria> (getCUSTOMNUMBER3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_NUMBER_3Key = "CUSTOM_NUMBER_3";
	json_object_set_member(pJsonObject, cUSTOM_NUMBER_3Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupUint32Criteria
CustomNumber3Filter::getCUSTOMNUMBER3()
{
	return cUSTOM_NUMBER_3;
}

void
CustomNumber3Filter::setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_3)
{
	this->cUSTOM_NUMBER_3 = cUSTOM_NUMBER_3;
}


