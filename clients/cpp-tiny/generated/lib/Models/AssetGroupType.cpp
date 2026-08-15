

#include "AssetGroupType.h"

using namespace Tiny;

AssetGroupType::AssetGroupType()
{
}

AssetGroupType::AssetGroupType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetGroupType::~AssetGroupType()
{

}

void
AssetGroupType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AssetGroupType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



