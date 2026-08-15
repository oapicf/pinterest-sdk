

#include "Catalogs_retail_filter_values_map.h"

using namespace Tiny;

Catalogs_retail_filter_values_map::Catalogs_retail_filter_values_map()
{
	ad_image_tags = std::list<std::string>();
	ad_video_tags = std::list<std::string>();
	availability = std::list<std::string>();
	brand = std::list<std::string>();
	condition = std::list<std::string>();
	custom_label_0 = std::list<std::string>();
	custom_label_1 = std::list<std::string>();
	custom_label_2 = std::list<std::string>();
	custom_label_3 = std::list<std::string>();
	custom_label_4 = std::list<std::string>();
	gender = std::list<std::string>();
	google_product_category_0 = std::list<std::string>();
	google_product_category_1 = std::list<std::string>();
	google_product_category_2 = std::list<std::string>();
	google_product_category_3 = std::list<std::string>();
	google_product_category_4 = std::list<std::string>();
	google_product_category_5 = std::list<std::string>();
	google_product_category_6 = std::list<std::string>();
	media_type = std::list<std::string>();
	product_type_0 = std::list<std::string>();
	product_type_1 = std::list<std::string>();
	product_type_2 = std::list<std::string>();
	product_type_3 = std::list<std::string>();
	product_type_4 = std::list<std::string>();
}

Catalogs_retail_filter_values_map::Catalogs_retail_filter_values_map(std::string jsonString)
{
	this->fromJson(jsonString);
}

Catalogs_retail_filter_values_map::~Catalogs_retail_filter_values_map()
{

}

