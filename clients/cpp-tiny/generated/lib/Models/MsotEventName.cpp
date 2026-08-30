

#include "MsotEventName.h"

using namespace Tiny;

MsotEventName::MsotEventName()
{
}

MsotEventName::MsotEventName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MsotEventName::~MsotEventName()
{

}

void
MsotEventName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
MsotEventName::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



