

#include "S3FilePart.h"

using namespace Tiny;

S3FilePart::S3FilePart()
{
	part_number = int(0);
	presigned_url = std::string();
}

S3FilePart::S3FilePart(std::string jsonString)
{
	this->fromJson(jsonString);
}

S3FilePart::~S3FilePart()
{

}

void
S3FilePart::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *part_numberKey = "part_number";

    if(object.has_key(part_numberKey))
    {
        bourne::json value = object[part_numberKey];



        jsonToValue(&part_number, value, "int");


    }

    const char *presigned_urlKey = "presigned_url";

    if(object.has_key(presigned_urlKey))
    {
        bourne::json value = object[presigned_urlKey];



        jsonToValue(&presigned_url, value, "std::string");


    }


}

bourne::json
S3FilePart::toJson()
{
    bourne::json object = bourne::json::object();





    object["part_number"] = getPartNumber();






    object["presigned_url"] = getPresignedUrl();



    return object;

}

int
S3FilePart::getPartNumber()
{
	return part_number;
}

void
S3FilePart::setPartNumber(int  part_number)
{
	this->part_number = part_number;
}

std::string
S3FilePart::getPresignedUrl()
{
	return presigned_url;
}

void
S3FilePart::setPresignedUrl(std::string  presigned_url)
{
	this->presigned_url = presigned_url;
}



