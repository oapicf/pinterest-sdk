#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePartnersRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePartnersRequest::DeletePartnersRequest()
{
	//__init();
}

DeletePartnersRequest::~DeletePartnersRequest()
{
	//__cleanup();
}

void
DeletePartnersRequest::__init()
{
	//new std::list()std::list> partner_ids;
	//partner_type = std::string();
}

void
DeletePartnersRequest::__cleanup()
{
	//if(partner_ids != NULL) {
	//partner_ids.RemoveAll(true);
	//delete partner_ids;
	//partner_ids = NULL;
	//}
	//if(partner_type != NULL) {
	//
	//delete partner_type;
	//partner_type = NULL;
	//}
	//
}

void
DeletePartnersRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *partner_idsKey = "partner_ids";
	node = json_object_get_member(pJsonObject, partner_idsKey);
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
			partner_ids = new_list;
		}
		
	}
	const gchar *partner_typeKey = "partner_type";
	node = json_object_get_member(pJsonObject, partner_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_type, node, "std::string", "");
		} else {
			
		}
	}
}

DeletePartnersRequest::DeletePartnersRequest(char* json)
{
	this->fromJson(json);
}

char*
DeletePartnersRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPartnerIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPartnerIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *partner_idsKey = "partner_ids";
	json_object_set_member(pJsonObject, partner_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_typeKey = "partner_type";
	json_object_set_member(pJsonObject, partner_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeletePartnersRequest::getPartnerIds()
{
	return partner_ids;
}

void
DeletePartnersRequest::setPartnerIds(std::list <std::string> partner_ids)
{
	this->partner_ids = partner_ids;
}

std::string
DeletePartnersRequest::getPartnerType()
{
	return partner_type;
}

void
DeletePartnersRequest::setPartnerType(std::string  partner_type)
{
	this->partner_type = partner_type;
}


