

#include "OrderLine.h"

using namespace Tiny;

OrderLine::OrderLine()
{
	ad_account_id = std::string();
	budget = float(0);
	end_time = float(0);
	id = std::string();
	name = std::string();
	paid_budget = float(0);
	paid_type = std::string();
	purchase_order_id = std::string();
	start_time = float(0);
	status = std::string();
	type = std::string();
	campaign_ids = std::list<std::string>();
}

OrderLine::OrderLine(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLine::~OrderLine()
{

}

void
OrderLine::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *budgetKey = "budget";

    if(object.has_key(budgetKey))
    {
        bourne::json value = object[budgetKey];



        jsonToValue(&budget, value, "long");


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "long");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *paid_budgetKey = "paid_budget";

    if(object.has_key(paid_budgetKey))
    {
        bourne::json value = object[paid_budgetKey];



        jsonToValue(&paid_budget, value, "long");


    }

    const char *paid_typeKey = "paid_type";

    if(object.has_key(paid_typeKey))
    {
        bourne::json value = object[paid_typeKey];




        OrderLinePaidType* obj = &paid_type;
		obj->fromJson(value.dump());

    }

    const char *purchase_order_idKey = "purchase_order_id";

    if(object.has_key(purchase_order_idKey))
    {
        bourne::json value = object[purchase_order_idKey];



        jsonToValue(&purchase_order_id, value, "std::string");


    }

    const char *start_timeKey = "start_time";

    if(object.has_key(start_timeKey))
    {
        bourne::json value = object[start_timeKey];



        jsonToValue(&start_time, value, "long");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        OrderLineStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *campaign_idsKey = "campaign_ids";

    if(object.has_key(campaign_idsKey))
    {
        bourne::json value = object[campaign_idsKey];


        std::list<std::string> campaign_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            campaign_ids_list.push_back(element);
        }
        campaign_ids = campaign_ids_list;


    }


}

bourne::json
OrderLine::toJson()
{
    bourne::json object = bourne::json::object();





    object["ad_account_id"] = getAdAccountId();






    object["budget"] = getBudget();






    object["end_time"] = getEndTime();






    object["id"] = getId();






    object["name"] = getName();






    object["paid_budget"] = getPaidBudget();







	object["paid_type"] = getPaidType().toJson();





    object["purchase_order_id"] = getPurchaseOrderId();






    object["start_time"] = getStartTime();







	object["status"] = getStatus().toJson();





    object["type"] = getType();





    std::list<std::string> campaign_ids_list = getCampaignIds();
    bourne::json campaign_ids_arr = bourne::json::array();

    for(auto& var : campaign_ids_list)
    {
        campaign_ids_arr.append(var);
    }
    object["campaign_ids"] = campaign_ids_arr;






    return object;

}

std::string
OrderLine::getAdAccountId()
{
	return ad_account_id;
}

void
OrderLine::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

long
OrderLine::getBudget()
{
	return budget;
}

void
OrderLine::setBudget(long  budget)
{
	this->budget = budget;
}

long
OrderLine::getEndTime()
{
	return end_time;
}

void
OrderLine::setEndTime(long  end_time)
{
	this->end_time = end_time;
}

std::string
OrderLine::getId()
{
	return id;
}

void
OrderLine::setId(std::string  id)
{
	this->id = id;
}

std::string
OrderLine::getName()
{
	return name;
}

void
OrderLine::setName(std::string  name)
{
	this->name = name;
}

long
OrderLine::getPaidBudget()
{
	return paid_budget;
}

void
OrderLine::setPaidBudget(long  paid_budget)
{
	this->paid_budget = paid_budget;
}

OrderLinePaidType
OrderLine::getPaidType()
{
	return paid_type;
}

void
OrderLine::setPaidType(OrderLinePaidType  paid_type)
{
	this->paid_type = paid_type;
}

std::string
OrderLine::getPurchaseOrderId()
{
	return purchase_order_id;
}

void
OrderLine::setPurchaseOrderId(std::string  purchase_order_id)
{
	this->purchase_order_id = purchase_order_id;
}

long
OrderLine::getStartTime()
{
	return start_time;
}

void
OrderLine::setStartTime(long  start_time)
{
	this->start_time = start_time;
}

OrderLineStatus
OrderLine::getStatus()
{
	return status;
}

void
OrderLine::setStatus(OrderLineStatus  status)
{
	this->status = status;
}

std::string
OrderLine::getType()
{
	return type;
}

void
OrderLine::setType(std::string  type)
{
	this->type = type;
}

std::list<std::string>
OrderLine::getCampaignIds()
{
	return campaign_ids;
}

void
OrderLine::setCampaignIds(std::list <std::string> campaign_ids)
{
	this->campaign_ids = campaign_ids;
}



