

#include "ProductGroupSummaryStatus.h"

using namespace Tiny;

ProductGroupSummaryStatus::ProductGroupSummaryStatus()
{
}

ProductGroupSummaryStatus::ProductGroupSummaryStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

ProductGroupSummaryStatus::~ProductGroupSummaryStatus()
{

}

void
ProductGroupSummaryStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ProductGroupSummaryStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



