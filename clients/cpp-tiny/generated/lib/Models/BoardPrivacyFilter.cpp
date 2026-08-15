

#include "BoardPrivacyFilter.h"

using namespace Tiny;

BoardPrivacyFilter::BoardPrivacyFilter()
{
}

BoardPrivacyFilter::BoardPrivacyFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardPrivacyFilter::~BoardPrivacyFilter()
{

}

void
BoardPrivacyFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
BoardPrivacyFilter::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



