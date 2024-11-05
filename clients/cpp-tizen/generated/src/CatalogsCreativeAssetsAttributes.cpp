#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsAttributes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsAttributes::CatalogsCreativeAssetsAttributes()
{
	//__init();
}

CatalogsCreativeAssetsAttributes::~CatalogsCreativeAssetsAttributes()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsAttributes::__init()
{
	//title = std::string();
	//description = std::string();
	//link = std::string();
	//ios_deep_link = std::string();
	//android_deep_link = std::string();
	//google_product_category = std::string();
	//custom_label_0 = std::string();
	//custom_label_1 = std::string();
	//custom_label_2 = std::string();
	//custom_label_3 = std::string();
	//custom_label_4 = std::string();
	//visibility = std::string();
	//image_link = std::string();
	//video_link = std::string();
}

void
CatalogsCreativeAssetsAttributes::__cleanup()
{
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(ios_deep_link != NULL) {
	//
	//delete ios_deep_link;
	//ios_deep_link = NULL;
	//}
	//if(android_deep_link != NULL) {
	//
	//delete android_deep_link;
	//android_deep_link = NULL;
	//}
	//if(google_product_category != NULL) {
	//
	//delete google_product_category;
	//google_product_category = NULL;
	//}
	//if(custom_label_0 != NULL) {
	//
	//delete custom_label_0;
	//custom_label_0 = NULL;
	//}
	//if(custom_label_1 != NULL) {
	//
	//delete custom_label_1;
	//custom_label_1 = NULL;
	//}
	//if(custom_label_2 != NULL) {
	//
	//delete custom_label_2;
	//custom_label_2 = NULL;
	//}
	//if(custom_label_3 != NULL) {
	//
	//delete custom_label_3;
	//custom_label_3 = NULL;
	//}
	//if(custom_label_4 != NULL) {
	//
	//delete custom_label_4;
	//custom_label_4 = NULL;
	//}
	//if(visibility != NULL) {
	//
	//delete visibility;
	//visibility = NULL;
	//}
	//if(image_link != NULL) {
	//
	//delete image_link;
	//image_link = NULL;
	//}
	//if(video_link != NULL) {
	//
	//delete video_link;
	//video_link = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsAttributes::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	node = json_object_get_member(pJsonObject, ios_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ios_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *android_deep_linkKey = "android_deep_link";
	node = json_object_get_member(pJsonObject, android_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&android_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *google_product_categoryKey = "google_product_category";
	node = json_object_get_member(pJsonObject, google_product_categoryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&google_product_category, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_0Key = "custom_label_0";
	node = json_object_get_member(pJsonObject, custom_label_0Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_0, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_1Key = "custom_label_1";
	node = json_object_get_member(pJsonObject, custom_label_1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_1, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_2Key = "custom_label_2";
	node = json_object_get_member(pJsonObject, custom_label_2Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_2, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_3Key = "custom_label_3";
	node = json_object_get_member(pJsonObject, custom_label_3Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_3, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_label_4Key = "custom_label_4";
	node = json_object_get_member(pJsonObject, custom_label_4Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_label_4, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *visibilityKey = "visibility";
	node = json_object_get_member(pJsonObject, visibilityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&visibility, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *image_linkKey = "image_link";
	node = json_object_get_member(pJsonObject, image_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&image_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *video_linkKey = "video_link";
	node = json_object_get_member(pJsonObject, video_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&video_link, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsCreativeAssetsAttributes::CatalogsCreativeAssetsAttributes(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsAttributes::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIosDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	json_object_set_member(pJsonObject, ios_deep_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAndroidDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *android_deep_linkKey = "android_deep_link";
	json_object_set_member(pJsonObject, android_deep_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getGoogleProductCategory();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *google_product_categoryKey = "google_product_category";
	json_object_set_member(pJsonObject, google_product_categoryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel0();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_0Key = "custom_label_0";
	json_object_set_member(pJsonObject, custom_label_0Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_1Key = "custom_label_1";
	json_object_set_member(pJsonObject, custom_label_1Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel2();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_2Key = "custom_label_2";
	json_object_set_member(pJsonObject, custom_label_2Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel3();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_3Key = "custom_label_3";
	json_object_set_member(pJsonObject, custom_label_3Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomLabel4();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_label_4Key = "custom_label_4";
	json_object_set_member(pJsonObject, custom_label_4Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getVisibility();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *visibilityKey = "visibility";
	json_object_set_member(pJsonObject, visibilityKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getImageLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *image_linkKey = "image_link";
	json_object_set_member(pJsonObject, image_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVideoLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *video_linkKey = "video_link";
	json_object_set_member(pJsonObject, video_linkKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsCreativeAssetsAttributes::getTitle()
{
	return title;
}

void
CatalogsCreativeAssetsAttributes::setTitle(std::string  title)
{
	this->title = title;
}

std::string
CatalogsCreativeAssetsAttributes::getDescription()
{
	return description;
}

void
CatalogsCreativeAssetsAttributes::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CatalogsCreativeAssetsAttributes::getLink()
{
	return link;
}

void
CatalogsCreativeAssetsAttributes::setLink(std::string  link)
{
	this->link = link;
}

std::string
CatalogsCreativeAssetsAttributes::getIosDeepLink()
{
	return ios_deep_link;
}

void
CatalogsCreativeAssetsAttributes::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
CatalogsCreativeAssetsAttributes::getAndroidDeepLink()
{
	return android_deep_link;
}

void
CatalogsCreativeAssetsAttributes::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
CatalogsCreativeAssetsAttributes::getGoogleProductCategory()
{
	return google_product_category;
}

void
CatalogsCreativeAssetsAttributes::setGoogleProductCategory(std::string  google_product_category)
{
	this->google_product_category = google_product_category;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel0()
{
	return custom_label_0;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel0(std::string  custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel1()
{
	return custom_label_1;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel1(std::string  custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel2()
{
	return custom_label_2;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel2(std::string  custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel3()
{
	return custom_label_3;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel3(std::string  custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::string
CatalogsCreativeAssetsAttributes::getCustomLabel4()
{
	return custom_label_4;
}

void
CatalogsCreativeAssetsAttributes::setCustomLabel4(std::string  custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::string
CatalogsCreativeAssetsAttributes::getVisibility()
{
	return visibility;
}

void
CatalogsCreativeAssetsAttributes::setVisibility(std::string  visibility)
{
	this->visibility = visibility;
}

std::string
CatalogsCreativeAssetsAttributes::getImageLink()
{
	return image_link;
}

void
CatalogsCreativeAssetsAttributes::setImageLink(std::string  image_link)
{
	this->image_link = image_link;
}

std::string
CatalogsCreativeAssetsAttributes::getVideoLink()
{
	return video_link;
}

void
CatalogsCreativeAssetsAttributes::setVideoLink(std::string  video_link)
{
	this->video_link = video_link;
}


