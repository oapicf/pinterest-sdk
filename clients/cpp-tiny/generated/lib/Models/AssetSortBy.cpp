

#include "AssetSortBy.h"

using namespace Tiny;

AssetSortBy::AssetSortBy()
{
}

AssetSortBy::AssetSortBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetSortBy::~AssetSortBy()
{

}

void
AssetSortBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AssetSortBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



