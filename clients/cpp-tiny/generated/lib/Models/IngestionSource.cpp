

#include "IngestionSource.h"

using namespace Tiny;

IngestionSource::IngestionSource()
{
}

IngestionSource::IngestionSource(std::string jsonString)
{
	this->fromJson(jsonString);
}

IngestionSource::~IngestionSource()
{

}

void
IngestionSource::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IngestionSource::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



