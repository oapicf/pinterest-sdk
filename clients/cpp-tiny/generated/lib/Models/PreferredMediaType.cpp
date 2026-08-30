

#include "PreferredMediaType.h"

using namespace Tiny;

PreferredMediaType::PreferredMediaType()
{
}

PreferredMediaType::PreferredMediaType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PreferredMediaType::~PreferredMediaType()
{

}

void
PreferredMediaType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PreferredMediaType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



