

#include "ConversionEventIngestionSource.h"

using namespace Tiny;

ConversionEventIngestionSource::ConversionEventIngestionSource()
{
}

ConversionEventIngestionSource::ConversionEventIngestionSource(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionEventIngestionSource::~ConversionEventIngestionSource()
{

}

void
ConversionEventIngestionSource::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionEventIngestionSource::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



