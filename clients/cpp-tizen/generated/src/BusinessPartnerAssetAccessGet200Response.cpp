#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Business_partner_asset_access_get_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Business_partner_asset_access_get_200_response::Business_partner_asset_access_get_200_response()
{
	//__init();
}

Business_partner_asset_access_get_200_response::~Business_partner_asset_access_get_200_response()
{
	//__cleanup();
}

void
Business_partner_asset_access_get_200_response::__init()
{
	//new std::list()std::list> items;
	//bookmark = std::string();
}

void
Business_partner_asset_access_get_200_response::__cleanup()
{
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(bookmark != NULL) {
	//
	//delete bookmark;
	//bookmark = NULL;
	//}
	//
}

void
Business_partner_asset_access_get_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GetPartnerAssetsResponse> new_list;
			GetPartnerAssetsResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GetPartnerAssetsResponse")) {
					jsonToValue(&inst, temp_json, "GetPartnerAssetsResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *bookmarkKey = "bookmark";
	node = json_object_get_member(pJsonObject, bookmarkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bookmark, node, "std::string", "");
		} else {
			
		}
	}
}

Business_partner_asset_access_get_200_response::Business_partner_asset_access_get_200_response(char* json)
{
	this->fromJson(json);
}

char*
Business_partner_asset_access_get_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("GetPartnerAssetsResponse")) {
		list<GetPartnerAssetsResponse> new_list = static_cast<list <GetPartnerAssetsResponse> > (getItems());
		node = converttoJson(&new_list, "GetPartnerAssetsResponse", "array");
	} else {
		node = json_node_alloc();
		list<GetPartnerAssetsResponse> new_list = static_cast<list <GetPartnerAssetsResponse> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GetPartnerAssetsResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GetPartnerAssetsResponse obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBookmark();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bookmarkKey = "bookmark";
	json_object_set_member(pJsonObject, bookmarkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<GetPartnerAssetsResponse>
Business_partner_asset_access_get_200_response::getItems()
{
	return items;
}

void
Business_partner_asset_access_get_200_response::setItems(std::list <GetPartnerAssetsResponse> items)
{
	this->items = items;
}

std::string
Business_partner_asset_access_get_200_response::getBookmark()
{
	return bookmark;
}

void
Business_partner_asset_access_get_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}


