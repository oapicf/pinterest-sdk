

#include "TopVideoPinsSortBy.h"

using namespace Tiny;

TopVideoPinsSortBy::TopVideoPinsSortBy()
{
}

TopVideoPinsSortBy::TopVideoPinsSortBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopVideoPinsSortBy::~TopVideoPinsSortBy()
{

}

void
TopVideoPinsSortBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TopVideoPinsSortBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



