

#include "WebsiteVerificationMethod.h"

using namespace Tiny;

WebsiteVerificationMethod::WebsiteVerificationMethod()
{
}

WebsiteVerificationMethod::WebsiteVerificationMethod(std::string jsonString)
{
	this->fromJson(jsonString);
}

WebsiteVerificationMethod::~WebsiteVerificationMethod()
{

}

void
WebsiteVerificationMethod::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
WebsiteVerificationMethod::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



