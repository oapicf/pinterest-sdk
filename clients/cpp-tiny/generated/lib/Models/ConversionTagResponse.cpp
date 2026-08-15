

#include "ConversionTagResponse.h"

using namespace Tiny;

ConversionTagResponse::ConversionTagResponse()
{
	code_snippet = std::string();
	configs = null;
	enhanced_match_status = null;
	id = std::string();
	last_fired_time_ms = float(0);
	name = std::string();
	version = std::string();
	ad_account_id = std::string();
	status = null;
}

ConversionTagResponse::ConversionTagResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagResponse::~ConversionTagResponse()
{

}

void
ConversionTagResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *code_snippetKey = "code_snippet";

    if(object.has_key(code_snippetKey))
    {
        bourne::json value = object[code_snippetKey];



        jsonToValue(&code_snippet, value, "std::string");


    }

    const char *configsKey = "configs";

    if(object.has_key(configsKey))
    {
        bourne::json value = object[configsKey];




        ConversionTagConfigs* obj = &configs;
		obj->fromJson(value.dump());

    }

    const char *enhanced_match_statusKey = "enhanced_match_status";

    if(object.has_key(enhanced_match_statusKey))
    {
        bourne::json value = object[enhanced_match_statusKey];




        EnhancedMatchStatusType* obj = &enhanced_match_status;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *last_fired_time_msKey = "last_fired_time_ms";

    if(object.has_key(last_fired_time_msKey))
    {
        bourne::json value = object[last_fired_time_msKey];



        jsonToValue(&last_fired_time_ms, value, "long");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];



        jsonToValue(&version, value, "std::string");


    }

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


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
ConversionTagResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["code_snippet"] = getCodeSnippet();







	object["configs"] = getConfigs().toJson();






	object["enhanced_match_status"] = getEnhancedMatchStatus().toJson();





    object["id"] = getId();






    object["last_fired_time_ms"] = getLastFiredTimeMs();






    object["name"] = getName();






    object["version"] = getVersion();






    object["ad_account_id"] = getAdAccountId();







	object["status"] = getStatus().toJson();


    return object;

}

std::string
ConversionTagResponse::getCodeSnippet()
{
	return code_snippet;
}

void
ConversionTagResponse::setCodeSnippet(std::string  code_snippet)
{
	this->code_snippet = code_snippet;
}

ConversionTagConfigs
ConversionTagResponse::getConfigs()
{
	return configs;
}

void
ConversionTagResponse::setConfigs(ConversionTagConfigs  configs)
{
	this->configs = configs;
}

EnhancedMatchStatusType
ConversionTagResponse::getEnhancedMatchStatus()
{
	return enhanced_match_status;
}

void
ConversionTagResponse::setEnhancedMatchStatus(EnhancedMatchStatusType  enhanced_match_status)
{
	this->enhanced_match_status = enhanced_match_status;
}

std::string
ConversionTagResponse::getId()
{
	return id;
}

void
ConversionTagResponse::setId(std::string  id)
{
	this->id = id;
}

long
ConversionTagResponse::getLastFiredTimeMs()
{
	return last_fired_time_ms;
}

void
ConversionTagResponse::setLastFiredTimeMs(long  last_fired_time_ms)
{
	this->last_fired_time_ms = last_fired_time_ms;
}

std::string
ConversionTagResponse::getName()
{
	return name;
}

void
ConversionTagResponse::setName(std::string  name)
{
	this->name = name;
}

std::string
ConversionTagResponse::getVersion()
{
	return version;
}

void
ConversionTagResponse::setVersion(std::string  version)
{
	this->version = version;
}

std::string
ConversionTagResponse::getAdAccountId()
{
	return ad_account_id;
}

void
ConversionTagResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

EntityStatus
ConversionTagResponse::getStatus()
{
	return status;
}

void
ConversionTagResponse::setStatus(EntityStatus  status)
{
	this->status = status;
}



