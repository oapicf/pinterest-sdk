#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QualityComponents.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QualityComponents::QualityComponents()
{
	//__init();
}

QualityComponents::~QualityComponents()
{
	//__cleanup();
}

void
QualityComponents::__init()
{
	//new std::map()std::map> advertiser_external_id;
	//new std::map()std::map> click_id_epik;
	//new std::map()std::map> external_event_id;
	//new std::map()std::map> hashed_email;
	//new std::map()std::map> hashed_maid;
	//new std::map()std::map> ip_address;
	//new std::map()std::map> order_id;
	//new std::map()std::map> order_value;
	//new std::map()std::map> product_id;
	//new std::map()std::map> source_url;
	//new std::map()std::map> user_agent;
}

void
QualityComponents::__cleanup()
{
	//if(advertiser_external_id != NULL) {
	//advertiser_external_id.RemoveAll(true);
	//delete advertiser_external_id;
	//advertiser_external_id = NULL;
	//}
	//if(click_id_epik != NULL) {
	//click_id_epik.RemoveAll(true);
	//delete click_id_epik;
	//click_id_epik = NULL;
	//}
	//if(external_event_id != NULL) {
	//external_event_id.RemoveAll(true);
	//delete external_event_id;
	//external_event_id = NULL;
	//}
	//if(hashed_email != NULL) {
	//hashed_email.RemoveAll(true);
	//delete hashed_email;
	//hashed_email = NULL;
	//}
	//if(hashed_maid != NULL) {
	//hashed_maid.RemoveAll(true);
	//delete hashed_maid;
	//hashed_maid = NULL;
	//}
	//if(ip_address != NULL) {
	//ip_address.RemoveAll(true);
	//delete ip_address;
	//ip_address = NULL;
	//}
	//if(order_id != NULL) {
	//order_id.RemoveAll(true);
	//delete order_id;
	//order_id = NULL;
	//}
	//if(order_value != NULL) {
	//order_value.RemoveAll(true);
	//delete order_value;
	//order_value = NULL;
	//}
	//if(product_id != NULL) {
	//product_id.RemoveAll(true);
	//delete product_id;
	//product_id = NULL;
	//}
	//if(source_url != NULL) {
	//source_url.RemoveAll(true);
	//delete source_url;
	//source_url = NULL;
	//}
	//if(user_agent != NULL) {
	//user_agent.RemoveAll(true);
	//delete user_agent;
	//user_agent = NULL;
	//}
	//
}

void
QualityComponents::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *advertiser_external_idKey = "advertiser_external_id";
	node = json_object_get_member(pJsonObject, advertiser_external_idKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			advertiser_external_id = new_map;
		}
		
	}
	const gchar *click_id_epikKey = "click_id_epik";
	node = json_object_get_member(pJsonObject, click_id_epikKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			click_id_epik = new_map;
		}
		
	}
	const gchar *external_event_idKey = "external_event_id";
	node = json_object_get_member(pJsonObject, external_event_idKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			external_event_id = new_map;
		}
		
	}
	const gchar *hashed_emailKey = "hashed_email";
	node = json_object_get_member(pJsonObject, hashed_emailKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			hashed_email = new_map;
		}
		
	}
	const gchar *hashed_maidKey = "hashed_maid";
	node = json_object_get_member(pJsonObject, hashed_maidKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			hashed_maid = new_map;
		}
		
	}
	const gchar *ip_addressKey = "ip_address";
	node = json_object_get_member(pJsonObject, ip_addressKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			ip_address = new_map;
		}
		
	}
	const gchar *order_idKey = "order_id";
	node = json_object_get_member(pJsonObject, order_idKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			order_id = new_map;
		}
		
	}
	const gchar *order_valueKey = "order_value";
	node = json_object_get_member(pJsonObject, order_valueKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			order_value = new_map;
		}
		
	}
	const gchar *product_idKey = "product_id";
	node = json_object_get_member(pJsonObject, product_idKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			product_id = new_map;
		}
		
	}
	const gchar *source_urlKey = "source_url";
	node = json_object_get_member(pJsonObject, source_urlKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			source_url = new_map;
		}
		
	}
	const gchar *user_agentKey = "user_agent";
	node = json_object_get_member(pJsonObject, user_agentKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			user_agent = new_map;
		}
		
	}
}

