

#include "OverallStatusOptions.h"

using namespace Tiny;

OverallStatusOptions::OverallStatusOptions()
{
}

OverallStatusOptions::OverallStatusOptions(std::string jsonString)
{
	this->fromJson(jsonString);
}

OverallStatusOptions::~OverallStatusOptions()
{

}

void
OverallStatusOptions::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
OverallStatusOptions::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



