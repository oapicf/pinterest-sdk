

#include "ConversionTagCommon.h"

using namespace Tiny;

ConversionTagCommon::ConversionTagCommon()
{
	code_snippet = std::string();
	configs = null;
	enhanced_match_status = null;
	id = std::string();
	last_fired_time_ms = float(0);
	name = std::string();
	version = std::string();
}

ConversionTagCommon::ConversionTagCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagCommon::~ConversionTagCommon()
{

}

void
ConversionTagCommon::fromJson(std::string jsonObj)
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


}

bourne::json
ConversionTagCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["code_snippet"] = getCodeSnippet();







	object["configs"] = getConfigs().toJson();






	object["enhanced_match_status"] = getEnhancedMatchStatus().toJson();





    object["id"] = getId();






    object["last_fired_time_ms"] = getLastFiredTimeMs();






    object["name"] = getName();






    object["version"] = getVersion();



    return object;

}

std::string
ConversionTagCommon::getCodeSnippet()
{
	return code_snippet;
}

void
ConversionTagCommon::setCodeSnippet(std::string code_snippet)
{
	this->code_snippet = code_snippet;
}

ConversionTagConfigs
ConversionTagCommon::getConfigs()
{
	return configs;
}

void
ConversionTagCommon::setConfigs(ConversionTagConfigs configs)
{
	this->configs = configs;
}

EnhancedMatchStatusType
ConversionTagCommon::getEnhancedMatchStatus()
{
	return enhanced_match_status;
}

void
ConversionTagCommon::setEnhancedMatchStatus(EnhancedMatchStatusType enhanced_match_status)
{
	this->enhanced_match_status = enhanced_match_status;
}

std::string
ConversionTagCommon::getId()
{
	return id;
}

void
ConversionTagCommon::setId(std::string id)
{
	this->id = id;
}

long
ConversionTagCommon::getLastFiredTimeMs()
{
	return last_fired_time_ms;
}

void
ConversionTagCommon::setLastFiredTimeMs(long last_fired_time_ms)
{
	this->last_fired_time_ms = last_fired_time_ms;
}

std::string
ConversionTagCommon::getName()
{
	return name;
}

void
ConversionTagCommon::setName(std::string name)
{
	this->name = name;
}

std::string
ConversionTagCommon::getVersion()
{
	return version;
}

void
ConversionTagCommon::setVersion(std::string version)
{
	this->version = version;
}



