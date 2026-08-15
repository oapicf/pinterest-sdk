

#include "ConversionProductReportingColumn.h"

using namespace Tiny;

ConversionProductReportingColumn::ConversionProductReportingColumn()
{
}

ConversionProductReportingColumn::ConversionProductReportingColumn(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionProductReportingColumn::~ConversionProductReportingColumn()
{

}

void
ConversionProductReportingColumn::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionProductReportingColumn::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



