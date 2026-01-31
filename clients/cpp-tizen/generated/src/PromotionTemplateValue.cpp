#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PromotionTemplateValue.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PromotionTemplateValue::PromotionTemplateValue()
{
	//__init();
}

PromotionTemplateValue::~PromotionTemplateValue()
{
	//__cleanup();
}

void
PromotionTemplateValue::__init()
{
	//amount = double(0);
	//currency_code = new Currency();
	//custom_text = std::string();
	//percent = double(0);
}

void
PromotionTemplateValue::__cleanup()
{
	//if(amount != NULL) {
	//
	//delete amount;
	//amount = NULL;
	//}
	//if(currency_code != NULL) {
	//
	//delete currency_code;
	//currency_code = NULL;
	//}
	//if(custom_text != NULL) {
	//
	//delete custom_text;
	//custom_text = NULL;
	//}
	//if(percent != NULL) {
	//
	//delete percent;
	//percent = NULL;
	//}
	//
}

void
PromotionTemplateValue::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *amountKey = "amount";
	node = json_object_get_member(pJsonObject, amountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&amount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currency_codeKey = "currency_code";
	node = json_object_get_member(pJsonObject, currency_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency_code, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency_code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_textKey = "custom_text";
	node = json_object_get_member(pJsonObject, custom_textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *percentKey = "percent";
	node = json_object_get_member(pJsonObject, percentKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&percent, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&percent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PromotionTemplateValue::PromotionTemplateValue(char* json)
{
	this->fromJson(json);
}

char*
PromotionTemplateValue::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *amountKey = "amount";
	json_object_set_member(pJsonObject, amountKey, node);
	if (isprimitive("Currency")) {
		Currency obj = getCurrencyCode();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrencyCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currency_codeKey = "currency_code";
	json_object_set_member(pJsonObject, currency_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_textKey = "custom_text";
	json_object_set_member(pJsonObject, custom_textKey, node);
	if (isprimitive("long long")) {
		long long obj = getPercent();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPercent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *percentKey = "percent";
	json_object_set_member(pJsonObject, percentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PromotionTemplateValue::getAmount()
{
	return amount;
}

void
PromotionTemplateValue::setAmount(long long  amount)
{
	this->amount = amount;
}

Currency
PromotionTemplateValue::getCurrencyCode()
{
	return currency_code;
}

void
PromotionTemplateValue::setCurrencyCode(Currency  currency_code)
{
	this->currency_code = currency_code;
}

std::string
PromotionTemplateValue::getCustomText()
{
	return custom_text;
}

void
PromotionTemplateValue::setCustomText(std::string  custom_text)
{
	this->custom_text = custom_text;
}

long long
PromotionTemplateValue::getPercent()
{
	return percent;
}

void
PromotionTemplateValue::setPercent(long long  percent)
{
	this->percent = percent;
}


