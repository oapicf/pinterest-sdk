

#include "BoardPrivacy.h"

using namespace Tiny;

BoardPrivacy::BoardPrivacy()
{
}

BoardPrivacy::BoardPrivacy(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardPrivacy::~BoardPrivacy()
{

}

void
BoardPrivacy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BoardPrivacy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



