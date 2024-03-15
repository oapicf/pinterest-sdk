#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLines.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLines::OrderLines()
{
	//__init();
}

OrderLines::~OrderLines()
{
	//__cleanup();
}

void
OrderLines::__init()
{
	//id = std::string();
	//type = std::string();
	//ad_account_id = std::string();
	//purchase_order_id = std::string();
	//start_time = double(0);
	//end_time = double(0);
	//budget = double(0);
	//paid_budget = double(0);
	//status = std::string();
	//name = std::string();
	//paid_type = std::string();
}

void
OrderLines::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(purchase_order_id != NULL) {
	//
	//delete purchase_order_id;
	//purchase_order_id = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(budget != NULL) {
	//
	//delete budget;
	//budget = NULL;
	//}
	//if(paid_budget != NULL) {
	//
	//delete paid_budget;
	//paid_budget = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(paid_type != NULL) {
	//
	//delete paid_type;
	//paid_type = NULL;
	//}
	//
}

void
OrderLines::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *purchase_order_idKey = "purchase_order_id";
	node = json_object_get_member(pJsonObject, purchase_order_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&purchase_order_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&start_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&start_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&end_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&end_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *budgetKey = "budget";
	node = json_object_get_member(pJsonObject, budgetKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&budget, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&budget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *paid_budgetKey = "paid_budget";
	node = json_object_get_member(pJsonObject, paid_budgetKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&paid_budget, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&paid_budget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLineStatus")) {
			jsonToValue(&status, node, "OrderLineStatus", "OrderLineStatus");
		} else {
			
			OrderLineStatus* obj = static_cast<OrderLineStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *paid_typeKey = "paid_type";
	node = json_object_get_member(pJsonObject, paid_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLinePaidType")) {
			jsonToValue(&paid_type, node, "OrderLinePaidType", "OrderLinePaidType");
		} else {
			
			OrderLinePaidType* obj = static_cast<OrderLinePaidType*> (&paid_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderLines::OrderLines(char* json)
{
	this->fromJson(json);
}

char*
OrderLines::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPurchaseOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *purchase_order_idKey = "purchase_order_id";
	json_object_set_member(pJsonObject, purchase_order_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getStartTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getStartTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	if (isprimitive("long long")) {
		long long obj = getEndTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getEndTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("long long")) {
		long long obj = getBudget();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBudget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budgetKey = "budget";
	json_object_set_member(pJsonObject, budgetKey, node);
	if (isprimitive("long long")) {
		long long obj = getPaidBudget();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPaidBudget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paid_budgetKey = "paid_budget";
	json_object_set_member(pJsonObject, paid_budgetKey, node);
	if (isprimitive("OrderLineStatus")) {
		OrderLineStatus obj = getStatus();
		node = converttoJson(&obj, "OrderLineStatus", "");
	}
	else {
		
		OrderLineStatus obj = static_cast<OrderLineStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("OrderLinePaidType")) {
		OrderLinePaidType obj = getPaidType();
		node = converttoJson(&obj, "OrderLinePaidType", "");
	}
	else {
		
		OrderLinePaidType obj = static_cast<OrderLinePaidType> (getPaidType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *paid_typeKey = "paid_type";
	json_object_set_member(pJsonObject, paid_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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
OrderLines::getType()
{
	return type;
}

void
OrderLines::setType(std::string  type)
{
	this->type = type;
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

long long
OrderLines::getStartTime()
{
	return start_time;
}

void
OrderLines::setStartTime(long long  start_time)
{
	this->start_time = start_time;
}

long long
OrderLines::getEndTime()
{
	return end_time;
}

void
OrderLines::setEndTime(long long  end_time)
{
	this->end_time = end_time;
}

long long
OrderLines::getBudget()
{
	return budget;
}

void
OrderLines::setBudget(long long  budget)
{
	this->budget = budget;
}

long long
OrderLines::getPaidBudget()
{
	return paid_budget;
}

void
OrderLines::setPaidBudget(long long  paid_budget)
{
	this->paid_budget = paid_budget;
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
OrderLines::getName()
{
	return name;
}

void
OrderLines::setName(std::string  name)
{
	this->name = name;
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


