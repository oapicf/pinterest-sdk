

#include "Brand_accounts_create_200_response.h"

using namespace Tiny;

Brand_accounts_create_200_response::Brand_accounts_create_200_response()
{
	brand_account_id = std::string();
}

Brand_accounts_create_200_response::Brand_accounts_create_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Brand_accounts_create_200_response::~Brand_accounts_create_200_response()
{

}

void
Brand_accounts_create_200_response::fromJson(std::string jsonObj)
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
Brand_accounts_create_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["brand_account_id"] = getBrandAccountId();



    return object;

}

std::string
Brand_accounts_create_200_response::getBrandAccountId()
{
	return brand_account_id;
}

void
Brand_accounts_create_200_response::setBrandAccountId(std::string  brand_account_id)
{
	this->brand_account_id = brand_account_id;
}



