

#include "ReportingColumn.h"

using namespace Tiny;

ReportingColumn::ReportingColumn()
{
}

ReportingColumn::ReportingColumn(std::string jsonString)
{
	this->fromJson(jsonString);
}

ReportingColumn::~ReportingColumn()
{

}

void
ReportingColumn::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ReportingColumn::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



