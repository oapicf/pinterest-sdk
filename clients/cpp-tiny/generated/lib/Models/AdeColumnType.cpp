

#include "AdeColumnType.h"

using namespace Tiny;

AdeColumnType::AdeColumnType()
{
}

AdeColumnType::AdeColumnType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdeColumnType::~AdeColumnType()
{

}

void
AdeColumnType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdeColumnType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



