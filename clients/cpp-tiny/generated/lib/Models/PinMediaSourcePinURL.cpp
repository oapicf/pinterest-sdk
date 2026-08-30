

#include "PinMediaSourcePinURL.h"

using namespace Tiny;

PinMediaSourcePinURL::PinMediaSourcePinURL()
{
	is_affiliate_link = bool(false);
	source_type = std::string();
}

PinMediaSourcePinURL::PinMediaSourcePinURL(std::string jsonString)
{
	this->fromJson(jsonString);
}

PinMediaSourcePinURL::~PinMediaSourcePinURL()
{

}

void
PinMediaSourcePinURL::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *is_affiliate_linkKey = "is_affiliate_link";

    if(object.has_key(is_affiliate_linkKey))
    {
        bourne::json value = object[is_affiliate_linkKey];



        jsonToValue(&is_affiliate_link, value, "bool");


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }


}

bourne::json
PinMediaSourcePinURL::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_affiliate_link"] = isIsAffiliateLink();






    object["source_type"] = getSourceType();



    return object;

}

bool
PinMediaSourcePinURL::isIsAffiliateLink()
{
	return is_affiliate_link;
}

void
PinMediaSourcePinURL::setIsAffiliateLink(bool is_affiliate_link)
{
	this->is_affiliate_link = is_affiliate_link;
}

std::string
PinMediaSourcePinURL::getSourceType()
{
	return source_type;
}

void
PinMediaSourcePinURL::setSourceType(std::string source_type)
{
	this->source_type = source_type;
}



