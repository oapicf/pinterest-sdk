#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsDataItemsCustomData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsDataItemsCustomData::ConversionEventsDataItemsCustomData()
{
	//__init();
}

ConversionEventsDataItemsCustomData::~ConversionEventsDataItemsCustomData()
{
	//__cleanup();
}

void
ConversionEventsDataItemsCustomData::__init()
{
	//content_brand = std::string();
	//content_category = std::string();
	//new std::list()std::list> content_ids;
	//content_name = std::string();
	//new std::list()std::list> contents;
	//currency = std::string();
	//external_measurement_id = std::string();
	//external_measurement_vendor_id = int(0);
	//np = std::string();
	//num_items = long(0);
	//opt_out_type = std::string();
	//order_id = std::string();
	//predicted_ltv = std::string();
	//search_string = std::string();
	//value = std::string();
}

void
ConversionEventsDataItemsCustomData::__cleanup()
{
	//if(content_brand != NULL) {
	//
	//delete content_brand;
	//content_brand = NULL;
	//}
	//if(content_category != NULL) {
	//
	//delete content_category;
	//content_category = NULL;
	//}
	//if(content_ids != NULL) {
	//content_ids.RemoveAll(true);
	//delete content_ids;
	//content_ids = NULL;
	//}
	//if(content_name != NULL) {
	//
	//delete content_name;
	//content_name = NULL;
	//}
	//if(contents != NULL) {
	//contents.RemoveAll(true);
	//delete contents;
	//contents = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(external_measurement_id != NULL) {
	//
	//delete external_measurement_id;
	//external_measurement_id = NULL;
	//}
	//if(external_measurement_vendor_id != NULL) {
	//
	//delete external_measurement_vendor_id;
	//external_measurement_vendor_id = NULL;
	//}
	//if(np != NULL) {
	//
	//delete np;
	//np = NULL;
	//}
	//if(num_items != NULL) {
	//
	//delete num_items;
	//num_items = NULL;
	//}
	//if(opt_out_type != NULL) {
	//
	//delete opt_out_type;
	//opt_out_type = NULL;
	//}
	//if(order_id != NULL) {
	//
	//delete order_id;
	//order_id = NULL;
	//}
	//if(predicted_ltv != NULL) {
	//
	//delete predicted_ltv;
	//predicted_ltv = NULL;
	//}
	//if(search_string != NULL) {
	//
	//delete search_string;
	//search_string = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
ConversionEventsDataItemsCustomData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *content_brandKey = "content_brand";
	node = json_object_get_member(pJsonObject, content_brandKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_brand, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *content_categoryKey = "content_category";
	node = json_object_get_member(pJsonObject, content_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_category, node, "std::string", "");
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
	const gchar *content_nameKey = "content_name";
	node = json_object_get_member(pJsonObject, content_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&content_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentsKey = "contents";
	node = json_object_get_member(pJsonObject, contentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionEventsDataItemsCustomDataContentsItems> new_list;
			ConversionEventsDataItemsCustomDataContentsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionEventsDataItemsCustomDataContentsItems")) {
					jsonToValue(&inst, temp_json, "ConversionEventsDataItemsCustomDataContentsItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			contents = new_list;
		}
		
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *external_measurement_idKey = "external_measurement_id";
	node = json_object_get_member(pJsonObject, external_measurement_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&external_measurement_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *external_measurement_vendor_idKey = "external_measurement_vendor_id";
	node = json_object_get_member(pJsonObject, external_measurement_vendor_idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&external_measurement_vendor_id, node, "int", "");
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
	const gchar *num_itemsKey = "num_items";
	node = json_object_get_member(pJsonObject, num_itemsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&num_items, node, "long long", "");
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
	const gchar *order_idKey = "order_id";
	node = json_object_get_member(pJsonObject, order_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *predicted_ltvKey = "predicted_ltv";
	node = json_object_get_member(pJsonObject, predicted_ltvKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&predicted_ltv, node, "std::string", "");
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&value, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEventsDataItemsCustomData::ConversionEventsDataItemsCustomData(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsDataItemsCustomData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getContentBrand();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_brandKey = "content_brand";
	json_object_set_member(pJsonObject, content_brandKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContentCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_categoryKey = "content_category";
	json_object_set_member(pJsonObject, content_categoryKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getContentName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *content_nameKey = "content_name";
	json_object_set_member(pJsonObject, content_nameKey, node);
	if (isprimitive("ConversionEventsDataItemsCustomDataContentsItems")) {
		list<ConversionEventsDataItemsCustomDataContentsItems> new_list = static_cast<list <ConversionEventsDataItemsCustomDataContentsItems> > (getContents());
		node = converttoJson(&new_list, "ConversionEventsDataItemsCustomDataContentsItems", "array");
	} else {
		node = json_node_alloc();
		list<ConversionEventsDataItemsCustomDataContentsItems> new_list = static_cast<list <ConversionEventsDataItemsCustomDataContentsItems> > (getContents());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionEventsDataItemsCustomDataContentsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionEventsDataItemsCustomDataContentsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentsKey = "contents";
	json_object_set_member(pJsonObject, contentsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalMeasurementId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *external_measurement_idKey = "external_measurement_id";
	json_object_set_member(pJsonObject, external_measurement_idKey, node);
	if (isprimitive("int")) {
		int obj = getExternalMeasurementVendorId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *external_measurement_vendor_idKey = "external_measurement_vendor_id";
	json_object_set_member(pJsonObject, external_measurement_vendor_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *npKey = "np";
	json_object_set_member(pJsonObject, npKey, node);
	if (isprimitive("long long")) {
		long long obj = getNumItems();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *num_itemsKey = "num_items";
	json_object_set_member(pJsonObject, num_itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOptOutType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *opt_out_typeKey = "opt_out_type";
	json_object_set_member(pJsonObject, opt_out_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_idKey = "order_id";
	json_object_set_member(pJsonObject, order_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPredictedLtv();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *predicted_ltvKey = "predicted_ltv";
	json_object_set_member(pJsonObject, predicted_ltvKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSearchString();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *search_stringKey = "search_string";
	json_object_set_member(pJsonObject, search_stringKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionEventsDataItemsCustomData::getContentBrand()
{
	return content_brand;
}

void
ConversionEventsDataItemsCustomData::setContentBrand(std::string  content_brand)
{
	this->content_brand = content_brand;
}

std::string
ConversionEventsDataItemsCustomData::getContentCategory()
{
	return content_category;
}

void
ConversionEventsDataItemsCustomData::setContentCategory(std::string  content_category)
{
	this->content_category = content_category;
}

std::list<std::string>
ConversionEventsDataItemsCustomData::getContentIds()
{
	return content_ids;
}

void
ConversionEventsDataItemsCustomData::setContentIds(std::list <std::string> content_ids)
{
	this->content_ids = content_ids;
}

std::string
ConversionEventsDataItemsCustomData::getContentName()
{
	return content_name;
}

void
ConversionEventsDataItemsCustomData::setContentName(std::string  content_name)
{
	this->content_name = content_name;
}

std::list<ConversionEventsDataItemsCustomDataContentsItems>
ConversionEventsDataItemsCustomData::getContents()
{
	return contents;
}

void
ConversionEventsDataItemsCustomData::setContents(std::list <ConversionEventsDataItemsCustomDataContentsItems> contents)
{
	this->contents = contents;
}

std::string
ConversionEventsDataItemsCustomData::getCurrency()
{
	return currency;
}

void
ConversionEventsDataItemsCustomData::setCurrency(std::string  currency)
{
	this->currency = currency;
}

std::string
ConversionEventsDataItemsCustomData::getExternalMeasurementId()
{
	return external_measurement_id;
}

void
ConversionEventsDataItemsCustomData::setExternalMeasurementId(std::string  external_measurement_id)
{
	this->external_measurement_id = external_measurement_id;
}

int
ConversionEventsDataItemsCustomData::getExternalMeasurementVendorId()
{
	return external_measurement_vendor_id;
}

void
ConversionEventsDataItemsCustomData::setExternalMeasurementVendorId(int  external_measurement_vendor_id)
{
	this->external_measurement_vendor_id = external_measurement_vendor_id;
}

std::string
ConversionEventsDataItemsCustomData::getNp()
{
	return np;
}

void
ConversionEventsDataItemsCustomData::setNp(std::string  np)
{
	this->np = np;
}

long long
ConversionEventsDataItemsCustomData::getNumItems()
{
	return num_items;
}

void
ConversionEventsDataItemsCustomData::setNumItems(long long  num_items)
{
	this->num_items = num_items;
}

std::string
ConversionEventsDataItemsCustomData::getOptOutType()
{
	return opt_out_type;
}

void
ConversionEventsDataItemsCustomData::setOptOutType(std::string  opt_out_type)
{
	this->opt_out_type = opt_out_type;
}

std::string
ConversionEventsDataItemsCustomData::getOrderId()
{
	return order_id;
}

void
ConversionEventsDataItemsCustomData::setOrderId(std::string  order_id)
{
	this->order_id = order_id;
}

std::string
ConversionEventsDataItemsCustomData::getPredictedLtv()
{
	return predicted_ltv;
}

void
ConversionEventsDataItemsCustomData::setPredictedLtv(std::string  predicted_ltv)
{
	this->predicted_ltv = predicted_ltv;
}

std::string
ConversionEventsDataItemsCustomData::getSearchString()
{
	return search_string;
}

void
ConversionEventsDataItemsCustomData::setSearchString(std::string  search_string)
{
	this->search_string = search_string;
}

std::string
ConversionEventsDataItemsCustomData::getValue()
{
	return value;
}

void
ConversionEventsDataItemsCustomData::setValue(std::string  value)
{
	this->value = value;
}


