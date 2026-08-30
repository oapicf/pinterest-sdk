

#include "KeywordUpdateItem.h"

using namespace Tiny;

KeywordUpdateItem::KeywordUpdateItem()
{
	archived = bool(false);
	bid = int(0);
	id = std::string();
}

KeywordUpdateItem::KeywordUpdateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordUpdateItem::~KeywordUpdateItem()
{

}

void
KeywordUpdateItem::fromJson(std::string jsonObj)
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
KeywordUpdateItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["archived"] = isArchived();






    object["bid"] = getBid();






    object["id"] = getId();



    return object;

}

bool
KeywordUpdateItem::isArchived()
{
	return archived;
}

void
KeywordUpdateItem::setArchived(bool archived)
{
	this->archived = archived;
}

int
KeywordUpdateItem::getBid()
{
	return bid;
}

void
KeywordUpdateItem::setBid(int bid)
{
	this->bid = bid;
}

std::string
KeywordUpdateItem::getId()
{
	return id;
}

void
KeywordUpdateItem::setId(std::string id)
{
	this->id = id;
}



