

#include "OrderLineStatus.h"

using namespace Tiny;

OrderLineStatus::OrderLineStatus()
{
}

OrderLineStatus::OrderLineStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLineStatus::~OrderLineStatus()
{

}

void
OrderLineStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderLineStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