void
Catalogs_retail_filter_values_map::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_image_tagsKey = "ad_image_tags";

    if(object.has_key(ad_image_tagsKey))
    {
        bourne::json value = object[ad_image_tagsKey];


        std::list<std::string> ad_image_tags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_image_tags_list.push_back(element);
        }
        ad_image_tags = ad_image_tags_list;


    }

    const char *ad_video_tagsKey = "ad_video_tags";

    if(object.has_key(ad_video_tagsKey))
    {
        bourne::json value = object[ad_video_tagsKey];


        std::list<std::string> ad_video_tags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_video_tags_list.push_back(element);
        }
        ad_video_tags = ad_video_tags_list;


    }

    const char *availabilityKey = "availability";

    if(object.has_key(availabilityKey))
    {
        bourne::json value = object[availabilityKey];


        std::list<std::string> availability_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            availability_list.push_back(element);
        }
        availability = availability_list;


    }

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

    const char *conditionKey = "condition";

    if(object.has_key(conditionKey))
    {
        bourne::json value = object[conditionKey];


        std::list<std::string> condition_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            condition_list.push_back(element);
        }
        condition = condition_list;


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

    const char *genderKey = "gender";

    if(object.has_key(genderKey))
    {
        bourne::json value = object[genderKey];


        std::list<std::string> gender_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            gender_list.push_back(element);
        }
        gender = gender_list;


    }

    const char *google_product_category_0Key = "google_product_category_0";

    if(object.has_key(google_product_category_0Key))
    {
        bourne::json value = object[google_product_category_0Key];


        std::list<std::string> google_product_category_0_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_0_list.push_back(element);
        }
        google_product_category_0 = google_product_category_0_list;


    }

    const char *google_product_category_1Key = "google_product_category_1";

    if(object.has_key(google_product_category_1Key))
    {
        bourne::json value = object[google_product_category_1Key];


        std::list<std::string> google_product_category_1_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_1_list.push_back(element);
        }
        google_product_category_1 = google_product_category_1_list;


    }

    const char *google_product_category_2Key = "google_product_category_2";

    if(object.has_key(google_product_category_2Key))
    {
        bourne::json value = object[google_product_category_2Key];


        std::list<std::string> google_product_category_2_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_2_list.push_back(element);
        }
        google_product_category_2 = google_product_category_2_list;


    }

    const char *google_product_category_3Key = "google_product_category_3";

    if(object.has_key(google_product_category_3Key))
    {
        bourne::json value = object[google_product_category_3Key];


        std::list<std::string> google_product_category_3_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_3_list.push_back(element);
        }
        google_product_category_3 = google_product_category_3_list;


    }

    const char *google_product_category_4Key = "google_product_category_4";

    if(object.has_key(google_product_category_4Key))
    {
        bourne::json value = object[google_product_category_4Key];


        std::list<std::string> google_product_category_4_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_4_list.push_back(element);
        }
        google_product_category_4 = google_product_category_4_list;


    }

    const char *google_product_category_5Key = "google_product_category_5";

    if(object.has_key(google_product_category_5Key))
    {
        bourne::json value = object[google_product_category_5Key];


        std::list<std::string> google_product_category_5_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_5_list.push_back(element);
        }
        google_product_category_5 = google_product_category_5_list;


    }

    const char *google_product_category_6Key = "google_product_category_6";

    if(object.has_key(google_product_category_6Key))
    {
        bourne::json value = object[google_product_category_6Key];


        std::list<std::string> google_product_category_6_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            google_product_category_6_list.push_back(element);
        }
        google_product_category_6 = google_product_category_6_list;


    }

    const char *media_typeKey = "media_type";

    if(object.has_key(media_typeKey))
    {
        bourne::json value = object[media_typeKey];


        std::list<std::string> media_type_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            media_type_list.push_back(element);
        }
        media_type = media_type_list;


    }

    const char *product_type_0Key = "product_type_0";

    if(object.has_key(product_type_0Key))
    {
        bourne::json value = object[product_type_0Key];


        std::list<std::string> product_type_0_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_type_0_list.push_back(element);
        }
        product_type_0 = product_type_0_list;


    }

    const char *product_type_1Key = "product_type_1";

    if(object.has_key(product_type_1Key))
    {
        bourne::json value = object[product_type_1Key];


        std::list<std::string> product_type_1_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_type_1_list.push_back(element);
        }
        product_type_1 = product_type_1_list;


    }

    const char *product_type_2Key = "product_type_2";

    if(object.has_key(product_type_2Key))
    {
        bourne::json value = object[product_type_2Key];


        std::list<std::string> product_type_2_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_type_2_list.push_back(element);
        }
        product_type_2 = product_type_2_list;


    }

    const char *product_type_3Key = "product_type_3";

    if(object.has_key(product_type_3Key))
    {
        bourne::json value = object[product_type_3Key];


        std::list<std::string> product_type_3_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_type_3_list.push_back(element);
        }
        product_type_3 = product_type_3_list;


    }

    const char *product_type_4Key = "product_type_4";

    if(object.has_key(product_type_4Key))
    {
        bourne::json value = object[product_type_4Key];


        std::list<std::string> product_type_4_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            product_type_4_list.push_back(element);
        }
        product_type_4 = product_type_4_list;


    }


}

