

#include "LeadsExportCreateRequest.h"

using namespace Tiny;

LeadsExportCreateRequest::LeadsExportCreateRequest()
{
	ad_id = std::string();
	end_date = std::string();
	start_date = std::string();
}

LeadsExportCreateRequest::LeadsExportCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadsExportCreateRequest::~LeadsExportCreateRequest()
{

}

void
LeadsExportCreateRequest::fromJson(std::string jsonObj)
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
LeadsExportCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_id"] = getAdId();






    object["end_date"] = getEndDate();






    object["start_date"] = getStartDate();



    return object;

}

std::string
LeadsExportCreateRequest::getAdId()
{
	return ad_id;
}

void
LeadsExportCreateRequest::setAdId(std::string  ad_id)
{
	this->ad_id = ad_id;
}

std::string
LeadsExportCreateRequest::getEndDate()
{
	return end_date;
}

void
LeadsExportCreateRequest::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
LeadsExportCreateRequest::getStartDate()
{
	return start_date;
}

void
LeadsExportCreateRequest::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}



