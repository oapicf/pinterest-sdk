

#include "ReportType.h"

using namespace Tiny;

ReportType::ReportType()
{
}

ReportType::ReportType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportType::~ReportType()
{

}

void
ReportType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



