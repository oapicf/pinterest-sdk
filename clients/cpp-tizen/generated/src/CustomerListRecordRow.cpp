#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListRecordRow.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListRecordRow::CustomerListRecordRow()
{
	//__init();
}

CustomerListRecordRow::~CustomerListRecordRow()
{
	//__cleanup();
}

void
CustomerListRecordRow::__init()
{
	//email = std::string();
	//external_id = std::string();
	//hashed_phone_number = std::string();
	//hashed_pinner_id = std::string();
	//ip_address = std::string();
	//liveramp_envelope = std::string();
	//maid = std::string();
	//user_agent = std::string();
}

void
CustomerListRecordRow::__cleanup()
{
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(external_id != NULL) {
	//
	//delete external_id;
	//external_id = NULL;
	//}
	//if(hashed_phone_number != NULL) {
	//
	//delete hashed_phone_number;
	//hashed_phone_number = NULL;
	//}
	//if(hashed_pinner_id != NULL) {
	//
	//delete hashed_pinner_id;
	//hashed_pinner_id = NULL;
	//}
	//if(ip_address != NULL) {
	//
	//delete ip_address;
	//ip_address = NULL;
	//}
	//if(liveramp_envelope != NULL) {
	//
	//delete liveramp_envelope;
	//liveramp_envelope = NULL;
	//}
	//if(maid != NULL) {
	//
	//delete maid;
	//maid = NULL;
	//}
	//if(user_agent != NULL) {
	//
	//delete user_agent;
	//user_agent = NULL;
	//}
	//
}

void
CustomerListRecordRow::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *external_idKey = "external_id";
	node = json_object_get_member(pJsonObject, external_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&external_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hashed_phone_numberKey = "hashed_phone_number";
	node = json_object_get_member(pJsonObject, hashed_phone_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hashed_phone_number, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hashed_pinner_idKey = "hashed_pinner_id";
	node = json_object_get_member(pJsonObject, hashed_pinner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hashed_pinner_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ip_addressKey = "ip_address";
	node = json_object_get_member(pJsonObject, ip_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ip_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *liveramp_envelopeKey = "liveramp_envelope";
	node = json_object_get_member(pJsonObject, liveramp_envelopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&liveramp_envelope, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *maidKey = "maid";
	node = json_object_get_member(pJsonObject, maidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&maid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *user_agentKey = "user_agent";
	node = json_object_get_member(pJsonObject, user_agentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_agent, node, "std::string", "");
		} else {
			
		}
	}
}

CustomerListRecordRow::CustomerListRecordRow(char* json)
{
	this->fromJson(json);
}

char*
CustomerListRecordRow::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExternalId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *external_idKey = "external_id";
	json_object_set_member(pJsonObject, external_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHashedPhoneNumber();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hashed_phone_numberKey = "hashed_phone_number";
	json_object_set_member(pJsonObject, hashed_phone_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHashedPinnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hashed_pinner_idKey = "hashed_pinner_id";
	json_object_set_member(pJsonObject, hashed_pinner_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIpAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ip_addressKey = "ip_address";
	json_object_set_member(pJsonObject, ip_addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLiverampEnvelope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *liveramp_envelopeKey = "liveramp_envelope";
	json_object_set_member(pJsonObject, liveramp_envelopeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMaid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *maidKey = "maid";
	json_object_set_member(pJsonObject, maidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserAgent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_agentKey = "user_agent";
	json_object_set_member(pJsonObject, user_agentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CustomerListRecordRow::getEmail()
{
	return email;
}

void
CustomerListRecordRow::setEmail(std::string  email)
{
	this->email = email;
}

std::string
CustomerListRecordRow::getExternalId()
{
	return external_id;
}

void
CustomerListRecordRow::setExternalId(std::string  external_id)
{
	this->external_id = external_id;
}

std::string
CustomerListRecordRow::getHashedPhoneNumber()
{
	return hashed_phone_number;
}

void
CustomerListRecordRow::setHashedPhoneNumber(std::string  hashed_phone_number)
{
	this->hashed_phone_number = hashed_phone_number;
}

std::string
CustomerListRecordRow::getHashedPinnerId()
{
	return hashed_pinner_id;
}

void
CustomerListRecordRow::setHashedPinnerId(std::string  hashed_pinner_id)
{
	this->hashed_pinner_id = hashed_pinner_id;
}

std::string
CustomerListRecordRow::getIpAddress()
{
	return ip_address;
}

void
CustomerListRecordRow::setIpAddress(std::string  ip_address)
{
	this->ip_address = ip_address;
}

std::string
CustomerListRecordRow::getLiverampEnvelope()
{
	return liveramp_envelope;
}

void
CustomerListRecordRow::setLiverampEnvelope(std::string  liveramp_envelope)
{
	this->liveramp_envelope = liveramp_envelope;
}

std::string
CustomerListRecordRow::getMaid()
{
	return maid;
}

void
CustomerListRecordRow::setMaid(std::string  maid)
{
	this->maid = maid;
}

std::string
CustomerListRecordRow::getUserAgent()
{
	return user_agent;
}

void
CustomerListRecordRow::setUserAgent(std::string  user_agent)
{
	this->user_agent = user_agent;
}


