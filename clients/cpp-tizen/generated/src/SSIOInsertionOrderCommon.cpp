#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOInsertionOrderCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOInsertionOrderCommon::SSIOInsertionOrderCommon()
{
	//__init();
}

SSIOInsertionOrderCommon::~SSIOInsertionOrderCommon()
{
	//__cleanup();
}

void
SSIOInsertionOrderCommon::__init()
{
	//start_date = std::string();
	//end_date = std::string();
	//po_number = std::string();
	//budget_amount = double(0);
	//billing_contact_firstname = std::string();
	//billing_contact_lastname = std::string();
	//billing_contact_email = std::string();
	//media_contact_firstname = std::string();
	//media_contact_lastname = std::string();
	//media_contact_email = std::string();
	//agency_link = std::string();
	//user_email = std::string();
}

void
SSIOInsertionOrderCommon::__cleanup()
{
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(po_number != NULL) {
	//
	//delete po_number;
	//po_number = NULL;
	//}
	//if(budget_amount != NULL) {
	//
	//delete budget_amount;
	//budget_amount = NULL;
	//}
	//if(billing_contact_firstname != NULL) {
	//
	//delete billing_contact_firstname;
	//billing_contact_firstname = NULL;
	//}
	//if(billing_contact_lastname != NULL) {
	//
	//delete billing_contact_lastname;
	//billing_contact_lastname = NULL;
	//}
	//if(billing_contact_email != NULL) {
	//
	//delete billing_contact_email;
	//billing_contact_email = NULL;
	//}
	//if(media_contact_firstname != NULL) {
	//
	//delete media_contact_firstname;
	//media_contact_firstname = NULL;
	//}
	//if(media_contact_lastname != NULL) {
	//
	//delete media_contact_lastname;
	//media_contact_lastname = NULL;
	//}
	//if(media_contact_email != NULL) {
	//
	//delete media_contact_email;
	//media_contact_email = NULL;
	//}
	//if(agency_link != NULL) {
	//
	//delete agency_link;
	//agency_link = NULL;
	//}
	//if(user_email != NULL) {
	//
	//delete user_email;
	//user_email = NULL;
	//}
	//
}

void
SSIOInsertionOrderCommon::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *po_numberKey = "po_number";
	node = json_object_get_member(pJsonObject, po_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&po_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *budget_amountKey = "budget_amount";
	node = json_object_get_member(pJsonObject, budget_amountKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&budget_amount, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&budget_amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *billing_contact_firstnameKey = "billing_contact_firstname";
	node = json_object_get_member(pJsonObject, billing_contact_firstnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_firstname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_contact_lastnameKey = "billing_contact_lastname";
	node = json_object_get_member(pJsonObject, billing_contact_lastnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_lastname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billing_contact_emailKey = "billing_contact_email";
	node = json_object_get_member(pJsonObject, billing_contact_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&billing_contact_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_firstnameKey = "media_contact_firstname";
	node = json_object_get_member(pJsonObject, media_contact_firstnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_firstname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_lastnameKey = "media_contact_lastname";
	node = json_object_get_member(pJsonObject, media_contact_lastnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_lastname, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *media_contact_emailKey = "media_contact_email";
	node = json_object_get_member(pJsonObject, media_contact_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&media_contact_email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *agency_linkKey = "agency_link";
	node = json_object_get_member(pJsonObject, agency_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&agency_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_emailKey = "user_email";
	node = json_object_get_member(pJsonObject, user_emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_email, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOInsertionOrderCommon::SSIOInsertionOrderCommon(char* json)
{
	this->fromJson(json);
}

char*
SSIOInsertionOrderCommon::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPoNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *po_numberKey = "po_number";
	json_object_set_member(pJsonObject, po_numberKey, node);
	if (isprimitive("long long")) {
		long long obj = getBudgetAmount();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBudgetAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_amountKey = "budget_amount";
	json_object_set_member(pJsonObject, budget_amountKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactFirstname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_firstnameKey = "billing_contact_firstname";
	json_object_set_member(pJsonObject, billing_contact_firstnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactLastname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_lastnameKey = "billing_contact_lastname";
	json_object_set_member(pJsonObject, billing_contact_lastnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBillingContactEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *billing_contact_emailKey = "billing_contact_email";
	json_object_set_member(pJsonObject, billing_contact_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactFirstname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_firstnameKey = "media_contact_firstname";
	json_object_set_member(pJsonObject, media_contact_firstnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactLastname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_lastnameKey = "media_contact_lastname";
	json_object_set_member(pJsonObject, media_contact_lastnameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMediaContactEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *media_contact_emailKey = "media_contact_email";
	json_object_set_member(pJsonObject, media_contact_emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAgencyLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *agency_linkKey = "agency_link";
	json_object_set_member(pJsonObject, agency_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_emailKey = "user_email";
	json_object_set_member(pJsonObject, user_emailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOInsertionOrderCommon::getStartDate()
{
	return start_date;
}

void
SSIOInsertionOrderCommon::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}

std::string
SSIOInsertionOrderCommon::getEndDate()
{
	return end_date;
}

void
SSIOInsertionOrderCommon::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
SSIOInsertionOrderCommon::getPoNumber()
{
	return po_number;
}

void
SSIOInsertionOrderCommon::setPoNumber(std::string  po_number)
{
	this->po_number = po_number;
}

long long
SSIOInsertionOrderCommon::getBudgetAmount()
{
	return budget_amount;
}

void
SSIOInsertionOrderCommon::setBudgetAmount(long long  budget_amount)
{
	this->budget_amount = budget_amount;
}

std::string
SSIOInsertionOrderCommon::getBillingContactFirstname()
{
	return billing_contact_firstname;
}

void
SSIOInsertionOrderCommon::setBillingContactFirstname(std::string  billing_contact_firstname)
{
	this->billing_contact_firstname = billing_contact_firstname;
}

std::string
SSIOInsertionOrderCommon::getBillingContactLastname()
{
	return billing_contact_lastname;
}

void
SSIOInsertionOrderCommon::setBillingContactLastname(std::string  billing_contact_lastname)
{
	this->billing_contact_lastname = billing_contact_lastname;
}

std::string
SSIOInsertionOrderCommon::getBillingContactEmail()
{
	return billing_contact_email;
}

void
SSIOInsertionOrderCommon::setBillingContactEmail(std::string  billing_contact_email)
{
	this->billing_contact_email = billing_contact_email;
}

std::string
SSIOInsertionOrderCommon::getMediaContactFirstname()
{
	return media_contact_firstname;
}

void
SSIOInsertionOrderCommon::setMediaContactFirstname(std::string  media_contact_firstname)
{
	this->media_contact_firstname = media_contact_firstname;
}

std::string
SSIOInsertionOrderCommon::getMediaContactLastname()
{
	return media_contact_lastname;
}

void
SSIOInsertionOrderCommon::setMediaContactLastname(std::string  media_contact_lastname)
{
	this->media_contact_lastname = media_contact_lastname;
}

std::string
SSIOInsertionOrderCommon::getMediaContactEmail()
{
	return media_contact_email;
}

void
SSIOInsertionOrderCommon::setMediaContactEmail(std::string  media_contact_email)
{
	this->media_contact_email = media_contact_email;
}

std::string
SSIOInsertionOrderCommon::getAgencyLink()
{
	return agency_link;
}

void
SSIOInsertionOrderCommon::setAgencyLink(std::string  agency_link)
{
	this->agency_link = agency_link;
}

std::string
SSIOInsertionOrderCommon::getUserEmail()
{
	return user_email;
}

void
SSIOInsertionOrderCommon::setUserEmail(std::string  user_email)
{
	this->user_email = user_email;
}


