

#include "PromotionCreate.h"

using namespace Tiny;

PromotionCreate::PromotionCreate()
{
	discount_status = DiscountStatus();
	end_time = int(0);
	external_id = std::string();
	platform_type = std::string();
	promotion_code = std::string();
	promotion_custom_id = std::string();
	promotion_title = std::string();
	promotion_type = PromotionType();
	start_time = int(0);
	template_values = std::list<PromotionTemplateValue>();
}

PromotionCreate::PromotionCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionCreate::~PromotionCreate()
{

}

void
PromotionCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *discount_statusKey = "discount_status";

    if(object.has_key(discount_statusKey))
    {
        bourne::json value = object[discount_statusKey];




        DiscountStatus* obj = &discount_status;
		obj->fromJson(value.dump());

    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "int");


    }

    const char *external_idKey = "external_id";

    if(object.has_key(external_idKey))
    {
        bourne::json value = object[external_idKey];



        jsonToValue(&external_id, value, "std::string");


    }

    const char *platform_typeKey = "platform_type";

    if(object.has_key(platform_typeKey))
    {
        bourne::json value = object[platform_typeKey];



        jsonToValue(&platform_type, value, "std::string");


    }

    const char *promotion_codeKey = "promotion_code";

    if(object.has_key(promotion_codeKey))
    {
        bourne::json value = object[promotion_codeKey];



        jsonToValue(&promotion_code, value, "std::string");


    }

    const char *promotion_custom_idKey = "promotion_custom_id";

    if(object.has_key(promotion_custom_idKey))
    {
        bourne::json value = object[promotion_custom_idKey];



        jsonToValue(&promotion_custom_id, value, "std::string");


    }

    const char *promotion_titleKey = "promotion_title";

    if(object.has_key(promotion_titleKey))
    {
        bourne::json value = object[promotion_titleKey];



        jsonToValue(&promotion_title, value, "std::string");


    }

    const char *promotion_typeKey = "promotion_type";

    if(object.has_key(promotion_typeKey))
    {
        bourne::json value = object[promotion_typeKey];




        PromotionType* obj = &promotion_type;
		obj->fromJson(value.dump());

    }

    const char *start_timeKey = "start_time";

    if(object.has_key(start_timeKey))
    {
        bourne::json value = object[start_timeKey];



        jsonToValue(&start_time, value, "int");


    }

    const char *template_valuesKey = "template_values";

    if(object.has_key(template_valuesKey))
    {
        bourne::json value = object[template_valuesKey];


        std::list<PromotionTemplateValue> template_values_list;
        PromotionTemplateValue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            template_values_list.push_back(element);
        }
        template_values = template_values_list;


    }


}

bourne::json
PromotionCreate::toJson()
{
    bourne::json object = bourne::json::object();






	object["discount_status"] = getDiscountStatus().toJson();





    object["end_time"] = getEndTime();






    object["external_id"] = getExternalId();






    object["platform_type"] = getPlatformType();






    object["promotion_code"] = getPromotionCode();






    object["promotion_custom_id"] = getPromotionCustomId();






    object["promotion_title"] = getPromotionTitle();







	object["promotion_type"] = getPromotionType().toJson();





    object["start_time"] = getStartTime();





    std::list<PromotionTemplateValue> template_values_list = getTemplateValues();
    bourne::json template_values_arr = bourne::json::array();

    for(auto& var : template_values_list)
    {
        PromotionTemplateValue obj = var;
        template_values_arr.append(obj.toJson());
    }
    object["template_values"] = template_values_arr;




    return object;

}

DiscountStatus
PromotionCreate::getDiscountStatus()
{
	return discount_status;
}

void
PromotionCreate::setDiscountStatus(DiscountStatus discount_status)
{
	this->discount_status = discount_status;
}

int
PromotionCreate::getEndTime()
{
	return end_time;
}

void
PromotionCreate::setEndTime(int end_time)
{
	this->end_time = end_time;
}

std::string
PromotionCreate::getExternalId()
{
	return external_id;
}

void
PromotionCreate::setExternalId(std::string external_id)
{
	this->external_id = external_id;
}

std::string
PromotionCreate::getPlatformType()
{
	return platform_type;
}

void
PromotionCreate::setPlatformType(std::string platform_type)
{
	this->platform_type = platform_type;
}

std::string
PromotionCreate::getPromotionCode()
{
	return promotion_code;
}

void
PromotionCreate::setPromotionCode(std::string promotion_code)
{
	this->promotion_code = promotion_code;
}

std::string
PromotionCreate::getPromotionCustomId()
{
	return promotion_custom_id;
}

void
PromotionCreate::setPromotionCustomId(std::string promotion_custom_id)
{
	this->promotion_custom_id = promotion_custom_id;
}

std::string
PromotionCreate::getPromotionTitle()
{
	return promotion_title;
}

void
PromotionCreate::setPromotionTitle(std::string promotion_title)
{
	this->promotion_title = promotion_title;
}

PromotionType
PromotionCreate::getPromotionType()
{
	return promotion_type;
}

void
PromotionCreate::setPromotionType(PromotionType promotion_type)
{
	this->promotion_type = promotion_type;
}

int
PromotionCreate::getStartTime()
{
	return start_time;
}

void
PromotionCreate::setStartTime(int start_time)
{
	this->start_time = start_time;
}

std::list<PromotionTemplateValue>
PromotionCreate::getTemplateValues()
{
	return template_values;
}

void
PromotionCreate::setTemplateValues(std::list<PromotionTemplateValue> template_values)
{
	this->template_values = template_values;
}



