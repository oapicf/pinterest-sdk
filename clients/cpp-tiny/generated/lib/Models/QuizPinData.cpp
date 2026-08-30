

#include "QuizPinData.h"

using namespace Tiny;

QuizPinData::QuizPinData()
{
	questions = std::list<QuizPinQuestion>();
	results = std::list<QuizPinResult>();
	tie_breaker_custom_result = QuizPinResult();
	tie_breaker_type = TieBreakerType();
}

QuizPinData::QuizPinData(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuizPinData::~QuizPinData()
{

}

void
QuizPinData::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *questionsKey = "questions";

    if(object.has_key(questionsKey))
    {
        bourne::json value = object[questionsKey];


        std::list<QuizPinQuestion> questions_list;
        QuizPinQuestion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            questions_list.push_back(element);
        }
        questions = questions_list;


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<QuizPinResult> results_list;
        QuizPinResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }

    const char *tie_breaker_custom_resultKey = "tie_breaker_custom_result";

    if(object.has_key(tie_breaker_custom_resultKey))
    {
        bourne::json value = object[tie_breaker_custom_resultKey];




        QuizPinResult* obj = &tie_breaker_custom_result;
		obj->fromJson(value.dump());

    }

    const char *tie_breaker_typeKey = "tie_breaker_type";

    if(object.has_key(tie_breaker_typeKey))
    {
        bourne::json value = object[tie_breaker_typeKey];




        TieBreakerType* obj = &tie_breaker_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
QuizPinData::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<QuizPinQuestion> questions_list = getQuestions();
    bourne::json questions_arr = bourne::json::array();

    for(auto& var : questions_list)
    {
        QuizPinQuestion obj = var;
        questions_arr.append(obj.toJson());
    }
    object["questions"] = questions_arr;






    std::list<QuizPinResult> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        QuizPinResult obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;








	object["tie_breaker_custom_result"] = getTieBreakerCustomResult().toJson();






	object["tie_breaker_type"] = getTieBreakerType().toJson();


    return object;

}

std::list<QuizPinQuestion>
QuizPinData::getQuestions()
{
	return questions;
}

void
QuizPinData::setQuestions(std::list<QuizPinQuestion> questions)
{
	this->questions = questions;
}

std::list<QuizPinResult>
QuizPinData::getResults()
{
	return results;
}

void
QuizPinData::setResults(std::list<QuizPinResult> results)
{
	this->results = results;
}

QuizPinResult
QuizPinData::getTieBreakerCustomResult()
{
	return tie_breaker_custom_result;
}

void
QuizPinData::setTieBreakerCustomResult(QuizPinResult tie_breaker_custom_result)
{
	this->tie_breaker_custom_result = tie_breaker_custom_result;
}

TieBreakerType
QuizPinData::getTieBreakerType()
{
	return tie_breaker_type;
}

void
QuizPinData::setTieBreakerType(TieBreakerType tie_breaker_type)
{
	this->tie_breaker_type = tie_breaker_type;
}



