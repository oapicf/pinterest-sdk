

#include "Pinterest.Lib.Status204.h"

using namespace Tiny;

Pinterest.Lib.Status204::Pinterest.Lib.Status204()
{
	statusCode = float(0);
}

Pinterest.Lib.Status204::Pinterest.Lib.Status204(std::string jsonString)
{
	this->fromJson(jsonString);
}

Pinterest.Lib.Status204::~Pinterest.Lib.Status204()
{

}

void
Pinterest.Lib.Status204::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *statusCodeKey = "statusCode";

    if(object.has_key(statusCodeKey))
    {
        bourne::json value = object[statusCodeKey];



        jsonToValue(&statusCode, value, "long");


    }


}

bourne::json
Pinterest.Lib.Status204::toJson()
{
    bourne::json object = bourne::json::object();





    object["statusCode"] = getStatusCode();



    return object;

}

long
Pinterest.Lib.Status204::getStatusCode()
{
	return statusCode;
}

void
Pinterest.Lib.Status204::setStatusCode(long  statusCode)
{
	this->statusCode = statusCode;
}



