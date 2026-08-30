

#include "DynamicTitlesGetStatus.h"

using namespace Tiny;

DynamicTitlesGetStatus::DynamicTitlesGetStatus()
{
	generated_count = int(0);
	is_ready = bool(false);
	reviewed_count = int(0);
}

DynamicTitlesGetStatus::DynamicTitlesGetStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

DynamicTitlesGetStatus::~DynamicTitlesGetStatus()
{

}

void
DynamicTitlesGetStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generated_countKey = "generated_count";

    if(object.has_key(generated_countKey))
    {
        bourne::json value = object[generated_countKey];



        jsonToValue(&generated_count, value, "int");


    }

    const char *is_readyKey = "is_ready";

    if(object.has_key(is_readyKey))
    {
        bourne::json value = object[is_readyKey];



        jsonToValue(&is_ready, value, "bool");


    }

    const char *reviewed_countKey = "reviewed_count";

    if(object.has_key(reviewed_countKey))
    {
        bourne::json value = object[reviewed_countKey];



        jsonToValue(&reviewed_count, value, "int");


    }


}

bourne::json
DynamicTitlesGetStatus::toJson()
{
    bourne::json object = bourne::json::object();





    object["generated_count"] = getGeneratedCount();






    object["is_ready"] = isIsReady();






    object["reviewed_count"] = getReviewedCount();



    return object;

}

int
DynamicTitlesGetStatus::getGeneratedCount()
{
	return generated_count;
}

void
DynamicTitlesGetStatus::setGeneratedCount(int generated_count)
{
	this->generated_count = generated_count;
}

bool
DynamicTitlesGetStatus::isIsReady()
{
	return is_ready;
}

void
DynamicTitlesGetStatus::setIsReady(bool is_ready)
{
	this->is_ready = is_ready;
}

int
DynamicTitlesGetStatus::getReviewedCount()
{
	return reviewed_count;
}

void
DynamicTitlesGetStatus::setReviewedCount(int reviewed_count)
{
	this->reviewed_count = reviewed_count;
}



