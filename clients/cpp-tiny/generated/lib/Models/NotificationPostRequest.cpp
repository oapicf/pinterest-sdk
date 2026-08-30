

#include "NotificationPostRequest.h"

using namespace Tiny;

NotificationPostRequest::NotificationPostRequest()
{
}

NotificationPostRequest::NotificationPostRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

NotificationPostRequest::~NotificationPostRequest()
{

}

void
NotificationPostRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NotificationPostRequest::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



