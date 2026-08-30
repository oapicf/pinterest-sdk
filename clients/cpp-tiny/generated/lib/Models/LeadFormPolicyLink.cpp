

#include "LeadFormPolicyLink.h"

using namespace Tiny;

LeadFormPolicyLink::LeadFormPolicyLink()
{
	label = std::string();
	link = std::string();
}

LeadFormPolicyLink::LeadFormPolicyLink(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormPolicyLink::~LeadFormPolicyLink()
{

}

void
LeadFormPolicyLink::fromJson(std::string jsonObj)
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
LeadFormPolicyLink::toJson()
{
    bourne::json object = bourne::json::object();





    object["label"] = getLabel();






    object["link"] = getLink();



    return object;

}

std::string
LeadFormPolicyLink::getLabel()
{
	return label;
}

void
LeadFormPolicyLink::setLabel(std::string label)
{
	this->label = label;
}

std::string
LeadFormPolicyLink::getLink()
{
	return link;
}

void
LeadFormPolicyLink::setLink(std::string link)
{
	this->link = link;
}



