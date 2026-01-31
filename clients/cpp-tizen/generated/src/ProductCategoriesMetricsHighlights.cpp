#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductCategoriesMetricsHighlights.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductCategoriesMetricsHighlights::ProductCategoriesMetricsHighlights()
{
	//__init();
}

ProductCategoriesMetricsHighlights::~ProductCategoriesMetricsHighlights()
{
	//__cleanup();
}

void
ProductCategoriesMetricsHighlights::__init()
{
	//engagement = null;
	//outbound_clicks = null;
	//pin_saves = null;
}

void
ProductCategoriesMetricsHighlights::__cleanup()
{
	//if(engagement != NULL) {
	//
	//delete engagement;
	//engagement = NULL;
	//}
	//if(outbound_clicks != NULL) {
	//
	//delete outbound_clicks;
	//outbound_clicks = NULL;
	//}
	//if(pin_saves != NULL) {
	//
	//delete pin_saves;
	//pin_saves = NULL;
	//}
	//
}

void
ProductCategoriesMetricsHighlights::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *engagementKey = "engagement";
	node = json_object_get_member(pJsonObject, engagementKey);
	if (node !=NULL) {
	

		if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
			jsonToValue(&engagement, node, "InnerProductCategoriesMetricsHighlights", "InnerProductCategoriesMetricsHighlights");
		} else {
			
			InnerProductCategoriesMetricsHighlights* obj = static_cast<InnerProductCategoriesMetricsHighlights*> (&engagement);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *outbound_clicksKey = "outbound_clicks";
	node = json_object_get_member(pJsonObject, outbound_clicksKey);
	if (node !=NULL) {
	

		if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
			jsonToValue(&outbound_clicks, node, "InnerProductCategoriesMetricsHighlights", "InnerProductCategoriesMetricsHighlights");
		} else {
			
			InnerProductCategoriesMetricsHighlights* obj = static_cast<InnerProductCategoriesMetricsHighlights*> (&outbound_clicks);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pin_savesKey = "pin_saves";
	node = json_object_get_member(pJsonObject, pin_savesKey);
	if (node !=NULL) {
	

		if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
			jsonToValue(&pin_saves, node, "InnerProductCategoriesMetricsHighlights", "InnerProductCategoriesMetricsHighlights");
		} else {
			
			InnerProductCategoriesMetricsHighlights* obj = static_cast<InnerProductCategoriesMetricsHighlights*> (&pin_saves);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProductCategoriesMetricsHighlights::ProductCategoriesMetricsHighlights(char* json)
{
	this->fromJson(json);
}

char*
ProductCategoriesMetricsHighlights::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
		InnerProductCategoriesMetricsHighlights obj = getEngagement();
		node = converttoJson(&obj, "InnerProductCategoriesMetricsHighlights", "");
	}
	else {
		
		InnerProductCategoriesMetricsHighlights obj = static_cast<InnerProductCategoriesMetricsHighlights> (getEngagement());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *engagementKey = "engagement";
	json_object_set_member(pJsonObject, engagementKey, node);
	if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
		InnerProductCategoriesMetricsHighlights obj = getOutboundClicks();
		node = converttoJson(&obj, "InnerProductCategoriesMetricsHighlights", "");
	}
	else {
		
		InnerProductCategoriesMetricsHighlights obj = static_cast<InnerProductCategoriesMetricsHighlights> (getOutboundClicks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *outbound_clicksKey = "outbound_clicks";
	json_object_set_member(pJsonObject, outbound_clicksKey, node);
	if (isprimitive("InnerProductCategoriesMetricsHighlights")) {
		InnerProductCategoriesMetricsHighlights obj = getPinSaves();
		node = converttoJson(&obj, "InnerProductCategoriesMetricsHighlights", "");
	}
	else {
		
		InnerProductCategoriesMetricsHighlights obj = static_cast<InnerProductCategoriesMetricsHighlights> (getPinSaves());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pin_savesKey = "pin_saves";
	json_object_set_member(pJsonObject, pin_savesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getEngagement()
{
	return engagement;
}

void
ProductCategoriesMetricsHighlights::setEngagement(InnerProductCategoriesMetricsHighlights  engagement)
{
	this->engagement = engagement;
}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getOutboundClicks()
{
	return outbound_clicks;
}

void
ProductCategoriesMetricsHighlights::setOutboundClicks(InnerProductCategoriesMetricsHighlights  outbound_clicks)
{
	this->outbound_clicks = outbound_clicks;
}

InnerProductCategoriesMetricsHighlights
ProductCategoriesMetricsHighlights::getPinSaves()
{
	return pin_saves;
}

void
ProductCategoriesMetricsHighlights::setPinSaves(InnerProductCategoriesMetricsHighlights  pin_saves)
{
	this->pin_saves = pin_saves;
}


