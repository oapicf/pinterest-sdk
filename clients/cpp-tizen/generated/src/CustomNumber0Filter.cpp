#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomNumber0Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomNumber0Filter::CustomNumber0Filter()
{
	//__init();
}

CustomNumber0Filter::~CustomNumber0Filter()
{
	//__cleanup();
}

void
CustomNumber0Filter::__init()
{
	//cUSTOM_NUMBER_0 = new CatalogsProductGroupUint32Criteria();
}

void
CustomNumber0Filter::__cleanup()
{
	//if(cUSTOM_NUMBER_0 != NULL) {
	//
	//delete cUSTOM_NUMBER_0;
	//cUSTOM_NUMBER_0 = NULL;
	//}
	//
}

void
CustomNumber0Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_NUMBER_0Key = "CUSTOM_NUMBER_0";
	node = json_object_get_member(pJsonObject, cUSTOM_NUMBER_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupUint32Criteria")) {
			jsonToValue(&cUSTOM_NUMBER_0, node, "CatalogsProductGroupUint32Criteria", "CatalogsProductGroupUint32Criteria");
		} else {
			
			CatalogsProductGroupUint32Criteria* obj = static_cast<CatalogsProductGroupUint32Criteria*> (&cUSTOM_NUMBER_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomNumber0Filter::CustomNumber0Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomNumber0Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupUint32Criteria")) {
		CatalogsProductGroupUint32Criteria obj = getCUSTOMNUMBER0();
		node = converttoJson(&obj, "CatalogsProductGroupUint32Criteria", "");
	}
	else {
		
		CatalogsProductGroupUint32Criteria obj = static_cast<CatalogsProductGroupUint32Criteria> (getCUSTOMNUMBER0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_NUMBER_0Key = "CUSTOM_NUMBER_0";
	json_object_set_member(pJsonObject, cUSTOM_NUMBER_0Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupUint32Criteria
CustomNumber0Filter::getCUSTOMNUMBER0()
{
	return cUSTOM_NUMBER_0;
}

void
CustomNumber0Filter::setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_0)
{
	this->cUSTOM_NUMBER_0 = cUSTOM_NUMBER_0;
}


