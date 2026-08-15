

#include "PromotionResponse.h"

using namespace Tiny;

PromotionResponse::PromotionResponse()
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
	ad_account_id = std::string();
	id = std::string();
	status = EntityStatus();
}

PromotionResponse::PromotionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PromotionResponse::~PromotionResponse()
{

}

void
PromotionResponse::fromJson(std::string jsonObj)
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

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
PromotionResponse::toJson()
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







    object["ad_account_id"] = getAdAccountId();






    object["id"] = getId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
PromotionResponse::getDiscountStatus()
{
	return discount_status;
}

void
PromotionResponse::setDiscountStatus(std::string  discount_status)
{
	this->discount_status = discount_status;
}

int
PromotionResponse::getEndTime()
{
	return end_time;
}

void
PromotionResponse::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::string
PromotionResponse::getExternalId()
{
	return external_id;
}

void
PromotionResponse::setExternalId(std::string  external_id)
{
	this->external_id = external_id;
}

std::string
PromotionResponse::getPlatformType()
{
	return platform_type;
}

void
PromotionResponse::setPlatformType(std::string  platform_type)
{
	this->platform_type = platform_type;
}

std::string
PromotionResponse::getPromotionCode()
{
	return promotion_code;
}

void
PromotionResponse::setPromotionCode(std::string  promotion_code)
{
	this->promotion_code = promotion_code;
}

std::string
PromotionResponse::getPromotionCustomId()
{
	return promotion_custom_id;
}

void
PromotionResponse::setPromotionCustomId(std::string  promotion_custom_id)
{
	this->promotion_custom_id = promotion_custom_id;
}

std::string
PromotionResponse::getPromotionTitle()
{
	return promotion_title;
}

void
PromotionResponse::setPromotionTitle(std::string  promotion_title)
{
	this->promotion_title = promotion_title;
}

PromotionType
PromotionResponse::getPromotionType()
{
	return promotion_type;
}

void
PromotionResponse::setPromotionType(PromotionType  promotion_type)
{
	this->promotion_type = promotion_type;
}

int
PromotionResponse::getStartTime()
{
	return start_time;
}

void
PromotionResponse::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

std::list<PromotionTemplateValue>
PromotionResponse::getTemplateValues()
{
	return template_values;
}

void
PromotionResponse::setTemplateValues(std::list <PromotionTemplateValue> template_values)
{
	this->template_values = template_values;
}

std::string
PromotionResponse::getAdAccountId()
{
	return ad_account_id;
}

void
PromotionResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
PromotionResponse::getId()
{
	return id;
}

void
PromotionResponse::setId(std::string  id)
{
	this->id = id;
}

EntityStatus
PromotionResponse::getStatus()
{
	return status;
}

void
PromotionResponse::setStatus(EntityStatus  status)
{
	this->status = status;
}



