#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TitleKeywordsFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TitleKeywordsFilter::TitleKeywordsFilter()
{
	//__init();
}

TitleKeywordsFilter::~TitleKeywordsFilter()
{
	//__cleanup();
}

void
TitleKeywordsFilter::__init()
{
	//tITLE_KEYWORDS = new CatalogsProductGroupMultipleStringCriteria();
}

void
TitleKeywordsFilter::__cleanup()
{
	//if(tITLE_KEYWORDS != NULL) {
	//
	//delete tITLE_KEYWORDS;
	//tITLE_KEYWORDS = NULL;
	//}
	//
}

void
TitleKeywordsFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";
	node = json_object_get_member(pJsonObject, tITLE_KEYWORDSKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&tITLE_KEYWORDS, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&tITLE_KEYWORDS);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TitleKeywordsFilter::TitleKeywordsFilter(char* json)
{
	this->fromJson(json);
}

char*
TitleKeywordsFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getTITLEKEYWORDS();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getTITLEKEYWORDS());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tITLE_KEYWORDSKey = "TITLE_KEYWORDS";
	json_object_set_member(pJsonObject, tITLE_KEYWORDSKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
TitleKeywordsFilter::getTITLEKEYWORDS()
{
	return tITLE_KEYWORDS;
}

void
TitleKeywordsFilter::setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria  tITLE_KEYWORDS)
{
	this->tITLE_KEYWORDS = tITLE_KEYWORDS;
}


