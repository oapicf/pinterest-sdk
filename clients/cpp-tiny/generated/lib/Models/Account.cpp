

#include "Account.h"

using namespace Tiny;

Account::Account()
{
	about = std::string();
	account_type = null;
	board_count = int(0);
	business_name = std::string();
	follower_count = int(0);
	following_count = int(0);
	id = std::string();
	monthly_views = int(0);
	pin_count = int(0);
	profile_image = std::string();
	username = std::string();
	website_url = std::string();
}

Account::Account(std::string jsonString)
{
	this->fromJson(jsonString);
}

Account::~Account()
{

}

void
Account::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aboutKey = "about";

    if(object.has_key(aboutKey))
    {
        bourne::json value = object[aboutKey];



        jsonToValue(&about, value, "std::string");


    }

    const char *account_typeKey = "account_type";

    if(object.has_key(account_typeKey))
    {
        bourne::json value = object[account_typeKey];




        UserAccountType* obj = &account_type;
		obj->fromJson(value.dump());

    }

    const char *board_countKey = "board_count";

    if(object.has_key(board_countKey))
    {
        bourne::json value = object[board_countKey];



        jsonToValue(&board_count, value, "int");


    }

    const char *business_nameKey = "business_name";

    if(object.has_key(business_nameKey))
    {
        bourne::json value = object[business_nameKey];



        jsonToValue(&business_name, value, "std::string");


    }

    const char *follower_countKey = "follower_count";

    if(object.has_key(follower_countKey))
    {
        bourne::json value = object[follower_countKey];



        jsonToValue(&follower_count, value, "int");


    }

    const char *following_countKey = "following_count";

    if(object.has_key(following_countKey))
    {
        bourne::json value = object[following_countKey];



        jsonToValue(&following_count, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *monthly_viewsKey = "monthly_views";

    if(object.has_key(monthly_viewsKey))
    {
        bourne::json value = object[monthly_viewsKey];



        jsonToValue(&monthly_views, value, "int");


    }

    const char *pin_countKey = "pin_count";

    if(object.has_key(pin_countKey))
    {
        bourne::json value = object[pin_countKey];



        jsonToValue(&pin_count, value, "int");


    }

    const char *profile_imageKey = "profile_image";

    if(object.has_key(profile_imageKey))
    {
        bourne::json value = object[profile_imageKey];



        jsonToValue(&profile_image, value, "std::string");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }

    const char *website_urlKey = "website_url";

    if(object.has_key(website_urlKey))
    {
        bourne::json value = object[website_urlKey];



        jsonToValue(&website_url, value, "std::string");


    }


}

bourne::json
Account::toJson()
{
    bourne::json object = bourne::json::object();





    object["about"] = getAbout();







	object["account_type"] = getAccountType().toJson();





    object["board_count"] = getBoardCount();






    object["business_name"] = getBusinessName();






    object["follower_count"] = getFollowerCount();






    object["following_count"] = getFollowingCount();






    object["id"] = getId();






    object["monthly_views"] = getMonthlyViews();






    object["pin_count"] = getPinCount();






    object["profile_image"] = getProfileImage();






    object["username"] = getUsername();






    object["website_url"] = getWebsiteUrl();



    return object;

}

std::string
Account::getAbout()
{
	return about;
}

void
Account::setAbout(std::string about)
{
	this->about = about;
}

UserAccountType
Account::getAccountType()
{
	return account_type;
}

void
Account::setAccountType(UserAccountType account_type)
{
	this->account_type = account_type;
}

int
Account::getBoardCount()
{
	return board_count;
}

void
Account::setBoardCount(int board_count)
{
	this->board_count = board_count;
}

std::string
Account::getBusinessName()
{
	return business_name;
}

void
Account::setBusinessName(std::string business_name)
{
	this->business_name = business_name;
}

int
Account::getFollowerCount()
{
	return follower_count;
}

void
Account::setFollowerCount(int follower_count)
{
	this->follower_count = follower_count;
}

int
Account::getFollowingCount()
{
	return following_count;
}

void
Account::setFollowingCount(int following_count)
{
	this->following_count = following_count;
}

std::string
Account::getId()
{
	return id;
}

void
Account::setId(std::string id)
{
	this->id = id;
}

int
Account::getMonthlyViews()
{
	return monthly_views;
}

void
Account::setMonthlyViews(int monthly_views)
{
	this->monthly_views = monthly_views;
}

int
Account::getPinCount()
{
	return pin_count;
}

void
Account::setPinCount(int pin_count)
{
	this->pin_count = pin_count;
}

std::string
Account::getProfileImage()
{
	return profile_image;
}

void
Account::setProfileImage(std::string profile_image)
{
	this->profile_image = profile_image;
}

std::string
Account::getUsername()
{
	return username;
}

void
Account::setUsername(std::string username)
{
	this->username = username;
}

std::string
Account::getWebsiteUrl()
{
	return website_url;
}

void
Account::setWebsiteUrl(std::string website_url)
{
	this->website_url = website_url;
}



