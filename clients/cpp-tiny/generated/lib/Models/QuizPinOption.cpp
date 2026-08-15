

#include "QuizPinOption.h"

using namespace Tiny;

QuizPinOption::QuizPinOption()
{
	id = float(0);
	text = std::string();
}

QuizPinOption::QuizPinOption(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuizPinOption::~QuizPinOption()
{

}

void
QuizPinOption::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "long");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }


}

bourne::json
QuizPinOption::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["text"] = getText();



    return object;

}

long
QuizPinOption::getId()
{
	return id;
}

void
QuizPinOption::setId(long  id)
{
	this->id = id;
}

std::string
QuizPinOption::getText()
{
	return text;
}

void
QuizPinOption::setText(std::string  text)
{
	this->text = text;
}



