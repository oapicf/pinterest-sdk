

#include "TieBreakerType.h"

using namespace Tiny;

TieBreakerType::TieBreakerType()
{
}

TieBreakerType::TieBreakerType(std::string jsonString)
{
	this->fromJson(jsonString);
}

TieBreakerType::~TieBreakerType()
{

}

void
TieBreakerType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TieBreakerType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



