

#include "CatalogsRetailFilterValuesMap.h"

using namespace Tiny;

CatalogsRetailFilterValuesMap::CatalogsRetailFilterValuesMap()
{
	ad_image_tags = std::list<std::string>();
	ad_video_tags = std::list<std::string>();
	availability = std::list<ProductAvailability>();
	brand = std::list<std::string>();
	condition = std::list<ProductCondition>();
	custom_label_0 = std::list<std::string>();
	custom_label_1 = std::list<std::string>();
	custom_label_2 = std::list<std::string>();
	custom_label_3 = std::list<std::string>();
	custom_label_4 = std::list<std::string>();
	gender = std::list<Gender>();
	google_product_category_0 = std::list<std::string>();
	google_product_category_1 = std::list<std::string>();
	google_product_category_2 = std::list<std::string>();
	google_product_category_3 = std::list<std::string>();
	google_product_category_4 = std::list<std::string>();
	google_product_category_5 = std::list<std::string>();
	google_product_category_6 = std::list<std::string>();
	media_type = std::list<MediaType>();
	product_type_0 = std::list<std::string>();
	product_type_1 = std::list<std::string>();
	product_type_2 = std::list<std::string>();
	product_type_3 = std::list<std::string>();
	product_type_4 = std::list<std::string>();
}

CatalogsRetailFilterValuesMap::CatalogsRetailFilterValuesMap(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsRetailFilterValuesMap::~CatalogsRetailFilterValuesMap()
{

}

void
CatalogsRetailFilterValuesMap::fromJson(std::string jsonObj)
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


        std::list<ProductAvailability> availability_list;
        ProductAvailability element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

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


        std::list<ProductCondition> condition_list;
        ProductCondition element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

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


        std::list<Gender> gender_list;
        Gender element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

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


        std::list<MediaType> media_type_list;
        MediaType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

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
CatalogsRetailFilterValuesMap::toJson()
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








    std::list<ProductAvailability> availability_list = getAvailability();
    bourne::json availability_arr = bourne::json::array();

    for(auto& var : availability_list)
    {
        ProductAvailability obj = var;
        availability_arr.append(obj.toJson());
    }
    object["availability"] = availability_arr;






    std::list<std::string> brand_list = getBrand();
    bourne::json brand_arr = bourne::json::array();

    for(auto& var : brand_list)
    {
        brand_arr.append(var);
    }
    object["brand"] = brand_arr;








    std::list<ProductCondition> condition_list = getCondition();
    bourne::json condition_arr = bourne::json::array();

    for(auto& var : condition_list)
    {
        ProductCondition obj = var;
        condition_arr.append(obj.toJson());
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








    std::list<Gender> gender_list = getGender();
    bourne::json gender_arr = bourne::json::array();

    for(auto& var : gender_list)
    {
        Gender obj = var;
        gender_arr.append(obj.toJson());
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








    std::list<MediaType> media_type_list = getMediaType();
    bourne::json media_type_arr = bourne::json::array();

    for(auto& var : media_type_list)
    {
        MediaType obj = var;
        media_type_arr.append(obj.toJson());
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
CatalogsRetailFilterValuesMap::getAdImageTags()
{
	return ad_image_tags;
}

void
CatalogsRetailFilterValuesMap::setAdImageTags(std::list<std::string> ad_image_tags)
{
	this->ad_image_tags = ad_image_tags;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getAdVideoTags()
{
	return ad_video_tags;
}

void
CatalogsRetailFilterValuesMap::setAdVideoTags(std::list<std::string> ad_video_tags)
{
	this->ad_video_tags = ad_video_tags;
}

std::list<ProductAvailability>
CatalogsRetailFilterValuesMap::getAvailability()
{
	return availability;
}

void
CatalogsRetailFilterValuesMap::setAvailability(std::list<ProductAvailability> availability)
{
	this->availability = availability;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getBrand()
{
	return brand;
}

void
CatalogsRetailFilterValuesMap::setBrand(std::list<std::string> brand)
{
	this->brand = brand;
}

std::list<ProductCondition>
CatalogsRetailFilterValuesMap::getCondition()
{
	return condition;
}

void
CatalogsRetailFilterValuesMap::setCondition(std::list<ProductCondition> condition)
{
	this->condition = condition;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel0(std::list<std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel1(std::list<std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel2(std::list<std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel3(std::list<std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsRetailFilterValuesMap::setCustomLabel4(std::list<std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::list<Gender>
CatalogsRetailFilterValuesMap::getGender()
{
	return gender;
}

void
CatalogsRetailFilterValuesMap::setGender(std::list<Gender> gender)
{
	this->gender = gender;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory0()
{
	return google_product_category_0;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory0(std::list<std::string> google_product_category_0)
{
	this->google_product_category_0 = google_product_category_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory1()
{
	return google_product_category_1;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory1(std::list<std::string> google_product_category_1)
{
	this->google_product_category_1 = google_product_category_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory2()
{
	return google_product_category_2;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory2(std::list<std::string> google_product_category_2)
{
	this->google_product_category_2 = google_product_category_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory3()
{
	return google_product_category_3;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory3(std::list<std::string> google_product_category_3)
{
	this->google_product_category_3 = google_product_category_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory4()
{
	return google_product_category_4;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory4(std::list<std::string> google_product_category_4)
{
	this->google_product_category_4 = google_product_category_4;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory5()
{
	return google_product_category_5;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory5(std::list<std::string> google_product_category_5)
{
	this->google_product_category_5 = google_product_category_5;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getGoogleProductCategory6()
{
	return google_product_category_6;
}

void
CatalogsRetailFilterValuesMap::setGoogleProductCategory6(std::list<std::string> google_product_category_6)
{
	this->google_product_category_6 = google_product_category_6;
}

std::list<MediaType>
CatalogsRetailFilterValuesMap::getMediaType()
{
	return media_type;
}

void
CatalogsRetailFilterValuesMap::setMediaType(std::list<MediaType> media_type)
{
	this->media_type = media_type;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType0()
{
	return product_type_0;
}

void
CatalogsRetailFilterValuesMap::setProductType0(std::list<std::string> product_type_0)
{
	this->product_type_0 = product_type_0;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType1()
{
	return product_type_1;
}

void
CatalogsRetailFilterValuesMap::setProductType1(std::list<std::string> product_type_1)
{
	this->product_type_1 = product_type_1;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType2()
{
	return product_type_2;
}

void
CatalogsRetailFilterValuesMap::setProductType2(std::list<std::string> product_type_2)
{
	this->product_type_2 = product_type_2;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType3()
{
	return product_type_3;
}

void
CatalogsRetailFilterValuesMap::setProductType3(std::list<std::string> product_type_3)
{
	this->product_type_3 = product_type_3;
}

std::list<std::string>
CatalogsRetailFilterValuesMap::getProductType4()
{
	return product_type_4;
}

void
CatalogsRetailFilterValuesMap::setProductType4(std::list<std::string> product_type_4)
{
	this->product_type_4 = product_type_4;
}



