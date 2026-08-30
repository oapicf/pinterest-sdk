

#include "TrendingTopic.h"

using namespace Tiny;

TrendingTopic::TrendingTopic()
{
	description = std::string();
	id = std::string();
	percent_growth_mom = int(0);
	pins = std::list<TrendingPin>();
	related_interests = std::list<std::string>();
	related_searches = std::list<std::string>();
	time_series = null<long>();
	title = std::string();
}

TrendingTopic::TrendingTopic(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendingTopic::~TrendingTopic()
{

}

void
TrendingTopic::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *percent_growth_momKey = "percent_growth_mom";

    if(object.has_key(percent_growth_momKey))
    {
        bourne::json value = object[percent_growth_momKey];



        jsonToValue(&percent_growth_mom, value, "int");


    }

    const char *pinsKey = "pins";

    if(object.has_key(pinsKey))
    {
        bourne::json value = object[pinsKey];


        std::list<TrendingPin> pins_list;
        TrendingPin element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pins_list.push_back(element);
        }
        pins = pins_list;


    }

    const char *related_interestsKey = "related_interests";

    if(object.has_key(related_interestsKey))
    {
        bourne::json value = object[related_interestsKey];


        std::list<std::string> related_interests_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            related_interests_list.push_back(element);
        }
        related_interests = related_interests_list;


    }

    const char *related_searchesKey = "related_searches";

    if(object.has_key(related_searchesKey))
    {
        bourne::json value = object[related_searchesKey];


        std::list<std::string> related_searches_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            related_searches_list.push_back(element);
        }
        related_searches = related_searches_list;


    }

    const char *time_seriesKey = "time_series";

    if(object.has_key(time_seriesKey))
    {
        bourne::json value = object[time_seriesKey];


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }


}

bourne::json
TrendingTopic::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["id"] = getId();






    object["percent_growth_mom"] = getPercentGrowthMom();





    std::list<TrendingPin> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        TrendingPin obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;






    std::list<std::string> related_interests_list = getRelatedInterests();
    bourne::json related_interests_arr = bourne::json::array();

    for(auto& var : related_interests_list)
    {
        related_interests_arr.append(var);
    }
    object["related_interests"] = related_interests_arr;








    std::list<std::string> related_searches_list = getRelatedSearches();
    bourne::json related_searches_arr = bourne::json::array();

    for(auto& var : related_searches_list)
    {
        related_searches_arr.append(var);
    }
    object["related_searches"] = related_searches_arr;












    object["title"] = getTitle();



    return object;

}

std::string
TrendingTopic::getDescription()
{
	return description;
}

void
TrendingTopic::setDescription(std::string description)
{
	this->description = description;
}

std::string
TrendingTopic::getId()
{
	return id;
}

void
TrendingTopic::setId(std::string id)
{
	this->id = id;
}

int
TrendingTopic::getPercentGrowthMom()
{
	return percent_growth_mom;
}

void
TrendingTopic::setPercentGrowthMom(int percent_growth_mom)
{
	this->percent_growth_mom = percent_growth_mom;
}

std::list<TrendingPin>
TrendingTopic::getPins()
{
	return pins;
}

void
TrendingTopic::setPins(std::list<TrendingPin> pins)
{
	this->pins = pins;
}

std::list<std::string>
TrendingTopic::getRelatedInterests()
{
	return related_interests;
}

void
TrendingTopic::setRelatedInterests(std::list<std::string> related_interests)
{
	this->related_interests = related_interests;
}

std::list<std::string>
TrendingTopic::getRelatedSearches()
{
	return related_searches;
}

void
TrendingTopic::setRelatedSearches(std::list<std::string> related_searches)
{
	this->related_searches = related_searches;
}

std::map<std::string, long>
TrendingTopic::getTimeSeries()
{
	return time_series;
}

void
TrendingTopic::setTimeSeries(std::map<std::string, long> time_series)
{
	this->time_series = time_series;
}

std::string
TrendingTopic::getTitle()
{
	return title;
}

void
TrendingTopic::setTitle(std::string title)
{
	this->title = title;
}



