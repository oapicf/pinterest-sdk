

#include "KeywordUpdateBody.h"

using namespace Tiny;

KeywordUpdateBody::KeywordUpdateBody()
{
	keywords = std::list<KeywordUpdate>();
}

KeywordUpdateBody::KeywordUpdateBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordUpdateBody::~KeywordUpdateBody()
{

}

void
KeywordUpdateBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<KeywordUpdate> keywords_list;
        KeywordUpdate element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }


}

bourne::json
KeywordUpdateBody::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordUpdate> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordUpdate obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;




    return object;

}

std::list<KeywordUpdate>
KeywordUpdateBody::getKeywords()
{
	return keywords;
}

void
KeywordUpdateBody::setKeywords(std::list <KeywordUpdate> keywords)
{
	this->keywords = keywords;
}



