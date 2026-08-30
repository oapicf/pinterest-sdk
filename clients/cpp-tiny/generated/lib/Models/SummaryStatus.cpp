

#include "SummaryStatus.h"

using namespace Tiny;

SummaryStatus::SummaryStatus()
{
}

SummaryStatus::SummaryStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

SummaryStatus::~SummaryStatus()
{

}

void
SummaryStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
SummaryStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



