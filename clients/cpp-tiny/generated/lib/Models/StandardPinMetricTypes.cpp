

#include "StandardPinMetricTypes.h"

using namespace Tiny;

StandardPinMetricTypes::StandardPinMetricTypes()
{
}

StandardPinMetricTypes::StandardPinMetricTypes(std::string jsonString)
{
	this->fromJson(jsonString);
}

StandardPinMetricTypes::~StandardPinMetricTypes()
{

}

void
StandardPinMetricTypes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
StandardPinMetricTypes::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



