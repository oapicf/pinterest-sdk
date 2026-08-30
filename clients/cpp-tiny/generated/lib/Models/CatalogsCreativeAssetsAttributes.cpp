

#include "CatalogsCreativeAssetsAttributes.h"

using namespace Tiny;

CatalogsCreativeAssetsAttributes::CatalogsCreativeAssetsAttributes()
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
	ai_disclosures = std::list<CatalogsAiContentDisclosure>();
	image_link = std::string();
	video_link = std::string();
}

CatalogsCreativeAssetsAttributes::CatalogsCreativeAssetsAttributes(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsCreativeAssetsAttributes::~CatalogsCreativeAssetsAttributes()
{

}

void
CatalogsCreativeAssetsAttributes::fromJson(std::string jsonObj)
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

    const char *image_linkKey = "image_link";

    if(object.has_key(image_linkKey))
    {
        bourne::json value = object[image_linkKey];



        jsonToValue(&image_link, value, "std::string");


    }

    const char *video_linkKey = "video_link";

    if(object.has_key(video_linkKey))
    {
        bourne::json value = object[video_linkKey];



        jsonToValue(&video_link, value, "std::string");


    }


}

bourne::json
CatalogsCreativeAssetsAttributes::toJson()
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





    std::list<CatalogsAiContentDisclosure> ai_disclosures_list = getAiDisclosures();
    bourne::json ai_disclosures_arr = bourne::json::array();

    for(auto& var : ai_disclosures_list)
    {
        CatalogsAiContentDisclosure obj = var;
        ai_disclosures_arr.append(obj.toJson());
    }
    object["ai_disclosures"] = ai_disclosures_arr;







    object["image_link"] = getImageLink();






    object["video_link"] = getVideoLink();



    return object;

}

std::string
CatalogsCreativeAssetsAttributes::getAndroidDeepLink()
{
	return android_deep_link;
}

void
CatalogsCreativeAssetsAttributes::setAndroidDeepLink(std::string android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel0(std::string custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel1(std::string custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel2(std::string custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel3(std::string custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel4(std::string custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsCreativeAssetsAttributes::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsAttributes::setDescription(std::string description)
{
	this->description = description;
}

std::string
CatalogsCreativeAssetsAttributes::getGoogleProductCategory()
{
	return google_product_category;
}

void
CatalogsCreativeAssetsAttributes::setGoogleProductCategory(std::string google_product_category)
{
	this->google_product_category = google_product_category;
}

std::string
CatalogsCreativeAssetsAttributes::getIosDeepLink()
{
	return ios_deep_link;
}

void
CatalogsCreativeAssetsAttributes::setIosDeepLink(std::string ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
CatalogsCreativeAssetsAttributes::getLink()
{
	return link;
}

void
CatalogsCreativeAssetsAttributes::setLink(std::string link)
{
	this->link = link;
}

std::string
CatalogsCreativeAssetsAttributes::getTitle()
{
	return title;
}

void
CatalogsCreativeAssetsAttributes::setTitle(std::string title)
{
	this->title = title;
}

std::string
CatalogsCreativeAssetsAttributes::getVisibility()
{
	return visibility;
}

void
CatalogsCreativeAssetsAttributes::setVisibility(std::string visibility)
{
	this->visibility = visibility;
}

std::list<CatalogsAiContentDisclosure>
CatalogsCreativeAssetsAttributes::getAiDisclosures()
{
	return ai_disclosures;
}

void
CatalogsCreativeAssetsAttributes::setAiDisclosures(std::list<CatalogsAiContentDisclosure> ai_disclosures)
{
	this->ai_disclosures = ai_disclosures;
}

std::string
CatalogsCreativeAssetsAttributes::getImageLink()
{
	return image_link;
}

void
CatalogsCreativeAssetsAttributes::setImageLink(std::string image_link)
{
	this->image_link = image_link;
}

std::string
CatalogsCreativeAssetsAttributes::getVideoLink()
{
	return video_link;
}

void
CatalogsCreativeAssetsAttributes::setVideoLink(std::string video_link)
{
	this->video_link = video_link;
}



