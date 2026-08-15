

#include "AudienceInsightType.h"

using namespace Tiny;

AudienceInsightType::AudienceInsightType()
{
}

AudienceInsightType::AudienceInsightType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceInsightType::~AudienceInsightType()
{

}

void
AudienceInsightType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AudienceInsightType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



