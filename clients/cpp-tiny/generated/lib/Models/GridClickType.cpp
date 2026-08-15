

#include "GridClickType.h"

using namespace Tiny;

GridClickType::GridClickType()
{
}

GridClickType::GridClickType(std::string jsonString)
{
	this->fromJson(jsonString);
}

GridClickType::~GridClickType()
{

}

void
GridClickType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GridClickType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



