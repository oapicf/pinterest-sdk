

#include "GenderBucket.h"

using namespace Tiny;

GenderBucket::GenderBucket()
{
}

GenderBucket::GenderBucket(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderBucket::~GenderBucket()
{

}

void
GenderBucket::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
GenderBucket::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



