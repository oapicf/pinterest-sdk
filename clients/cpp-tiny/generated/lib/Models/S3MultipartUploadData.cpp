

#include "S3MultipartUploadData.h"

using namespace Tiny;

S3MultipartUploadData::S3MultipartUploadData()
{
	file_parts = std::list<S3FilePart>();
}

S3MultipartUploadData::S3MultipartUploadData(std::string jsonString)
{
	this->fromJson(jsonString);
}

S3MultipartUploadData::~S3MultipartUploadData()
{

}

void
S3MultipartUploadData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_partsKey = "file_parts";

    if(object.has_key(file_partsKey))
    {
        bourne::json value = object[file_partsKey];


        std::list<S3FilePart> file_parts_list;
        S3FilePart element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            file_parts_list.push_back(element);
        }
        file_parts = file_parts_list;


    }


}

bourne::json
S3MultipartUploadData::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<S3FilePart> file_parts_list = getFileParts();
    bourne::json file_parts_arr = bourne::json::array();

    for(auto& var : file_parts_list)
    {
        S3FilePart obj = var;
        file_parts_arr.append(obj.toJson());
    }
    object["file_parts"] = file_parts_arr;




    return object;

}

std::list<S3FilePart>
S3MultipartUploadData::getFileParts()
{
	return file_parts;
}

void
S3MultipartUploadData::setFileParts(std::list <S3FilePart> file_parts)
{
	this->file_parts = file_parts;
}



