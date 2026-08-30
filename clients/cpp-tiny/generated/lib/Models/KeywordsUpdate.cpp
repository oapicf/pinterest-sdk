

#include "KeywordsUpdate.h"

using namespace Tiny;

KeywordsUpdate::KeywordsUpdate()
{
	keywords = std::list<KeywordUpdateItem>();
}

KeywordsUpdate::KeywordsUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsUpdate::~KeywordsUpdate()
{

}

void
KeywordsUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<KeywordUpdateItem> keywords_list;
        KeywordUpdateItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }


}

bourne::json
KeywordsUpdate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordUpdateItem> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordUpdateItem obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;




    return object;

}

std::list<KeywordUpdateItem>
KeywordsUpdate::getKeywords()
{
	return keywords;
}

void
KeywordsUpdate::setKeywords(std::list<KeywordUpdateItem> keywords)
{
	this->keywords = keywords;
}



