#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_creative_assets_filter_values_map.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_creative_assets_filter_values_map::Catalogs_creative_assets_filter_values_map()
{
	//__init();
}

Catalogs_creative_assets_filter_values_map::~Catalogs_creative_assets_filter_values_map()
{
	//__cleanup();
}

void
Catalogs_creative_assets_filter_values_map::__init()
{
	//new std::list()std::list> custom_label_0;
	//new std::list()std::list> custom_label_1;
	//new std::list()std::list> custom_label_2;
	//new std::list()std::list> custom_label_3;
	//new std::list()std::list> custom_label_4;
	//new std::list()std::list> google_product_category_0;
	//new std::list()std::list> google_product_category_1;
	//new std::list()std::list> google_product_category_2;
	//new std::list()std::list> google_product_category_3;
	//new std::list()std::list> google_product_category_4;
	//new std::list()std::list> google_product_category_5;
	//new std::list()std::list> google_product_category_6;
	//new std::list()std::list> media_type;
}

void
Catalogs_creative_assets_filter_values_map::__cleanup()
{
	//if(custom_label_0 != NULL) {
	//custom_label_0.RemoveAll(true);
	//delete custom_label_0;
	//custom_label_0 = NULL;
	//}
	//if(custom_label_1 != NULL) {
	//custom_label_1.RemoveAll(true);
	//delete custom_label_1;
	//custom_label_1 = NULL;
	//}
	//if(custom_label_2 != NULL) {
	//custom_label_2.RemoveAll(true);
	//delete custom_label_2;
	//custom_label_2 = NULL;
	//}
	//if(custom_label_3 != NULL) {
	//custom_label_3.RemoveAll(true);
	//delete custom_label_3;
	//custom_label_3 = NULL;
	//}
	//if(custom_label_4 != NULL) {
	//custom_label_4.RemoveAll(true);
	//delete custom_label_4;
	//custom_label_4 = NULL;
	//}
	//if(google_product_category_0 != NULL) {
	//google_product_category_0.RemoveAll(true);
	//delete google_product_category_0;
	//google_product_category_0 = NULL;
	//}
	//if(google_product_category_1 != NULL) {
	//google_product_category_1.RemoveAll(true);
	//delete google_product_category_1;
	//google_product_category_1 = NULL;
	//}
	//if(google_product_category_2 != NULL) {
	//google_product_category_2.RemoveAll(true);
	//delete google_product_category_2;
	//google_product_category_2 = NULL;
	//}
	//if(google_product_category_3 != NULL) {
	//google_product_category_3.RemoveAll(true);
	//delete google_product_category_3;
	//google_product_category_3 = NULL;
	//}
	//if(google_product_category_4 != NULL) {
	//google_product_category_4.RemoveAll(true);
	//delete google_product_category_4;
	//google_product_category_4 = NULL;
	//}
	//if(google_product_category_5 != NULL) {
	//google_product_category_5.RemoveAll(true);
	//delete google_product_category_5;
	//google_product_category_5 = NULL;
	//}
	//if(google_product_category_6 != NULL) {
	//google_product_category_6.RemoveAll(true);
	//delete google_product_category_6;
	//google_product_category_6 = NULL;
	//}
	//if(media_type != NULL) {
	//media_type.RemoveAll(true);
	//delete media_type;
	//media_type = NULL;
	//}
	//
}

void
Catalogs_creative_assets_filter_values_map::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *custom_label_0Key = "custom_label_0";
	node = json_object_get_member(pJsonObject, custom_label_0Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_label_0 = new_list;
		}
		
	}
	const gchar *custom_label_1Key = "custom_label_1";
	node = json_object_get_member(pJsonObject, custom_label_1Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_label_1 = new_list;
		}
		
	}
	const gchar *custom_label_2Key = "custom_label_2";
	node = json_object_get_member(pJsonObject, custom_label_2Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_label_2 = new_list;
		}
		
	}
	const gchar *custom_label_3Key = "custom_label_3";
	node = json_object_get_member(pJsonObject, custom_label_3Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_label_3 = new_list;
		}
		
	}
	const gchar *custom_label_4Key = "custom_label_4";
	node = json_object_get_member(pJsonObject, custom_label_4Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			custom_label_4 = new_list;
		}
		
	}
	const gchar *google_product_category_0Key = "google_product_category_0";
	node = json_object_get_member(pJsonObject, google_product_category_0Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_0 = new_list;
		}
		
	}
	const gchar *google_product_category_1Key = "google_product_category_1";
	node = json_object_get_member(pJsonObject, google_product_category_1Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_1 = new_list;
		}
		
	}
	const gchar *google_product_category_2Key = "google_product_category_2";
	node = json_object_get_member(pJsonObject, google_product_category_2Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_2 = new_list;
		}
		
	}
	const gchar *google_product_category_3Key = "google_product_category_3";
	node = json_object_get_member(pJsonObject, google_product_category_3Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_3 = new_list;
		}
		
	}
	const gchar *google_product_category_4Key = "google_product_category_4";
	node = json_object_get_member(pJsonObject, google_product_category_4Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_4 = new_list;
		}
		
	}
	const gchar *google_product_category_5Key = "google_product_category_5";
	node = json_object_get_member(pJsonObject, google_product_category_5Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_5 = new_list;
		}
		
	}
	const gchar *google_product_category_6Key = "google_product_category_6";
	node = json_object_get_member(pJsonObject, google_product_category_6Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			google_product_category_6 = new_list;
		}
		
	}
	const gchar *media_typeKey = "media_type";
	node = json_object_get_member(pJsonObject, media_typeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			media_type = new_list;
		}
		
	}
}

