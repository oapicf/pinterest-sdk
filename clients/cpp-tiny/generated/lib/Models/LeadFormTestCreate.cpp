

#include "LeadFormTestCreate.h"

using namespace Tiny;

LeadFormTestCreate::LeadFormTestCreate()
{
	answers = std::list<std::string>();
}

LeadFormTestCreate::LeadFormTestCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormTestCreate::~LeadFormTestCreate()
{

}

void
LeadFormTestCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *answersKey = "answers";

    if(object.has_key(answersKey))
    {
        bourne::json value = object[answersKey];


        std::list<std::string> answers_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            answers_list.push_back(element);
        }
        answers = answers_list;


    }


}

bourne::json
LeadFormTestCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> answers_list = getAnswers();
    bourne::json answers_arr = bourne::json::array();

    for(auto& var : answers_list)
    {
        answers_arr.append(var);
    }
    object["answers"] = answers_arr;






    return object;

}

std::list<std::string>
LeadFormTestCreate::getAnswers()
{
	return answers;
}

void
LeadFormTestCreate::setAnswers(std::list<std::string> answers)
{
	this->answers = answers;
}