QualityComponents::QualityComponents(char* json)
{
	this->fromJson(json);
}

char*
QualityComponents::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getAdvertiserExternalId());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *advertiser_external_idKey = "advertiser_external_id";
	json_object_set_member(pJsonObject, advertiser_external_idKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getClickIdEpik());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *click_id_epikKey = "click_id_epik";
	json_object_set_member(pJsonObject, click_id_epikKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getExternalEventId());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *external_event_idKey = "external_event_id";
	json_object_set_member(pJsonObject, external_event_idKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getHashedEmail());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *hashed_emailKey = "hashed_email";
	json_object_set_member(pJsonObject, hashed_emailKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getHashedMaid());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *hashed_maidKey = "hashed_maid";
	json_object_set_member(pJsonObject, hashed_maidKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getIpAddress());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *ip_addressKey = "ip_address";
	json_object_set_member(pJsonObject, ip_addressKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getOrderId());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *order_idKey = "order_id";
	json_object_set_member(pJsonObject, order_idKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getOrderValue());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *order_valueKey = "order_value";
	json_object_set_member(pJsonObject, order_valueKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getProductId());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *product_idKey = "product_id";
	json_object_set_member(pJsonObject, product_idKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getSourceUrl());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *source_urlKey = "source_url";
	json_object_set_member(pJsonObject, source_urlKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getUserAgent());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
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

std::map<string, string>
QualityComponents::getAdvertiserExternalId()
{
	return advertiser_external_id;
}

void
QualityComponents::setAdvertiserExternalId(std::map <string, string> advertiser_external_id)
{
	this->advertiser_external_id = advertiser_external_id;
}

std::map<string, string>
QualityComponents::getClickIdEpik()
{
	return click_id_epik;
}

void
QualityComponents::setClickIdEpik(std::map <string, string> click_id_epik)
{
	this->click_id_epik = click_id_epik;
}

std::map<string, string>
QualityComponents::getExternalEventId()
{
	return external_event_id;
}

void
QualityComponents::setExternalEventId(std::map <string, string> external_event_id)
{
	this->external_event_id = external_event_id;
}

std::map<string, string>
QualityComponents::getHashedEmail()
{
	return hashed_email;
}

void
QualityComponents::setHashedEmail(std::map <string, string> hashed_email)
{
	this->hashed_email = hashed_email;
}

std::map<string, string>
QualityComponents::getHashedMaid()
{
	return hashed_maid;
}

void
QualityComponents::setHashedMaid(std::map <string, string> hashed_maid)
{
	this->hashed_maid = hashed_maid;
}

std::map<string, string>
QualityComponents::getIpAddress()
{
	return ip_address;
}

void
QualityComponents::setIpAddress(std::map <string, string> ip_address)
{
	this->ip_address = ip_address;
}

std::map<string, string>
QualityComponents::getOrderId()
{
	return order_id;
}

void
QualityComponents::setOrderId(std::map <string, string> order_id)
{
	this->order_id = order_id;
}

std::map<string, string>
QualityComponents::getOrderValue()
{
	return order_value;
}

void
QualityComponents::setOrderValue(std::map <string, string> order_value)
{
	this->order_value = order_value;
}

std::map<string, string>
QualityComponents::getProductId()
{
	return product_id;
}

void
QualityComponents::setProductId(std::map <string, string> product_id)
{
	this->product_id = product_id;
}

std::map<string, string>
QualityComponents::getSourceUrl()
{
	return source_url;
}

void
QualityComponents::setSourceUrl(std::map <string, string> source_url)
{
	this->source_url = source_url;
}

std::map<string, string>
QualityComponents::getUserAgent()
{
	return user_agent;
}

void
QualityComponents::setUserAgent(std::map <string, string> user_agent)
{
	this->user_agent = user_agent;
}


