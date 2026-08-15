

#include "OrderLines.h"

using namespace Tiny;

OrderLines::OrderLines()
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
}

OrderLines::OrderLines(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLines::~OrderLines()
{

}

void
OrderLines::fromJson(std::string jsonObj)
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


}

bourne::json
OrderLines::toJson()
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



    return object;

}

std::string
OrderLines::getAdAccountId()
{
	return ad_account_id;
}

void
OrderLines::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

long
OrderLines::getBudget()
{
	return budget;
}

void
OrderLines::setBudget(long  budget)
{
	this->budget = budget;
}

long
OrderLines::getEndTime()
{
	return end_time;
}

void
OrderLines::setEndTime(long  end_time)
{
	this->end_time = end_time;
}

std::string
OrderLines::getId()
{
	return id;
}

void
OrderLines::setId(std::string  id)
{
	this->id = id;
}

std::string
OrderLines::getName()
{
	return name;
}

void
OrderLines::setName(std::string  name)
{
	this->name = name;
}

long
OrderLines::getPaidBudget()
{
	return paid_budget;
}

void
OrderLines::setPaidBudget(long  paid_budget)
{
	this->paid_budget = paid_budget;
}

OrderLinePaidType
OrderLines::getPaidType()
{
	return paid_type;
}

void
OrderLines::setPaidType(OrderLinePaidType  paid_type)
{
	this->paid_type = paid_type;
}

std::string
OrderLines::getPurchaseOrderId()
{
	return purchase_order_id;
}

void
OrderLines::setPurchaseOrderId(std::string  purchase_order_id)
{
	this->purchase_order_id = purchase_order_id;
}

long
OrderLines::getStartTime()
{
	return start_time;
}

void
OrderLines::setStartTime(long  start_time)
{
	this->start_time = start_time;
}

OrderLineStatus
OrderLines::getStatus()
{
	return status;
}

void
OrderLines::setStatus(OrderLineStatus  status)
{
	this->status = status;
}

std::string
OrderLines::getType()
{
	return type;
}

void
OrderLines::setType(std::string  type)
{
	this->type = type;
}



