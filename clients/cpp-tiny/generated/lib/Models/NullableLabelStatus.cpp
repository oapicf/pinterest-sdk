

#include "NullableLabelStatus.h"

using namespace Tiny;

NullableLabelStatus::NullableLabelStatus()
{
}

NullableLabelStatus::NullableLabelStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

NullableLabelStatus::~NullableLabelStatus()
{

}

void
NullableLabelStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NullableLabelStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



