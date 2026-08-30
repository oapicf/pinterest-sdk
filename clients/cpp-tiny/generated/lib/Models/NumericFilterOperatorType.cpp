

#include "NumericFilterOperatorType.h"

using namespace Tiny;

NumericFilterOperatorType::NumericFilterOperatorType()
{
}

NumericFilterOperatorType::NumericFilterOperatorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

NumericFilterOperatorType::~NumericFilterOperatorType()
{

}

void
NumericFilterOperatorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NumericFilterOperatorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



