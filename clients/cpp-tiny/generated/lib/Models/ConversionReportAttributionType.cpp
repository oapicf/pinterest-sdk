

#include "ConversionReportAttributionType.h"

using namespace Tiny;

ConversionReportAttributionType::ConversionReportAttributionType()
{
}

ConversionReportAttributionType::ConversionReportAttributionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionReportAttributionType::~ConversionReportAttributionType()
{

}

void
ConversionReportAttributionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionReportAttributionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



