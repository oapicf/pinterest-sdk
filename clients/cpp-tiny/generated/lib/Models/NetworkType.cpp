

#include "NetworkType.h"

using namespace Tiny;

NetworkType::NetworkType()
{
}

NetworkType::NetworkType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NetworkType::~NetworkType()
{

}

void
NetworkType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NetworkType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



