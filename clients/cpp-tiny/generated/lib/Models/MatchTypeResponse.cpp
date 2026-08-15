

#include "MatchTypeResponse.h"

using namespace Tiny;

MatchTypeResponse::MatchTypeResponse()
{
}

MatchTypeResponse::MatchTypeResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

MatchTypeResponse::~MatchTypeResponse()
{

}

void
MatchTypeResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MatchTypeResponse::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



