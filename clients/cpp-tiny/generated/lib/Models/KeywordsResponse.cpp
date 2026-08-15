

#include "KeywordsResponse.h"

using namespace Tiny;

KeywordsResponse::KeywordsResponse()
{
	errors = std::list<KeywordError>();
	keywords = std::list<Keyword>();
}

KeywordsResponse::KeywordsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsResponse::~KeywordsResponse()
{

}

void
KeywordsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *errorsKey = "errors";

    if(object.has_key(errorsKey))
    {
        bourne::json value = object[errorsKey];


        std::list<KeywordError> errors_list;
        KeywordError element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            errors_list.push_back(element);
        }
        errors = errors_list;


    }

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<Keyword> keywords_list;
        Keyword element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }


}

bourne::json
KeywordsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordError> errors_list = getErrors();
    bourne::json errors_arr = bourne::json::array();

    for(auto& var : errors_list)
    {
        KeywordError obj = var;
        errors_arr.append(obj.toJson());
    }
    object["errors"] = errors_arr;






    std::list<Keyword> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        Keyword obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;




    return object;

}

std::list<KeywordError>
KeywordsResponse::getErrors()
{
	return errors;
}

void
KeywordsResponse::setErrors(std::list <KeywordError> errors)
{
	this->errors = errors;
}

std::list<Keyword>
KeywordsResponse::getKeywords()
{
	return keywords;
}

void
KeywordsResponse::setKeywords(std::list <Keyword> keywords)
{
	this->keywords = keywords;
}



