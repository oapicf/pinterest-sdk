

#include "LeadFormQuestion.h"

using namespace Tiny;

LeadFormQuestion::LeadFormQuestion()
{
	custom_question_field_type = LeadFormQuestionFieldType();
	custom_question_label = std::string();
	custom_question_options = std::list<std::string>();
	question_type = LeadFormQuestionType();
}

LeadFormQuestion::LeadFormQuestion(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormQuestion::~LeadFormQuestion()
{

}

void
LeadFormQuestion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *custom_question_field_typeKey = "custom_question_field_type";

    if(object.has_key(custom_question_field_typeKey))
    {
        bourne::json value = object[custom_question_field_typeKey];




        LeadFormQuestionFieldType* obj = &custom_question_field_type;
		obj->fromJson(value.dump());

    }

    const char *custom_question_labelKey = "custom_question_label";

    if(object.has_key(custom_question_labelKey))
    {
        bourne::json value = object[custom_question_labelKey];



        jsonToValue(&custom_question_label, value, "std::string");


    }

    const char *custom_question_optionsKey = "custom_question_options";

    if(object.has_key(custom_question_optionsKey))
    {
        bourne::json value = object[custom_question_optionsKey];


        std::list<std::string> custom_question_options_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            custom_question_options_list.push_back(element);
        }
        custom_question_options = custom_question_options_list;


    }

    const char *question_typeKey = "question_type";

    if(object.has_key(question_typeKey))
    {
        bourne::json value = object[question_typeKey];




        LeadFormQuestionType* obj = &question_type;
		obj->fromJson(value.dump());

    }


}

bourne::json
LeadFormQuestion::toJson()
{
    bourne::json object = bourne::json::object();






	object["custom_question_field_type"] = getCustomQuestionFieldType().toJson();





    object["custom_question_label"] = getCustomQuestionLabel();





    std::list<std::string> custom_question_options_list = getCustomQuestionOptions();
    bourne::json custom_question_options_arr = bourne::json::array();

    for(auto& var : custom_question_options_list)
    {
        custom_question_options_arr.append(var);
    }
    object["custom_question_options"] = custom_question_options_arr;










	object["question_type"] = getQuestionType().toJson();


    return object;

}

LeadFormQuestionFieldType
LeadFormQuestion::getCustomQuestionFieldType()
{
	return custom_question_field_type;
}

void
LeadFormQuestion::setCustomQuestionFieldType(LeadFormQuestionFieldType  custom_question_field_type)
{
	this->custom_question_field_type = custom_question_field_type;
}

std::string
LeadFormQuestion::getCustomQuestionLabel()
{
	return custom_question_label;
}

void
LeadFormQuestion::setCustomQuestionLabel(std::string  custom_question_label)
{
	this->custom_question_label = custom_question_label;
}

std::list<std::string>
LeadFormQuestion::getCustomQuestionOptions()
{
	return custom_question_options;
}

void
LeadFormQuestion::setCustomQuestionOptions(std::list <std::string> custom_question_options)
{
	this->custom_question_options = custom_question_options;
}

LeadFormQuestionType
LeadFormQuestion::getQuestionType()
{
	return question_type;
}

void
LeadFormQuestion::setQuestionType(LeadFormQuestionType  question_type)
{
	this->question_type = question_type;
}



