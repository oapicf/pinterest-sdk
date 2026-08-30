

#include "SSIOOrderLineType.h"

using namespace Tiny;

SSIOOrderLineType::SSIOOrderLineType()
{
}

SSIOOrderLineType::SSIOOrderLineType(std::string jsonString)
{
	this->fromJson(jsonString);
}

SSIOOrderLineType::~SSIOOrderLineType()
{

}

void
SSIOOrderLineType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SSIOOrderLineType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



