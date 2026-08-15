

#include "BaseInviteDataResponse_invite_data.h"

using namespace Tiny;

BaseInviteDataResponse_invite_data::BaseInviteDataResponse_invite_data()
{
	invite_expiration = int(0);
	invite_status = std::string();
	invite_type = std::string();
	last_updated_time = int(0);
	sent_at = int(0);
}

BaseInviteDataResponse_invite_data::BaseInviteDataResponse_invite_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

BaseInviteDataResponse_invite_data::~BaseInviteDataResponse_invite_data()
{

}

void
BaseInviteDataResponse_invite_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invite_expirationKey = "invite_expiration";

    if(object.has_key(invite_expirationKey))
    {
        bourne::json value = object[invite_expirationKey];



        jsonToValue(&invite_expiration, value, "int");


    }

    const char *invite_statusKey = "invite_status";

    if(object.has_key(invite_statusKey))
    {
        bourne::json value = object[invite_statusKey];



        jsonToValue(&invite_status, value, "std::string");


    }

    const char *invite_typeKey = "invite_type";

    if(object.has_key(invite_typeKey))
    {
        bourne::json value = object[invite_typeKey];



        jsonToValue(&invite_type, value, "std::string");


    }

    const char *last_updated_timeKey = "last_updated_time";

    if(object.has_key(last_updated_timeKey))
    {
        bourne::json value = object[last_updated_timeKey];



        jsonToValue(&last_updated_time, value, "int");


    }

    const char *sent_atKey = "sent_at";

    if(object.has_key(sent_atKey))
    {
        bourne::json value = object[sent_atKey];



        jsonToValue(&sent_at, value, "int");


    }


}

bourne::json
BaseInviteDataResponse_invite_data::toJson()
{
    bourne::json object = bourne::json::object();





    object["invite_expiration"] = getInviteExpiration();






    object["invite_status"] = getInviteStatus();






    object["invite_type"] = getInviteType();






    object["last_updated_time"] = getLastUpdatedTime();






    object["sent_at"] = getSentAt();



    return object;

}

int
BaseInviteDataResponse_invite_data::getInviteExpiration()
{
	return invite_expiration;
}

void
BaseInviteDataResponse_invite_data::setInviteExpiration(int  invite_expiration)
{
	this->invite_expiration = invite_expiration;
}

std::string
BaseInviteDataResponse_invite_data::getInviteStatus()
{
	return invite_status;
}

void
BaseInviteDataResponse_invite_data::setInviteStatus(std::string  invite_status)
{
	this->invite_status = invite_status;
}

std::string
BaseInviteDataResponse_invite_data::getInviteType()
{
	return invite_type;
}

void
BaseInviteDataResponse_invite_data::setInviteType(std::string  invite_type)
{
	this->invite_type = invite_type;
}

int
BaseInviteDataResponse_invite_data::getLastUpdatedTime()
{
	return last_updated_time;
}

void
BaseInviteDataResponse_invite_data::setLastUpdatedTime(int  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

int
BaseInviteDataResponse_invite_data::getSentAt()
{
	return sent_at;
}

void
BaseInviteDataResponse_invite_data::setSentAt(int  sent_at)
{
	this->sent_at = sent_at;
}



