#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadsExportsCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadsExportsCreate::LeadsExportsCreate()
{
	//__init();
}

LeadsExportsCreate::~LeadsExportsCreate()
{
	//__cleanup();
}

void
LeadsExportsCreate::__init()
{
	//ad_id = std::string();
	//end_date = std::string();
	//start_date = std::string();
}

void
LeadsExportsCreate::__cleanup()
{
	//if(ad_id != NULL) {
	//
	//delete ad_id;
	//ad_id = NULL;
	//}
	//if(end_date != NULL) {
	//
	//delete end_date;
	//end_date = NULL;
	//}
	//if(start_date != NULL) {
	//
	//delete start_date;
	//start_date = NULL;
	//}
	//
}

void
LeadsExportsCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_idKey = "ad_id";
	node = json_object_get_member(pJsonObject, ad_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *end_dateKey = "end_date";
	node = json_object_get_member(pJsonObject, end_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *start_dateKey = "start_date";
	node = json_object_get_member(pJsonObject, start_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_date, node, "std::string", "");
		} else {
			
		}
	}
}

LeadsExportsCreate::LeadsExportsCreate(char* json)
{
	this->fromJson(json);
}

char*
LeadsExportsCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_idKey = "ad_id";
	json_object_set_member(pJsonObject, ad_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_dateKey = "end_date";
	json_object_set_member(pJsonObject, end_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_dateKey = "start_date";
	json_object_set_member(pJsonObject, start_dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadsExportsCreate::getAdId()
{
	return ad_id;
}

void
LeadsExportsCreate::setAdId(std::string  ad_id)
{
	this->ad_id = ad_id;
}

std::string
LeadsExportsCreate::getEndDate()
{
	return end_date;
}

void
LeadsExportsCreate::setEndDate(std::string  end_date)
{
	this->end_date = end_date;
}

std::string
LeadsExportsCreate::getStartDate()
{
	return start_date;
}

void
LeadsExportsCreate::setStartDate(std::string  start_date)
{
	this->start_date = start_date;
}


