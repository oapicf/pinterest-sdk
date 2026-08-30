

#include "BillingInvoiceDownloadResponse.h"

using namespace Tiny;

BillingInvoiceDownloadResponse::BillingInvoiceDownloadResponse()
{
	download_url = std::string();
	id = std::string();
}

BillingInvoiceDownloadResponse::BillingInvoiceDownloadResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BillingInvoiceDownloadResponse::~BillingInvoiceDownloadResponse()
{

}

void
BillingInvoiceDownloadResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *download_urlKey = "download_url";

    if(object.has_key(download_urlKey))
    {
        bourne::json value = object[download_urlKey];



        jsonToValue(&download_url, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
BillingInvoiceDownloadResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["download_url"] = getDownloadUrl();






    object["id"] = getId();



    return object;

}

std::string
BillingInvoiceDownloadResponse::getDownloadUrl()
{
	return download_url;
}

void
BillingInvoiceDownloadResponse::setDownloadUrl(std::string download_url)
{
	this->download_url = download_url;
}

std::string
BillingInvoiceDownloadResponse::getId()
{
	return id;
}

void
BillingInvoiceDownloadResponse::setId(std::string id)
{
	this->id = id;
}



