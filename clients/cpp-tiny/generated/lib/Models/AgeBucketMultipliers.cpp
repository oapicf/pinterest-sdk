

#include "AgeBucketMultipliers.h"

using namespace Tiny;

AgeBucketMultipliers::AgeBucketMultipliers()
{
	aGE_BUCKET = null;
}

AgeBucketMultipliers::AgeBucketMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

AgeBucketMultipliers::~AgeBucketMultipliers()
{

}

void
AgeBucketMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aGE_BUCKETKey = "AGE_BUCKET";

    if(object.has_key(aGE_BUCKETKey))
    {
        bourne::json value = object[aGE_BUCKETKey];




        TargetingSpecAgeBucket* obj = &aGE_BUCKET;
		obj->fromJson(value.dump());

    }


}

bourne::json
AgeBucketMultipliers::toJson()
{
    bourne::json object = bourne::json::object();






	object["aGE_BUCKET"] = getAGEBUCKET().toJson();


    return object;

}

TargetingSpecAgeBucket
AgeBucketMultipliers::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
AgeBucketMultipliers::setAGEBUCKET(TargetingSpecAgeBucket aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}



