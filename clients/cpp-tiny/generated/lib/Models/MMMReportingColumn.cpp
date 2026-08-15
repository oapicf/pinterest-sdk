

#include "MMMReportingColumn.h"

using namespace Tiny;

MMMReportingColumn::MMMReportingColumn()
{
}

MMMReportingColumn::MMMReportingColumn(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReportingColumn::~MMMReportingColumn()
{

}

void
MMMReportingColumn::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MMMReportingColumn::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



