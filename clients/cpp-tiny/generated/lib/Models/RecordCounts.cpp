

#include "RecordCounts.h"

using namespace Tiny;

RecordCounts::RecordCounts()
{
	invalid = int(0);
	processed = int(0);
	valid = int(0);
}

RecordCounts::RecordCounts(std::string jsonString)
{
	this->fromJson(jsonString);
}

RecordCounts::~RecordCounts()
{

}

void
RecordCounts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *invalidKey = "invalid";

    if(object.has_key(invalidKey))
    {
        bourne::json value = object[invalidKey];



        jsonToValue(&invalid, value, "int");


    }

    const char *processedKey = "processed";

    if(object.has_key(processedKey))
    {
        bourne::json value = object[processedKey];



        jsonToValue(&processed, value, "int");


    }

    const char *validKey = "valid";

    if(object.has_key(validKey))
    {
        bourne::json value = object[validKey];



        jsonToValue(&valid, value, "int");


    }


}

bourne::json
RecordCounts::toJson()
{
    bourne::json object = bourne::json::object();





    object["invalid"] = getInvalid();






    object["processed"] = getProcessed();






    object["valid"] = getValid();



    return object;

}

int
RecordCounts::getInvalid()
{
	return invalid;
}

void
RecordCounts::setInvalid(int invalid)
{
	this->invalid = invalid;
}

int
RecordCounts::getProcessed()
{
	return processed;
}

void
RecordCounts::setProcessed(int processed)
{
	this->processed = processed;
}

int
RecordCounts::getValid()
{
	return valid;
}

void
RecordCounts::setValid(int valid)
{
	this->valid = valid;
}



