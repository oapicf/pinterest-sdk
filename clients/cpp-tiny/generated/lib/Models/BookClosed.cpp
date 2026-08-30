

#include "BookClosed.h"

using namespace Tiny;

BookClosed::BookClosed()
{
	conversion_metrics_ready = bool(false);
	non_conversion_metrics_ready = bool(false);
}

BookClosed::BookClosed(std::string jsonString)
{
	this->fromJson(jsonString);
}

BookClosed::~BookClosed()
{

}

void
BookClosed::fromJson(std::string jsonObj)
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
BookClosed::toJson()
{
    bourne::json object = bourne::json::object();





    object["conversion_metrics_ready"] = isConversionMetricsReady();






    object["non_conversion_metrics_ready"] = isNonConversionMetricsReady();



    return object;

}

bool
BookClosed::isConversionMetricsReady()
{
	return conversion_metrics_ready;
}

void
BookClosed::setConversionMetricsReady(bool conversion_metrics_ready)
{
	this->conversion_metrics_ready = conversion_metrics_ready;
}

bool
BookClosed::isNonConversionMetricsReady()
{
	return non_conversion_metrics_ready;
}

void
BookClosed::setNonConversionMetricsReady(bool non_conversion_metrics_ready)
{
	this->non_conversion_metrics_ready = non_conversion_metrics_ready;
}



