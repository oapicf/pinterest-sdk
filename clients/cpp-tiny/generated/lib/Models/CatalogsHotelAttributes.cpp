

#include "CatalogsHotelAttributes.h"

using namespace Tiny;

CatalogsHotelAttributes::CatalogsHotelAttributes()
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
	additional_image_link = std::list<std::string>();
	ai_disclosures = std::list<CatalogsAiContentDisclosure>();
	main_image = null;
}

CatalogsHotelAttributes::CatalogsHotelAttributes(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelAttributes::~CatalogsHotelAttributes()
{

}

void
CatalogsHotelAttributes::fromJson(std::string jsonObj)
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

    const char *additional_image_linkKey = "additional_image_link";

    if(object.has_key(additional_image_linkKey))
    {
        bourne::json value = object[additional_image_linkKey];


        std::list<std::string> additional_image_link_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            additional_image_link_list.push_back(element);
        }
        additional_image_link = additional_image_link_list;


    }

    const char *ai_disclosuresKey = "ai_disclosures";

    if(object.has_key(ai_disclosuresKey))
    {
        bourne::json value = object[ai_disclosuresKey];


        std::list<CatalogsAiContentDisclosure> ai_disclosures_list;
        CatalogsAiContentDisclosure element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ai_disclosures_list.push_back(element);
        }
        ai_disclosures = ai_disclosures_list;


    }

    const char *main_imageKey = "main_image";

    if(object.has_key(main_imageKey))
    {
        bourne::json value = object[main_imageKey];




        CatalogsHotelMainImage* obj = &main_image;
		obj->fromJson(value.dump());

    }


}

bourne::json
CatalogsHotelAttributes::toJson()
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





    std::list<std::string> additional_image_link_list = getAdditionalImageLink();
    bourne::json additional_image_link_arr = bourne::json::array();

    for(auto& var : additional_image_link_list)
    {
        additional_image_link_arr.append(var);
    }
    object["additional_image_link"] = additional_image_link_arr;








    std::list<CatalogsAiContentDisclosure> ai_disclosures_list = getAiDisclosures();
    bourne::json ai_disclosures_arr = bourne::json::array();

    for(auto& var : ai_disclosures_list)
    {
        CatalogsAiContentDisclosure obj = var;
        ai_disclosures_arr.append(obj.toJson());
    }
    object["ai_disclosures"] = ai_disclosures_arr;








	object["main_image"] = getMainImage().toJson();


    return object;

}

CatalogsHotelAddress
CatalogsHotelAttributes::getAddress()
{
	return address;
}

void
CatalogsHotelAttributes::setAddress(CatalogsHotelAddress address)
{
	this->address = address;
}

std::string
CatalogsHotelAttributes::getBasePrice()
{
	return base_price;
}

void
CatalogsHotelAttributes::setBasePrice(std::string base_price)
{
	this->base_price = base_price;
}

std::string
CatalogsHotelAttributes::getBrand()
{
	return brand;
}

void
CatalogsHotelAttributes::setBrand(std::string brand)
{
	this->brand = brand;
}

std::string
CatalogsHotelAttributes::getCategory()
{
	return category;
}

void
CatalogsHotelAttributes::setCategory(std::string category)
{
	this->category = category;
}

std::string
CatalogsHotelAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsHotelAttributes::setCustomLabel0(std::string custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsHotelAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsHotelAttributes::setCustomLabel1(std::string custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsHotelAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsHotelAttributes::setCustomLabel2(std::string custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsHotelAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsHotelAttributes::setCustomLabel3(std::string custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsHotelAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsHotelAttributes::setCustomLabel4(std::string custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsHotelAttributes::getDescription()
{
	return description;
}

void
CatalogsHotelAttributes::setDescription(std::string description)
{
	this->description = description;
}

CatalogsHotelGuestRatings
CatalogsHotelAttributes::getGuestRatings()
{
	return guest_ratings;
}

void
CatalogsHotelAttributes::setGuestRatings(CatalogsHotelGuestRatings guest_ratings)
{
	this->guest_ratings = guest_ratings;
}

long
CatalogsHotelAttributes::getLatitude()
{
	return latitude;
}

void
CatalogsHotelAttributes::setLatitude(long latitude)
{
	this->latitude = latitude;
}

std::string
CatalogsHotelAttributes::getLink()
{
	return link;
}

void
CatalogsHotelAttributes::setLink(std::string link)
{
	this->link = link;
}

long
CatalogsHotelAttributes::getLongitude()
{
	return longitude;
}

void
CatalogsHotelAttributes::setLongitude(long longitude)
{
	this->longitude = longitude;
}

std::string
CatalogsHotelAttributes::getName()
{
	return name;
}

void
CatalogsHotelAttributes::setName(std::string name)
{
	this->name = name;
}

std::list<std::string>
CatalogsHotelAttributes::getNeighborhood()
{
	return neighborhood;
}

void
CatalogsHotelAttributes::setNeighborhood(std::list<std::string> neighborhood)
{
	this->neighborhood = neighborhood;
}

std::string
CatalogsHotelAttributes::getSalePrice()
{
	return sale_price;
}

void
CatalogsHotelAttributes::setSalePrice(std::string sale_price)
{
	this->sale_price = sale_price;
}

std::list<std::string>
CatalogsHotelAttributes::getAdditionalImageLink()
{
	return additional_image_link;
}

void
CatalogsHotelAttributes::setAdditionalImageLink(std::list<std::string> additional_image_link)
{
	this->additional_image_link = additional_image_link;
}

std::list<CatalogsAiContentDisclosure>
CatalogsHotelAttributes::getAiDisclosures()
{
	return ai_disclosures;
}

void
CatalogsHotelAttributes::setAiDisclosures(std::list<CatalogsAiContentDisclosure> ai_disclosures)
{
	this->ai_disclosures = ai_disclosures;
}

CatalogsHotelMainImage
CatalogsHotelAttributes::getMainImage()
{
	return main_image;
}

void
CatalogsHotelAttributes::setMainImage(CatalogsHotelMainImage main_image)
{
	this->main_image = main_image;
}