bourne::json
Catalogs_retail_filter_values_map::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> ad_image_tags_list = getAdImageTags();
    bourne::json ad_image_tags_arr = bourne::json::array();

    for(auto& var : ad_image_tags_list)
    {
        ad_image_tags_arr.append(var);
    }
    object["ad_image_tags"] = ad_image_tags_arr;








    std::list<std::string> ad_video_tags_list = getAdVideoTags();
    bourne::json ad_video_tags_arr = bourne::json::array();

    for(auto& var : ad_video_tags_list)
    {
        ad_video_tags_arr.append(var);
    }
    object["ad_video_tags"] = ad_video_tags_arr;








    std::list<std::string> availability_list = getAvailability();
    bourne::json availability_arr = bourne::json::array();

    for(auto& var : availability_list)
    {
        availability_arr.append(var);
    }
    object["availability"] = availability_arr;








    std::list<std::string> brand_list = getBrand();
    bourne::json brand_arr = bourne::json::array();

    for(auto& var : brand_list)
    {
        brand_arr.append(var);
    }
    object["brand"] = brand_arr;








    std::list<std::string> condition_list = getCondition();
    bourne::json condition_arr = bourne::json::array();

    for(auto& var : condition_list)
    {
        condition_arr.append(var);
    }
    object["condition"] = condition_arr;








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








    std::list<std::string> gender_list = getGender();
    bourne::json gender_arr = bourne::json::array();

    for(auto& var : gender_list)
    {
        gender_arr.append(var);
    }
    object["gender"] = gender_arr;








    std::list<std::string> google_product_category_0_list = getGoogleProductCategory0();
    bourne::json google_product_category_0_arr = bourne::json::array();

    for(auto& var : google_product_category_0_list)
    {
        google_product_category_0_arr.append(var);
    }
    object["google_product_category_0"] = google_product_category_0_arr;








    std::list<std::string> google_product_category_1_list = getGoogleProductCategory1();
    bourne::json google_product_category_1_arr = bourne::json::array();

    for(auto& var : google_product_category_1_list)
    {
        google_product_category_1_arr.append(var);
    }
    object["google_product_category_1"] = google_product_category_1_arr;








    std::list<std::string> google_product_category_2_list = getGoogleProductCategory2();
    bourne::json google_product_category_2_arr = bourne::json::array();

    for(auto& var : google_product_category_2_list)
    {
        google_product_category_2_arr.append(var);
    }
    object["google_product_category_2"] = google_product_category_2_arr;








    std::list<std::string> google_product_category_3_list = getGoogleProductCategory3();
    bourne::json google_product_category_3_arr = bourne::json::array();

    for(auto& var : google_product_category_3_list)
    {
        google_product_category_3_arr.append(var);
    }
    object["google_product_category_3"] = google_product_category_3_arr;








    std::list<std::string> google_product_category_4_list = getGoogleProductCategory4();
    bourne::json google_product_category_4_arr = bourne::json::array();

    for(auto& var : google_product_category_4_list)
    {
        google_product_category_4_arr.append(var);
    }
    object["google_product_category_4"] = google_product_category_4_arr;








    std::list<std::string> google_product_category_5_list = getGoogleProductCategory5();
    bourne::json google_product_category_5_arr = bourne::json::array();

    for(auto& var : google_product_category_5_list)
    {
        google_product_category_5_arr.append(var);
    }
    object["google_product_category_5"] = google_product_category_5_arr;








    std::list<std::string> google_product_category_6_list = getGoogleProductCategory6();
    bourne::json google_product_category_6_arr = bourne::json::array();

    for(auto& var : google_product_category_6_list)
    {
        google_product_category_6_arr.append(var);
    }
    object["google_product_category_6"] = google_product_category_6_arr;








    std::list<std::string> media_type_list = getMediaType();
    bourne::json media_type_arr = bourne::json::array();

    for(auto& var : media_type_list)
    {
        media_type_arr.append(var);
    }
    object["media_type"] = media_type_arr;








    std::list<std::string> product_type_0_list = getProductType0();
    bourne::json product_type_0_arr = bourne::json::array();

    for(auto& var : product_type_0_list)
    {
        product_type_0_arr.append(var);
    }
    object["product_type_0"] = product_type_0_arr;








    std::list<std::string> product_type_1_list = getProductType1();
    bourne::json product_type_1_arr = bourne::json::array();

    for(auto& var : product_type_1_list)
    {
        product_type_1_arr.append(var);
    }
    object["product_type_1"] = product_type_1_arr;








    std::list<std::string> product_type_2_list = getProductType2();
    bourne::json product_type_2_arr = bourne::json::array();

    for(auto& var : product_type_2_list)
    {
        product_type_2_arr.append(var);
    }
    object["product_type_2"] = product_type_2_arr;








    std::list<std::string> product_type_3_list = getProductType3();
    bourne::json product_type_3_arr = bourne::json::array();

    for(auto& var : product_type_3_list)
    {
        product_type_3_arr.append(var);
    }
    object["product_type_3"] = product_type_3_arr;








    std::list<std::string> product_type_4_list = getProductType4();
    bourne::json product_type_4_arr = bourne::json::array();

    for(auto& var : product_type_4_list)
    {
        product_type_4_arr.append(var);
    }
    object["product_type_4"] = product_type_4_arr;






    return object;

}

std::list<std::string>
Catalogs_retail_filter_values_map::getAdImageTags()
{
	return ad_image_tags;
}

