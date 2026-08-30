

#include "IneligibleProductTagReason.h"

using namespace Tiny;

IneligibleProductTagReason::IneligibleProductTagReason()
{
}

IneligibleProductTagReason::IneligibleProductTagReason(std::string jsonString)
{
	this->fromJson(jsonString);
}

IneligibleProductTagReason::~IneligibleProductTagReason()
{

}

void
IneligibleProductTagReason::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
IneligibleProductTagReason::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



