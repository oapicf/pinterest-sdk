#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsUpdatableCreativeAssetsAttributes.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsUpdatableCreativeAssetsAttributes::CatalogsUpdatableCreativeAssetsAttributes()
{
	//__init();
}

CatalogsUpdatableCreativeAssetsAttributes::~CatalogsUpdatableCreativeAssetsAttributes()
{
	//__cleanup();
}

void
CatalogsUpdatableCreativeAssetsAttributes::__init()
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
}

void
CatalogsUpdatableCreativeAssetsAttributes::__cleanup()
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
	//
}

void
CatalogsUpdatableCreativeAssetsAttributes::fromJson(char* jsonStr)
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
}

CatalogsUpdatableCreativeAssetsAttributes::CatalogsUpdatableCreativeAssetsAttributes(char* json)
{
	this->fromJson(json);
}

char*
CatalogsUpdatableCreativeAssetsAttributes::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
CatalogsUpdatableCreativeAssetsAttributes::getVisibility()
{
	return visibility;
}

void
CatalogsUpdatableCreativeAssetsAttributes::setVisibility(std::string  visibility)
{
	this->visibility = visibility;
}


