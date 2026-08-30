

#include "TrendsAgeBucket.h"

using namespace Tiny;

TrendsAgeBucket::TrendsAgeBucket()
{
}

TrendsAgeBucket::TrendsAgeBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

TrendsAgeBucket::~TrendsAgeBucket()
{

}

void
TrendsAgeBucket::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
TrendsAgeBucket::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



