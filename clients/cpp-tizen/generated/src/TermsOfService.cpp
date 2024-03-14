#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TermsOfService.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TermsOfService::TermsOfService()
{
	//__init();
}

TermsOfService::~TermsOfService()
{
	//__cleanup();
}

void
TermsOfService::__init()
{
	//id = std::string();
	//html = std::string();
	//has_accepted = bool(false);
	//ad_account_id = std::string();
}

void
TermsOfService::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(html != NULL) {
	//
	//delete html;
	//html = NULL;
	//}
	//if(has_accepted != NULL) {
	//
	//delete has_accepted;
	//has_accepted = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//
}

void
TermsOfService::fromJson(char* jsonStr)
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
	const gchar *htmlKey = "html";
	node = json_object_get_member(pJsonObject, htmlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&html, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *has_acceptedKey = "has_accepted";
	node = json_object_get_member(pJsonObject, has_acceptedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_accepted, node, "bool", "");
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
}

TermsOfService::TermsOfService(char* json)
{
	this->fromJson(json);
}

char*
TermsOfService::toJson()
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
		std::string obj = getHtml();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *htmlKey = "html";
	json_object_set_member(pJsonObject, htmlKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasAccepted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_acceptedKey = "has_accepted";
	json_object_set_member(pJsonObject, has_acceptedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TermsOfService::getId()
{
	return id;
}

void
TermsOfService::setId(std::string  id)
{
	this->id = id;
}

std::string
TermsOfService::getHtml()
{
	return html;
}

void
TermsOfService::setHtml(std::string  html)
{
	this->html = html;
}

bool
TermsOfService::getHasAccepted()
{
	return has_accepted;
}

void
TermsOfService::setHasAccepted(bool  has_accepted)
{
	this->has_accepted = has_accepted;
}

std::string
TermsOfService::getAdAccountId()
{
	return ad_account_id;
}

void
TermsOfService::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}


