

#include "ChangeHistoryDataType.h"

using namespace Tiny;

ChangeHistoryDataType::ChangeHistoryDataType()
{
}

ChangeHistoryDataType::ChangeHistoryDataType(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChangeHistoryDataType::~ChangeHistoryDataType()
{

}

void
ChangeHistoryDataType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChangeHistoryDataType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



