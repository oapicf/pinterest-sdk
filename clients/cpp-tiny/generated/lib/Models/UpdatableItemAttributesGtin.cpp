

#include "UpdatableItemAttributes_gtin.h"

using namespace Tiny;

UpdatableItemAttributes_gtin::UpdatableItemAttributes_gtin()
{
}

UpdatableItemAttributes_gtin::UpdatableItemAttributes_gtin(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatableItemAttributes_gtin::~UpdatableItemAttributes_gtin()
{

}

void
UpdatableItemAttributes_gtin::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
UpdatableItemAttributes_gtin::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



