

#include "VideoPinMetricTypes.h"

using namespace Tiny;

VideoPinMetricTypes::VideoPinMetricTypes()
{
}

VideoPinMetricTypes::VideoPinMetricTypes(std::string jsonString)
{
	this->fromJson(jsonString);
}

VideoPinMetricTypes::~VideoPinMetricTypes()
{

}

void
VideoPinMetricTypes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
VideoPinMetricTypes::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



