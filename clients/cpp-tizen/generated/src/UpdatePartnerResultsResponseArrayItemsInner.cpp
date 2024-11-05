#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdatePartnerResultsResponseArray_items_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdatePartnerResultsResponseArray_items_inner::UpdatePartnerResultsResponseArray_items_inner()
{
	//__init();
}

UpdatePartnerResultsResponseArray_items_inner::~UpdatePartnerResultsResponseArray_items_inner()
{
	//__cleanup();
}

void
UpdatePartnerResultsResponseArray_items_inner::__init()
{
	//exception = new BusinessAccessError();
	//member_or_partner_id = std::string();
}

void
UpdatePartnerResultsResponseArray_items_inner::__cleanup()
{
	//if(exception != NULL) {
	//
	//delete exception;
	//exception = NULL;
	//}
	//if(member_or_partner_id != NULL) {
	//
	//delete member_or_partner_id;
	//member_or_partner_id = NULL;
	//}
	//
}

void
UpdatePartnerResultsResponseArray_items_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exceptionKey = "exception";
	node = json_object_get_member(pJsonObject, exceptionKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessError")) {
			jsonToValue(&exception, node, "BusinessAccessError", "BusinessAccessError");
		} else {
			
			BusinessAccessError* obj = static_cast<BusinessAccessError*> (&exception);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *member_or_partner_idKey = "member_or_partner_id";
	node = json_object_get_member(pJsonObject, member_or_partner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&member_or_partner_id, node, "std::string", "");
		} else {
			
		}
	}
}

UpdatePartnerResultsResponseArray_items_inner::UpdatePartnerResultsResponseArray_items_inner(char* json)
{
	this->fromJson(json);
}

char*
UpdatePartnerResultsResponseArray_items_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BusinessAccessError")) {
		BusinessAccessError obj = getException();
		node = converttoJson(&obj, "BusinessAccessError", "");
	}
	else {
		
		BusinessAccessError obj = static_cast<BusinessAccessError> (getException());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionKey = "exception";
	json_object_set_member(pJsonObject, exceptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMemberOrPartnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *member_or_partner_idKey = "member_or_partner_id";
	json_object_set_member(pJsonObject, member_or_partner_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BusinessAccessError
UpdatePartnerResultsResponseArray_items_inner::getException()
{
	return exception;
}

void
UpdatePartnerResultsResponseArray_items_inner::setException(BusinessAccessError  exception)
{
	this->exception = exception;
}

std::string
UpdatePartnerResultsResponseArray_items_inner::getMemberOrPartnerId()
{
	return member_or_partner_id;
}

void
UpdatePartnerResultsResponseArray_items_inner::setMemberOrPartnerId(std::string  member_or_partner_id)
{
	this->member_or_partner_id = member_or_partner_id;
}


