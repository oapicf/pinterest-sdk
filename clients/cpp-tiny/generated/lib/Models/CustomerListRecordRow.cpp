

#include "CustomerListRecordRow.h"

using namespace Tiny;

CustomerListRecordRow::CustomerListRecordRow()
{
	email = std::string();
	external_id = std::string();
	hashed_phone_number = std::string();
	hashed_pinner_id = std::string();
	ip_address = std::string();
	liveramp_envelope = std::string();
	maid = std::string();
	user_agent = std::string();
}

CustomerListRecordRow::CustomerListRecordRow(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListRecordRow::~CustomerListRecordRow()
{

}

void
CustomerListRecordRow::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

    const char *external_idKey = "external_id";

    if(object.has_key(external_idKey))
    {
        bourne::json value = object[external_idKey];



        jsonToValue(&external_id, value, "std::string");


    }

    const char *hashed_phone_numberKey = "hashed_phone_number";

    if(object.has_key(hashed_phone_numberKey))
    {
        bourne::json value = object[hashed_phone_numberKey];



        jsonToValue(&hashed_phone_number, value, "std::string");


    }

    const char *hashed_pinner_idKey = "hashed_pinner_id";

    if(object.has_key(hashed_pinner_idKey))
    {
        bourne::json value = object[hashed_pinner_idKey];



        jsonToValue(&hashed_pinner_id, value, "std::string");


    }

    const char *ip_addressKey = "ip_address";

    if(object.has_key(ip_addressKey))
    {
        bourne::json value = object[ip_addressKey];



        jsonToValue(&ip_address, value, "std::string");


    }

    const char *liveramp_envelopeKey = "liveramp_envelope";

    if(object.has_key(liveramp_envelopeKey))
    {
        bourne::json value = object[liveramp_envelopeKey];



        jsonToValue(&liveramp_envelope, value, "std::string");


    }

    const char *maidKey = "maid";

    if(object.has_key(maidKey))
    {
        bourne::json value = object[maidKey];



        jsonToValue(&maid, value, "std::string");


    }

    const char *user_agentKey = "user_agent";

    if(object.has_key(user_agentKey))
    {
        bourne::json value = object[user_agentKey];



        jsonToValue(&user_agent, value, "std::string");


    }


}

bourne::json
CustomerListRecordRow::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["external_id"] = getExternalId();






    object["hashed_phone_number"] = getHashedPhoneNumber();






    object["hashed_pinner_id"] = getHashedPinnerId();






    object["ip_address"] = getIpAddress();






    object["liveramp_envelope"] = getLiverampEnvelope();






    object["maid"] = getMaid();






    object["user_agent"] = getUserAgent();



    return object;

}

std::string
CustomerListRecordRow::getEmail()
{
	return email;
}

void
CustomerListRecordRow::setEmail(std::string email)
{
	this->email = email;
}

std::string
CustomerListRecordRow::getExternalId()
{
	return external_id;
}

void
CustomerListRecordRow::setExternalId(std::string external_id)
{
	this->external_id = external_id;
}

std::string
CustomerListRecordRow::getHashedPhoneNumber()
{
	return hashed_phone_number;
}

void
CustomerListRecordRow::setHashedPhoneNumber(std::string hashed_phone_number)
{
	this->hashed_phone_number = hashed_phone_number;
}

std::string
CustomerListRecordRow::getHashedPinnerId()
{
	return hashed_pinner_id;
}

void
CustomerListRecordRow::setHashedPinnerId(std::string hashed_pinner_id)
{
	this->hashed_pinner_id = hashed_pinner_id;
}

std::string
CustomerListRecordRow::getIpAddress()
{
	return ip_address;
}

void
CustomerListRecordRow::setIpAddress(std::string ip_address)
{
	this->ip_address = ip_address;
}

std::string
CustomerListRecordRow::getLiverampEnvelope()
{
	return liveramp_envelope;
}

void
CustomerListRecordRow::setLiverampEnvelope(std::string liveramp_envelope)
{
	this->liveramp_envelope = liveramp_envelope;
}

std::string
CustomerListRecordRow::getMaid()
{
	return maid;
}

void
CustomerListRecordRow::setMaid(std::string maid)
{
	this->maid = maid;
}

std::string
CustomerListRecordRow::getUserAgent()
{
	return user_agent;
}

void
CustomerListRecordRow::setUserAgent(std::string user_agent)
{
	this->user_agent = user_agent;
}



