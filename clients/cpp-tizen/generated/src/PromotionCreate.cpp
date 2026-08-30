#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromotionCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromotionCreate::PromotionCreate()
{
	//__init();
}

PromotionCreate::~PromotionCreate()
{
	//__cleanup();
}

void
PromotionCreate::__init()
{
	//discount_status = new DiscountStatus();
	//end_time = int(0);
	//external_id = std::string();
	//platform_type = std::string();
	//promotion_code = std::string();
	//promotion_custom_id = std::string();
	//promotion_title = std::string();
	//promotion_type = new PromotionType();
	//start_time = int(0);
	//new std::list()std::list> template_values;
}

void
PromotionCreate::__cleanup()
{
	//if(discount_status != NULL) {
	//
	//delete discount_status;
	//discount_status = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(external_id != NULL) {
	//
	//delete external_id;
	//external_id = NULL;
	//}
	//if(platform_type != NULL) {
	//
	//delete platform_type;
	//platform_type = NULL;
	//}
	//if(promotion_code != NULL) {
	//
	//delete promotion_code;
	//promotion_code = NULL;
	//}
	//if(promotion_custom_id != NULL) {
	//
	//delete promotion_custom_id;
	//promotion_custom_id = NULL;
	//}
	//if(promotion_title != NULL) {
	//
	//delete promotion_title;
	//promotion_title = NULL;
	//}
	//if(promotion_type != NULL) {
	//
	//delete promotion_type;
	//promotion_type = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(template_values != NULL) {
	//template_values.RemoveAll(true);
	//delete template_values;
	//template_values = NULL;
	//}
	//
}

void
PromotionCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *discount_statusKey = "discount_status";
	node = json_object_get_member(pJsonObject, discount_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("DiscountStatus")) {
			jsonToValue(&discount_status, node, "DiscountStatus", "DiscountStatus");
		} else {
			
			DiscountStatus* obj = static_cast<DiscountStatus*> (&discount_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *external_idKey = "external_id";
	node = json_object_get_member(pJsonObject, external_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&external_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *platform_typeKey = "platform_type";
	node = json_object_get_member(pJsonObject, platform_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&platform_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promotion_codeKey = "promotion_code";
	node = json_object_get_member(pJsonObject, promotion_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promotion_custom_idKey = "promotion_custom_id";
	node = json_object_get_member(pJsonObject, promotion_custom_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_custom_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promotion_titleKey = "promotion_title";
	node = json_object_get_member(pJsonObject, promotion_titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&promotion_title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *promotion_typeKey = "promotion_type";
	node = json_object_get_member(pJsonObject, promotion_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PromotionType")) {
			jsonToValue(&promotion_type, node, "PromotionType", "PromotionType");
		} else {
			
			PromotionType* obj = static_cast<PromotionType*> (&promotion_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *template_valuesKey = "template_values";
	node = json_object_get_member(pJsonObject, template_valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PromotionTemplateValue> new_list;
			PromotionTemplateValue inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PromotionTemplateValue")) {
					jsonToValue(&inst, temp_json, "PromotionTemplateValue", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			template_values = new_list;
		}
		
	}
}

PromotionCreate::PromotionCreate(char* json)
{
	this->fromJson(json);
}

char*
PromotionCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DiscountStatus")) {
		DiscountStatus obj = getDiscountStatus();
		node = converttoJson(&obj, "DiscountStatus", "");
	}
	else {
		
		DiscountStatus obj = static_cast<DiscountStatus> (getDiscountStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discount_statusKey = "discount_status";
	json_object_set_member(pJsonObject, discount_statusKey, node);
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *external_idKey = "external_id";
	json_object_set_member(pJsonObject, external_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlatformType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *platform_typeKey = "platform_type";
	json_object_set_member(pJsonObject, platform_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromotionCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promotion_codeKey = "promotion_code";
	json_object_set_member(pJsonObject, promotion_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromotionCustomId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promotion_custom_idKey = "promotion_custom_id";
	json_object_set_member(pJsonObject, promotion_custom_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPromotionTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *promotion_titleKey = "promotion_title";
	json_object_set_member(pJsonObject, promotion_titleKey, node);
	if (isprimitive("PromotionType")) {
		PromotionType obj = getPromotionType();
		node = converttoJson(&obj, "PromotionType", "");
	}
	else {
		
		PromotionType obj = static_cast<PromotionType> (getPromotionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *promotion_typeKey = "promotion_type";
	json_object_set_member(pJsonObject, promotion_typeKey, node);
	if (isprimitive("int")) {
		int obj = getStartTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	if (isprimitive("PromotionTemplateValue")) {
		list<PromotionTemplateValue> new_list = static_cast<list <PromotionTemplateValue> > (getTemplateValues());
		node = converttoJson(&new_list, "PromotionTemplateValue", "array");
	} else {
		node = json_node_alloc();
		list<PromotionTemplateValue> new_list = static_cast<list <PromotionTemplateValue> > (getTemplateValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PromotionTemplateValue>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PromotionTemplateValue obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *template_valuesKey = "template_values";
	json_object_set_member(pJsonObject, template_valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

DiscountStatus
PromotionCreate::getDiscountStatus()
{
	return discount_status;
}

void
PromotionCreate::setDiscountStatus(DiscountStatus  discount_status)
{
	this->discount_status = discount_status;
}

int
PromotionCreate::getEndTime()
{
	return end_time;
}

void
PromotionCreate::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::string
PromotionCreate::getExternalId()
{
	return external_id;
}

void
PromotionCreate::setExternalId(std::string  external_id)
{
	this->external_id = external_id;
}

std::string
PromotionCreate::getPlatformType()
{
	return platform_type;
}

void
PromotionCreate::setPlatformType(std::string  platform_type)
{
	this->platform_type = platform_type;
}

std::string
PromotionCreate::getPromotionCode()
{
	return promotion_code;
}

void
PromotionCreate::setPromotionCode(std::string  promotion_code)
{
	this->promotion_code = promotion_code;
}

std::string
PromotionCreate::getPromotionCustomId()
{
	return promotion_custom_id;
}

void
PromotionCreate::setPromotionCustomId(std::string  promotion_custom_id)
{
	this->promotion_custom_id = promotion_custom_id;
}

std::string
PromotionCreate::getPromotionTitle()
{
	return promotion_title;
}

void
PromotionCreate::setPromotionTitle(std::string  promotion_title)
{
	this->promotion_title = promotion_title;
}

PromotionType
PromotionCreate::getPromotionType()
{
	return promotion_type;
}

void
PromotionCreate::setPromotionType(PromotionType  promotion_type)
{
	this->promotion_type = promotion_type;
}

int
PromotionCreate::getStartTime()
{
	return start_time;
}

void
PromotionCreate::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

std::list<PromotionTemplateValue>
PromotionCreate::getTemplateValues()
{
	return template_values;
}

void
PromotionCreate::setTemplateValues(std::list <PromotionTemplateValue> template_values)
{
	this->template_values = template_values;
}


