

#include "SourcePlatformOptions.h"

using namespace Tiny;

SourcePlatformOptions::SourcePlatformOptions()
{
}

SourcePlatformOptions::SourcePlatformOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

SourcePlatformOptions::~SourcePlatformOptions()
{

}

void
SourcePlatformOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SourcePlatformOptions::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



