

#include "QueryLabelTypesItems.h"

using namespace Tiny;

QueryLabelTypesItems::QueryLabelTypesItems()
{
}

QueryLabelTypesItems::QueryLabelTypesItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

QueryLabelTypesItems::~QueryLabelTypesItems()
{

}

void
QueryLabelTypesItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QueryLabelTypesItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



