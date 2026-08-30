

#include "AttributionActionType.h"

using namespace Tiny;

AttributionActionType::AttributionActionType()
{
}

AttributionActionType::AttributionActionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AttributionActionType::~AttributionActionType()
{

}

void
AttributionActionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AttributionActionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



