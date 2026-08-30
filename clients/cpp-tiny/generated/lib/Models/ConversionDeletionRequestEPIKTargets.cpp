

#include "ConversionDeletionRequestEPIKTargets.h"

using namespace Tiny;

ConversionDeletionRequestEPIKTargets::ConversionDeletionRequestEPIKTargets()
{
	epiks = std::list<std::string>();
}

ConversionDeletionRequestEPIKTargets::ConversionDeletionRequestEPIKTargets(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequestEPIKTargets::~ConversionDeletionRequestEPIKTargets()
{

}

void
ConversionDeletionRequestEPIKTargets::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *epiksKey = "epiks";

    if(object.has_key(epiksKey))
    {
        bourne::json value = object[epiksKey];


        std::list<std::string> epiks_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            epiks_list.push_back(element);
        }
        epiks = epiks_list;


    }


}

bourne::json
ConversionDeletionRequestEPIKTargets::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> epiks_list = getEpiks();
    bourne::json epiks_arr = bourne::json::array();

    for(auto& var : epiks_list)
    {
        epiks_arr.append(var);
    }
    object["epiks"] = epiks_arr;






    return object;

}

std::list<std::string>
ConversionDeletionRequestEPIKTargets::getEpiks()
{
	return epiks;
}

void
ConversionDeletionRequestEPIKTargets::setEpiks(std::list<std::string> epiks)
{
	this->epiks = epiks;
}



