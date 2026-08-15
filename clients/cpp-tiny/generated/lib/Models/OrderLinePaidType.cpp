

#include "OrderLinePaidType.h"

using namespace Tiny;

OrderLinePaidType::OrderLinePaidType()
{
}

OrderLinePaidType::OrderLinePaidType(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLinePaidType::~OrderLinePaidType()
{

}

void
OrderLinePaidType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OrderLinePaidType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



