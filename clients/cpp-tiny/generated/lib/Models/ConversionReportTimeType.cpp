

#include "ConversionReportTimeType.h"

using namespace Tiny;

ConversionReportTimeType::ConversionReportTimeType()
{
}

ConversionReportTimeType::ConversionReportTimeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionReportTimeType::~ConversionReportTimeType()
{

}

void
ConversionReportTimeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionReportTimeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



