#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SharedAudienceAccount.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SharedAudienceAccount::SharedAudienceAccount()
{
	//__init();
}

SharedAudienceAccount::~SharedAudienceAccount()
{
	//__cleanup();
}

void
SharedAudienceAccount::__init()
{
	//account_id = std::string();
	//account_name = std::string();
	//account_type = std::string();
	//shared_on_timestamp = int(0);
}

void
SharedAudienceAccount::__cleanup()
{
	//if(account_id != NULL) {
	//
	//delete account_id;
	//account_id = NULL;
	//}
	//if(account_name != NULL) {
	//
	//delete account_name;
	//account_name = NULL;
	//}
	//if(account_type != NULL) {
	//
	//delete account_type;
	//account_type = NULL;
	//}
	//if(shared_on_timestamp != NULL) {
	//
	//delete shared_on_timestamp;
	//shared_on_timestamp = NULL;
	//}
	//
}

void
SharedAudienceAccount::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *account_idKey = "account_id";
	node = json_object_get_member(pJsonObject, account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *account_nameKey = "account_name";
	node = json_object_get_member(pJsonObject, account_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&account_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *account_typeKey = "account_type";
	node = json_object_get_member(pJsonObject, account_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&account_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *shared_on_timestampKey = "shared_on_timestamp";
	node = json_object_get_member(pJsonObject, shared_on_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&shared_on_timestamp, node, "int", "");
		} else {
			
		}
	}
}

SharedAudienceAccount::SharedAudienceAccount(char* json)
{
	this->fromJson(json);
}

char*
SharedAudienceAccount::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *account_idKey = "account_id";
	json_object_set_member(pJsonObject, account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAccountName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *account_nameKey = "account_name";
	json_object_set_member(pJsonObject, account_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAccountType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *account_typeKey = "account_type";
	json_object_set_member(pJsonObject, account_typeKey, node);
	if (isprimitive("int")) {
		int obj = getSharedOnTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *shared_on_timestampKey = "shared_on_timestamp";
	json_object_set_member(pJsonObject, shared_on_timestampKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SharedAudienceAccount::getAccountId()
{
	return account_id;
}

void
SharedAudienceAccount::setAccountId(std::string  account_id)
{
	this->account_id = account_id;
}

std::string
SharedAudienceAccount::getAccountName()
{
	return account_name;
}

void
SharedAudienceAccount::setAccountName(std::string  account_name)
{
	this->account_name = account_name;
}

std::string
SharedAudienceAccount::getAccountType()
{
	return account_type;
}

void
SharedAudienceAccount::setAccountType(std::string  account_type)
{
	this->account_type = account_type;
}

int
SharedAudienceAccount::getSharedOnTimestamp()
{
	return shared_on_timestamp;
}

void
SharedAudienceAccount::setSharedOnTimestamp(int  shared_on_timestamp)
{
	this->shared_on_timestamp = shared_on_timestamp;
}


