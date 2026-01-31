#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupIdFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupIdFilter::AdGroupIdFilter()
{
	//__init();
}

AdGroupIdFilter::~AdGroupIdFilter()
{
	//__cleanup();
}

void
AdGroupIdFilter::__init()
{
	//new std::list()std::list> ad_group_ids;
}

void
AdGroupIdFilter::__cleanup()
{
	//if(ad_group_ids != NULL) {
	//ad_group_ids.RemoveAll(true);
	//delete ad_group_ids;
	//ad_group_ids = NULL;
	//}
	//
}

void
AdGroupIdFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_group_idsKey = "ad_group_ids";
	node = json_object_get_member(pJsonObject, ad_group_idsKey);
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
			ad_group_ids = new_list;
		}
		
	}
}

AdGroupIdFilter::AdGroupIdFilter(char* json)
{
	this->fromJson(json);
}

char*
AdGroupIdFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAdGroupIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdGroupIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_group_idsKey = "ad_group_ids";
	json_object_set_member(pJsonObject, ad_group_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
AdGroupIdFilter::getAdGroupIds()
{
	return ad_group_ids;
}

void
AdGroupIdFilter::setAdGroupIds(std::list <std::string> ad_group_ids)
{
	this->ad_group_ids = ad_group_ids;
}


