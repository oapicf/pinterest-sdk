

#include "EnhancedMatchStatusType.h"

using namespace Tiny;

EnhancedMatchStatusType::EnhancedMatchStatusType()
{
}

EnhancedMatchStatusType::EnhancedMatchStatusType(std::string jsonString)
{
	this->fromJson(jsonString);
}

EnhancedMatchStatusType::~EnhancedMatchStatusType()
{

}

void
EnhancedMatchStatusType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
EnhancedMatchStatusType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



