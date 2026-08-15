

#include "ReportingTimeZone.h"

using namespace Tiny;

ReportingTimeZone::ReportingTimeZone()
{
}

ReportingTimeZone::ReportingTimeZone(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportingTimeZone::~ReportingTimeZone()
{

}

void
ReportingTimeZone::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportingTimeZone::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



