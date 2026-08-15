

#include "BulkEntityType.h"

using namespace Tiny;

BulkEntityType::BulkEntityType()
{
}

BulkEntityType::BulkEntityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkEntityType::~BulkEntityType()
{

}

void
BulkEntityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BulkEntityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



