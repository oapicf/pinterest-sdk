

#include "ConversionProductReportBreakdownType.h"

using namespace Tiny;

ConversionProductReportBreakdownType::ConversionProductReportBreakdownType()
{
}

ConversionProductReportBreakdownType::ConversionProductReportBreakdownType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportBreakdownType::~ConversionProductReportBreakdownType()
{

}

void
ConversionProductReportBreakdownType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionProductReportBreakdownType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



