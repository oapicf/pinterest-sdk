

#include "GetBusinessAssetTypeResponse.h"

using namespace Tiny;

GetBusinessAssetTypeResponse::GetBusinessAssetTypeResponse()
{
}

GetBusinessAssetTypeResponse::GetBusinessAssetTypeResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetBusinessAssetTypeResponse::~GetBusinessAssetTypeResponse()
{

}

void
GetBusinessAssetTypeResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GetBusinessAssetTypeResponse::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



