

#include "AssetSearchBy.h"

using namespace Tiny;

AssetSearchBy::AssetSearchBy()
{
}

AssetSearchBy::AssetSearchBy(std::string jsonString)
{
	this->fromJson(jsonString);
}

AssetSearchBy::~AssetSearchBy()
{

}

void
AssetSearchBy::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AssetSearchBy::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



