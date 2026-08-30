

#include "ItemAvailability.h"

using namespace Tiny;

ItemAvailability::ItemAvailability()
{
}

ItemAvailability::ItemAvailability(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAvailability::~ItemAvailability()
{

}

void
ItemAvailability::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ItemAvailability::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



