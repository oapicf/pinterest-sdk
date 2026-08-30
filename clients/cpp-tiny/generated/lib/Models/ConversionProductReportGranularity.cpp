

#include "ConversionProductReportGranularity.h"

using namespace Tiny;

ConversionProductReportGranularity::ConversionProductReportGranularity()
{
}

ConversionProductReportGranularity::ConversionProductReportGranularity(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportGranularity::~ConversionProductReportGranularity()
{

}

void
ConversionProductReportGranularity::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionProductReportGranularity::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



