

#include "KeywordsCreate.h"

using namespace Tiny;

KeywordsCreate::KeywordsCreate()
{
	keywords = std::list<KeywordCreateItem>();
	parent_id = std::string();
}

KeywordsCreate::KeywordsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsCreate::~KeywordsCreate()
{

}

void
KeywordsCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<KeywordCreateItem> keywords_list;
        KeywordCreateItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }


}

bourne::json
KeywordsCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<KeywordCreateItem> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordCreateItem obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;







    object["parent_id"] = getParentId();



    return object;

}

std::list<KeywordCreateItem>
KeywordsCreate::getKeywords()
{
	return keywords;
}

void
KeywordsCreate::setKeywords(std::list<KeywordCreateItem> keywords)
{
	this->keywords = keywords;
}

std::string
KeywordsCreate::getParentId()
{
	return parent_id;
}

void
KeywordsCreate::setParentId(std::string parent_id)
{
	this->parent_id = parent_id;
}