void
Catalogs_retail_filter_values_map::setAdImageTags(std::list <std::string> ad_image_tags)
{
	this->ad_image_tags = ad_image_tags;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getAdVideoTags()
{
	return ad_video_tags;
}

void
Catalogs_retail_filter_values_map::setAdVideoTags(std::list <std::string> ad_video_tags)
{
	this->ad_video_tags = ad_video_tags;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getAvailability()
{
	return availability;
}

void
Catalogs_retail_filter_values_map::setAvailability(std::list <std::string> availability)
{
	this->availability = availability;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getBrand()
{
	return brand;
}

void
Catalogs_retail_filter_values_map::setBrand(std::list <std::string> brand)
{
	this->brand = brand;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCondition()
{
	return condition;
}

void
Catalogs_retail_filter_values_map::setCondition(std::list <std::string> condition)
{
	this->condition = condition;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCustomLabel0()
{
	return custom_label_0;
}

void
Catalogs_retail_filter_values_map::setCustomLabel0(std::list <std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCustomLabel1()
{
	return custom_label_1;
}

void
Catalogs_retail_filter_values_map::setCustomLabel1(std::list <std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCustomLabel2()
{
	return custom_label_2;
}

void
Catalogs_retail_filter_values_map::setCustomLabel2(std::list <std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCustomLabel3()
{
	return custom_label_3;
}

void
Catalogs_retail_filter_values_map::setCustomLabel3(std::list <std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getCustomLabel4()
{
	return custom_label_4;
}

void
Catalogs_retail_filter_values_map::setCustomLabel4(std::list <std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGender()
{
	return gender;
}

void
Catalogs_retail_filter_values_map::setGender(std::list <std::string> gender)
{
	this->gender = gender;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory0()
{
	return google_product_category_0;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory0(std::list <std::string> google_product_category_0)
{
	this->google_product_category_0 = google_product_category_0;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory1()
{
	return google_product_category_1;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory1(std::list <std::string> google_product_category_1)
{
	this->google_product_category_1 = google_product_category_1;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory2()
{
	return google_product_category_2;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory2(std::list <std::string> google_product_category_2)
{
	this->google_product_category_2 = google_product_category_2;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory3()
{
	return google_product_category_3;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory3(std::list <std::string> google_product_category_3)
{
	this->google_product_category_3 = google_product_category_3;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory4()
{
	return google_product_category_4;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory4(std::list <std::string> google_product_category_4)
{
	this->google_product_category_4 = google_product_category_4;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory5()
{
	return google_product_category_5;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory5(std::list <std::string> google_product_category_5)
{
	this->google_product_category_5 = google_product_category_5;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getGoogleProductCategory6()
{
	return google_product_category_6;
}

void
Catalogs_retail_filter_values_map::setGoogleProductCategory6(std::list <std::string> google_product_category_6)
{
	this->google_product_category_6 = google_product_category_6;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getMediaType()
{
	return media_type;
}

void
Catalogs_retail_filter_values_map::setMediaType(std::list <std::string> media_type)
{
	this->media_type = media_type;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getProductType0()
{
	return product_type_0;
}

void
Catalogs_retail_filter_values_map::setProductType0(std::list <std::string> product_type_0)
{
	this->product_type_0 = product_type_0;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getProductType1()
{
	return product_type_1;
}

void
Catalogs_retail_filter_values_map::setProductType1(std::list <std::string> product_type_1)
{
	this->product_type_1 = product_type_1;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getProductType2()
{
	return product_type_2;
}

void
Catalogs_retail_filter_values_map::setProductType2(std::list <std::string> product_type_2)
{
	this->product_type_2 = product_type_2;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getProductType3()
{
	return product_type_3;
}

void
Catalogs_retail_filter_values_map::setProductType3(std::list <std::string> product_type_3)
{
	this->product_type_3 = product_type_3;
}

std::list<std::string>
Catalogs_retail_filter_values_map::getProductType4()
{
	return product_type_4;
}

void
Catalogs_retail_filter_values_map::setProductType4(std::list <std::string> product_type_4)
{
	this->product_type_4 = product_type_4;
}



