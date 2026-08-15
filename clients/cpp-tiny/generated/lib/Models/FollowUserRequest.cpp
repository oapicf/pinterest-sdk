

#include "FollowUserRequest.h"

using namespace Tiny;

FollowUserRequest::FollowUserRequest()
{
	auto_follow = bool(false);
}

FollowUserRequest::FollowUserRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

FollowUserRequest::~FollowUserRequest()
{

}

void
FollowUserRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *auto_followKey = "auto_follow";

    if(object.has_key(auto_followKey))
    {
        bourne::json value = object[auto_followKey];



        jsonToValue(&auto_follow, value, "bool");


    }


}

bourne::json
FollowUserRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_follow"] = isAutoFollow();



    return object;

}

bool
FollowUserRequest::isAutoFollow()
{
	return auto_follow;
}

void
FollowUserRequest::setAutoFollow(bool  auto_follow)
{
	this->auto_follow = auto_follow;
}



