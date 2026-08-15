

#include "CampaignCreateResponseItem.h"

using namespace Tiny;

CampaignCreateResponseItem::CampaignCreateResponseItem()
{
	data = CampaignCreateResponseData();
	exceptions = std::list<Exception>();
}

CampaignCreateResponseItem::CampaignCreateResponseItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCreateResponseItem::~CampaignCreateResponseItem()
{

}

void
CampaignCreateResponseItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        CampaignCreateResponseData* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *exceptionsKey = "exceptions";

    if(object.has_key(exceptionsKey))
    {
        bourne::json value = object[exceptionsKey];


        std::list<Exception> exceptions_list;
        Exception element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            exceptions_list.push_back(element);
        }
        exceptions = exceptions_list;


    }


}

bourne::json
CampaignCreateResponseItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["data"] = getData().toJson();




    std::list<Exception> exceptions_list = getExceptions();
    bourne::json exceptions_arr = bourne::json::array();

    for(auto& var : exceptions_list)
    {
        Exception obj = var;
        exceptions_arr.append(obj.toJson());
    }
    object["exceptions"] = exceptions_arr;




    return object;

}

CampaignCreateResponseData
CampaignCreateResponseItem::getData()
{
	return data;
}

void
CampaignCreateResponseItem::setData(CampaignCreateResponseData  data)
{
	this->data = data;
}

std::list<Exception>
CampaignCreateResponseItem::getExceptions()
{
	return exceptions;
}

void
CampaignCreateResponseItem::setExceptions(std::list <Exception> exceptions)
{
	this->exceptions = exceptions;
}



