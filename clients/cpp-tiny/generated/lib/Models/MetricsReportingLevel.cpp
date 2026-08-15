

#include "MetricsReportingLevel.h"

using namespace Tiny;

MetricsReportingLevel::MetricsReportingLevel()
{
}

MetricsReportingLevel::MetricsReportingLevel(std::string jsonString)
{
	this->fromJson(jsonString);
}

MetricsReportingLevel::~MetricsReportingLevel()
{

}

void
MetricsReportingLevel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MetricsReportingLevel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



