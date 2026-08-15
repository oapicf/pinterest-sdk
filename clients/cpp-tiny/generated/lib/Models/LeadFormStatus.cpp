

#include "LeadFormStatus.h"

using namespace Tiny;

LeadFormStatus::LeadFormStatus()
{
}

LeadFormStatus::LeadFormStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormStatus::~LeadFormStatus()
{

}

void
LeadFormStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LeadFormStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



