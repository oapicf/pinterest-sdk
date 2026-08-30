

#include "LineItem.h"

using namespace Tiny;

LineItem::LineItem()
{
	product_brand = std::string();
	product_category = std::string();
	product_id = int(0);
	product_name = std::string();
	product_price = std::string();
	product_quantity = int(0);
	product_variant = std::string();
	product_variant_id = std::string();
}

LineItem::LineItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

LineItem::~LineItem()
{

}

void
LineItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *product_brandKey = "product_brand";

    if(object.has_key(product_brandKey))
    {
        bourne::json value = object[product_brandKey];



        jsonToValue(&product_brand, value, "std::string");


    }

    const char *product_categoryKey = "product_category";

    if(object.has_key(product_categoryKey))
    {
        bourne::json value = object[product_categoryKey];



        jsonToValue(&product_category, value, "std::string");


    }

    const char *product_idKey = "product_id";

    if(object.has_key(product_idKey))
    {
        bourne::json value = object[product_idKey];



        jsonToValue(&product_id, value, "int");


    }

    const char *product_nameKey = "product_name";

    if(object.has_key(product_nameKey))
    {
        bourne::json value = object[product_nameKey];



        jsonToValue(&product_name, value, "std::string");


    }

    const char *product_priceKey = "product_price";

    if(object.has_key(product_priceKey))
    {
        bourne::json value = object[product_priceKey];



        jsonToValue(&product_price, value, "std::string");


    }

    const char *product_quantityKey = "product_quantity";

    if(object.has_key(product_quantityKey))
    {
        bourne::json value = object[product_quantityKey];



        jsonToValue(&product_quantity, value, "int");


    }

    const char *product_variantKey = "product_variant";

    if(object.has_key(product_variantKey))
    {
        bourne::json value = object[product_variantKey];



        jsonToValue(&product_variant, value, "std::string");


    }

    const char *product_variant_idKey = "product_variant_id";

    if(object.has_key(product_variant_idKey))
    {
        bourne::json value = object[product_variant_idKey];



        jsonToValue(&product_variant_id, value, "std::string");


    }


}

bourne::json
LineItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["product_brand"] = getProductBrand();






    object["product_category"] = getProductCategory();






    object["product_id"] = getProductId();






    object["product_name"] = getProductName();






    object["product_price"] = getProductPrice();






    object["product_quantity"] = getProductQuantity();






    object["product_variant"] = getProductVariant();






    object["product_variant_id"] = getProductVariantId();



    return object;

}

std::string
LineItem::getProductBrand()
{
	return product_brand;
}

void
LineItem::setProductBrand(std::string product_brand)
{
	this->product_brand = product_brand;
}

std::string
LineItem::getProductCategory()
{
	return product_category;
}

void
LineItem::setProductCategory(std::string product_category)
{
	this->product_category = product_category;
}

int
LineItem::getProductId()
{
	return product_id;
}

void
LineItem::setProductId(int product_id)
{
	this->product_id = product_id;
}

std::string
LineItem::getProductName()
{
	return product_name;
}

void
LineItem::setProductName(std::string product_name)
{
	this->product_name = product_name;
}

std::string
LineItem::getProductPrice()
{
	return product_price;
}

void
LineItem::setProductPrice(std::string product_price)
{
	this->product_price = product_price;
}

int
LineItem::getProductQuantity()
{
	return product_quantity;
}

void
LineItem::setProductQuantity(int product_quantity)
{
	this->product_quantity = product_quantity;
}

std::string
LineItem::getProductVariant()
{
	return product_variant;
}

void
LineItem::setProductVariant(std::string product_variant)
{
	this->product_variant = product_variant;
}

std::string
LineItem::getProductVariantId()
{
	return product_variant_id;
}

void
LineItem::setProductVariantId(std::string product_variant_id)
{
	this->product_variant_id = product_variant_id;
}



