

#include "Notification_post_request.h"

using namespace Tiny;

Notification_post_request::Notification_post_request()
{
}

Notification_post_request::Notification_post_request(std::string jsonString)
{
	this->fromJson(jsonString);
}

Notification_post_request::~Notification_post_request()
{

}

void
Notification_post_request::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Notification_post_request::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



