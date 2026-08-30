

#include "QuerypinanalyticsmetrictypesItems.h"

using namespace Tiny;

QuerypinanalyticsmetrictypesItems::QuerypinanalyticsmetrictypesItems()
{
}

QuerypinanalyticsmetrictypesItems::QuerypinanalyticsmetrictypesItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

QuerypinanalyticsmetrictypesItems::~QuerypinanalyticsmetrictypesItems()
{

}

void
QuerypinanalyticsmetrictypesItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
QuerypinanalyticsmetrictypesItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



