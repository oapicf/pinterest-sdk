

#include "ReportingColumnAsync.h"

using namespace Tiny;

ReportingColumnAsync::ReportingColumnAsync()
{
}

ReportingColumnAsync::ReportingColumnAsync(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportingColumnAsync::~ReportingColumnAsync()
{

}

void
ReportingColumnAsync::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportingColumnAsync::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



