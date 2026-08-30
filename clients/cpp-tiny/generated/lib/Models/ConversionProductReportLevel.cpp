

#include "ConversionProductReportLevel.h"

using namespace Tiny;

ConversionProductReportLevel::ConversionProductReportLevel()
{
}

ConversionProductReportLevel::ConversionProductReportLevel(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportLevel::~ConversionProductReportLevel()
{

}

void
ConversionProductReportLevel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionProductReportLevel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



