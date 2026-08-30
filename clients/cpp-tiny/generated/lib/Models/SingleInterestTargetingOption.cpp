

#include "SingleInterestTargetingOption.h"

using namespace Tiny;

SingleInterestTargetingOption::SingleInterestTargetingOption()
{
	child_interests = std::list<std::string>();
	id = std::string();
	level = int(0);
	name = std::string();
}

SingleInterestTargetingOption::SingleInterestTargetingOption(std::string jsonString)
{
	this->fromJson(jsonString);
}

SingleInterestTargetingOption::~SingleInterestTargetingOption()
{

}

void
SingleInterestTargetingOption::fromJson(std::string jsonObj)
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
SingleInterestTargetingOption::toJson()
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
SingleInterestTargetingOption::getChildInterests()
{
	return child_interests;
}

void
SingleInterestTargetingOption::setChildInterests(std::list<std::string> child_interests)
{
	this->child_interests = child_interests;
}

std::string
SingleInterestTargetingOption::getId()
{
	return id;
}

void
SingleInterestTargetingOption::setId(std::string id)
{
	this->id = id;
}

int
SingleInterestTargetingOption::getLevel()
{
	return level;
}

void
SingleInterestTargetingOption::setLevel(int level)
{
	this->level = level;
}

std::string
SingleInterestTargetingOption::getName()
{
	return name;
}

void
SingleInterestTargetingOption::setName(std::string name)
{
	this->name = name;
}



