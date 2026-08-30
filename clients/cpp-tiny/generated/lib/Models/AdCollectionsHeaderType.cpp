

#include "AdCollectionsHeaderType.h"

using namespace Tiny;

AdCollectionsHeaderType::AdCollectionsHeaderType()
{
}

AdCollectionsHeaderType::AdCollectionsHeaderType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdCollectionsHeaderType::~AdCollectionsHeaderType()
{

}

void
AdCollectionsHeaderType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdCollectionsHeaderType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



