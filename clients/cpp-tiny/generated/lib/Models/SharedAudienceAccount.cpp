

#include "SharedAudienceAccount.h"

using namespace Tiny;

SharedAudienceAccount::SharedAudienceAccount()
{
	account_id = std::string();
	account_name = std::string();
	account_type = null;
	shared_on_timestamp = int(0);
}

SharedAudienceAccount::SharedAudienceAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

SharedAudienceAccount::~SharedAudienceAccount()
{

}

void
SharedAudienceAccount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *account_idKey = "account_id";

    if(object.has_key(account_idKey))
    {
        bourne::json value = object[account_idKey];



        jsonToValue(&account_id, value, "std::string");


    }

    const char *account_nameKey = "account_name";

    if(object.has_key(account_nameKey))
    {
        bourne::json value = object[account_nameKey];



        jsonToValue(&account_name, value, "std::string");


    }

    const char *account_typeKey = "account_type";

    if(object.has_key(account_typeKey))
    {
        bourne::json value = object[account_typeKey];




        AudienceAccountType* obj = &account_type;
		obj->fromJson(value.dump());

    }

    const char *shared_on_timestampKey = "shared_on_timestamp";

    if(object.has_key(shared_on_timestampKey))
    {
        bourne::json value = object[shared_on_timestampKey];



        jsonToValue(&shared_on_timestamp, value, "int");


    }


}

bourne::json
SharedAudienceAccount::toJson()
{
    bourne::json object = bourne::json::object();





    object["account_id"] = getAccountId();






    object["account_name"] = getAccountName();







	object["account_type"] = getAccountType().toJson();





    object["shared_on_timestamp"] = getSharedOnTimestamp();



    return object;

}

std::string
SharedAudienceAccount::getAccountId()
{
	return account_id;
}

void
SharedAudienceAccount::setAccountId(std::string account_id)
{
	this->account_id = account_id;
}

std::string
SharedAudienceAccount::getAccountName()
{
	return account_name;
}

void
SharedAudienceAccount::setAccountName(std::string account_name)
{
	this->account_name = account_name;
}

AudienceAccountType
SharedAudienceAccount::getAccountType()
{
	return account_type;
}

void
SharedAudienceAccount::setAccountType(AudienceAccountType account_type)
{
	this->account_type = account_type;
}

int
SharedAudienceAccount::getSharedOnTimestamp()
{
	return shared_on_timestamp;
}

void
SharedAudienceAccount::setSharedOnTimestamp(int shared_on_timestamp)
{
	this->shared_on_timestamp = shared_on_timestamp;
}



