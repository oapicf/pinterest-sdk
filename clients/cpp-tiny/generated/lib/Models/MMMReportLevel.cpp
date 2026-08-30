

#include "MMMReportLevel.h"

using namespace Tiny;

MMMReportLevel::MMMReportLevel()
{
}

MMMReportLevel::MMMReportLevel(std::string jsonString)
{
	this->fromJson(jsonString);
}

MMMReportLevel::~MMMReportLevel()
{

}

void
MMMReportLevel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MMMReportLevel::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



