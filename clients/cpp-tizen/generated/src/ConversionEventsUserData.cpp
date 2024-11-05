#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsUserData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsUserData::ConversionEventsUserData()
{
	//__init();
}

ConversionEventsUserData::~ConversionEventsUserData()
{
	//__cleanup();
}

void
ConversionEventsUserData::__init()
{
	//new std::list()std::list> ph;
	//new std::list()std::list> ge;
	//new std::list()std::list> db;
	//new std::list()std::list> ln;
	//new std::list()std::list> fn;
	//new std::list()std::list> ct;
	//new std::list()std::list> st;
	//new std::list()std::list> zp;
	//new std::list()std::list> country;
	//new std::list()std::list> external_id;
	//click_id = std::string();
	//partner_id = std::string();
	//new std::list()std::list> em;
	//new std::list()std::list> hashed_maids;
	//client_ip_address = std::string();
	//client_user_agent = std::string();
}

void
ConversionEventsUserData::__cleanup()
{
	//if(ph != NULL) {
	//ph.RemoveAll(true);
	//delete ph;
	//ph = NULL;
	//}
	//if(ge != NULL) {
	//ge.RemoveAll(true);
	//delete ge;
	//ge = NULL;
	//}
	//if(db != NULL) {
	//db.RemoveAll(true);
	//delete db;
	//db = NULL;
	//}
	//if(ln != NULL) {
	//ln.RemoveAll(true);
	//delete ln;
	//ln = NULL;
	//}
	//if(fn != NULL) {
	//fn.RemoveAll(true);
	//delete fn;
	//fn = NULL;
	//}
	//if(ct != NULL) {
	//ct.RemoveAll(true);
	//delete ct;
	//ct = NULL;
	//}
	//if(st != NULL) {
	//st.RemoveAll(true);
	//delete st;
	//st = NULL;
	//}
	//if(zp != NULL) {
	//zp.RemoveAll(true);
	//delete zp;
	//zp = NULL;
	//}
	//if(country != NULL) {
	//country.RemoveAll(true);
	//delete country;
	//country = NULL;
	//}
	//if(external_id != NULL) {
	//external_id.RemoveAll(true);
	//delete external_id;
	//external_id = NULL;
	//}
	//if(click_id != NULL) {
	//
	//delete click_id;
	//click_id = NULL;
	//}
	//if(partner_id != NULL) {
	//
	//delete partner_id;
	//partner_id = NULL;
	//}
	//if(em != NULL) {
	//em.RemoveAll(true);
	//delete em;
	//em = NULL;
	//}
	//if(hashed_maids != NULL) {
	//hashed_maids.RemoveAll(true);
	//delete hashed_maids;
	//hashed_maids = NULL;
	//}
	//if(client_ip_address != NULL) {
	//
	//delete client_ip_address;
	//client_ip_address = NULL;
	//}
	//if(client_user_agent != NULL) {
	//
	//delete client_user_agent;
	//client_user_agent = NULL;
	//}
	//
}

