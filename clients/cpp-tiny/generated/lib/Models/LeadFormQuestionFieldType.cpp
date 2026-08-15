

#include "LeadFormQuestionFieldType.h"

using namespace Tiny;

LeadFormQuestionFieldType::LeadFormQuestionFieldType()
{
}

LeadFormQuestionFieldType::LeadFormQuestionFieldType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormQuestionFieldType::~LeadFormQuestionFieldType()
{

}

void
LeadFormQuestionFieldType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LeadFormQuestionFieldType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



