

#include "ConversionEvents_data_inner_custom_data.h"

using namespace Tiny;

ConversionEvents_data_inner_custom_data::ConversionEvents_data_inner_custom_data()
{
	content_brand = std::string();
	content_category = std::string();
	content_ids = std::list<std::string>();
	content_name = std::string();
	contents = std::list<ConversionEvents_data_inner_custom_data_contents_inner>();
	currency = std::string();
	external_measurement_id = std::string();
	external_measurement_vendor_id = int(0);
	np = std::string();
	num_items = long(0);
	opt_out_type = std::string();
	order_id = std::string();
	predicted_ltv = std::string();
	search_string = std::string();
	value = std::string();
}

ConversionEvents_data_inner_custom_data::ConversionEvents_data_inner_custom_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEvents_data_inner_custom_data::~ConversionEvents_data_inner_custom_data()
{

}

void
ConversionEvents_data_inner_custom_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *content_brandKey = "content_brand";

    if(object.has_key(content_brandKey))
    {
        bourne::json value = object[content_brandKey];



        jsonToValue(&content_brand, value, "std::string");


    }

    const char *content_categoryKey = "content_category";

    if(object.has_key(content_categoryKey))
    {
        bourne::json value = object[content_categoryKey];



        jsonToValue(&content_category, value, "std::string");


    }

    const char *content_idsKey = "content_ids";

    if(object.has_key(content_idsKey))
    {
        bourne::json value = object[content_idsKey];


        std::list<std::string> content_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            content_ids_list.push_back(element);
        }
        content_ids = content_ids_list;


    }

    const char *content_nameKey = "content_name";

    if(object.has_key(content_nameKey))
    {
        bourne::json value = object[content_nameKey];



        jsonToValue(&content_name, value, "std::string");


    }

    const char *contentsKey = "contents";

    if(object.has_key(contentsKey))
    {
        bourne::json value = object[contentsKey];


        std::list<ConversionEvents_data_inner_custom_data_contents_inner> contents_list;
        ConversionEvents_data_inner_custom_data_contents_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            contents_list.push_back(element);
        }
        contents = contents_list;


    }

    const char *currencyKey = "currency";

    if(object.has_key(currencyKey))
    {
        bourne::json value = object[currencyKey];



        jsonToValue(&currency, value, "std::string");


    }

    const char *external_measurement_idKey = "external_measurement_id";

    if(object.has_key(external_measurement_idKey))
    {
        bourne::json value = object[external_measurement_idKey];



        jsonToValue(&external_measurement_id, value, "std::string");


    }

    const char *external_measurement_vendor_idKey = "external_measurement_vendor_id";

    if(object.has_key(external_measurement_vendor_idKey))
    {
        bourne::json value = object[external_measurement_vendor_idKey];



        jsonToValue(&external_measurement_vendor_id, value, "int");


    }

    const char *npKey = "np";

    if(object.has_key(npKey))
    {
        bourne::json value = object[npKey];



        jsonToValue(&np, value, "std::string");


    }

    const char *num_itemsKey = "num_items";

    if(object.has_key(num_itemsKey))
    {
        bourne::json value = object[num_itemsKey];



        jsonToValue(&num_items, value, "long");


    }

    const char *opt_out_typeKey = "opt_out_type";

    if(object.has_key(opt_out_typeKey))
    {
        bourne::json value = object[opt_out_typeKey];



        jsonToValue(&opt_out_type, value, "std::string");


    }

    const char *order_idKey = "order_id";

    if(object.has_key(order_idKey))
    {
        bourne::json value = object[order_idKey];



        jsonToValue(&order_id, value, "std::string");


    }

    const char *predicted_ltvKey = "predicted_ltv";

    if(object.has_key(predicted_ltvKey))
    {
        bourne::json value = object[predicted_ltvKey];



        jsonToValue(&predicted_ltv, value, "std::string");


    }

    const char *search_stringKey = "search_string";

    if(object.has_key(search_stringKey))
    {
        bourne::json value = object[search_stringKey];



        jsonToValue(&search_string, value, "std::string");


    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
ConversionEvents_data_inner_custom_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["content_brand"] = getContentBrand();






    object["content_category"] = getContentCategory();





    std::list<std::string> content_ids_list = getContentIds();
    bourne::json content_ids_arr = bourne::json::array();

    for(auto& var : content_ids_list)
    {
        content_ids_arr.append(var);
    }
    object["content_ids"] = content_ids_arr;









    object["content_name"] = getContentName();





    std::list<ConversionEvents_data_inner_custom_data_contents_inner> contents_list = getContents();
    bourne::json contents_arr = bourne::json::array();

    for(auto& var : contents_list)
    {
        ConversionEvents_data_inner_custom_data_contents_inner obj = var;
        contents_arr.append(obj.toJson());
    }
    object["contents"] = contents_arr;







    object["currency"] = getCurrency();






    object["external_measurement_id"] = getExternalMeasurementId();






    object["external_measurement_vendor_id"] = getExternalMeasurementVendorId();






    object["np"] = getNp();






    object["num_items"] = getNumItems();






    object["opt_out_type"] = getOptOutType();






    object["order_id"] = getOrderId();






    object["predicted_ltv"] = getPredictedLtv();






    object["search_string"] = getSearchString();






    object["value"] = getValue();



    return object;

}

std::string
ConversionEvents_data_inner_custom_data::getContentBrand()
{
	return content_brand;
}

void
ConversionEvents_data_inner_custom_data::setContentBrand(std::string  content_brand)
{
	this->content_brand = content_brand;
}

std::string
ConversionEvents_data_inner_custom_data::getContentCategory()
{
	return content_category;
}

void
ConversionEvents_data_inner_custom_data::setContentCategory(std::string  content_category)
{
	this->content_category = content_category;
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

std::string
ConversionEvents_data_inner_custom_data::getContentName()
{
	return content_name;
}

void
ConversionEvents_data_inner_custom_data::setContentName(std::string  content_name)
{
	this->content_name = content_name;
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
ConversionEvents_data_inner_custom_data::getExternalMeasurementId()
{
	return external_measurement_id;
}

void
ConversionEvents_data_inner_custom_data::setExternalMeasurementId(std::string  external_measurement_id)
{
	this->external_measurement_id = external_measurement_id;
}

int
ConversionEvents_data_inner_custom_data::getExternalMeasurementVendorId()
{
	return external_measurement_vendor_id;
}

void
ConversionEvents_data_inner_custom_data::setExternalMeasurementVendorId(int  external_measurement_vendor_id)
{
	this->external_measurement_vendor_id = external_measurement_vendor_id;
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

long
ConversionEvents_data_inner_custom_data::getNumItems()
{
	return num_items;
}

void
ConversionEvents_data_inner_custom_data::setNumItems(long  num_items)
{
	this->num_items = num_items;
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
ConversionEvents_data_inner_custom_data::getPredictedLtv()
{
	return predicted_ltv;
}

void
ConversionEvents_data_inner_custom_data::setPredictedLtv(std::string  predicted_ltv)
{
	this->predicted_ltv = predicted_ltv;
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
ConversionEvents_data_inner_custom_data::getValue()
{
	return value;
}

void
ConversionEvents_data_inner_custom_data::setValue(std::string  value)
{
	this->value = value;
}



