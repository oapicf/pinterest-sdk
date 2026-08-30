

#include "AdsCreditRedeemCreate.h"

using namespace Tiny;

AdsCreditRedeemCreate::AdsCreditRedeemCreate()
{
	offerCodeHash = std::string();
	validateOnly = bool(false);
}

AdsCreditRedeemCreate::AdsCreditRedeemCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditRedeemCreate::~AdsCreditRedeemCreate()
{

}

void
AdsCreditRedeemCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offerCodeHashKey = "offerCodeHash";

    if(object.has_key(offerCodeHashKey))
    {
        bourne::json value = object[offerCodeHashKey];



        jsonToValue(&offerCodeHash, value, "std::string");


    }

    const char *validateOnlyKey = "validateOnly";

    if(object.has_key(validateOnlyKey))
    {
        bourne::json value = object[validateOnlyKey];



        jsonToValue(&validateOnly, value, "bool");


    }


}

bourne::json
AdsCreditRedeemCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerCodeHash"] = getOfferCodeHash();






    object["validateOnly"] = isValidateOnly();



    return object;

}

std::string
AdsCreditRedeemCreate::getOfferCodeHash()
{
	return offerCodeHash;
}

void
AdsCreditRedeemCreate::setOfferCodeHash(std::string offerCodeHash)
{
	this->offerCodeHash = offerCodeHash;
}

bool
AdsCreditRedeemCreate::isValidateOnly()
{
	return validateOnly;
}

void
AdsCreditRedeemCreate::setValidateOnly(bool validateOnly)
{
	this->validateOnly = validateOnly;
}



