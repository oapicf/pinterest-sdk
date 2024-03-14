#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenderFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenderFilter::GenderFilter()
{
	//__init();
}

GenderFilter::~GenderFilter()
{
	//__cleanup();
}

void
GenderFilter::__init()
{
	//gENDER = new CatalogsProductGroupMultipleStringCriteria();
}

void
GenderFilter::__cleanup()
{
	//if(gENDER != NULL) {
	//
	//delete gENDER;
	//gENDER = NULL;
	//}
	//
}

void
GenderFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gENDERKey = "GENDER";
	node = json_object_get_member(pJsonObject, gENDERKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&gENDER, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&gENDER);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GenderFilter::GenderFilter(char* json)
{
	this->fromJson(json);
}

char*
GenderFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getGENDER();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getGENDER());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gENDERKey = "GENDER";
	json_object_set_member(pJsonObject, gENDERKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
GenderFilter::getGENDER()
{
	return gENDER;
}

void
GenderFilter::setGENDER(CatalogsProductGroupMultipleStringCriteria  gENDER)
{
	this->gENDER = gENDER;
}


