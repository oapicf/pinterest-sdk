

#include "PromotionTemplateValue.h"

using namespace Tiny;

PromotionTemplateValue::PromotionTemplateValue()
{
	amount = float(0);
	currency_code = Currency();
	custom_text = std::string();
	percent = float(0);
}

PromotionTemplateValue::PromotionTemplateValue(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionTemplateValue::~PromotionTemplateValue()
{

}

void
PromotionTemplateValue::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *amountKey = "amount";

    if(object.has_key(amountKey))
    {
        bourne::json value = object[amountKey];



        jsonToValue(&amount, value, "long");


    }

    const char *currency_codeKey = "currency_code";

    if(object.has_key(currency_codeKey))
    {
        bourne::json value = object[currency_codeKey];




        Currency* obj = &currency_code;
		obj->fromJson(value.dump());

    }

    const char *custom_textKey = "custom_text";

    if(object.has_key(custom_textKey))
    {
        bourne::json value = object[custom_textKey];



        jsonToValue(&custom_text, value, "std::string");


    }

    const char *percentKey = "percent";

    if(object.has_key(percentKey))
    {
        bourne::json value = object[percentKey];



        jsonToValue(&percent, value, "long");


    }


}

bourne::json
PromotionTemplateValue::toJson()
{
    bourne::json object = bourne::json::object();





    object["amount"] = getAmount();







	object["currency_code"] = getCurrencyCode().toJson();





    object["custom_text"] = getCustomText();






    object["percent"] = getPercent();



    return object;

}

long
PromotionTemplateValue::getAmount()
{
	return amount;
}

void
PromotionTemplateValue::setAmount(long amount)
{
	this->amount = amount;
}

Currency
PromotionTemplateValue::getCurrencyCode()
{
	return currency_code;
}

void
PromotionTemplateValue::setCurrencyCode(Currency currency_code)
{
	this->currency_code = currency_code;
}

std::string
PromotionTemplateValue::getCustomText()
{
	return custom_text;
}

void
PromotionTemplateValue::setCustomText(std::string custom_text)
{
	this->custom_text = custom_text;
}

long
PromotionTemplateValue::getPercent()
{
	return percent;
}

void
PromotionTemplateValue::setPercent(long percent)
{
	this->percent = percent;
}



