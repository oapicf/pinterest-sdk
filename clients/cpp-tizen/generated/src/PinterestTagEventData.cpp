#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PinterestTagEventData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PinterestTagEventData::PinterestTagEventData()
{
	//__init();
}

PinterestTagEventData::~PinterestTagEventData()
{
	//__cleanup();
}

void
PinterestTagEventData::__init()
{
	//currency = new Currency();
	//lead_type = std::string();
	//line_items = new LineItem();
	//order_id = std::string();
	//order_quantity = int(0);
	//page_name = std::string();
	//promo_code = std::string();
	//property = std::string();
	//search_query = std::string();
	//value = std::string();
	//video_title = std::string();
}

void
PinterestTagEventData::__cleanup()
{
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(lead_type != NULL) {
	//
	//delete lead_type;
	//lead_type = NULL;
	//}
	//if(line_items != NULL) {
	//
	//delete line_items;
	//line_items = NULL;
	//}
	//if(order_id != NULL) {
	//
	//delete order_id;
	//order_id = NULL;
	//}
	//if(order_quantity != NULL) {
	//
	//delete order_quantity;
	//order_quantity = NULL;
	//}
	//if(page_name != NULL) {
	//
	//delete page_name;
	//page_name = NULL;
	//}
	//if(promo_code != NULL) {
	//
	//delete promo_code;
	//promo_code = NULL;
	//}
	//if(property != NULL) {
	//
	//delete property;
	//property = NULL;
	//}
	//if(search_query != NULL) {
	//
	//delete search_query;
	//search_query = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(video_title != NULL) {
	//
	//delete video_title;
	//video_title = NULL;
	//}
	//
}

void
PinterestTagEventData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lead_typeKey = "lead_type";
	node = json_object_get_member(pJsonObject, lead_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lead_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *line_itemsKey = "line_items";
	node = json_object_get_member(pJsonObject, line_itemsKey);
	if (node !=NULL) {
	

		if (isprimitive("LineItem")) {
			jsonToValue(&line_items, node, "LineItem", "LineItem");
		} else {
			
			LineItem* obj = static_cast<LineItem*> (&line_items);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *order_quantityKey = "order_quantity";
	node = json_object_get_member(pJsonObject, order_quantityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order_quantity, node, "int", "");
		} else {
			
		}
	}
	const gchar *page_nameKey = "page_name";
	node = json_object_get_member(pJsonObject, page_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&page_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promo_codeKey = "promo_code";
	node = json_object_get_member(pJsonObject, promo_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promo_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propertyKey = "property";
	node = json_object_get_member(pJsonObject, propertyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&property, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *search_queryKey = "search_query";
	node = json_object_get_member(pJsonObject, search_queryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&search_query, node, "std::string", "");
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
	const gchar *video_titleKey = "video_title";
	node = json_object_get_member(pJsonObject, video_titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_title, node, "std::string", "");
		} else {
			
		}
	}
}

PinterestTagEventData::PinterestTagEventData(char* json)
{
	this->fromJson(json);
}

char*
PinterestTagEventData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Currency")) {
		Currency obj = getCurrency();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLeadType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_typeKey = "lead_type";
	json_object_set_member(pJsonObject, lead_typeKey, node);
	if (isprimitive("LineItem")) {
		LineItem obj = getLineItems();
		node = converttoJson(&obj, "LineItem", "");
	}
	else {
		
		LineItem obj = static_cast<LineItem> (getLineItems());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *line_itemsKey = "line_items";
	json_object_set_member(pJsonObject, line_itemsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_idKey = "order_id";
	json_object_set_member(pJsonObject, order_idKey, node);
	if (isprimitive("int")) {
		int obj = getOrderQuantity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *order_quantityKey = "order_quantity";
	json_object_set_member(pJsonObject, order_quantityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPageName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *page_nameKey = "page_name";
	json_object_set_member(pJsonObject, page_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromoCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promo_codeKey = "promo_code";
	json_object_set_member(pJsonObject, promo_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProperty();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *propertyKey = "property";
	json_object_set_member(pJsonObject, propertyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSearchQuery();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *search_queryKey = "search_query";
	json_object_set_member(pJsonObject, search_queryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_titleKey = "video_title";
	json_object_set_member(pJsonObject, video_titleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Currency
PinterestTagEventData::getCurrency()
{
	return currency;
}

void
PinterestTagEventData::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
PinterestTagEventData::getLeadType()
{
	return lead_type;
}

void
PinterestTagEventData::setLeadType(std::string  lead_type)
{
	this->lead_type = lead_type;
}

LineItem
PinterestTagEventData::getLineItems()
{
	return line_items;
}

void
PinterestTagEventData::setLineItems(LineItem  line_items)
{
	this->line_items = line_items;
}

std::string
PinterestTagEventData::getOrderId()
{
	return order_id;
}

void
PinterestTagEventData::setOrderId(std::string  order_id)
{
	this->order_id = order_id;
}

int
PinterestTagEventData::getOrderQuantity()
{
	return order_quantity;
}

void
PinterestTagEventData::setOrderQuantity(int  order_quantity)
{
	this->order_quantity = order_quantity;
}

std::string
PinterestTagEventData::getPageName()
{
	return page_name;
}

void
PinterestTagEventData::setPageName(std::string  page_name)
{
	this->page_name = page_name;
}

std::string
PinterestTagEventData::getPromoCode()
{
	return promo_code;
}

void
PinterestTagEventData::setPromoCode(std::string  promo_code)
{
	this->promo_code = promo_code;
}

std::string
PinterestTagEventData::getProperty()
{
	return property;
}

void
PinterestTagEventData::setProperty(std::string  property)
{
	this->property = property;
}

std::string
PinterestTagEventData::getSearchQuery()
{
	return search_query;
}

void
PinterestTagEventData::setSearchQuery(std::string  search_query)
{
	this->search_query = search_query;
}

std::string
PinterestTagEventData::getValue()
{
	return value;
}

void
PinterestTagEventData::setValue(std::string  value)
{
	this->value = value;
}

std::string
PinterestTagEventData::getVideoTitle()
{
	return video_title;
}

void
PinterestTagEventData::setVideoTitle(std::string  video_title)
{
	this->video_title = video_title;
}


