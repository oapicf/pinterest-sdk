

#include "LeadFormQuestionType.h"

using namespace Tiny;

LeadFormQuestionType::LeadFormQuestionType()
{
}

LeadFormQuestionType::LeadFormQuestionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormQuestionType::~LeadFormQuestionType()
{

}

void
LeadFormQuestionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
LeadFormQuestionType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



