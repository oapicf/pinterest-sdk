

#include "DataStatus.h"

using namespace Tiny;

DataStatus::DataStatus()
{
}

DataStatus::DataStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

DataStatus::~DataStatus()
{

}

void
DataStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DataStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



