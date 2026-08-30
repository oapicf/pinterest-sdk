

#include "HttpMethod.h"

using namespace Tiny;

HttpMethod::HttpMethod()
{
}

HttpMethod::HttpMethod(std::string jsonString)
{
	this->fromJson(jsonString);
}

HttpMethod::~HttpMethod()
{

}

void
HttpMethod::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
HttpMethod::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



