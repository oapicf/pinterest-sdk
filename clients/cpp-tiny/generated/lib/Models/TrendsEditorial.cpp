

#include "TrendsEditorial.h"

using namespace Tiny;

TrendsEditorial::TrendsEditorial()
{
	board_url = std::string();
	description = std::string();
	interests = std::list<std::string>();
	pins_url = std::list<std::string>();
	related_keywords = std::list<KeywordInfo>();
	title = std::string();
}

TrendsEditorial::TrendsEditorial(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsEditorial::~TrendsEditorial()
{

}

void
TrendsEditorial::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *board_urlKey = "board_url";

    if(object.has_key(board_urlKey))
    {
        bourne::json value = object[board_urlKey];



        jsonToValue(&board_url, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *interestsKey = "interests";

    if(object.has_key(interestsKey))
    {
        bourne::json value = object[interestsKey];


        std::list<std::string> interests_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            interests_list.push_back(element);
        }
        interests = interests_list;


    }

    const char *pins_urlKey = "pins_url";

    if(object.has_key(pins_urlKey))
    {
        bourne::json value = object[pins_urlKey];


        std::list<std::string> pins_url_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            pins_url_list.push_back(element);
        }
        pins_url = pins_url_list;


    }

    const char *related_keywordsKey = "related_keywords";

    if(object.has_key(related_keywordsKey))
    {
        bourne::json value = object[related_keywordsKey];


        std::list<KeywordInfo> related_keywords_list;
        KeywordInfo element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            related_keywords_list.push_back(element);
        }
        related_keywords = related_keywords_list;


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
TrendsEditorial::toJson()
{
    bourne::json object = bourne::json::object();





    object["board_url"] = getBoardUrl();






    object["description"] = getDescription();





    std::list<std::string> interests_list = getInterests();
    bourne::json interests_arr = bourne::json::array();

    for(auto& var : interests_list)
    {
        interests_arr.append(var);
    }
    object["interests"] = interests_arr;








    std::list<std::string> pins_url_list = getPinsUrl();
    bourne::json pins_url_arr = bourne::json::array();

    for(auto& var : pins_url_list)
    {
        pins_url_arr.append(var);
    }
    object["pins_url"] = pins_url_arr;








    std::list<KeywordInfo> related_keywords_list = getRelatedKeywords();
    bourne::json related_keywords_arr = bourne::json::array();

    for(auto& var : related_keywords_list)
    {
        KeywordInfo obj = var;
        related_keywords_arr.append(obj.toJson());
    }
    object["related_keywords"] = related_keywords_arr;







    object["title"] = getTitle();



    return object;

}

std::string
TrendsEditorial::getBoardUrl()
{
	return board_url;
}

void
TrendsEditorial::setBoardUrl(std::string board_url)
{
	this->board_url = board_url;
}

std::string
TrendsEditorial::getDescription()
{
	return description;
}

void
TrendsEditorial::setDescription(std::string description)
{
	this->description = description;
}

std::list<std::string>
TrendsEditorial::getInterests()
{
	return interests;
}

void
TrendsEditorial::setInterests(std::list<std::string> interests)
{
	this->interests = interests;
}

std::list<std::string>
TrendsEditorial::getPinsUrl()
{
	return pins_url;
}

void
TrendsEditorial::setPinsUrl(std::list<std::string> pins_url)
{
	this->pins_url = pins_url;
}

std::list<KeywordInfo>
TrendsEditorial::getRelatedKeywords()
{
	return related_keywords;
}

void
TrendsEditorial::setRelatedKeywords(std::list<KeywordInfo> related_keywords)
{
	this->related_keywords = related_keywords;
}

std::string
TrendsEditorial::getTitle()
{
	return title;
}

void
TrendsEditorial::setTitle(std::string title)
{
	this->title = title;
}



