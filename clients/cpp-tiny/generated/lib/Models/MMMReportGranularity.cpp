

#include "MMMReportGranularity.h"

using namespace Tiny;

MMMReportGranularity::MMMReportGranularity()
{
}

MMMReportGranularity::MMMReportGranularity(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReportGranularity::~MMMReportGranularity()
{

}

void
MMMReportGranularity::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MMMReportGranularity::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