Catalogs_creative_assets_filter_values_map::Catalogs_creative_assets_filter_values_map(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_creative_assets_filter_values_map::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel0());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel0());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_0Key = "custom_label_0";
	json_object_set_member(pJsonObject, custom_label_0Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel1());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel1());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_1Key = "custom_label_1";
	json_object_set_member(pJsonObject, custom_label_1Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel2());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_2Key = "custom_label_2";
	json_object_set_member(pJsonObject, custom_label_2Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel3());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel3());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_3Key = "custom_label_3";
	json_object_set_member(pJsonObject, custom_label_3Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel4());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomLabel4());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_label_4Key = "custom_label_4";
	json_object_set_member(pJsonObject, custom_label_4Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory0());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory0());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_0Key = "google_product_category_0";
	json_object_set_member(pJsonObject, google_product_category_0Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory1());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory1());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_1Key = "google_product_category_1";
	json_object_set_member(pJsonObject, google_product_category_1Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory2());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_2Key = "google_product_category_2";
	json_object_set_member(pJsonObject, google_product_category_2Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory3());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory3());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_3Key = "google_product_category_3";
	json_object_set_member(pJsonObject, google_product_category_3Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory4());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory4());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_4Key = "google_product_category_4";
	json_object_set_member(pJsonObject, google_product_category_4Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory5());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory5());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_5Key = "google_product_category_5";
	json_object_set_member(pJsonObject, google_product_category_5Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory6());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGoogleProductCategory6());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *google_product_category_6Key = "google_product_category_6";
	json_object_set_member(pJsonObject, google_product_category_6Key, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getMediaType());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getMediaType());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *media_typeKey = "media_type";
	json_object_set_member(pJsonObject, media_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getCustomLabel0()
{
	return custom_label_0;
}

void
Catalogs_creative_assets_filter_values_map::setCustomLabel0(std::list <std::string> custom_label_0)
{
	this->custom_label_0 = custom_label_0;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getCustomLabel1()
{
	return custom_label_1;
}

void
Catalogs_creative_assets_filter_values_map::setCustomLabel1(std::list <std::string> custom_label_1)
{
	this->custom_label_1 = custom_label_1;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getCustomLabel2()
{
	return custom_label_2;
}

void
Catalogs_creative_assets_filter_values_map::setCustomLabel2(std::list <std::string> custom_label_2)
{
	this->custom_label_2 = custom_label_2;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getCustomLabel3()
{
	return custom_label_3;
}

void
Catalogs_creative_assets_filter_values_map::setCustomLabel3(std::list <std::string> custom_label_3)
{
	this->custom_label_3 = custom_label_3;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getCustomLabel4()
{
	return custom_label_4;
}

void
Catalogs_creative_assets_filter_values_map::setCustomLabel4(std::list <std::string> custom_label_4)
{
	this->custom_label_4 = custom_label_4;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory0()
{
	return google_product_category_0;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory0(std::list <std::string> google_product_category_0)
{
	this->google_product_category_0 = google_product_category_0;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory1()
{
	return google_product_category_1;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory1(std::list <std::string> google_product_category_1)
{
	this->google_product_category_1 = google_product_category_1;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory2()
{
	return google_product_category_2;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory2(std::list <std::string> google_product_category_2)
{
	this->google_product_category_2 = google_product_category_2;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory3()
{
	return google_product_category_3;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory3(std::list <std::string> google_product_category_3)
{
	this->google_product_category_3 = google_product_category_3;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory4()
{
	return google_product_category_4;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory4(std::list <std::string> google_product_category_4)
{
	this->google_product_category_4 = google_product_category_4;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory5()
{
	return google_product_category_5;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory5(std::list <std::string> google_product_category_5)
{
	this->google_product_category_5 = google_product_category_5;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getGoogleProductCategory6()
{
	return google_product_category_6;
}

void
Catalogs_creative_assets_filter_values_map::setGoogleProductCategory6(std::list <std::string> google_product_category_6)
{
	this->google_product_category_6 = google_product_category_6;
}

std::list<std::string>
Catalogs_creative_assets_filter_values_map::getMediaType()
{
	return media_type;
}

void
Catalogs_creative_assets_filter_values_map::setMediaType(std::list <std::string> media_type)
{
	this->media_type = media_type;
}


