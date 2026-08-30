#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProductTagsError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProductTagsError::ProductTagsError()
{
	//__init();
}

ProductTagsError::~ProductTagsError()
{
	//__cleanup();
}

void
ProductTagsError::__init()
{
	//code = int(0);
	//details = null;
	//message = std::string();
}

void
ProductTagsError::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(details != NULL) {
	//
	//delete details;
	//details = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
ProductTagsError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *detailsKey = "details";
	node = json_object_get_member(pJsonObject, detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("IneligibleProductTagsErrorDetails")) {
			jsonToValue(&details, node, "IneligibleProductTagsErrorDetails", "IneligibleProductTagsErrorDetails");
		} else {
			
			IneligibleProductTagsErrorDetails* obj = static_cast<IneligibleProductTagsErrorDetails*> (&details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

ProductTagsError::ProductTagsError(char* json)
{
	this->fromJson(json);
}

char*
ProductTagsError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("IneligibleProductTagsErrorDetails")) {
		IneligibleProductTagsErrorDetails obj = getDetails();
		node = converttoJson(&obj, "IneligibleProductTagsErrorDetails", "");
	}
	else {
		
		IneligibleProductTagsErrorDetails obj = static_cast<IneligibleProductTagsErrorDetails> (getDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *detailsKey = "details";
	json_object_set_member(pJsonObject, detailsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ProductTagsError::getCode()
{
	return code;
}

void
ProductTagsError::setCode(int  code)
{
	this->code = code;
}

IneligibleProductTagsErrorDetails
ProductTagsError::getDetails()
{
	return details;
}

void
ProductTagsError::setDetails(IneligibleProductTagsErrorDetails  details)
{
	this->details = details;
}

std::string
ProductTagsError::getMessage()
{
	return message;
}

void
ProductTagsError::setMessage(std::string  message)
{
	this->message = message;
}


