

#include "CustomerListStatus.h"

using namespace Tiny;

CustomerListStatus::CustomerListStatus()
{
}

CustomerListStatus::CustomerListStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListStatus::~CustomerListStatus()
{

}

void
CustomerListStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CustomerListStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



