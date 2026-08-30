

#include "KeywordMetricsResponse.h"

using namespace Tiny;

KeywordMetricsResponse::KeywordMetricsResponse()
{
	keyword = std::string();
	metrics = KeywordMetrics();
}

KeywordMetricsResponse::KeywordMetricsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordMetricsResponse::~KeywordMetricsResponse()
{

}

void
KeywordMetricsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keywordKey = "keyword";

    if(object.has_key(keywordKey))
    {
        bourne::json value = object[keywordKey];



        jsonToValue(&keyword, value, "std::string");


    }

    const char *metricsKey = "metrics";

    if(object.has_key(metricsKey))
    {
        bourne::json value = object[metricsKey];




        KeywordMetrics* obj = &metrics;
		obj->fromJson(value.dump());

    }


}

bourne::json
KeywordMetricsResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["keyword"] = getKeyword();







	object["metrics"] = getMetrics().toJson();


    return object;

}

std::string
KeywordMetricsResponse::getKeyword()
{
	return keyword;
}

void
KeywordMetricsResponse::setKeyword(std::string keyword)
{
	this->keyword = keyword;
}

KeywordMetrics
KeywordMetricsResponse::getMetrics()
{
	return metrics;
}

void
KeywordMetricsResponse::setMetrics(KeywordMetrics metrics)
{
	this->metrics = metrics;
}



