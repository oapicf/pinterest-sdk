

#include "AgeTrendsBucket.h"

using namespace Tiny;

AgeTrendsBucket::AgeTrendsBucket()
{
}

AgeTrendsBucket::AgeTrendsBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

AgeTrendsBucket::~AgeTrendsBucket()
{

}

void
AgeTrendsBucket::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AgeTrendsBucket::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



