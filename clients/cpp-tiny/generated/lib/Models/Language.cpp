

#include "Language.h"

using namespace Tiny;

Language::Language()
{
}

Language::Language(std::string jsonString)
{
	this->fromJson(jsonString);
}

Language::~Language()
{

}

void
Language::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Language::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



