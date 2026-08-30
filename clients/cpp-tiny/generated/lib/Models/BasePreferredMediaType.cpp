

#include "BasePreferredMediaType.h"

using namespace Tiny;

BasePreferredMediaType::BasePreferredMediaType()
{
}

BasePreferredMediaType::BasePreferredMediaType(std::string jsonString)
{
	this->fromJson(jsonString);
}

BasePreferredMediaType::~BasePreferredMediaType()
{

}

void
BasePreferredMediaType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BasePreferredMediaType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



