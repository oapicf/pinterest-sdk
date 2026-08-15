

#include "KeywordMetrics.h"

using namespace Tiny;

KeywordMetrics::KeywordMetrics()
{
	keyword_query_volume = std::string();
}

KeywordMetrics::KeywordMetrics(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordMetrics::~KeywordMetrics()
{

}

void
KeywordMetrics::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keyword_query_volumeKey = "keyword_query_volume";

    if(object.has_key(keyword_query_volumeKey))
    {
        bourne::json value = object[keyword_query_volumeKey];



        jsonToValue(&keyword_query_volume, value, "std::string");


    }


}

bourne::json
KeywordMetrics::toJson()
{
    bourne::json object = bourne::json::object();





    object["keyword_query_volume"] = getKeywordQueryVolume();



    return object;

}

std::string
KeywordMetrics::getKeywordQueryVolume()
{
	return keyword_query_volume;
}

void
KeywordMetrics::setKeywordQueryVolume(std::string  keyword_query_volume)
{
	this->keyword_query_volume = keyword_query_volume;
}



