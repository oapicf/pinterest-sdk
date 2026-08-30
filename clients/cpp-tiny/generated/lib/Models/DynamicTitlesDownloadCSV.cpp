

#include "DynamicTitlesDownloadCSV.h"

using namespace Tiny;

DynamicTitlesDownloadCSV::DynamicTitlesDownloadCSV()
{
	download_url = std::string();
}

DynamicTitlesDownloadCSV::DynamicTitlesDownloadCSV(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesDownloadCSV::~DynamicTitlesDownloadCSV()
{

}

void
DynamicTitlesDownloadCSV::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *download_urlKey = "download_url";

    if(object.has_key(download_urlKey))
    {
        bourne::json value = object[download_urlKey];



        jsonToValue(&download_url, value, "std::string");


    }


}

bourne::json
DynamicTitlesDownloadCSV::toJson()
{
    bourne::json object = bourne::json::object();





    object["download_url"] = getDownloadUrl();



    return object;

}

std::string
DynamicTitlesDownloadCSV::getDownloadUrl()
{
	return download_url;
}

void
DynamicTitlesDownloadCSV::setDownloadUrl(std::string download_url)
{
	this->download_url = download_url;
}



