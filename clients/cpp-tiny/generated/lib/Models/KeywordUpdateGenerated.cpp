

#include "KeywordUpdateGenerated.h"

using namespace Tiny;

KeywordUpdateGenerated::KeywordUpdateGenerated()
{
	archived = bool(false);
	bid = int(0);
	id = std::string();
}

KeywordUpdateGenerated::KeywordUpdateGenerated(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordUpdateGenerated::~KeywordUpdateGenerated()
{

}

void
KeywordUpdateGenerated::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *archivedKey = "archived";

    if(object.has_key(archivedKey))
    {
        bourne::json value = object[archivedKey];



        jsonToValue(&archived, value, "bool");


    }

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
KeywordUpdateGenerated::toJson()
{
    bourne::json object = bourne::json::object();





    object["archived"] = isArchived();






    object["bid"] = getBid();






    object["id"] = getId();



    return object;

}

bool
KeywordUpdateGenerated::isArchived()
{
	return archived;
}

void
KeywordUpdateGenerated::setArchived(bool archived)
{
	this->archived = archived;
}

int
KeywordUpdateGenerated::getBid()
{
	return bid;
}

void
KeywordUpdateGenerated::setBid(int bid)
{
	this->bid = bid;
}

std::string
KeywordUpdateGenerated::getId()
{
	return id;
}

void
KeywordUpdateGenerated::setId(std::string id)
{
	this->id = id;
}



