

#include "ProductAvailability.h"

using namespace Tiny;

ProductAvailability::ProductAvailability()
{
}

ProductAvailability::ProductAvailability(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductAvailability::~ProductAvailability()
{

}

void
ProductAvailability::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductAvailability::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



