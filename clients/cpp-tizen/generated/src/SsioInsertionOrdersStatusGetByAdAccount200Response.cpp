#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Ssio_insertion_orders_status_get_by_ad_account_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Ssio_insertion_orders_status_get_by_ad_account_200_response::Ssio_insertion_orders_status_get_by_ad_account_200_response()
{
	//__init();
}

Ssio_insertion_orders_status_get_by_ad_account_200_response::~Ssio_insertion_orders_status_get_by_ad_account_200_response()
{
	//__cleanup();
}

void
Ssio_insertion_orders_status_get_by_ad_account_200_response::__init()
{
	//new std::list()std::list> items;
	//bookmark = std::string();
}

void
Ssio_insertion_orders_status_get_by_ad_account_200_response::__cleanup()
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
Ssio_insertion_orders_status_get_by_ad_account_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SSIOInsertionOrderStatus> new_list;
			SSIOInsertionOrderStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SSIOInsertionOrderStatus")) {
					jsonToValue(&inst, temp_json, "SSIOInsertionOrderStatus", "");
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

Ssio_insertion_orders_status_get_by_ad_account_200_response::Ssio_insertion_orders_status_get_by_ad_account_200_response(char* json)
{
	this->fromJson(json);
}

char*
Ssio_insertion_orders_status_get_by_ad_account_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SSIOInsertionOrderStatus")) {
		list<SSIOInsertionOrderStatus> new_list = static_cast<list <SSIOInsertionOrderStatus> > (getItems());
		node = converttoJson(&new_list, "SSIOInsertionOrderStatus", "array");
	} else {
		node = json_node_alloc();
		list<SSIOInsertionOrderStatus> new_list = static_cast<list <SSIOInsertionOrderStatus> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SSIOInsertionOrderStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SSIOInsertionOrderStatus obj = *it;
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

std::list<SSIOInsertionOrderStatus>
Ssio_insertion_orders_status_get_by_ad_account_200_response::getItems()
{
	return items;
}

void
Ssio_insertion_orders_status_get_by_ad_account_200_response::setItems(std::list <SSIOInsertionOrderStatus> items)
{
	this->items = items;
}

std::string
Ssio_insertion_orders_status_get_by_ad_account_200_response::getBookmark()
{
	return bookmark;
}

void
Ssio_insertion_orders_status_get_by_ad_account_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}


