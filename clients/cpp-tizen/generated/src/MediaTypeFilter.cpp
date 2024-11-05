#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaTypeFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaTypeFilter::MediaTypeFilter()
{
	//__init();
}

MediaTypeFilter::~MediaTypeFilter()
{
	//__cleanup();
}

void
MediaTypeFilter::__init()
{
	//mEDIA_TYPE = new CatalogsProductGroupMultipleMediaTypesCriteria();
}

void
MediaTypeFilter::__cleanup()
{
	//if(mEDIA_TYPE != NULL) {
	//
	//delete mEDIA_TYPE;
	//mEDIA_TYPE = NULL;
	//}
	//
}

void
MediaTypeFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mEDIA_TYPEKey = "MEDIA_TYPE";
	node = json_object_get_member(pJsonObject, mEDIA_TYPEKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleMediaTypesCriteria")) {
			jsonToValue(&mEDIA_TYPE, node, "CatalogsProductGroupMultipleMediaTypesCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleMediaTypesCriteria* obj = static_cast<CatalogsProductGroupMultipleMediaTypesCriteria*> (&mEDIA_TYPE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MediaTypeFilter::MediaTypeFilter(char* json)
{
	this->fromJson(json);
}

char*
MediaTypeFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleMediaTypesCriteria")) {
		CatalogsProductGroupMultipleMediaTypesCriteria obj = getMEDIATYPE();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleMediaTypesCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleMediaTypesCriteria obj = static_cast<CatalogsProductGroupMultipleMediaTypesCriteria> (getMEDIATYPE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mEDIA_TYPEKey = "MEDIA_TYPE";
	json_object_set_member(pJsonObject, mEDIA_TYPEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleMediaTypesCriteria
MediaTypeFilter::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
MediaTypeFilter::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}


