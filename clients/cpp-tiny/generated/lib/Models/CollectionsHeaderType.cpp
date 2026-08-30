

#include "CollectionsHeaderType.h"

using namespace Tiny;

CollectionsHeaderType::CollectionsHeaderType()
{
}

CollectionsHeaderType::CollectionsHeaderType(std::string jsonString)
{
	this->fromJson(jsonString);
}

CollectionsHeaderType::~CollectionsHeaderType()
{

}

void
CollectionsHeaderType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CollectionsHeaderType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



