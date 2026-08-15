

#include "PlacementGroupType.h"

using namespace Tiny;

PlacementGroupType::PlacementGroupType()
{
}

PlacementGroupType::PlacementGroupType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PlacementGroupType::~PlacementGroupType()
{

}

void
PlacementGroupType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PlacementGroupType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



