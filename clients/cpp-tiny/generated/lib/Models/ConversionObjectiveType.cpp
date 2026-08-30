

#include "ConversionObjectiveType.h"

using namespace Tiny;

ConversionObjectiveType::ConversionObjectiveType()
{
}

ConversionObjectiveType::ConversionObjectiveType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionObjectiveType::~ConversionObjectiveType()
{

}

void
ConversionObjectiveType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionObjectiveType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



