

#include "AdGroupAudienceSizingCreativeTypes.h"

using namespace Tiny;

AdGroupAudienceSizingCreativeTypes::AdGroupAudienceSizingCreativeTypes()
{
}

AdGroupAudienceSizingCreativeTypes::AdGroupAudienceSizingCreativeTypes(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingCreativeTypes::~AdGroupAudienceSizingCreativeTypes()
{

}

void
AdGroupAudienceSizingCreativeTypes::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdGroupAudienceSizingCreativeTypes::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



