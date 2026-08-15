

#include "LabelStatus.h"

using namespace Tiny;

LabelStatus::LabelStatus()
{
}

LabelStatus::LabelStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

LabelStatus::~LabelStatus()
{

}

void
LabelStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LabelStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



