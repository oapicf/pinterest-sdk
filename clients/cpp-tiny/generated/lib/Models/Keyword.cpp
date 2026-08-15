

#include "Keyword.h"

using namespace Tiny;

Keyword::Keyword()
{
	bid = int(0);
	match_type = MatchTypeResponse();
	value = std::string();
	archived = bool(false);
	id = std::string();
	parent_id = std::string();
	parent_type = std::string();
	type = std::string();
}

Keyword::Keyword(std::string jsonString)
{
	this->fromJson(jsonString);
}

Keyword::~Keyword()
{

}

void
Keyword::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "int");


    }

    const char *match_typeKey = "match_type";

    if(object.has_key(match_typeKey))
    {
        bourne::json value = object[match_typeKey];




        MatchTypeResponse* obj = &match_type;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *archivedKey = "archived";

    if(object.has_key(archivedKey))
    {
        bourne::json value = object[archivedKey];



        jsonToValue(&archived, value, "bool");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *parent_idKey = "parent_id";

    if(object.has_key(parent_idKey))
    {
        bourne::json value = object[parent_idKey];



        jsonToValue(&parent_id, value, "std::string");


    }

    const char *parent_typeKey = "parent_type";

    if(object.has_key(parent_typeKey))
    {
        bourne::json value = object[parent_typeKey];



        jsonToValue(&parent_type, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
Keyword::toJson()
{
    bourne::json object = bourne::json::object();





    object["bid"] = getBid();







	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();






    object["archived"] = isArchived();






    object["id"] = getId();






    object["parent_id"] = getParentId();






    object["parent_type"] = getParentType();






    object["type"] = getType();



    return object;

}

int
Keyword::getBid()
{
	return bid;
}

void
Keyword::setBid(int  bid)
{
	this->bid = bid;
}

MatchTypeResponse
Keyword::getMatchType()
{
	return match_type;
}

void
Keyword::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
Keyword::getValue()
{
	return value;
}

void
Keyword::setValue(std::string  value)
{
	this->value = value;
}

bool
Keyword::isArchived()
{
	return archived;
}

void
Keyword::setArchived(bool  archived)
{
	this->archived = archived;
}

std::string
Keyword::getId()
{
	return id;
}

void
Keyword::setId(std::string  id)
{
	this->id = id;
}

std::string
Keyword::getParentId()
{
	return parent_id;
}

void
Keyword::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

std::string
Keyword::getParentType()
{
	return parent_type;
}

void
Keyword::setParentType(std::string  parent_type)
{
	this->parent_type = parent_type;
}

std::string
Keyword::getType()
{
	return type;
}

void
Keyword::setType(std::string  type)
{
	this->type = type;
}



