

#include "ReportingColumnSync.h"

using namespace Tiny;

ReportingColumnSync::ReportingColumnSync()
{
}

ReportingColumnSync::ReportingColumnSync(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportingColumnSync::~ReportingColumnSync()
{

}

void
ReportingColumnSync::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportingColumnSync::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



