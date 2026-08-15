

#include "PromotionCommon.h"

using namespace Tiny;

PromotionCommon::PromotionCommon()
{
	discount_status = std::string();
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

PromotionCommon::PromotionCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionCommon::~PromotionCommon()
{

}

void
PromotionCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *discount_statusKey = "discount_status";

    if(object.has_key(discount_statusKey))
    {
        bourne::json value = object[discount_statusKey];



        jsonToValue(&discount_status, value, "std::string");


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
PromotionCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["discount_status"] = getDiscountStatus();






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

std::string
PromotionCommon::getDiscountStatus()
{
	return discount_status;
}

void
PromotionCommon::setDiscountStatus(std::string  discount_status)
{
	this->discount_status = discount_status;
}

int
PromotionCommon::getEndTime()
{
	return end_time;
}

void
PromotionCommon::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::string
PromotionCommon::getExternalId()
{
	return external_id;
}

void
PromotionCommon::setExternalId(std::string  external_id)
{
	this->external_id = external_id;
}

std::string
PromotionCommon::getPlatformType()
{
	return platform_type;
}

void
PromotionCommon::setPlatformType(std::string  platform_type)
{
	this->platform_type = platform_type;
}

std::string
PromotionCommon::getPromotionCode()
{
	return promotion_code;
}

void
PromotionCommon::setPromotionCode(std::string  promotion_code)
{
	this->promotion_code = promotion_code;
}

std::string
PromotionCommon::getPromotionCustomId()
{
	return promotion_custom_id;
}

void
PromotionCommon::setPromotionCustomId(std::string  promotion_custom_id)
{
	this->promotion_custom_id = promotion_custom_id;
}

std::string
PromotionCommon::getPromotionTitle()
{
	return promotion_title;
}

void
PromotionCommon::setPromotionTitle(std::string  promotion_title)
{
	this->promotion_title = promotion_title;
}

PromotionType
PromotionCommon::getPromotionType()
{
	return promotion_type;
}

void
PromotionCommon::setPromotionType(PromotionType  promotion_type)
{
	this->promotion_type = promotion_type;
}

int
PromotionCommon::getStartTime()
{
	return start_time;
}

void
PromotionCommon::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

std::list<PromotionTemplateValue>
PromotionCommon::getTemplateValues()
{
	return template_values;
}

void
PromotionCommon::setTemplateValues(std::list <PromotionTemplateValue> template_values)
{
	this->template_values = template_values;
}



