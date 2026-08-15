

#include "CatalogsUpdatableCreativeAssetsAttributes.h"

using namespace Tiny;

CatalogsUpdatableCreativeAssetsAttributes::CatalogsUpdatableCreativeAssetsAttributes()
{
	android_deep_link = std::string();
	custom_label_0 = std::string();
	custom_label_1 = std::string();
	custom_label_2 = std::string();
	custom_label_3 = std::string();
	custom_label_4 = std::string();
	description = std::string();
	google_product_category = std::string();
	ios_deep_link = std::string();
	link = std::string();
	title = std::string();
	visibility = std::string();
}

CatalogsUpdatableCreativeAssetsAttributes::CatalogsUpdatableCreativeAssetsAttributes(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsUpdatableCreativeAssetsAttributes::~CatalogsUpdatableCreativeAssetsAttributes()
{

}

void
CatalogsUpdatableCreativeAssetsAttributes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *android_deep_linkKey = "android_deep_link";

    if(object.has_key(android_deep_linkKey))
    {
        bourne::json value = object[android_deep_linkKey];



        jsonToValue(&android_deep_link, value, "std::string");


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

    const char *google_product_categoryKey = "google_product_category";

    if(object.has_key(google_product_categoryKey))
    {
        bourne::json value = object[google_product_categoryKey];



        jsonToValue(&google_product_category, value, "std::string");


    }

    const char *ios_deep_linkKey = "ios_deep_link";

    if(object.has_key(ios_deep_linkKey))
    {
        bourne::json value = object[ios_deep_linkKey];



        jsonToValue(&ios_deep_link, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *visibilityKey = "visibility";

    if(object.has_key(visibilityKey))
    {
        bourne::json value = object[visibilityKey];



        jsonToValue(&visibility, value, "std::string");


    }


}

bourne::json
CatalogsUpdatableCreativeAssetsAttributes::toJson()
{
    bourne::json object = bourne::json::object();





    object["android_deep_link"] = getAndroidDeepLink();






    object["custom_label_0"] = getCustomLabel0();






    object["custom_label_1"] = getCustomLabel1();






    object["custom_label_2"] = getCustomLabel2();






    object["custom_label_3"] = getCustomLabel3();






    object["custom_label_4"] = getCustomLabel4();






    object["description"] = getDescription();






    object["google_product_category"] = getGoogleProductCategory();






    object["ios_deep_link"] = getIosDeepLink();






    object["link"] = getLink();






    object["title"] = getTitle();






    object["visibility"] = getVisibility();



    return object;

}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getAndroidDeepLink()
{
	return android_deep_link;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getDescription()
{
	return description;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getGoogleProductCategory()
{
	return google_product_category;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setGoogleProductCategory(std::string  google_product_category)
{
	this->google_product_category = google_product_category;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getIosDeepLink()
{
	return ios_deep_link;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getLink()
{
	return link;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setLink(std::string  link)
{
	this->link = link;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getTitle()
{
	return title;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setTitle(std::string  title)
{
	this->title = title;
}

std::string
CatalogsUpdatableCreativeAssetsAttributes::getVisibility()
{
	return visibility;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setVisibility(std::string  visibility)
{
	this->visibility = visibility;
}



