

#include "QueryLabelEntityStatusesItems.h"

using namespace Tiny;

QueryLabelEntityStatusesItems::QueryLabelEntityStatusesItems()
{
}

QueryLabelEntityStatusesItems::QueryLabelEntityStatusesItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

QueryLabelEntityStatusesItems::~QueryLabelEntityStatusesItems()
{

}

void
QueryLabelEntityStatusesItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QueryLabelEntityStatusesItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



