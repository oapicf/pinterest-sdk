

#include "AssetPermissionType.h"

using namespace Tiny;

AssetPermissionType::AssetPermissionType()
{
}

AssetPermissionType::AssetPermissionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetPermissionType::~AssetPermissionType()
{

}

void
AssetPermissionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AssetPermissionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



