

#include "LeadFormCommon_policy_links_inner.h"

using namespace Tiny;

LeadFormCommon_policy_links_inner::LeadFormCommon_policy_links_inner()
{
	label = std::string();
	link = std::string();
}

LeadFormCommon_policy_links_inner::LeadFormCommon_policy_links_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormCommon_policy_links_inner::~LeadFormCommon_policy_links_inner()
{

}

void
LeadFormCommon_policy_links_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *labelKey = "label";

    if(object.has_key(labelKey))
    {
        bourne::json value = object[labelKey];



        jsonToValue(&label, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }


}

bourne::json
LeadFormCommon_policy_links_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["label"] = getLabel();






    object["link"] = getLink();



    return object;

}

std::string
LeadFormCommon_policy_links_inner::getLabel()
{
	return label;
}

void
LeadFormCommon_policy_links_inner::setLabel(std::string  label)
{
	this->label = label;
}

std::string
LeadFormCommon_policy_links_inner::getLink()
{
	return link;
}

void
LeadFormCommon_policy_links_inner::setLink(std::string  link)
{
	this->link = link;
}



