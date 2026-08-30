

#include "IntegrationLogEventType.h"

using namespace Tiny;

IntegrationLogEventType::IntegrationLogEventType()
{
}

IntegrationLogEventType::IntegrationLogEventType(std::string jsonString)
{
	this->fromJson(jsonString);
}

IntegrationLogEventType::~IntegrationLogEventType()
{

}

void
IntegrationLogEventType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IntegrationLogEventType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



