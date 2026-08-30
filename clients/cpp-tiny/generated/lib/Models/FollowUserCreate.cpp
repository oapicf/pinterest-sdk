

#include "FollowUserCreate.h"

using namespace Tiny;

FollowUserCreate::FollowUserCreate()
{
	auto_follow = bool(false);
}

FollowUserCreate::FollowUserCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

FollowUserCreate::~FollowUserCreate()
{

}

void
FollowUserCreate::fromJson(std::string jsonObj)
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
FollowUserCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["auto_follow"] = isAutoFollow();



    return object;

}

bool
FollowUserCreate::isAutoFollow()
{
	return auto_follow;
}

void
FollowUserCreate::setAutoFollow(bool auto_follow)
{
	this->auto_follow = auto_follow;
}



