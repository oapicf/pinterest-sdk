

#include "QueryvideopinmetrictypesItems.h"

using namespace Tiny;

QueryvideopinmetrictypesItems::QueryvideopinmetrictypesItems()
{
}

QueryvideopinmetrictypesItems::QueryvideopinmetrictypesItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

QueryvideopinmetrictypesItems::~QueryvideopinmetrictypesItems()
{

}

void
QueryvideopinmetrictypesItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QueryvideopinmetrictypesItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



