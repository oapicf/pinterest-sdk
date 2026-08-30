

#include "BrandAccount.h"

using namespace Tiny;

BrandAccount::BrandAccount()
{
	brand_account_id = std::string();
}

BrandAccount::BrandAccount(std::string jsonString)
{
	this->fromJson(jsonString);
}

BrandAccount::~BrandAccount()
{

}

void
BrandAccount::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *brand_account_idKey = "brand_account_id";

    if(object.has_key(brand_account_idKey))
    {
        bourne::json value = object[brand_account_idKey];



        jsonToValue(&brand_account_id, value, "std::string");


    }


}

bourne::json
BrandAccount::toJson()
{
    bourne::json object = bourne::json::object();





    object["brand_account_id"] = getBrandAccountId();



    return object;

}

std::string
BrandAccount::getBrandAccountId()
{
	return brand_account_id;
}

void
BrandAccount::setBrandAccountId(std::string brand_account_id)
{
	this->brand_account_id = brand_account_id;
}



