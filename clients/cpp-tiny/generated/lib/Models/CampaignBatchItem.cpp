

#include "CampaignBatchItem.h"

using namespace Tiny;

CampaignBatchItem::CampaignBatchItem()
{
	data = null;
	exceptions = std::list<Exception>();
}

CampaignBatchItem::CampaignBatchItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBatchItem::~CampaignBatchItem()
{

}

void
CampaignBatchItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        CampaignBatchResponseData* obj = &data;
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
CampaignBatchItem::toJson()
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

CampaignBatchResponseData
CampaignBatchItem::getData()
{
	return data;
}

void
CampaignBatchItem::setData(CampaignBatchResponseData data)
{
	this->data = data;
}

std::list<Exception>
CampaignBatchItem::getExceptions()
{
	return exceptions;
}

void
CampaignBatchItem::setExceptions(std::list<Exception> exceptions)
{
	this->exceptions = exceptions;
}



