

#include "DataOutputFormat.h"

using namespace Tiny;

DataOutputFormat::DataOutputFormat()
{
}

DataOutputFormat::DataOutputFormat(std::string jsonString)
{
	this->fromJson(jsonString);
}

DataOutputFormat::~DataOutputFormat()
{

}

void
DataOutputFormat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
DataOutputFormat::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



