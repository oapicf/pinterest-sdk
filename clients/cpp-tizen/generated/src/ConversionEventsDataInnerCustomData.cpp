#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEvents_data_inner_custom_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEvents_data_inner_custom_data::ConversionEvents_data_inner_custom_data()
{
	//__init();
}

ConversionEvents_data_inner_custom_data::~ConversionEvents_data_inner_custom_data()
{
	//__cleanup();
}

void
ConversionEvents_data_inner_custom_data::__init()
{
	//currency = std::string();
	//value = std::string();
	//new std::list()std::list> content_ids;
	//new std::list()std::list> contents;
	//num_items = long(0);
	//order_id = std::string();
	//search_string = std::string();
	//opt_out_type = std::string();
	//np = std::string();
}

void
ConversionEvents_data_inner_custom_data::__cleanup()
{
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(content_ids != NULL) {
	//content_ids.RemoveAll(true);
	//delete content_ids;
	//content_ids = NULL;
	//}
	//if(contents != NULL) {
	//contents.RemoveAll(true);
	//delete contents;
	//contents = NULL;
	//}
	//if(num_items != NULL) {
	//
	//delete num_items;
	//num_items = NULL;
	//}
	//if(order_id != NULL) {
	//
	//delete order_id;
	//order_id = NULL;
	//}
	//if(search_string != NULL) {
	//
	//delete search_string;
	//search_string = NULL;
	//}
	//if(opt_out_type != NULL) {
	//
	//delete opt_out_type;
	//opt_out_type = NULL;
	//}
	//if(np != NULL) {
	//
	//delete np;
	//np = NULL;
	//}
	//
}

void
ConversionEvents_data_inner_custom_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *content_idsKey = "content_ids";
	node = json_object_get_member(pJsonObject, content_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			content_ids = new_list;
		}
		
	}
	const gchar *contentsKey = "contents";
	node = json_object_get_member(pJsonObject, contentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionEvents_data_inner_custom_data_contents_inner> new_list;
			ConversionEvents_data_inner_custom_data_contents_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionEvents_data_inner_custom_data_contents_inner")) {
					jsonToValue(&inst, temp_json, "ConversionEvents_data_inner_custom_data_contents_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			contents = new_list;
		}
		
	}
	const gchar *num_itemsKey = "num_items";
	node = json_object_get_member(pJsonObject, num_itemsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&num_items, node, "long long", "");
		} else {
			
		}
	}
	const gchar *order_idKey = "order_id";
	node = json_object_get_member(pJsonObject, order_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *search_stringKey = "search_string";
	node = json_object_get_member(pJsonObject, search_stringKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&search_string, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *opt_out_typeKey = "opt_out_type";
	node = json_object_get_member(pJsonObject, opt_out_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&opt_out_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *npKey = "np";
	node = json_object_get_member(pJsonObject, npKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&np, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEvents_data_inner_custom_data::ConversionEvents_data_inner_custom_data(char* json)
{
	this->fromJson(json);
}

char*
ConversionEvents_data_inner_custom_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getContentIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getContentIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *content_idsKey = "content_ids";
	json_object_set_member(pJsonObject, content_idsKey, node);
	if (isprimitive("ConversionEvents_data_inner_custom_data_contents_inner")) {
		list<ConversionEvents_data_inner_custom_data_contents_inner> new_list = static_cast<list <ConversionEvents_data_inner_custom_data_contents_inner> > (getContents());
		node = converttoJson(&new_list, "ConversionEvents_data_inner_custom_data_contents_inner", "array");
	} else {
		node = json_node_alloc();
		list<ConversionEvents_data_inner_custom_data_contents_inner> new_list = static_cast<list <ConversionEvents_data_inner_custom_data_contents_inner> > (getContents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionEvents_data_inner_custom_data_contents_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionEvents_data_inner_custom_data_contents_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentsKey = "contents";
	json_object_set_member(pJsonObject, contentsKey, node);
	if (isprimitive("long long")) {
		long long obj = getNumItems();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *num_itemsKey = "num_items";
	json_object_set_member(pJsonObject, num_itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_idKey = "order_id";
	json_object_set_member(pJsonObject, order_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSearchString();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *search_stringKey = "search_string";
	json_object_set_member(pJsonObject, search_stringKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOptOutType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *opt_out_typeKey = "opt_out_type";
	json_object_set_member(pJsonObject, opt_out_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *npKey = "np";
	json_object_set_member(pJsonObject, npKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionEvents_data_inner_custom_data::getCurrency()
{
	return currency;
}

void
ConversionEvents_data_inner_custom_data::setCurrency(std::string  currency)
{
	this->currency = currency;
}

std::string
ConversionEvents_data_inner_custom_data::getValue()
{
	return value;
}

void
ConversionEvents_data_inner_custom_data::setValue(std::string  value)
{
	this->value = value;
}

std::list<std::string>
ConversionEvents_data_inner_custom_data::getContentIds()
{
	return content_ids;
}

void
ConversionEvents_data_inner_custom_data::setContentIds(std::list <std::string> content_ids)
{
	this->content_ids = content_ids;
}

std::list<ConversionEvents_data_inner_custom_data_contents_inner>
ConversionEvents_data_inner_custom_data::getContents()
{
	return contents;
}

void
ConversionEvents_data_inner_custom_data::setContents(std::list <ConversionEvents_data_inner_custom_data_contents_inner> contents)
{
	this->contents = contents;
}

long long
ConversionEvents_data_inner_custom_data::getNumItems()
{
	return num_items;
}

void
ConversionEvents_data_inner_custom_data::setNumItems(long long  num_items)
{
	this->num_items = num_items;
}

std::string
ConversionEvents_data_inner_custom_data::getOrderId()
{
	return order_id;
}

void
ConversionEvents_data_inner_custom_data::setOrderId(std::string  order_id)
{
	this->order_id = order_id;
}

std::string
ConversionEvents_data_inner_custom_data::getSearchString()
{
	return search_string;
}

void
ConversionEvents_data_inner_custom_data::setSearchString(std::string  search_string)
{
	this->search_string = search_string;
}

std::string
ConversionEvents_data_inner_custom_data::getOptOutType()
{
	return opt_out_type;
}

void
ConversionEvents_data_inner_custom_data::setOptOutType(std::string  opt_out_type)
{
	this->opt_out_type = opt_out_type;
}

std::string
ConversionEvents_data_inner_custom_data::getNp()
{
	return np;
}

void
ConversionEvents_data_inner_custom_data::setNp(std::string  np)
{
	this->np = np;
}


