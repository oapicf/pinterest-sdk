

#include "CreativeAssetsVisibilityType.h"

using namespace Tiny;

CreativeAssetsVisibilityType::CreativeAssetsVisibilityType()
{
}

CreativeAssetsVisibilityType::CreativeAssetsVisibilityType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreativeAssetsVisibilityType::~CreativeAssetsVisibilityType()
{

}

void
CreativeAssetsVisibilityType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreativeAssetsVisibilityType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



