

#include "SingleInterestTargetingOptionResponse.h"

using namespace Tiny;

SingleInterestTargetingOptionResponse::SingleInterestTargetingOptionResponse()
{
	child_interests = std::list<std::string>();
	id = std::string();
	level = int(0);
	name = std::string();
}

SingleInterestTargetingOptionResponse::SingleInterestTargetingOptionResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

SingleInterestTargetingOptionResponse::~SingleInterestTargetingOptionResponse()
{

}

void
SingleInterestTargetingOptionResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *child_interestsKey = "child_interests";

    if(object.has_key(child_interestsKey))
    {
        bourne::json value = object[child_interestsKey];


        std::list<std::string> child_interests_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            child_interests_list.push_back(element);
        }
        child_interests = child_interests_list;


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];



        jsonToValue(&level, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }


}

bourne::json
SingleInterestTargetingOptionResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> child_interests_list = getChildInterests();
    bourne::json child_interests_arr = bourne::json::array();

    for(auto& var : child_interests_list)
    {
        child_interests_arr.append(var);
    }
    object["child_interests"] = child_interests_arr;









    object["id"] = getId();






    object["level"] = getLevel();






    object["name"] = getName();



    return object;

}

std::list<std::string>
SingleInterestTargetingOptionResponse::getChildInterests()
{
	return child_interests;
}

void
SingleInterestTargetingOptionResponse::setChildInterests(std::list <std::string> child_interests)
{
	this->child_interests = child_interests;
}

std::string
SingleInterestTargetingOptionResponse::getId()
{
	return id;
}

void
SingleInterestTargetingOptionResponse::setId(std::string  id)
{
	this->id = id;
}

int
SingleInterestTargetingOptionResponse::getLevel()
{
	return level;
}

void
SingleInterestTargetingOptionResponse::setLevel(int  level)
{
	this->level = level;
}

std::string
SingleInterestTargetingOptionResponse::getName()
{
	return name;
}

void
SingleInterestTargetingOptionResponse::setName(std::string  name)
{
	this->name = name;
}



