#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsListProductsByFilterRequest_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsListProductsByFilterRequest_oneOf::CatalogsListProductsByFilterRequest_oneOf()
{
	//__init();
}

CatalogsListProductsByFilterRequest_oneOf::~CatalogsListProductsByFilterRequest_oneOf()
{
	//__cleanup();
}

void
CatalogsListProductsByFilterRequest_oneOf::__init()
{
	//feed_id = std::string();
	//filters = new CatalogsProductGroupFilters();
}

void
CatalogsListProductsByFilterRequest_oneOf::__cleanup()
{
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//if(filters != NULL) {
	//
	//delete filters;
	//filters = NULL;
	//}
	//
}

void
CatalogsListProductsByFilterRequest_oneOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *filtersKey = "filters";
	node = json_object_get_member(pJsonObject, filtersKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupFilters")) {
			jsonToValue(&filters, node, "CatalogsProductGroupFilters", "CatalogsProductGroupFilters");
		} else {
			
			CatalogsProductGroupFilters* obj = static_cast<CatalogsProductGroupFilters*> (&filters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsListProductsByFilterRequest_oneOf::CatalogsListProductsByFilterRequest_oneOf(char* json)
{
	this->fromJson(json);
}

char*
CatalogsListProductsByFilterRequest_oneOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	if (isprimitive("CatalogsProductGroupFilters")) {
		CatalogsProductGroupFilters obj = getFilters();
		node = converttoJson(&obj, "CatalogsProductGroupFilters", "");
	}
	else {
		
		CatalogsProductGroupFilters obj = static_cast<CatalogsProductGroupFilters> (getFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtersKey = "filters";
	json_object_set_member(pJsonObject, filtersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsListProductsByFilterRequest_oneOf::getFeedId()
{
	return feed_id;
}

void
CatalogsListProductsByFilterRequest_oneOf::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

CatalogsProductGroupFilters
CatalogsListProductsByFilterRequest_oneOf::getFilters()
{
	return filters;
}

void
CatalogsListProductsByFilterRequest_oneOf::setFilters(CatalogsProductGroupFilters  filters)
{
	this->filters = filters;
}


