

#include "NullableEntityStatus.h"

using namespace Tiny;

NullableEntityStatus::NullableEntityStatus()
{
}

NullableEntityStatus::NullableEntityStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullableEntityStatus::~NullableEntityStatus()
{

}

void
NullableEntityStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullableEntityStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



