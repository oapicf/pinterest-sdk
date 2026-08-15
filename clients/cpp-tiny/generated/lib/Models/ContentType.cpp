

#include "ContentType.h"

using namespace Tiny;

ContentType::ContentType()
{
}

ContentType::ContentType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContentType::~ContentType()
{

}

void
ContentType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ContentType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



