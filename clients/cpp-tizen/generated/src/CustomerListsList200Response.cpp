#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Customer_lists_list_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Customer_lists_list_200_response::Customer_lists_list_200_response()
{
	//__init();
}

Customer_lists_list_200_response::~Customer_lists_list_200_response()
{
	//__cleanup();
}

void
Customer_lists_list_200_response::__init()
{
	//new std::list()std::list> items;
	//bookmark = std::string();
}

void
Customer_lists_list_200_response::__cleanup()
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
Customer_lists_list_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemsKey = "items";
	node = json_object_get_member(pJsonObject, itemsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CustomerList> new_list;
			CustomerList inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CustomerList")) {
					jsonToValue(&inst, temp_json, "CustomerList", "");
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

Customer_lists_list_200_response::Customer_lists_list_200_response(char* json)
{
	this->fromJson(json);
}

char*
Customer_lists_list_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CustomerList")) {
		list<CustomerList> new_list = static_cast<list <CustomerList> > (getItems());
		node = converttoJson(&new_list, "CustomerList", "array");
	} else {
		node = json_node_alloc();
		list<CustomerList> new_list = static_cast<list <CustomerList> > (getItems());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CustomerList>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CustomerList obj = *it;
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

std::list<CustomerList>
Customer_lists_list_200_response::getItems()
{
	return items;
}

void
Customer_lists_list_200_response::setItems(std::list <CustomerList> items)
{
	this->items = items;
}

std::string
Customer_lists_list_200_response::getBookmark()
{
	return bookmark;
}

void
Customer_lists_list_200_response::setBookmark(std::string  bookmark)
{
	this->bookmark = bookmark;
}


