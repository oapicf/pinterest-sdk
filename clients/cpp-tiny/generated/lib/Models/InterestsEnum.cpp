

#include "InterestsEnum.h"

using namespace Tiny;

InterestsEnum::InterestsEnum()
{
}

InterestsEnum::InterestsEnum(std::string jsonString)
{
	this->fromJson(jsonString);
}

InterestsEnum::~InterestsEnum()
{

}

void
InterestsEnum::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
InterestsEnum::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



