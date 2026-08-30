#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerSegmentUpdateRequestUpdateWithRequiredBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerSegmentUpdateRequestUpdateWithRequiredBody::CustomerSegmentUpdateRequestUpdateWithRequiredBody()
{
	//__init();
}

CustomerSegmentUpdateRequestUpdateWithRequiredBody::~CustomerSegmentUpdateRequestUpdateWithRequiredBody()
{
	//__cleanup();
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::__init()
{
	//new std::list()std::list> audience_ids;
	//id = std::string();
	//operation_type = new AudienceUpdateOperationType();
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::__cleanup()
{
	//if(audience_ids != NULL) {
	//audience_ids.RemoveAll(true);
	//delete audience_ids;
	//audience_ids = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
	//}
	//
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *audience_idsKey = "audience_ids";
	node = json_object_get_member(pJsonObject, audience_idsKey);
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
			audience_ids = new_list;
		}
		
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AudienceUpdateOperationType")) {
			jsonToValue(&operation_type, node, "AudienceUpdateOperationType", "AudienceUpdateOperationType");
		} else {
			
			AudienceUpdateOperationType* obj = static_cast<AudienceUpdateOperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomerSegmentUpdateRequestUpdateWithRequiredBody::CustomerSegmentUpdateRequestUpdateWithRequiredBody(char* json)
{
	this->fromJson(json);
}

char*
CustomerSegmentUpdateRequestUpdateWithRequiredBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *audience_idsKey = "audience_ids";
	json_object_set_member(pJsonObject, audience_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("AudienceUpdateOperationType")) {
		AudienceUpdateOperationType obj = getOperationType();
		node = converttoJson(&obj, "AudienceUpdateOperationType", "");
	}
	else {
		
		AudienceUpdateOperationType obj = static_cast<AudienceUpdateOperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setAudienceIds(std::list <std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

std::string
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getId()
{
	return id;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setId(std::string  id)
{
	this->id = id;
}

AudienceUpdateOperationType
CustomerSegmentUpdateRequestUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
CustomerSegmentUpdateRequestUpdateWithRequiredBody::setOperationType(AudienceUpdateOperationType  operation_type)
{
	this->operation_type = operation_type;
}


