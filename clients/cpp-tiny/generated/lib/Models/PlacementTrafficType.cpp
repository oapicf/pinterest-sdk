

#include "PlacementTrafficType.h"

using namespace Tiny;

PlacementTrafficType::PlacementTrafficType()
{
}

PlacementTrafficType::PlacementTrafficType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PlacementTrafficType::~PlacementTrafficType()
{

}

void
PlacementTrafficType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PlacementTrafficType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



