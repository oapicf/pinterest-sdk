

#include "BatchOperationStatus.h"

using namespace Tiny;

BatchOperationStatus::BatchOperationStatus()
{
}

BatchOperationStatus::BatchOperationStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchOperationStatus::~BatchOperationStatus()
{

}

void
BatchOperationStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BatchOperationStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



