

#include "AdvertiserDefinedEventProcessingRecord.h"

using namespace Tiny;

AdvertiserDefinedEventProcessingRecord::AdvertiserDefinedEventProcessingRecord()
{
	exceptions = std::list<std::string>();
	name = std::string();
	status = std::string();
}

AdvertiserDefinedEventProcessingRecord::AdvertiserDefinedEventProcessingRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEventProcessingRecord::~AdvertiserDefinedEventProcessingRecord()
{

}

void
AdvertiserDefinedEventProcessingRecord::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<std::string> exceptions_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }


}

bourne::json
AdvertiserDefinedEventProcessingRecord::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        exceptions_arr.append(var);
    }
    object["exceptions"] = exceptions_arr;









    object["name"] = getName();






    object["status"] = getStatus();



    return object;

}

std::list<std::string>
AdvertiserDefinedEventProcessingRecord::getExceptions()
{
	return exceptions;
}

void
AdvertiserDefinedEventProcessingRecord::setExceptions(std::list<std::string> exceptions)
{
	this->exceptions = exceptions;
}

std::string
AdvertiserDefinedEventProcessingRecord::getName()
{
	return name;
}

void
AdvertiserDefinedEventProcessingRecord::setName(std::string name)
{
	this->name = name;
}

std::string
AdvertiserDefinedEventProcessingRecord::getStatus()
{
	return status;
}

void
AdvertiserDefinedEventProcessingRecord::setStatus(std::string status)
{
	this->status = status;
}



