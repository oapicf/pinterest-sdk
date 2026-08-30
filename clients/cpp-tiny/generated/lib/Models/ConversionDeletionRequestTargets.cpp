

#include "ConversionDeletionRequestTargets.h"

using namespace Tiny;

ConversionDeletionRequestTargets::ConversionDeletionRequestTargets()
{
	user_emails = std::list<std::string>();
	epiks = std::list<std::string>();
}

ConversionDeletionRequestTargets::ConversionDeletionRequestTargets(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequestTargets::~ConversionDeletionRequestTargets()
{

}

void
ConversionDeletionRequestTargets::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *user_emailsKey = "user_emails";

    if(object.has_key(user_emailsKey))
    {
        bourne::json value = object[user_emailsKey];


        std::list<std::string> user_emails_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            user_emails_list.push_back(element);
        }
        user_emails = user_emails_list;


    }

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
ConversionDeletionRequestTargets::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> user_emails_list = getUserEmails();
    bourne::json user_emails_arr = bourne::json::array();

    for(auto& var : user_emails_list)
    {
        user_emails_arr.append(var);
    }
    object["user_emails"] = user_emails_arr;








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
ConversionDeletionRequestTargets::getUserEmails()
{
	return user_emails;
}

void
ConversionDeletionRequestTargets::setUserEmails(std::list<std::string> user_emails)
{
	this->user_emails = user_emails;
}

std::list<std::string>
ConversionDeletionRequestTargets::getEpiks()
{
	return epiks;
}

void
ConversionDeletionRequestTargets::setEpiks(std::list<std::string> epiks)
{
	this->epiks = epiks;
}



