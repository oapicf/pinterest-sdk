

#include "EventData.h"

using namespace Tiny;

EventData::EventData()
{
	currency = null;
	lead_type = std::string();
	line_items = null;
	order_id = std::string();
	order_quantity = int(0);
	page_name = std::string();
	promo_code = std::string();
	property = std::string();
	search_query = std::string();
	value = std::string();
	video_title = std::string();
}

EventData::EventData(std::string jsonString)
{
	this->fromJson(jsonString);
}

EventData::~EventData()
{

}

void
EventData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];




        Currency* obj = &currency;
		obj->fromJson(value.dump());

    }

    const char *lead_typeKey = "lead_type";

    if(object.has_key(lead_typeKey))
    {
        bourne::json value = object[lead_typeKey];



        jsonToValue(&lead_type, value, "std::string");


    }

    const char *line_itemsKey = "line_items";

    if(object.has_key(line_itemsKey))
    {
        bourne::json value = object[line_itemsKey];




        LineItem* obj = &line_items;
		obj->fromJson(value.dump());

    }

    const char *order_idKey = "order_id";

    if(object.has_key(order_idKey))
    {
        bourne::json value = object[order_idKey];



        jsonToValue(&order_id, value, "std::string");


    }

    const char *order_quantityKey = "order_quantity";

    if(object.has_key(order_quantityKey))
    {
        bourne::json value = object[order_quantityKey];



        jsonToValue(&order_quantity, value, "int");


    }

    const char *page_nameKey = "page_name";

    if(object.has_key(page_nameKey))
    {
        bourne::json value = object[page_nameKey];



        jsonToValue(&page_name, value, "std::string");


    }

    const char *promo_codeKey = "promo_code";

    if(object.has_key(promo_codeKey))
    {
        bourne::json value = object[promo_codeKey];



        jsonToValue(&promo_code, value, "std::string");


    }

    const char *propertyKey = "property";

    if(object.has_key(propertyKey))
    {
        bourne::json value = object[propertyKey];



        jsonToValue(&property, value, "std::string");


    }

    const char *search_queryKey = "search_query";

    if(object.has_key(search_queryKey))
    {
        bourne::json value = object[search_queryKey];



        jsonToValue(&search_query, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *video_titleKey = "video_title";

    if(object.has_key(video_titleKey))
    {
        bourne::json value = object[video_titleKey];



        jsonToValue(&video_title, value, "std::string");


    }


}

bourne::json
EventData::toJson()
{
    bourne::json object = bourne::json::object();






	object["currency"] = getCurrency().toJson();





    object["lead_type"] = getLeadType();







	object["line_items"] = getLineItems().toJson();





    object["order_id"] = getOrderId();






    object["order_quantity"] = getOrderQuantity();






    object["page_name"] = getPageName();






    object["promo_code"] = getPromoCode();






    object["property"] = getProperty();






    object["search_query"] = getSearchQuery();






    object["value"] = getValue();






    object["video_title"] = getVideoTitle();



    return object;

}

Currency
EventData::getCurrency()
{
	return currency;
}

void
EventData::setCurrency(Currency currency)
{
	this->currency = currency;
}

std::string
EventData::getLeadType()
{
	return lead_type;
}

void
EventData::setLeadType(std::string lead_type)
{
	this->lead_type = lead_type;
}

LineItem
EventData::getLineItems()
{
	return line_items;
}

void
EventData::setLineItems(LineItem line_items)
{
	this->line_items = line_items;
}

std::string
EventData::getOrderId()
{
	return order_id;
}

void
EventData::setOrderId(std::string order_id)
{
	this->order_id = order_id;
}

int
EventData::getOrderQuantity()
{
	return order_quantity;
}

void
EventData::setOrderQuantity(int order_quantity)
{
	this->order_quantity = order_quantity;
}

std::string
EventData::getPageName()
{
	return page_name;
}

void
EventData::setPageName(std::string page_name)
{
	this->page_name = page_name;
}

std::string
EventData::getPromoCode()
{
	return promo_code;
}

void
EventData::setPromoCode(std::string promo_code)
{
	this->promo_code = promo_code;
}

std::string
EventData::getProperty()
{
	return property;
}

void
EventData::setProperty(std::string property)
{
	this->property = property;
}

std::string
EventData::getSearchQuery()
{
	return search_query;
}

void
EventData::setSearchQuery(std::string search_query)
{
	this->search_query = search_query;
}

std::string
EventData::getValue()
{
	return value;
}

void
EventData::setValue(std::string value)
{
	this->value = value;
}

std::string
EventData::getVideoTitle()
{
	return video_title;
}

void
EventData::setVideoTitle(std::string video_title)
{
	this->video_title = video_title;
}



