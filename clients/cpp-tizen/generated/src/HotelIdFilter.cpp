#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "HotelIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

HotelIdFilter::HotelIdFilter()
{
	//__init();
}

HotelIdFilter::~HotelIdFilter()
{
	//__cleanup();
}

void
HotelIdFilter::__init()
{
	//hOTEL_ID = new CatalogsProductGroupMultipleStringCriteria();
}

void
HotelIdFilter::__cleanup()
{
	//if(hOTEL_ID != NULL) {
	//
	//delete hOTEL_ID;
	//hOTEL_ID = NULL;
	//}
	//
}

void
HotelIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hOTEL_IDKey = "HOTEL_ID";
	node = json_object_get_member(pJsonObject, hOTEL_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&hOTEL_ID, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&hOTEL_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

HotelIdFilter::HotelIdFilter(char* json)
{
	this->fromJson(json);
}

char*
HotelIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getHOTELID();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getHOTELID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hOTEL_IDKey = "HOTEL_ID";
	json_object_set_member(pJsonObject, hOTEL_IDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
HotelIdFilter::getHOTELID()
{
	return hOTEL_ID;
}

void
HotelIdFilter::setHOTELID(CatalogsProductGroupMultipleStringCriteria  hOTEL_ID)
{
	this->hOTEL_ID = hOTEL_ID;
}


