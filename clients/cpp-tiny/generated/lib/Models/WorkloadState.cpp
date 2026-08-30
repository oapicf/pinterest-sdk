

#include "WorkloadState.h"

using namespace Tiny;

WorkloadState::WorkloadState()
{
}

WorkloadState::WorkloadState(std::string jsonString)
{
	this->fromJson(jsonString);
}

WorkloadState::~WorkloadState()
{

}

void
WorkloadState::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
WorkloadState::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



