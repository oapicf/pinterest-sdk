#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessMemberAssetsGetResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessMemberAssetsGetResponse::BusinessMemberAssetsGetResponse()
{
	//__init();
}

BusinessMemberAssetsGetResponse::~BusinessMemberAssetsGetResponse()
{
	//__cleanup();
}

void
BusinessMemberAssetsGetResponse::__init()
{
	//bookmark = std::string();
	//new std::list()std::list> items;
	//total_data_count = int(0);
	//total_data_count_by_status = null;
}

void
BusinessMemberAssetsGetResponse::__cleanup()
{
	//if(bookmark != NULL) {
	//
	//delete bookmark;
	//bookmark = NULL;
	//}
	//if(items != NULL) {
	//items.RemoveAll(true);
	//delete items;
	//items = NULL;
	//}
	//if(total_data_count != NULL) {
	//
	//delete total_data_count;
	//total_data_count = NULL;
	//}
	//if(total_data_count_by_status != NULL) {
	//
	//delete total_data_count_by_status;
	//total_data_count_by_status = NULL;
	//}
	//
}

void
BusinessMemberAssetsGetResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bookmarkKey = "bookmark";
	node = json_object_get_member(pJsonObject, bookmarkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bookmark, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssetIdPermissions> new_list;
			AssetIdPermissions inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssetIdPermissions")) {
					jsonToValue(&inst, temp_json, "AssetIdPermissions", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			items = new_list;
		}
		
	}
	const gchar *total_data_countKey = "total_data_count";
	node = json_object_get_member(pJsonObject, total_data_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_data_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *total_data_count_by_statusKey = "total_data_count_by_status";
	node = json_object_get_member(pJsonObject, total_data_count_by_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("TotalCountByEntityStatus")) {
			jsonToValue(&total_data_count_by_status, node, "TotalCountByEntityStatus", "TotalCountByEntityStatus");
		} else {
			
			TotalCountByEntityStatus* obj = static_cast<TotalCountByEntityStatus*> (&total_data_count_by_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BusinessMemberAssetsGetResponse::BusinessMemberAssetsGetResponse(char* json)
{
	this->fromJson(json);
}

char*
BusinessMemberAssetsGetResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBookmark();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bookmarkKey = "bookmark";
	json_object_set_member(pJsonObject, bookmarkKey, node);
	if (isprimitive("AssetIdPermissions")) {
		list<AssetIdPermissions> new_list = static_cast<list <AssetIdPermissions> > (getItems());
		node = converttoJson(&new_list, "AssetIdPermissions", "array");
	} else {
		node = json_node_alloc();
		list<AssetIdPermissions> new_list = static_cast<list <AssetIdPermissions> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssetIdPermissions>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssetIdPermissions obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *itemsKey = "items";
	json_object_set_member(pJsonObject, itemsKey, node);
	if (isprimitive("int")) {
		int obj = getTotalDataCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_data_countKey = "total_data_count";
	json_object_set_member(pJsonObject, total_data_countKey, node);
	if (isprimitive("TotalCountByEntityStatus")) {
		TotalCountByEntityStatus obj = getTotalDataCountByStatus();
		node = converttoJson(&obj, "TotalCountByEntityStatus", "");
	}
	else {
		
		TotalCountByEntityStatus obj = static_cast<TotalCountByEntityStatus> (getTotalDataCountByStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *total_data_count_by_statusKey = "total_data_count_by_status";
	json_object_set_member(pJsonObject, total_data_count_by_statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BusinessMemberAssetsGetResponse::getBookmark()
{
	return bookmark;
}

void
BusinessMemberAssetsGetResponse::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}

std::list<AssetIdPermissions>
BusinessMemberAssetsGetResponse::getItems()
{
	return items;
}

void
BusinessMemberAssetsGetResponse::setItems(std::list <AssetIdPermissions> items)
{
	this->items = items;
}

int
BusinessMemberAssetsGetResponse::getTotalDataCount()
{
	return total_data_count;
}

void
BusinessMemberAssetsGetResponse::setTotalDataCount(int  total_data_count)
{
	this->total_data_count = total_data_count;
}

TotalCountByEntityStatus
BusinessMemberAssetsGetResponse::getTotalDataCountByStatus()
{
	return total_data_count_by_status;
}

void
BusinessMemberAssetsGetResponse::setTotalDataCountByStatus(TotalCountByEntityStatus  total_data_count_by_status)
{
	this->total_data_count_by_status = total_data_count_by_status;
}


