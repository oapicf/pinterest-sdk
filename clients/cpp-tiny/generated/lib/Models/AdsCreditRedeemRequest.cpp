

#include "AdsCreditRedeemRequest.h"

using namespace Tiny;

AdsCreditRedeemRequest::AdsCreditRedeemRequest()
{
	offerCodeHash = std::string();
	validateOnly = bool(false);
}

AdsCreditRedeemRequest::AdsCreditRedeemRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdsCreditRedeemRequest::~AdsCreditRedeemRequest()
{

}

void
AdsCreditRedeemRequest::fromJson(std::string jsonObj)
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
AdsCreditRedeemRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["offerCodeHash"] = getOfferCodeHash();






    object["validateOnly"] = isValidateOnly();



    return object;

}

std::string
AdsCreditRedeemRequest::getOfferCodeHash()
{
	return offerCodeHash;
}

void
AdsCreditRedeemRequest::setOfferCodeHash(std::string  offerCodeHash)
{
	this->offerCodeHash = offerCodeHash;
}

bool
AdsCreditRedeemRequest::isValidateOnly()
{
	return validateOnly;
}

void
AdsCreditRedeemRequest::setValidateOnly(bool  validateOnly)
{
	this->validateOnly = validateOnly;
}



