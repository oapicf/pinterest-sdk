

#include "PlacementType.h"

using namespace Tiny;

PlacementType::PlacementType()
{
}

PlacementType::PlacementType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PlacementType::~PlacementType()
{

}

void
PlacementType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
PlacementType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



