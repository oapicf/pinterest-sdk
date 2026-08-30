

#include "LeadsExportsCreate.h"

using namespace Tiny;

LeadsExportsCreate::LeadsExportsCreate()
{
	ad_id = std::string();
	end_date = std::string();
	start_date = std::string();
}

LeadsExportsCreate::LeadsExportsCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadsExportsCreate::~LeadsExportsCreate()
{

}

void
LeadsExportsCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_idKey = "ad_id";

    if(object.has_key(ad_idKey))
    {
        bourne::json value = object[ad_idKey];



        jsonToValue(&ad_id, value, "std::string");


    }

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "std::string");


    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "std::string");


    }


}

bourne::json
LeadsExportsCreate::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_id"] = getAdId();






    object["end_date"] = getEndDate();






    object["start_date"] = getStartDate();



    return object;

}

std::string
LeadsExportsCreate::getAdId()
{
	return ad_id;
}

void
LeadsExportsCreate::setAdId(std::string ad_id)
{
	this->ad_id = ad_id;
}

std::string
LeadsExportsCreate::getEndDate()
{
	return end_date;
}

void
LeadsExportsCreate::setEndDate(std::string end_date)
{
	this->end_date = end_date;
}

std::string
LeadsExportsCreate::getStartDate()
{
	return start_date;
}

void
LeadsExportsCreate::setStartDate(std::string start_date)
{
	this->start_date = start_date;
}



