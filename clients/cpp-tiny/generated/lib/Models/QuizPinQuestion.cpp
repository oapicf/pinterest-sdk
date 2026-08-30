

#include "QuizPinQuestion.h"

using namespace Tiny;

QuizPinQuestion::QuizPinQuestion()
{
	options = std::list<QuizPinOption>();
	question_id = float(0);
	question_text = std::string();
}

QuizPinQuestion::QuizPinQuestion(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuizPinQuestion::~QuizPinQuestion()
{

}

void
QuizPinQuestion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *optionsKey = "options";

    if(object.has_key(optionsKey))
    {
        bourne::json value = object[optionsKey];


        std::list<QuizPinOption> options_list;
        QuizPinOption element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            options_list.push_back(element);
        }
        options = options_list;


    }

    const char *question_idKey = "question_id";

    if(object.has_key(question_idKey))
    {
        bourne::json value = object[question_idKey];



        jsonToValue(&question_id, value, "long");


    }

    const char *question_textKey = "question_text";

    if(object.has_key(question_textKey))
    {
        bourne::json value = object[question_textKey];



        jsonToValue(&question_text, value, "std::string");


    }


}

bourne::json
QuizPinQuestion::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<QuizPinOption> options_list = getOptions();
    bourne::json options_arr = bourne::json::array();

    for(auto& var : options_list)
    {
        QuizPinOption obj = var;
        options_arr.append(obj.toJson());
    }
    object["options"] = options_arr;







    object["question_id"] = getQuestionId();






    object["question_text"] = getQuestionText();



    return object;

}

std::list<QuizPinOption>
QuizPinQuestion::getOptions()
{
	return options;
}

void
QuizPinQuestion::setOptions(std::list<QuizPinOption> options)
{
	this->options = options;
}

long
QuizPinQuestion::getQuestionId()
{
	return question_id;
}

void
QuizPinQuestion::setQuestionId(long question_id)
{
	this->question_id = question_id;
}

std::string
QuizPinQuestion::getQuestionText()
{
	return question_text;
}

void
QuizPinQuestion::setQuestionText(std::string question_text)
{
	this->question_text = question_text;
}



