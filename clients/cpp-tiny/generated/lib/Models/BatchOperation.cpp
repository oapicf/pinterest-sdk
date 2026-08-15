

#include "BatchOperation.h"

using namespace Tiny;

BatchOperation::BatchOperation()
{
}

BatchOperation::BatchOperation(std::string jsonString)
{
	this->fromJson(jsonString);
}

BatchOperation::~BatchOperation()
{

}

void
BatchOperation::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BatchOperation::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



