

#include "TopPinsSortBy.h"

using namespace Tiny;

TopPinsSortBy::TopPinsSortBy()
{
}

TopPinsSortBy::TopPinsSortBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopPinsSortBy::~TopPinsSortBy()
{

}

void
TopPinsSortBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TopPinsSortBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



