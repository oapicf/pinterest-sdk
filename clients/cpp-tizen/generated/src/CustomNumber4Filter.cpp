#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomNumber4Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomNumber4Filter::CustomNumber4Filter()
{
	//__init();
}

CustomNumber4Filter::~CustomNumber4Filter()
{
	//__cleanup();
}

void
CustomNumber4Filter::__init()
{
	//cUSTOM_NUMBER_4 = new CatalogsProductGroupUint32Criteria();
}

void
CustomNumber4Filter::__cleanup()
{
	//if(cUSTOM_NUMBER_4 != NULL) {
	//
	//delete cUSTOM_NUMBER_4;
	//cUSTOM_NUMBER_4 = NULL;
	//}
	//
}

void
CustomNumber4Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_NUMBER_4Key = "CUSTOM_NUMBER_4";
	node = json_object_get_member(pJsonObject, cUSTOM_NUMBER_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupUint32Criteria")) {
			jsonToValue(&cUSTOM_NUMBER_4, node, "CatalogsProductGroupUint32Criteria", "CatalogsProductGroupUint32Criteria");
		} else {
			
			CatalogsProductGroupUint32Criteria* obj = static_cast<CatalogsProductGroupUint32Criteria*> (&cUSTOM_NUMBER_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomNumber4Filter::CustomNumber4Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomNumber4Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupUint32Criteria")) {
		CatalogsProductGroupUint32Criteria obj = getCUSTOMNUMBER4();
		node = converttoJson(&obj, "CatalogsProductGroupUint32Criteria", "");
	}
	else {
		
		CatalogsProductGroupUint32Criteria obj = static_cast<CatalogsProductGroupUint32Criteria> (getCUSTOMNUMBER4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_NUMBER_4Key = "CUSTOM_NUMBER_4";
	json_object_set_member(pJsonObject, cUSTOM_NUMBER_4Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupUint32Criteria
CustomNumber4Filter::getCUSTOMNUMBER4()
{
	return cUSTOM_NUMBER_4;
}

void
CustomNumber4Filter::setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_4)
{
	this->cUSTOM_NUMBER_4 = cUSTOM_NUMBER_4;
}


