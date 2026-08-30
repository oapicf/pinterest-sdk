

#include "Order.h"

using namespace Tiny;

Order::Order()
{
}

Order::Order(std::string jsonString)
{
	this->fromJson(jsonString);
}

Order::~Order()
{

}

void
Order::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Order::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



