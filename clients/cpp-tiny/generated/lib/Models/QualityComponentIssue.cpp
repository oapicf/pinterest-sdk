

#include "QualityComponentIssue.h"

using namespace Tiny;

QualityComponentIssue::QualityComponentIssue()
{
	id = std::string();
	name = std::string();
	reason = std::string();
}

QualityComponentIssue::QualityComponentIssue(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityComponentIssue::~QualityComponentIssue()
{

}

void
QualityComponentIssue::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *reasonKey = "reason";

    if(object.has_key(reasonKey))
    {
        bourne::json value = object[reasonKey];



        jsonToValue(&reason, value, "std::string");


    }


}

bourne::json
QualityComponentIssue::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["reason"] = getReason();



    return object;

}

std::string
QualityComponentIssue::getId()
{
	return id;
}

void
QualityComponentIssue::setId(std::string id)
{
	this->id = id;
}

std::string
QualityComponentIssue::getName()
{
	return name;
}

void
QualityComponentIssue::setName(std::string name)
{
	this->name = name;
}

std::string
QualityComponentIssue::getReason()
{
	return reason;
}

void
QualityComponentIssue::setReason(std::string reason)
{
	this->reason = reason;
}



