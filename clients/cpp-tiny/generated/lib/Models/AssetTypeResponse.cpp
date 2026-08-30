

#include "AssetTypeResponse.h"

using namespace Tiny;

AssetTypeResponse::AssetTypeResponse()
{
}

AssetTypeResponse::AssetTypeResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetTypeResponse::~AssetTypeResponse()
{

}

void
AssetTypeResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AssetTypeResponse::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



