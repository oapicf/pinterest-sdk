

#include "KeywordUpdate.h"

using namespace Tiny;

KeywordUpdate::KeywordUpdate()
{
	archived = bool(false);
	bid = int(0);
	id = std::string();
}

KeywordUpdate::KeywordUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordUpdate::~KeywordUpdate()
{

}

void
KeywordUpdate::fromJson(std::string jsonObj)
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
KeywordUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["archived"] = isArchived();






    object["bid"] = getBid();






    object["id"] = getId();



    return object;

}

bool
KeywordUpdate::isArchived()
{
	return archived;
}

void
KeywordUpdate::setArchived(bool  archived)
{
	this->archived = archived;
}

int
KeywordUpdate::getBid()
{
	return bid;
}

void
KeywordUpdate::setBid(int  bid)
{
	this->bid = bid;
}

std::string
KeywordUpdate::getId()
{
	return id;
}

void
KeywordUpdate::setId(std::string  id)
{
	this->id = id;
}



