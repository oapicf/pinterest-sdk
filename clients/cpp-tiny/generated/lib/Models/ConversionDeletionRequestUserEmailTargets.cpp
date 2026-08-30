

#include "ConversionDeletionRequestUserEmailTargets.h"

using namespace Tiny;

ConversionDeletionRequestUserEmailTargets::ConversionDeletionRequestUserEmailTargets()
{
	user_emails = std::list<std::string>();
}

ConversionDeletionRequestUserEmailTargets::ConversionDeletionRequestUserEmailTargets(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionDeletionRequestUserEmailTargets::~ConversionDeletionRequestUserEmailTargets()
{

}

void
ConversionDeletionRequestUserEmailTargets::fromJson(std::string jsonObj)
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


}

bourne::json
ConversionDeletionRequestUserEmailTargets::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> user_emails_list = getUserEmails();
    bourne::json user_emails_arr = bourne::json::array();

    for(auto& var : user_emails_list)
    {
        user_emails_arr.append(var);
    }
    object["user_emails"] = user_emails_arr;






    return object;

}

std::list<std::string>
ConversionDeletionRequestUserEmailTargets::getUserEmails()
{
	return user_emails;
}

void
ConversionDeletionRequestUserEmailTargets::setUserEmails(std::list<std::string> user_emails)
{
	this->user_emails = user_emails;
}



