

#include "BookClosedResponse.h"

using namespace Tiny;

BookClosedResponse::BookClosedResponse()
{
	conversion_metrics_ready = bool(false);
	non_conversion_metrics_ready = bool(false);
}

BookClosedResponse::BookClosedResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BookClosedResponse::~BookClosedResponse()
{

}

void
BookClosedResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *conversion_metrics_readyKey = "conversion_metrics_ready";

    if(object.has_key(conversion_metrics_readyKey))
    {
        bourne::json value = object[conversion_metrics_readyKey];



        jsonToValue(&conversion_metrics_ready, value, "bool");


    }

    const char *non_conversion_metrics_readyKey = "non_conversion_metrics_ready";

    if(object.has_key(non_conversion_metrics_readyKey))
    {
        bourne::json value = object[non_conversion_metrics_readyKey];



        jsonToValue(&non_conversion_metrics_ready, value, "bool");


    }


}

bourne::json
BookClosedResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["conversion_metrics_ready"] = isConversionMetricsReady();






    object["non_conversion_metrics_ready"] = isNonConversionMetricsReady();



    return object;

}

bool
BookClosedResponse::isConversionMetricsReady()
{
	return conversion_metrics_ready;
}

void
BookClosedResponse::setConversionMetricsReady(bool  conversion_metrics_ready)
{
	this->conversion_metrics_ready = conversion_metrics_ready;
}

bool
BookClosedResponse::isNonConversionMetricsReady()
{
	return non_conversion_metrics_ready;
}

void
BookClosedResponse::setNonConversionMetricsReady(bool  non_conversion_metrics_ready)
{
	this->non_conversion_metrics_ready = non_conversion_metrics_ready;
}