void
ConversionEventsUserData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *phKey = "ph";
	node = json_object_get_member(pJsonObject, phKey);
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
			ph = new_list;
		}
		
	}
	const gchar *geKey = "ge";
	node = json_object_get_member(pJsonObject, geKey);
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
			ge = new_list;
		}
		
	}
	const gchar *dbKey = "db";
	node = json_object_get_member(pJsonObject, dbKey);
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
			db = new_list;
		}
		
	}
	const gchar *lnKey = "ln";
	node = json_object_get_member(pJsonObject, lnKey);
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
			ln = new_list;
		}
		
	}
	const gchar *fnKey = "fn";
	node = json_object_get_member(pJsonObject, fnKey);
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
			fn = new_list;
		}
		
	}
	const gchar *ctKey = "ct";
	node = json_object_get_member(pJsonObject, ctKey);
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
			ct = new_list;
		}
		
	}
	const gchar *stKey = "st";
	node = json_object_get_member(pJsonObject, stKey);
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
			st = new_list;
		}
		
	}
	const gchar *zpKey = "zp";
	node = json_object_get_member(pJsonObject, zpKey);
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
			zp = new_list;
		}
		
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
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
			country = new_list;
		}
		
	}
	const gchar *external_idKey = "external_id";
	node = json_object_get_member(pJsonObject, external_idKey);
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
			external_id = new_list;
		}
		
	}
	const gchar *click_idKey = "click_id";
	node = json_object_get_member(pJsonObject, click_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&click_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *partner_idKey = "partner_id";
	node = json_object_get_member(pJsonObject, partner_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&partner_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *emKey = "em";
	node = json_object_get_member(pJsonObject, emKey);
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
			em = new_list;
		}
		
	}
	const gchar *hashed_maidsKey = "hashed_maids";
	node = json_object_get_member(pJsonObject, hashed_maidsKey);
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
			hashed_maids = new_list;
		}
		
	}
	const gchar *client_ip_addressKey = "client_ip_address";
	node = json_object_get_member(pJsonObject, client_ip_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client_ip_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *client_user_agentKey = "client_user_agent";
	node = json_object_get_member(pJsonObject, client_user_agentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client_user_agent, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEventsUserData::ConversionEventsUserData(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsUserData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPh());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPh());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *phKey = "ph";
	json_object_set_member(pJsonObject, phKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGe());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGe());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *geKey = "ge";
	json_object_set_member(pJsonObject, geKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDb());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDb());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *dbKey = "db";
	json_object_set_member(pJsonObject, dbKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLn());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLn());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *lnKey = "ln";
	json_object_set_member(pJsonObject, lnKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFn());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFn());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *fnKey = "fn";
	json_object_set_member(pJsonObject, fnKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCt());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCt());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ctKey = "ct";
	json_object_set_member(pJsonObject, ctKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSt());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSt());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *stKey = "st";
	json_object_set_member(pJsonObject, stKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getZp());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getZp());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *zpKey = "zp";
	json_object_set_member(pJsonObject, zpKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCountry());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCountry());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getExternalId());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getExternalId());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *external_idKey = "external_id";
	json_object_set_member(pJsonObject, external_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClickId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *click_idKey = "click_id";
	json_object_set_member(pJsonObject, click_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartnerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *partner_idKey = "partner_id";
	json_object_set_member(pJsonObject, partner_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *emKey = "em";
	json_object_set_member(pJsonObject, emKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hashed_maidsKey = "hashed_maids";
	json_object_set_member(pJsonObject, hashed_maidsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClientIpAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *client_ip_addressKey = "client_ip_address";
	json_object_set_member(pJsonObject, client_ip_addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClientUserAgent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *client_user_agentKey = "client_user_agent";
	json_object_set_member(pJsonObject, client_user_agentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
ConversionEventsUserData::getPh()
{
	return ph;
}

void
ConversionEventsUserData::setPh(std::list <std::string> ph)
{
	this->ph = ph;
}

std::list<std::string>
ConversionEventsUserData::getGe()
{
	return ge;
}

void
ConversionEventsUserData::setGe(std::list <std::string> ge)
{
	this->ge = ge;
}

std::list<std::string>
ConversionEventsUserData::getDb()
{
	return db;
}

void
ConversionEventsUserData::setDb(std::list <std::string> db)
{
	this->db = db;
}

std::list<std::string>
ConversionEventsUserData::getLn()
{
	return ln;
}

void
ConversionEventsUserData::setLn(std::list <std::string> ln)
{
	this->ln = ln;
}

std::list<std::string>
ConversionEventsUserData::getFn()
{
	return fn;
}

void
ConversionEventsUserData::setFn(std::list <std::string> fn)
{
	this->fn = fn;
}

std::list<std::string>
ConversionEventsUserData::getCt()
{
	return ct;
}

void
ConversionEventsUserData::setCt(std::list <std::string> ct)
{
	this->ct = ct;
}

std::list<std::string>
ConversionEventsUserData::getSt()
{
	return st;
}

void
ConversionEventsUserData::setSt(std::list <std::string> st)
{
	this->st = st;
}

std::list<std::string>
ConversionEventsUserData::getZp()
{
	return zp;
}

void
ConversionEventsUserData::setZp(std::list <std::string> zp)
{
	this->zp = zp;
}

std::list<std::string>
ConversionEventsUserData::getCountry()
{
	return country;
}

void
ConversionEventsUserData::setCountry(std::list <std::string> country)
{
	this->country = country;
}

std::list<std::string>
ConversionEventsUserData::getExternalId()
{
	return external_id;
}

void
ConversionEventsUserData::setExternalId(std::list <std::string> external_id)
{
	this->external_id = external_id;
}

std::string
ConversionEventsUserData::getClickId()
{
	return click_id;
}

void
ConversionEventsUserData::setClickId(std::string  click_id)
{
	this->click_id = click_id;
}

std::string
ConversionEventsUserData::getPartnerId()
{
	return partner_id;
}

void
ConversionEventsUserData::setPartnerId(std::string  partner_id)
{
	this->partner_id = partner_id;
}

std::list<std::string>
ConversionEventsUserData::getEm()
{
	return em;
}

void
ConversionEventsUserData::setEm(std::list <std::string> em)
{
	this->em = em;
}

std::list<std::string>
ConversionEventsUserData::getHashedMaids()
{
	return hashed_maids;
}

void
ConversionEventsUserData::setHashedMaids(std::list <std::string> hashed_maids)
{
	this->hashed_maids = hashed_maids;
}

std::string
ConversionEventsUserData::getClientIpAddress()
{
	return client_ip_address;
}

void
ConversionEventsUserData::setClientIpAddress(std::string  client_ip_address)
{
	this->client_ip_address = client_ip_address;
}

std::string
ConversionEventsUserData::getClientUserAgent()
{
	return client_user_agent;
}

void
ConversionEventsUserData::setClientUserAgent(std::string  client_user_agent)
{
	this->client_user_agent = client_user_agent;
}


