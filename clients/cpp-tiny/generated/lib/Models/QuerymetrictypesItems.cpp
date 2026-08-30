

#include "QuerymetrictypesItems.h"

using namespace Tiny;

QuerymetrictypesItems::QuerymetrictypesItems()
{
}

QuerymetrictypesItems::QuerymetrictypesItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuerymetrictypesItems::~QuerymetrictypesItems()
{

}

void
QuerymetrictypesItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QuerymetrictypesItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



