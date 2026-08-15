

#include "Pinterest.Lib.PaginationOrder.h"

using namespace Tiny;

Pinterest.Lib.PaginationOrder::Pinterest.Lib.PaginationOrder()
{
}

Pinterest.Lib.PaginationOrder::Pinterest.Lib.PaginationOrder(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pinterest.Lib.PaginationOrder::~Pinterest.Lib.PaginationOrder()
{

}

void
Pinterest.Lib.PaginationOrder::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Pinterest.Lib.PaginationOrder::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



