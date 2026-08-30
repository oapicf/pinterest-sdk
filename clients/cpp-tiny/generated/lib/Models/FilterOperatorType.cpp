

#include "FilterOperatorType.h"

using namespace Tiny;

FilterOperatorType::FilterOperatorType()
{
}

FilterOperatorType::FilterOperatorType(std::string jsonString)
{
	this->fromJson(jsonString);
}

FilterOperatorType::~FilterOperatorType()
{

}

void
FilterOperatorType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
FilterOperatorType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



