#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomNumber1Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomNumber1Filter::CustomNumber1Filter()
{
	//__init();
}

CustomNumber1Filter::~CustomNumber1Filter()
{
	//__cleanup();
}

void
CustomNumber1Filter::__init()
{
	//cUSTOM_NUMBER_1 = new CatalogsProductGroupUint32Criteria();
}

void
CustomNumber1Filter::__cleanup()
{
	//if(cUSTOM_NUMBER_1 != NULL) {
	//
	//delete cUSTOM_NUMBER_1;
	//cUSTOM_NUMBER_1 = NULL;
	//}
	//
}

void
CustomNumber1Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_NUMBER_1Key = "CUSTOM_NUMBER_1";
	node = json_object_get_member(pJsonObject, cUSTOM_NUMBER_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupUint32Criteria")) {
			jsonToValue(&cUSTOM_NUMBER_1, node, "CatalogsProductGroupUint32Criteria", "");
		} else {
			
			CatalogsProductGroupUint32Criteria* obj = static_cast<CatalogsProductGroupUint32Criteria*> (&cUSTOM_NUMBER_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomNumber1Filter::CustomNumber1Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomNumber1Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupUint32Criteria")) {
		CatalogsProductGroupUint32Criteria obj = getCUSTOMNUMBER1();
		node = converttoJson(&obj, "CatalogsProductGroupUint32Criteria", "");
	}
	else {
		
		CatalogsProductGroupUint32Criteria obj = static_cast<CatalogsProductGroupUint32Criteria> (getCUSTOMNUMBER1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_NUMBER_1Key = "CUSTOM_NUMBER_1";
	json_object_set_member(pJsonObject, cUSTOM_NUMBER_1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupUint32Criteria
CustomNumber1Filter::getCUSTOMNUMBER1()
{
	return cUSTOM_NUMBER_1;
}

void
CustomNumber1Filter::setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_1)
{
	this->cUSTOM_NUMBER_1 = cUSTOM_NUMBER_1;
}


