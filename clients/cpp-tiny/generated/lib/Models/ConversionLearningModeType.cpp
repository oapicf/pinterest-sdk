

#include "ConversionLearningModeType.h"

using namespace Tiny;

ConversionLearningModeType::ConversionLearningModeType()
{
}

ConversionLearningModeType::ConversionLearningModeType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionLearningModeType::~ConversionLearningModeType()
{

}

void
ConversionLearningModeType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ConversionLearningModeType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



