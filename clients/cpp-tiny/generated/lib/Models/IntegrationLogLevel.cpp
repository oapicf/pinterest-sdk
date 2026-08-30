

#include "IntegrationLogLevel.h"

using namespace Tiny;

IntegrationLogLevel::IntegrationLogLevel()
{
}

IntegrationLogLevel::IntegrationLogLevel(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogLevel::~IntegrationLogLevel()
{

}

void
IntegrationLogLevel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IntegrationLogLevel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



