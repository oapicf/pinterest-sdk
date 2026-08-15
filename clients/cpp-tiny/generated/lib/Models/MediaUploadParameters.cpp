

#include "MediaUploadParameters.h"

using namespace Tiny;

MediaUploadParameters::MediaUploadParameters()
{
	contentType = std::string();
	key = std::string();
	policy = std::string();
	xamzalgorithm = std::string();
	xamzcredential = std::string();
	xamzdate = std::string();
	xamzsecuritytoken = std::string();
	xamzsignature = std::string();
}

MediaUploadParameters::MediaUploadParameters(std::string jsonString)
{
	this->fromJson(jsonString);
}

MediaUploadParameters::~MediaUploadParameters()
{

}

void
MediaUploadParameters::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentTypeKey = "Content-Type";

    if(object.has_key(contentTypeKey))
    {
        bourne::json value = object[contentTypeKey];



        jsonToValue(&contentType, value, "std::string");


    }

    const char *keyKey = "key";

    if(object.has_key(keyKey))
    {
        bourne::json value = object[keyKey];



        jsonToValue(&key, value, "std::string");


    }

    const char *policyKey = "policy";

    if(object.has_key(policyKey))
    {
        bourne::json value = object[policyKey];



        jsonToValue(&policy, value, "std::string");


    }

    const char *xamzalgorithmKey = "x-amz-algorithm";

    if(object.has_key(xamzalgorithmKey))
    {
        bourne::json value = object[xamzalgorithmKey];



        jsonToValue(&xamzalgorithm, value, "std::string");


    }

    const char *xamzcredentialKey = "x-amz-credential";

    if(object.has_key(xamzcredentialKey))
    {
        bourne::json value = object[xamzcredentialKey];



        jsonToValue(&xamzcredential, value, "std::string");


    }

    const char *xamzdateKey = "x-amz-date";

    if(object.has_key(xamzdateKey))
    {
        bourne::json value = object[xamzdateKey];



        jsonToValue(&xamzdate, value, "std::string");


    }

    const char *xamzsecuritytokenKey = "x-amz-security-token";

    if(object.has_key(xamzsecuritytokenKey))
    {
        bourne::json value = object[xamzsecuritytokenKey];



        jsonToValue(&xamzsecuritytoken, value, "std::string");


    }

    const char *xamzsignatureKey = "x-amz-signature";

    if(object.has_key(xamzsignatureKey))
    {
        bourne::json value = object[xamzsignatureKey];



        jsonToValue(&xamzsignature, value, "std::string");


    }


}

bourne::json
MediaUploadParameters::toJson()
{
    bourne::json object = bourne::json::object();





    object["contentType"] = getContentType();






    object["key"] = getKey();






    object["policy"] = getPolicy();






    object["xamzalgorithm"] = getXamzalgorithm();






    object["xamzcredential"] = getXamzcredential();






    object["xamzdate"] = getXamzdate();






    object["xamzsecuritytoken"] = getXamzsecuritytoken();






    object["xamzsignature"] = getXamzsignature();



    return object;

}

std::string
MediaUploadParameters::getContentType()
{
	return contentType;
}

void
MediaUploadParameters::setContentType(std::string  contentType)
{
	this->contentType = contentType;
}

std::string
MediaUploadParameters::getKey()
{
	return key;
}

void
MediaUploadParameters::setKey(std::string  key)
{
	this->key = key;
}

std::string
MediaUploadParameters::getPolicy()
{
	return policy;
}

void
MediaUploadParameters::setPolicy(std::string  policy)
{
	this->policy = policy;
}

std::string
MediaUploadParameters::getXamzalgorithm()
{
	return xamzalgorithm;
}

void
MediaUploadParameters::setXamzalgorithm(std::string  xamzalgorithm)
{
	this->xamzalgorithm = xamzalgorithm;
}

std::string
MediaUploadParameters::getXamzcredential()
{
	return xamzcredential;
}

void
MediaUploadParameters::setXamzcredential(std::string  xamzcredential)
{
	this->xamzcredential = xamzcredential;
}

std::string
MediaUploadParameters::getXamzdate()
{
	return xamzdate;
}

void
MediaUploadParameters::setXamzdate(std::string  xamzdate)
{
	this->xamzdate = xamzdate;
}

std::string
MediaUploadParameters::getXamzsecuritytoken()
{
	return xamzsecuritytoken;
}

void
MediaUploadParameters::setXamzsecuritytoken(std::string  xamzsecuritytoken)
{
	this->xamzsecuritytoken = xamzsecuritytoken;
}

std::string
MediaUploadParameters::getXamzsignature()
{
	return xamzsignature;
}

void
MediaUploadParameters::setXamzsignature(std::string  xamzsignature)
{
	this->xamzsignature = xamzsignature;
}



