

#include "CartingProduct.h"

using namespace Tiny;

CartingProduct::CartingProduct()
{
	carting_product_id = std::string();
	display_preferred_retailers_only = bool(false);
	display_product_price = bool(false);
	preferred_retailers = std::list<CartingRetailer>();
	randomize_preferred_retailers = bool(false);
}

CartingProduct::CartingProduct(std::string jsonString)
{
	this->fromJson(jsonString);
}

CartingProduct::~CartingProduct()
{

}

void
CartingProduct::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *carting_product_idKey = "carting_product_id";

    if(object.has_key(carting_product_idKey))
    {
        bourne::json value = object[carting_product_idKey];



        jsonToValue(&carting_product_id, value, "std::string");


    }

    const char *display_preferred_retailers_onlyKey = "display_preferred_retailers_only";

    if(object.has_key(display_preferred_retailers_onlyKey))
    {
        bourne::json value = object[display_preferred_retailers_onlyKey];



        jsonToValue(&display_preferred_retailers_only, value, "bool");


    }

    const char *display_product_priceKey = "display_product_price";

    if(object.has_key(display_product_priceKey))
    {
        bourne::json value = object[display_product_priceKey];



        jsonToValue(&display_product_price, value, "bool");


    }

    const char *preferred_retailersKey = "preferred_retailers";

    if(object.has_key(preferred_retailersKey))
    {
        bourne::json value = object[preferred_retailersKey];


        std::list<CartingRetailer> preferred_retailers_list;
        CartingRetailer element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            preferred_retailers_list.push_back(element);
        }
        preferred_retailers = preferred_retailers_list;


    }

    const char *randomize_preferred_retailersKey = "randomize_preferred_retailers";

    if(object.has_key(randomize_preferred_retailersKey))
    {
        bourne::json value = object[randomize_preferred_retailersKey];



        jsonToValue(&randomize_preferred_retailers, value, "bool");


    }


}

bourne::json
CartingProduct::toJson()
{
    bourne::json object = bourne::json::object();





    object["carting_product_id"] = getCartingProductId();






    object["display_preferred_retailers_only"] = isDisplayPreferredRetailersOnly();






    object["display_product_price"] = isDisplayProductPrice();





    std::list<CartingRetailer> preferred_retailers_list = getPreferredRetailers();
    bourne::json preferred_retailers_arr = bourne::json::array();

    for(auto& var : preferred_retailers_list)
    {
        CartingRetailer obj = var;
        preferred_retailers_arr.append(obj.toJson());
    }
    object["preferred_retailers"] = preferred_retailers_arr;







    object["randomize_preferred_retailers"] = isRandomizePreferredRetailers();



    return object;

}

std::string
CartingProduct::getCartingProductId()
{
	return carting_product_id;
}

void
CartingProduct::setCartingProductId(std::string carting_product_id)
{
	this->carting_product_id = carting_product_id;
}

bool
CartingProduct::isDisplayPreferredRetailersOnly()
{
	return display_preferred_retailers_only;
}

void
CartingProduct::setDisplayPreferredRetailersOnly(bool display_preferred_retailers_only)
{
	this->display_preferred_retailers_only = display_preferred_retailers_only;
}

bool
CartingProduct::isDisplayProductPrice()
{
	return display_product_price;
}

void
CartingProduct::setDisplayProductPrice(bool display_product_price)
{
	this->display_product_price = display_product_price;
}

std::list<CartingRetailer>
CartingProduct::getPreferredRetailers()
{
	return preferred_retailers;
}

void
CartingProduct::setPreferredRetailers(std::list<CartingRetailer> preferred_retailers)
{
	this->preferred_retailers = preferred_retailers;
}

bool
CartingProduct::isRandomizePreferredRetailers()
{
	return randomize_preferred_retailers;
}

void
CartingProduct::setRandomizePreferredRetailers(bool randomize_preferred_retailers)
{
	this->randomize_preferred_retailers = randomize_preferred_retailers;
}



