

#include "MetricsReportingTemplateType.h"

using namespace Tiny;

MetricsReportingTemplateType::MetricsReportingTemplateType()
{
}

MetricsReportingTemplateType::MetricsReportingTemplateType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MetricsReportingTemplateType::~MetricsReportingTemplateType()
{

}

void
MetricsReportingTemplateType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MetricsReportingTemplateType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



