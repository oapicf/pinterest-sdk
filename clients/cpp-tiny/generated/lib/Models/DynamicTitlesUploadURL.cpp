

#include "DynamicTitlesUploadURL.h"

using namespace Tiny;

DynamicTitlesUploadURL::DynamicTitlesUploadURL()
{
	existing_filename = std::string();
	request_id = std::string();
	upload_url = std::string();
}

DynamicTitlesUploadURL::DynamicTitlesUploadURL(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesUploadURL::~DynamicTitlesUploadURL()
{

}

void
DynamicTitlesUploadURL::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *existing_filenameKey = "existing_filename";

    if(object.has_key(existing_filenameKey))
    {
        bourne::json value = object[existing_filenameKey];



        jsonToValue(&existing_filename, value, "std::string");


    }

    const char *request_idKey = "request_id";

    if(object.has_key(request_idKey))
    {
        bourne::json value = object[request_idKey];



        jsonToValue(&request_id, value, "std::string");


    }

    const char *upload_urlKey = "upload_url";

    if(object.has_key(upload_urlKey))
    {
        bourne::json value = object[upload_urlKey];



        jsonToValue(&upload_url, value, "std::string");


    }


}

bourne::json
DynamicTitlesUploadURL::toJson()
{
    bourne::json object = bourne::json::object();





    object["existing_filename"] = getExistingFilename();






    object["request_id"] = getRequestId();






    object["upload_url"] = getUploadUrl();



    return object;

}

std::string
DynamicTitlesUploadURL::getExistingFilename()
{
	return existing_filename;
}

void
DynamicTitlesUploadURL::setExistingFilename(std::string existing_filename)
{
	this->existing_filename = existing_filename;
}

std::string
DynamicTitlesUploadURL::getRequestId()
{
	return request_id;
}

void
DynamicTitlesUploadURL::setRequestId(std::string request_id)
{
	this->request_id = request_id;
}

std::string
DynamicTitlesUploadURL::getUploadUrl()
{
	return upload_url;
}

void
DynamicTitlesUploadURL::setUploadUrl(std::string upload_url)
{
	this->upload_url = upload_url;
}



