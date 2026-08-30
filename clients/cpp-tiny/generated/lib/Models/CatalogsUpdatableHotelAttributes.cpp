

#include "CatalogsUpdatableHotelAttributes.h"

using namespace Tiny;

CatalogsUpdatableHotelAttributes::CatalogsUpdatableHotelAttributes()
{
	address = null;
	base_price = std::string();
	brand = std::string();
	category = std::string();
	custom_label_0 = std::string();
	custom_label_1 = std::string();
	custom_label_2 = std::string();
	custom_label_3 = std::string();
	custom_label_4 = std::string();
	description = std::string();
	guest_ratings = null;
	latitude = float(0);
	link = std::string();
	longitude = float(0);
	name = std::string();
	neighborhood = std::list<std::string>();
	sale_price = std::string();
}

CatalogsUpdatableHotelAttributes::CatalogsUpdatableHotelAttributes(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpdatableHotelAttributes::~CatalogsUpdatableHotelAttributes()
{

}

void
CatalogsUpdatableHotelAttributes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *addressKey = "address";

    if(object.has_key(addressKey))
    {
        bourne::json value = object[addressKey];




        CatalogsHotelAddress* obj = &address;
		obj->fromJson(value.dump());

    }

    const char *base_priceKey = "base_price";

    if(object.has_key(base_priceKey))
    {
        bourne::json value = object[base_priceKey];



        jsonToValue(&base_price, value, "std::string");


    }

    const char *brandKey = "brand";

    if(object.has_key(brandKey))
    {
        bourne::json value = object[brandKey];



        jsonToValue(&brand, value, "std::string");


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];



        jsonToValue(&category, value, "std::string");


    }

    const char *custom_label_0Key = "custom_label_0";

    if(object.has_key(custom_label_0Key))
    {
        bourne::json value = object[custom_label_0Key];



        jsonToValue(&custom_label_0, value, "std::string");


    }

    const char *custom_label_1Key = "custom_label_1";

    if(object.has_key(custom_label_1Key))
    {
        bourne::json value = object[custom_label_1Key];



        jsonToValue(&custom_label_1, value, "std::string");


    }

    const char *custom_label_2Key = "custom_label_2";

    if(object.has_key(custom_label_2Key))
    {
        bourne::json value = object[custom_label_2Key];



        jsonToValue(&custom_label_2, value, "std::string");


    }

    const char *custom_label_3Key = "custom_label_3";

    if(object.has_key(custom_label_3Key))
    {
        bourne::json value = object[custom_label_3Key];



        jsonToValue(&custom_label_3, value, "std::string");


    }

    const char *custom_label_4Key = "custom_label_4";

    if(object.has_key(custom_label_4Key))
    {
        bourne::json value = object[custom_label_4Key];



        jsonToValue(&custom_label_4, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *guest_ratingsKey = "guest_ratings";

    if(object.has_key(guest_ratingsKey))
    {
        bourne::json value = object[guest_ratingsKey];




        CatalogsHotelGuestRatings* obj = &guest_ratings;
		obj->fromJson(value.dump());

    }

    const char *latitudeKey = "latitude";

    if(object.has_key(latitudeKey))
    {
        bourne::json value = object[latitudeKey];



        jsonToValue(&latitude, value, "long");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *longitudeKey = "longitude";

    if(object.has_key(longitudeKey))
    {
        bourne::json value = object[longitudeKey];



        jsonToValue(&longitude, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *neighborhoodKey = "neighborhood";

    if(object.has_key(neighborhoodKey))
    {
        bourne::json value = object[neighborhoodKey];


        std::list<std::string> neighborhood_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            neighborhood_list.push_back(element);
        }
        neighborhood = neighborhood_list;


    }

    const char *sale_priceKey = "sale_price";

    if(object.has_key(sale_priceKey))
    {
        bourne::json value = object[sale_priceKey];



        jsonToValue(&sale_price, value, "std::string");


    }


}

bourne::json
CatalogsUpdatableHotelAttributes::toJson()
{
    bourne::json object = bourne::json::object();






	object["address"] = getAddress().toJson();





    object["base_price"] = getBasePrice();






    object["brand"] = getBrand();






    object["category"] = getCategory();






    object["custom_label_0"] = getCustomLabel0();






    object["custom_label_1"] = getCustomLabel1();






    object["custom_label_2"] = getCustomLabel2();






    object["custom_label_3"] = getCustomLabel3();






    object["custom_label_4"] = getCustomLabel4();






    object["description"] = getDescription();







	object["guest_ratings"] = getGuestRatings().toJson();





    object["latitude"] = getLatitude();






    object["link"] = getLink();






    object["longitude"] = getLongitude();






    object["name"] = getName();





    std::list<std::string> neighborhood_list = getNeighborhood();
    bourne::json neighborhood_arr = bourne::json::array();

    for(auto& var : neighborhood_list)
    {
        neighborhood_arr.append(var);
    }
    object["neighborhood"] = neighborhood_arr;









    object["sale_price"] = getSalePrice();



    return object;

}

CatalogsHotelAddress
CatalogsUpdatableHotelAttributes::getAddress()
{
	return address;
}

void
CatalogsUpdatableHotelAttributes::setAddress(CatalogsHotelAddress address)
{
	this->address = address;
}

std::string
CatalogsUpdatableHotelAttributes::getBasePrice()
{
	return base_price;
}

void
CatalogsUpdatableHotelAttributes::setBasePrice(std::string base_price)
{
	this->base_price = base_price;
}

std::string
CatalogsUpdatableHotelAttributes::getBrand()
{
	return brand;
}

void
CatalogsUpdatableHotelAttributes::setBrand(std::string brand)
{
	this->brand = brand;
}

std::string
CatalogsUpdatableHotelAttributes::getCategory()
{
	return category;
}

void
CatalogsUpdatableHotelAttributes::setCategory(std::string category)
{
	this->category = category;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel0(std::string custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel1(std::string custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel2(std::string custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel3(std::string custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsUpdatableHotelAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsUpdatableHotelAttributes::setCustomLabel4(std::string custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsUpdatableHotelAttributes::getDescription()
{
	return description;
}

void
CatalogsUpdatableHotelAttributes::setDescription(std::string description)
{
	this->description = description;
}

CatalogsHotelGuestRatings
CatalogsUpdatableHotelAttributes::getGuestRatings()
{
	return guest_ratings;
}

void
CatalogsUpdatableHotelAttributes::setGuestRatings(CatalogsHotelGuestRatings guest_ratings)
{
	this->guest_ratings = guest_ratings;
}

long
CatalogsUpdatableHotelAttributes::getLatitude()
{
	return latitude;
}

void
CatalogsUpdatableHotelAttributes::setLatitude(long latitude)
{
	this->latitude = latitude;
}

std::string
CatalogsUpdatableHotelAttributes::getLink()
{
	return link;
}

void
CatalogsUpdatableHotelAttributes::setLink(std::string link)
{
	this->link = link;
}

long
CatalogsUpdatableHotelAttributes::getLongitude()
{
	return longitude;
}

void
CatalogsUpdatableHotelAttributes::setLongitude(long longitude)
{
	this->longitude = longitude;
}

std::string
CatalogsUpdatableHotelAttributes::getName()
{
	return name;
}

void
CatalogsUpdatableHotelAttributes::setName(std::string name)
{
	this->name = name;
}

std::list<std::string>
CatalogsUpdatableHotelAttributes::getNeighborhood()
{
	return neighborhood;
}

void
CatalogsUpdatableHotelAttributes::setNeighborhood(std::list<std::string> neighborhood)
{
	this->neighborhood = neighborhood;
}

std::string
CatalogsUpdatableHotelAttributes::getSalePrice()
{
	return sale_price;
}

void
CatalogsUpdatableHotelAttributes::setSalePrice(std::string sale_price)
{
	this->sale_price = sale_price;
}



