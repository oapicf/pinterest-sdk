

#include "UserWebsiteVerification.h"

using namespace Tiny;

UserWebsiteVerification::UserWebsiteVerification()
{
	dns_txt_record = std::string();
	file_content = std::string();
	filename = std::string();
	metatag = std::string();
	verification_code = std::string();
}

UserWebsiteVerification::UserWebsiteVerification(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsiteVerification::~UserWebsiteVerification()
{

}

void
UserWebsiteVerification::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dns_txt_recordKey = "dns_txt_record";

    if(object.has_key(dns_txt_recordKey))
    {
        bourne::json value = object[dns_txt_recordKey];



        jsonToValue(&dns_txt_record, value, "std::string");


    }

    const char *file_contentKey = "file_content";

    if(object.has_key(file_contentKey))
    {
        bourne::json value = object[file_contentKey];



        jsonToValue(&file_content, value, "std::string");


    }

    const char *filenameKey = "filename";

    if(object.has_key(filenameKey))
    {
        bourne::json value = object[filenameKey];



        jsonToValue(&filename, value, "std::string");


    }

    const char *metatagKey = "metatag";

    if(object.has_key(metatagKey))
    {
        bourne::json value = object[metatagKey];



        jsonToValue(&metatag, value, "std::string");


    }

    const char *verification_codeKey = "verification_code";

    if(object.has_key(verification_codeKey))
    {
        bourne::json value = object[verification_codeKey];



        jsonToValue(&verification_code, value, "std::string");


    }


}

bourne::json
UserWebsiteVerification::toJson()
{
    bourne::json object = bourne::json::object();





    object["dns_txt_record"] = getDnsTxtRecord();






    object["file_content"] = getFileContent();






    object["filename"] = getFilename();






    object["metatag"] = getMetatag();






    object["verification_code"] = getVerificationCode();



    return object;

}

std::string
UserWebsiteVerification::getDnsTxtRecord()
{
	return dns_txt_record;
}

void
UserWebsiteVerification::setDnsTxtRecord(std::string dns_txt_record)
{
	this->dns_txt_record = dns_txt_record;
}

std::string
UserWebsiteVerification::getFileContent()
{
	return file_content;
}

void
UserWebsiteVerification::setFileContent(std::string file_content)
{
	this->file_content = file_content;
}

std::string
UserWebsiteVerification::getFilename()
{
	return filename;
}

void
UserWebsiteVerification::setFilename(std::string filename)
{
	this->filename = filename;
}

std::string
UserWebsiteVerification::getMetatag()
{
	return metatag;
}

void
UserWebsiteVerification::setMetatag(std::string metatag)
{
	this->metatag = metatag;
}

std::string
UserWebsiteVerification::getVerificationCode()
{
	return verification_code;
}

void
UserWebsiteVerification::setVerificationCode(std::string verification_code)
{
	this->verification_code = verification_code;
}



