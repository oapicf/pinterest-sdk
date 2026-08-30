#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody()
{
	//__init();
}

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::~AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody()
{
	//__cleanup();
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::__init()
{
	//audience_id = null;
	//operation_type = new OperationType();
	//new std::list()std::list> recipient_account_ids;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::__cleanup()
{
	//if(audience_id != NULL) {
	//
	//delete audience_id;
	//audience_id = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//if(recipient_account_ids != NULL) {
	//recipient_account_ids.RemoveAll(true);
	//delete recipient_account_ids;
	//recipient_account_ids = NULL;
	//}
	//
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idKey = "audience_id";
	node = json_object_get_member(pJsonObject, audience_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&audience_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OperationType")) {
			jsonToValue(&operation_type, node, "OperationType", "OperationType");
		} else {
			
			OperationType* obj = static_cast<OperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *recipient_account_idsKey = "recipient_account_ids";
	node = json_object_get_member(pJsonObject, recipient_account_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			recipient_account_ids = new_list;
		}
		
	}
}

AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(char* json)
{
	this->fromJson(json);
}

char*
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAudienceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *audience_idKey = "audience_id";
	json_object_set_member(pJsonObject, audience_idKey, node);
	if (isprimitive("OperationType")) {
		OperationType obj = getOperationType();
		node = converttoJson(&obj, "OperationType", "");
	}
	else {
		
		OperationType obj = static_cast<OperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientAccountIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRecipientAccountIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *recipient_account_idsKey = "recipient_account_ids";
	json_object_set_member(pJsonObject, recipient_account_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getAudienceId()
{
	return audience_id;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setAudienceId(std::string  audience_id)
{
	this->audience_id = audience_id;
}

OperationType
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setOperationType(OperationType  operation_type)
{
	this->operation_type = operation_type;
}

std::list<std::string>
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::getRecipientAccountIds()
{
	return recipient_account_ids;
}

void
AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody::setRecipientAccountIds(std::list <std::string> recipient_account_ids)
{
	this->recipient_account_ids = recipient_account_ids;
}


