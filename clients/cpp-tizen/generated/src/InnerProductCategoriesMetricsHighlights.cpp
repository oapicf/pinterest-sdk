#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InnerProductCategoriesMetricsHighlights.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InnerProductCategoriesMetricsHighlights::InnerProductCategoriesMetricsHighlights()
{
	//__init();
}

InnerProductCategoriesMetricsHighlights::~InnerProductCategoriesMetricsHighlights()
{
	//__cleanup();
}

void
InnerProductCategoriesMetricsHighlights::__init()
{
	//pct_change_mom = double(0);
}

void
InnerProductCategoriesMetricsHighlights::__cleanup()
{
	//if(pct_change_mom != NULL) {
	//
	//delete pct_change_mom;
	//pct_change_mom = NULL;
	//}
	//
}

void
InnerProductCategoriesMetricsHighlights::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pct_change_momKey = "pct_change_mom";
	node = json_object_get_member(pJsonObject, pct_change_momKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&pct_change_mom, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&pct_change_mom);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

InnerProductCategoriesMetricsHighlights::InnerProductCategoriesMetricsHighlights(char* json)
{
	this->fromJson(json);
}

char*
InnerProductCategoriesMetricsHighlights::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getPctChangeMom();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPctChangeMom());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pct_change_momKey = "pct_change_mom";
	json_object_set_member(pJsonObject, pct_change_momKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
InnerProductCategoriesMetricsHighlights::getPctChangeMom()
{
	return pct_change_mom;
}

void
InnerProductCategoriesMetricsHighlights::setPctChangeMom(long long  pct_change_mom)
{
	this->pct_change_mom = pct_change_mom;
}


