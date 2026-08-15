

#include "BoardUpdatePrivacy.h"

using namespace Tiny;

BoardUpdatePrivacy::BoardUpdatePrivacy()
{
}

BoardUpdatePrivacy::BoardUpdatePrivacy(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardUpdatePrivacy::~BoardUpdatePrivacy()
{

}

void
BoardUpdatePrivacy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BoardUpdatePrivacy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



