

#include "UserWebsiteVerificationCode.h"

using namespace Tiny;

UserWebsiteVerificationCode::UserWebsiteVerificationCode()
{
	dns_txt_record = std::string();
	file_content = std::string();
	filename = std::string();
	metatag = std::string();
	verification_code = std::string();
}

UserWebsiteVerificationCode::UserWebsiteVerificationCode(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserWebsiteVerificationCode::~UserWebsiteVerificationCode()
{

}

void
UserWebsiteVerificationCode::fromJson(std::string jsonObj)
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
UserWebsiteVerificationCode::toJson()
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
UserWebsiteVerificationCode::getDnsTxtRecord()
{
	return dns_txt_record;
}

void
UserWebsiteVerificationCode::setDnsTxtRecord(std::string  dns_txt_record)
{
	this->dns_txt_record = dns_txt_record;
}

std::string
UserWebsiteVerificationCode::getFileContent()
{
	return file_content;
}

void
UserWebsiteVerificationCode::setFileContent(std::string  file_content)
{
	this->file_content = file_content;
}

std::string
UserWebsiteVerificationCode::getFilename()
{
	return filename;
}

void
UserWebsiteVerificationCode::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
UserWebsiteVerificationCode::getMetatag()
{
	return metatag;
}

void
UserWebsiteVerificationCode::setMetatag(std::string  metatag)
{
	this->metatag = metatag;
}

std::string
UserWebsiteVerificationCode::getVerificationCode()
{
	return verification_code;
}

void
UserWebsiteVerificationCode::setVerificationCode(std::string  verification_code)
{
	this->verification_code = verification_code;
}



