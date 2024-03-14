#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomLabel4Filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomLabel4Filter::CustomLabel4Filter()
{
	//__init();
}

CustomLabel4Filter::~CustomLabel4Filter()
{
	//__cleanup();
}

void
CustomLabel4Filter::__init()
{
	//cUSTOM_LABEL_4 = new CatalogsProductGroupMultipleStringCriteria();
}

void
CustomLabel4Filter::__cleanup()
{
	//if(cUSTOM_LABEL_4 != NULL) {
	//
	//delete cUSTOM_LABEL_4;
	//cUSTOM_LABEL_4 = NULL;
	//}
	//
}

void
CustomLabel4Filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_4, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomLabel4Filter::CustomLabel4Filter(char* json)
{
	this->fromJson(json);
}

char*
CustomLabel4Filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_4Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CustomLabel4Filter::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CustomLabel4Filter::setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}


