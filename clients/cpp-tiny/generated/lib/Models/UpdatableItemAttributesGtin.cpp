

#include "UpdatableItemAttributesGtin.h"

using namespace Tiny;

UpdatableItemAttributesGtin::UpdatableItemAttributesGtin()
{
}

UpdatableItemAttributesGtin::UpdatableItemAttributesGtin(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatableItemAttributesGtin::~UpdatableItemAttributesGtin()
{

}

void
UpdatableItemAttributesGtin::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UpdatableItemAttributesGtin::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



