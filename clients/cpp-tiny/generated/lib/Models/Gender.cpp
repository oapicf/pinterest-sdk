

#include "Gender.h"

using namespace Tiny;

Gender::Gender()
{
}

Gender::Gender(std::string jsonString)
{
	this->fromJson(jsonString);
}

Gender::~Gender()
{

}

void
Gender::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Gender::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



