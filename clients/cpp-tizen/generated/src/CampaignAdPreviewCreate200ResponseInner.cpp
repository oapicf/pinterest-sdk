#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Campaign_ad_preview_create_200_response_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Campaign_ad_preview_create_200_response_inner::Campaign_ad_preview_create_200_response_inner()
{
	//__init();
}

Campaign_ad_preview_create_200_response_inner::~Campaign_ad_preview_create_200_response_inner()
{
	//__cleanup();
}

void
Campaign_ad_preview_create_200_response_inner::__init()
{
	//data = new Campaign_ad_preview_create_200_response_inner_data();
}

void
Campaign_ad_preview_create_200_response_inner::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
Campaign_ad_preview_create_200_response_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("Campaign_ad_preview_create_200_response_inner_data")) {
			jsonToValue(&data, node, "Campaign_ad_preview_create_200_response_inner_data", "Campaign_ad_preview_create_200_response_inner_data");
		} else {
			
			Campaign_ad_preview_create_200_response_inner_data* obj = static_cast<Campaign_ad_preview_create_200_response_inner_data*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Campaign_ad_preview_create_200_response_inner::Campaign_ad_preview_create_200_response_inner(char* json)
{
	this->fromJson(json);
}

char*
Campaign_ad_preview_create_200_response_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Campaign_ad_preview_create_200_response_inner_data")) {
		Campaign_ad_preview_create_200_response_inner_data obj = getData();
		node = converttoJson(&obj, "Campaign_ad_preview_create_200_response_inner_data", "");
	}
	else {
		
		Campaign_ad_preview_create_200_response_inner_data obj = static_cast<Campaign_ad_preview_create_200_response_inner_data> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Campaign_ad_preview_create_200_response_inner_data
Campaign_ad_preview_create_200_response_inner::getData()
{
	return data;
}

void
Campaign_ad_preview_create_200_response_inner::setData(Campaign_ad_preview_create_200_response_inner_data  data)
{
	this->data = data;
}


