

#include "AdGroupIdFilter.h"

using namespace Tiny;

AdGroupIdFilter::AdGroupIdFilter()
{
	ad_group_ids = std::list<std::string>();
}

AdGroupIdFilter::AdGroupIdFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupIdFilter::~AdGroupIdFilter()
{

}

void
AdGroupIdFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_group_idsKey = "ad_group_ids";

    if(object.has_key(ad_group_idsKey))
    {
        bourne::json value = object[ad_group_idsKey];


        std::list<std::string> ad_group_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ad_group_ids_list.push_back(element);
        }
        ad_group_ids = ad_group_ids_list;


    }


}

bourne::json
AdGroupIdFilter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> ad_group_ids_list = getAdGroupIds();
    bourne::json ad_group_ids_arr = bourne::json::array();

    for(auto& var : ad_group_ids_list)
    {
        ad_group_ids_arr.append(var);
    }
    object["ad_group_ids"] = ad_group_ids_arr;






    return object;

}

std::list<std::string>
AdGroupIdFilter::getAdGroupIds()
{
	return ad_group_ids;
}

void
AdGroupIdFilter::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}



