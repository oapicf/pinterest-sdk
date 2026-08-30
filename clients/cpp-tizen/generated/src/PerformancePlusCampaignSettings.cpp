#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PerformancePlusCampaignSettings.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PerformancePlusCampaignSettings::PerformancePlusCampaignSettings()
{
	//__init();
}

PerformancePlusCampaignSettings::~PerformancePlusCampaignSettings()
{
	//__cleanup();
}

void
PerformancePlusCampaignSettings::__init()
{
	//boost_prospecting_ad_group_bid = bool(false);
	//new std::list()std::list> pinner_list_exclusions;
}

void
PerformancePlusCampaignSettings::__cleanup()
{
	//if(boost_prospecting_ad_group_bid != NULL) {
	//
	//delete boost_prospecting_ad_group_bid;
	//boost_prospecting_ad_group_bid = NULL;
	//}
	//if(pinner_list_exclusions != NULL) {
	//pinner_list_exclusions.RemoveAll(true);
	//delete pinner_list_exclusions;
	//pinner_list_exclusions = NULL;
	//}
	//
}

void
PerformancePlusCampaignSettings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *boost_prospecting_ad_group_bidKey = "boost_prospecting_ad_group_bid";
	node = json_object_get_member(pJsonObject, boost_prospecting_ad_group_bidKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&boost_prospecting_ad_group_bid, node, "bool", "");
		} else {
			
		}
	}
	const gchar *pinner_list_exclusionsKey = "pinner_list_exclusions";
	node = json_object_get_member(pJsonObject, pinner_list_exclusionsKey);
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
			pinner_list_exclusions = new_list;
		}
		
	}
}

PerformancePlusCampaignSettings::PerformancePlusCampaignSettings(char* json)
{
	this->fromJson(json);
}

char*
PerformancePlusCampaignSettings::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getBoostProspectingAdGroupBid();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *boost_prospecting_ad_group_bidKey = "boost_prospecting_ad_group_bid";
	json_object_set_member(pJsonObject, boost_prospecting_ad_group_bidKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPinnerListExclusions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPinnerListExclusions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *pinner_list_exclusionsKey = "pinner_list_exclusions";
	json_object_set_member(pJsonObject, pinner_list_exclusionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
PerformancePlusCampaignSettings::getBoostProspectingAdGroupBid()
{
	return boost_prospecting_ad_group_bid;
}

void
PerformancePlusCampaignSettings::setBoostProspectingAdGroupBid(bool  boost_prospecting_ad_group_bid)
{
	this->boost_prospecting_ad_group_bid = boost_prospecting_ad_group_bid;
}

std::list<std::string>
PerformancePlusCampaignSettings::getPinnerListExclusions()
{
	return pinner_list_exclusions;
}

void
PerformancePlusCampaignSettings::setPinnerListExclusions(std::list <std::string> pinner_list_exclusions)
{
	this->pinner_list_exclusions = pinner_list_exclusions;
}


