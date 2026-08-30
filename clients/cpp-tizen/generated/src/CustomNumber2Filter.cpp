#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomNumber2Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomNumber2Filter::CustomNumber2Filter()
{
	//__init();
}

CustomNumber2Filter::~CustomNumber2Filter()
{
	//__cleanup();
}

void
CustomNumber2Filter::__init()
{
	//cUSTOM_NUMBER_2 = new CatalogsProductGroupUint32Criteria();
}

void
CustomNumber2Filter::__cleanup()
{
	//if(cUSTOM_NUMBER_2 != NULL) {
	//
	//delete cUSTOM_NUMBER_2;
	//cUSTOM_NUMBER_2 = NULL;
	//}
	//
}

void
CustomNumber2Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_NUMBER_2Key = "CUSTOM_NUMBER_2";
	node = json_object_get_member(pJsonObject, cUSTOM_NUMBER_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupUint32Criteria")) {
			jsonToValue(&cUSTOM_NUMBER_2, node, "CatalogsProductGroupUint32Criteria", "CatalogsProductGroupUint32Criteria");
		} else {
			
			CatalogsProductGroupUint32Criteria* obj = static_cast<CatalogsProductGroupUint32Criteria*> (&cUSTOM_NUMBER_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomNumber2Filter::CustomNumber2Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomNumber2Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupUint32Criteria")) {
		CatalogsProductGroupUint32Criteria obj = getCUSTOMNUMBER2();
		node = converttoJson(&obj, "CatalogsProductGroupUint32Criteria", "");
	}
	else {
		
		CatalogsProductGroupUint32Criteria obj = static_cast<CatalogsProductGroupUint32Criteria> (getCUSTOMNUMBER2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_NUMBER_2Key = "CUSTOM_NUMBER_2";
	json_object_set_member(pJsonObject, cUSTOM_NUMBER_2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupUint32Criteria
CustomNumber2Filter::getCUSTOMNUMBER2()
{
	return cUSTOM_NUMBER_2;
}

void
CustomNumber2Filter::setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_2)
{
	this->cUSTOM_NUMBER_2 = cUSTOM_NUMBER_2;
}


