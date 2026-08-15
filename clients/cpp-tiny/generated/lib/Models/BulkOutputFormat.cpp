

#include "BulkOutputFormat.h"

using namespace Tiny;

BulkOutputFormat::BulkOutputFormat()
{
}

BulkOutputFormat::BulkOutputFormat(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkOutputFormat::~BulkOutputFormat()
{

}

void
BulkOutputFormat::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BulkOutputFormat::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



