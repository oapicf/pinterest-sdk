

#include "AdgroupPlacementGroupType.h"

using namespace Tiny;

AdgroupPlacementGroupType::AdgroupPlacementGroupType()
{
}

AdgroupPlacementGroupType::AdgroupPlacementGroupType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdgroupPlacementGroupType::~AdgroupPlacementGroupType()
{

}

void
AdgroupPlacementGroupType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdgroupPlacementGroupType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



