

#include "MatchType.h"

using namespace Tiny;

MatchType::MatchType()
{
}

MatchType::MatchType(std::string jsonString)
{
	this->fromJson(jsonString);
}

MatchType::~MatchType()
{

}

void
MatchType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MatchType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



