

#include "IngestionSourceOptions.h"

using namespace Tiny;

IngestionSourceOptions::IngestionSourceOptions()
{
}

IngestionSourceOptions::IngestionSourceOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

IngestionSourceOptions::~IngestionSourceOptions()
{

}

void
IngestionSourceOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IngestionSourceOptions::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



