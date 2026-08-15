

#include "Catalogs_hotel_filter_values_map.h"

using namespace Tiny;

Catalogs_hotel_filter_values_map::Catalogs_hotel_filter_values_map()
{
	brand = std::list<std::string>();
	custom_label_0 = std::list<std::string>();
	custom_label_1 = std::list<std::string>();
	custom_label_2 = std::list<std::string>();
	custom_label_3 = std::list<std::string>();
	custom_label_4 = std::list<std::string>();
}

Catalogs_hotel_filter_values_map::Catalogs_hotel_filter_values_map(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_hotel_filter_values_map::~Catalogs_hotel_filter_values_map()
{

}

void
Catalogs_hotel_filter_values_map::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *brandKey = "brand";

    if(object.has_key(brandKey))
    {
        bourne::json value = object[brandKey];


        std::list<std::string> brand_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            brand_list.push_back(element);
        }
        brand = brand_list;


    }

    const char *custom_label_0Key = "custom_label_0";

    if(object.has_key(custom_label_0Key))
    {
        bourne::json value = object[custom_label_0Key];


        std::list<std::string> custom_label_0_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_label_0_list.push_back(element);
        }
        custom_label_0 = custom_label_0_list;


    }

    const char *custom_label_1Key = "custom_label_1";

    if(object.has_key(custom_label_1Key))
    {
        bourne::json value = object[custom_label_1Key];


        std::list<std::string> custom_label_1_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_label_1_list.push_back(element);
        }
        custom_label_1 = custom_label_1_list;


    }

    const char *custom_label_2Key = "custom_label_2";

    if(object.has_key(custom_label_2Key))
    {
        bourne::json value = object[custom_label_2Key];


        std::list<std::string> custom_label_2_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_label_2_list.push_back(element);
        }
        custom_label_2 = custom_label_2_list;


    }

    const char *custom_label_3Key = "custom_label_3";

    if(object.has_key(custom_label_3Key))
    {
        bourne::json value = object[custom_label_3Key];


        std::list<std::string> custom_label_3_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_label_3_list.push_back(element);
        }
        custom_label_3 = custom_label_3_list;


    }

    const char *custom_label_4Key = "custom_label_4";

    if(object.has_key(custom_label_4Key))
    {
        bourne::json value = object[custom_label_4Key];


        std::list<std::string> custom_label_4_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_label_4_list.push_back(element);
        }
        custom_label_4 = custom_label_4_list;


    }


}

bourne::json
Catalogs_hotel_filter_values_map::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> brand_list = getBrand();
    bourne::json brand_arr = bourne::json::array();

    for(auto& var : brand_list)
    {
        brand_arr.append(var);
    }
    object["brand"] = brand_arr;








    std::list<std::string> custom_label_0_list = getCustomLabel0();
    bourne::json custom_label_0_arr = bourne::json::array();

    for(auto& var : custom_label_0_list)
    {
        custom_label_0_arr.append(var);
    }
    object["custom_label_0"] = custom_label_0_arr;








    std::list<std::string> custom_label_1_list = getCustomLabel1();
    bourne::json custom_label_1_arr = bourne::json::array();

    for(auto& var : custom_label_1_list)
    {
        custom_label_1_arr.append(var);
    }
    object["custom_label_1"] = custom_label_1_arr;








    std::list<std::string> custom_label_2_list = getCustomLabel2();
    bourne::json custom_label_2_arr = bourne::json::array();

    for(auto& var : custom_label_2_list)
    {
        custom_label_2_arr.append(var);
    }
    object["custom_label_2"] = custom_label_2_arr;








    std::list<std::string> custom_label_3_list = getCustomLabel3();
    bourne::json custom_label_3_arr = bourne::json::array();

    for(auto& var : custom_label_3_list)
    {
        custom_label_3_arr.append(var);
    }
    object["custom_label_3"] = custom_label_3_arr;








    std::list<std::string> custom_label_4_list = getCustomLabel4();
    bourne::json custom_label_4_arr = bourne::json::array();

    for(auto& var : custom_label_4_list)
    {
        custom_label_4_arr.append(var);
    }
    object["custom_label_4"] = custom_label_4_arr;






    return object;

}

std::list<std::string>
Catalogs_hotel_filter_values_map::getBrand()
{
	return brand;
}

void
Catalogs_hotel_filter_values_map::setBrand(std::list <std::string> brand)
{
	this->brand = brand;
}

std::list<std::string>
Catalogs_hotel_filter_values_map::getCustomLabel0()
{
	return custom_label_0;
}

void
Catalogs_hotel_filter_values_map::setCustomLabel0(std::list <std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
Catalogs_hotel_filter_values_map::getCustomLabel1()
{
	return custom_label_1;
}

void
Catalogs_hotel_filter_values_map::setCustomLabel1(std::list <std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
Catalogs_hotel_filter_values_map::getCustomLabel2()
{
	return custom_label_2;
}

void
Catalogs_hotel_filter_values_map::setCustomLabel2(std::list <std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
Catalogs_hotel_filter_values_map::getCustomLabel3()
{
	return custom_label_3;
}

void
Catalogs_hotel_filter_values_map::setCustomLabel3(std::list <std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
Catalogs_hotel_filter_values_map::getCustomLabel4()
{
	return custom_label_4;
}

void
Catalogs_hotel_filter_values_map::setCustomLabel4(std::list <std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}



