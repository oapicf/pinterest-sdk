#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BaseInviteDataResponse_invite_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BaseInviteDataResponse_invite_data::BaseInviteDataResponse_invite_data()
{
	//__init();
}

BaseInviteDataResponse_invite_data::~BaseInviteDataResponse_invite_data()
{
	//__cleanup();
}

void
BaseInviteDataResponse_invite_data::__init()
{
	//invite_expiration = int(0);
	//invite_status = std::string();
	//invite_type = std::string();
	//last_updated_time = int(0);
	//sent_at = int(0);
}

void
BaseInviteDataResponse_invite_data::__cleanup()
{
	//if(invite_expiration != NULL) {
	//
	//delete invite_expiration;
	//invite_expiration = NULL;
	//}
	//if(invite_status != NULL) {
	//
	//delete invite_status;
	//invite_status = NULL;
	//}
	//if(invite_type != NULL) {
	//
	//delete invite_type;
	//invite_type = NULL;
	//}
	//if(last_updated_time != NULL) {
	//
	//delete last_updated_time;
	//last_updated_time = NULL;
	//}
	//if(sent_at != NULL) {
	//
	//delete sent_at;
	//sent_at = NULL;
	//}
	//
}

void
BaseInviteDataResponse_invite_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invite_expirationKey = "invite_expiration";
	node = json_object_get_member(pJsonObject, invite_expirationKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&invite_expiration, node, "int", "");
		} else {
			
		}
	}
	const gchar *invite_statusKey = "invite_status";
	node = json_object_get_member(pJsonObject, invite_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&invite_status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *invite_typeKey = "invite_type";
	node = json_object_get_member(pJsonObject, invite_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&invite_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	node = json_object_get_member(pJsonObject, last_updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&last_updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *sent_atKey = "sent_at";
	node = json_object_get_member(pJsonObject, sent_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sent_at, node, "int", "");
		} else {
			
		}
	}
}

BaseInviteDataResponse_invite_data::BaseInviteDataResponse_invite_data(char* json)
{
	this->fromJson(json);
}

char*
BaseInviteDataResponse_invite_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getInviteExpiration();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *invite_expirationKey = "invite_expiration";
	json_object_set_member(pJsonObject, invite_expirationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInviteStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *invite_statusKey = "invite_status";
	json_object_set_member(pJsonObject, invite_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInviteType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *invite_typeKey = "invite_type";
	json_object_set_member(pJsonObject, invite_typeKey, node);
	if (isprimitive("int")) {
		int obj = getLastUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *last_updated_timeKey = "last_updated_time";
	json_object_set_member(pJsonObject, last_updated_timeKey, node);
	if (isprimitive("int")) {
		int obj = getSentAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sent_atKey = "sent_at";
	json_object_set_member(pJsonObject, sent_atKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BaseInviteDataResponse_invite_data::getInviteExpiration()
{
	return invite_expiration;
}

void
BaseInviteDataResponse_invite_data::setInviteExpiration(int  invite_expiration)
{
	this->invite_expiration = invite_expiration;
}

std::string
BaseInviteDataResponse_invite_data::getInviteStatus()
{
	return invite_status;
}

void
BaseInviteDataResponse_invite_data::setInviteStatus(std::string  invite_status)
{
	this->invite_status = invite_status;
}

std::string
BaseInviteDataResponse_invite_data::getInviteType()
{
	return invite_type;
}

void
BaseInviteDataResponse_invite_data::setInviteType(std::string  invite_type)
{
	this->invite_type = invite_type;
}

int
BaseInviteDataResponse_invite_data::getLastUpdatedTime()
{
	return last_updated_time;
}

void
BaseInviteDataResponse_invite_data::setLastUpdatedTime(int  last_updated_time)
{
	this->last_updated_time = last_updated_time;
}

int
BaseInviteDataResponse_invite_data::getSentAt()
{
	return sent_at;
}

void
BaseInviteDataResponse_invite_data::setSentAt(int  sent_at)
{
	this->sent_at = sent_at;
}


