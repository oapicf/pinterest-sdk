

#include "AdPreviewURLResponse.h"

using namespace Tiny;

AdPreviewURLResponse::AdPreviewURLResponse()
{
	url = std::string();
}

AdPreviewURLResponse::AdPreviewURLResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdPreviewURLResponse::~AdPreviewURLResponse()
{

}

void
AdPreviewURLResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
AdPreviewURLResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
AdPreviewURLResponse::getUrl()
{
	return url;
}

void
AdPreviewURLResponse::setUrl(std::string  url)
{
	this->url = url;
}



