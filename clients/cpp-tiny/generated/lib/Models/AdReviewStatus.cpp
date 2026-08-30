

#include "AdReviewStatus.h"

using namespace Tiny;

AdReviewStatus::AdReviewStatus()
{
}

AdReviewStatus::AdReviewStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdReviewStatus::~AdReviewStatus()
{

}

void
AdReviewStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AdReviewStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



