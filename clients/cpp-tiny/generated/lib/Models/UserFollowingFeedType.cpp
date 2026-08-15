

#include "UserFollowingFeedType.h"

using namespace Tiny;

UserFollowingFeedType::UserFollowingFeedType()
{
}

UserFollowingFeedType::UserFollowingFeedType(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserFollowingFeedType::~UserFollowingFeedType()
{

}

void
UserFollowingFeedType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UserFollowingFeedType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



