

#include "CatalogsCreativeAssetsFilterValuesMap.h"

using namespace Tiny;

CatalogsCreativeAssetsFilterValuesMap::CatalogsCreativeAssetsFilterValuesMap()
{
	custom_label_0 = std::list<std::string>();
	custom_label_1 = std::list<std::string>();
	custom_label_2 = std::list<std::string>();
	custom_label_3 = std::list<std::string>();
	custom_label_4 = std::list<std::string>();
	google_product_category_0 = std::list<std::string>();
	google_product_category_1 = std::list<std::string>();
	google_product_category_2 = std::list<std::string>();
	google_product_category_3 = std::list<std::string>();
	google_product_category_4 = std::list<std::string>();
	google_product_category_5 = std::list<std::string>();
	google_product_category_6 = std::list<std::string>();
	media_type = std::list<MediaType>();
}

CatalogsCreativeAssetsFilterValuesMap::CatalogsCreativeAssetsFilterValuesMap(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsFilterValuesMap::~CatalogsCreativeAssetsFilterValuesMap()
{

}

void
CatalogsCreativeAssetsFilterValuesMap::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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


}

bourne::json
CatalogsCreativeAssetsFilterValuesMap::toJson()
{
    bourne::json object = bourne::json::object();




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




    return object;

}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsCreativeAssetsFilterValuesMap::setCustomLabel0(std::list<std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsCreativeAssetsFilterValuesMap::setCustomLabel1(std::list<std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsCreativeAssetsFilterValuesMap::setCustomLabel2(std::list<std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsCreativeAssetsFilterValuesMap::setCustomLabel3(std::list<std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsCreativeAssetsFilterValuesMap::setCustomLabel4(std::list<std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory0()
{
	return google_product_category_0;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory0(std::list<std::string> google_product_category_0)
{
	this->google_product_category_0 = google_product_category_0;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory1()
{
	return google_product_category_1;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory1(std::list<std::string> google_product_category_1)
{
	this->google_product_category_1 = google_product_category_1;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory2()
{
	return google_product_category_2;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory2(std::list<std::string> google_product_category_2)
{
	this->google_product_category_2 = google_product_category_2;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory3()
{
	return google_product_category_3;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory3(std::list<std::string> google_product_category_3)
{
	this->google_product_category_3 = google_product_category_3;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory4()
{
	return google_product_category_4;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory4(std::list<std::string> google_product_category_4)
{
	this->google_product_category_4 = google_product_category_4;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory5()
{
	return google_product_category_5;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory5(std::list<std::string> google_product_category_5)
{
	this->google_product_category_5 = google_product_category_5;
}

std::list<std::string>
CatalogsCreativeAssetsFilterValuesMap::getGoogleProductCategory6()
{
	return google_product_category_6;
}

void
CatalogsCreativeAssetsFilterValuesMap::setGoogleProductCategory6(std::list<std::string> google_product_category_6)
{
	this->google_product_category_6 = google_product_category_6;
}

std::list<MediaType>
CatalogsCreativeAssetsFilterValuesMap::getMediaType()
{
	return media_type;
}

void
CatalogsCreativeAssetsFilterValuesMap::setMediaType(std::list<MediaType> media_type)
{
	this->media_type = media_type;
}



