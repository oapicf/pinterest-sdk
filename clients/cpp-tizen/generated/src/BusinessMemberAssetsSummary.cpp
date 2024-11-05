#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessMemberAssetsSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessMemberAssetsSummary::BusinessMemberAssetsSummary()
{
	//__init();
}

BusinessMemberAssetsSummary::~BusinessMemberAssetsSummary()
{
	//__cleanup();
}

void
BusinessMemberAssetsSummary::__init()
{
	//new std::list()std::list> ad_accounts;
	//new std::list()std::list> profiles;
}

void
BusinessMemberAssetsSummary::__cleanup()
{
	//if(ad_accounts != NULL) {
	//ad_accounts.RemoveAll(true);
	//delete ad_accounts;
	//ad_accounts = NULL;
	//}
	//if(profiles != NULL) {
	//profiles.RemoveAll(true);
	//delete profiles;
	//profiles = NULL;
	//}
	//
}

void
BusinessMemberAssetsSummary::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_accountsKey = "ad_accounts";
	node = json_object_get_member(pJsonObject, ad_accountsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BusinessMemberAssetsSummary_ad_accounts_inner> new_list;
			BusinessMemberAssetsSummary_ad_accounts_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BusinessMemberAssetsSummary_ad_accounts_inner")) {
					jsonToValue(&inst, temp_json, "BusinessMemberAssetsSummary_ad_accounts_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ad_accounts = new_list;
		}
		
	}
	const gchar *profilesKey = "profiles";
	node = json_object_get_member(pJsonObject, profilesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BusinessMemberAssetsSummary_profiles_inner> new_list;
			BusinessMemberAssetsSummary_profiles_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BusinessMemberAssetsSummary_profiles_inner")) {
					jsonToValue(&inst, temp_json, "BusinessMemberAssetsSummary_profiles_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			profiles = new_list;
		}
		
	}
}

BusinessMemberAssetsSummary::BusinessMemberAssetsSummary(char* json)
{
	this->fromJson(json);
}

char*
BusinessMemberAssetsSummary::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BusinessMemberAssetsSummary_ad_accounts_inner")) {
		list<BusinessMemberAssetsSummary_ad_accounts_inner> new_list = static_cast<list <BusinessMemberAssetsSummary_ad_accounts_inner> > (getAdAccounts());
		node = converttoJson(&new_list, "BusinessMemberAssetsSummary_ad_accounts_inner", "array");
	} else {
		node = json_node_alloc();
		list<BusinessMemberAssetsSummary_ad_accounts_inner> new_list = static_cast<list <BusinessMemberAssetsSummary_ad_accounts_inner> > (getAdAccounts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BusinessMemberAssetsSummary_ad_accounts_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BusinessMemberAssetsSummary_ad_accounts_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_accountsKey = "ad_accounts";
	json_object_set_member(pJsonObject, ad_accountsKey, node);
	if (isprimitive("BusinessMemberAssetsSummary_profiles_inner")) {
		list<BusinessMemberAssetsSummary_profiles_inner> new_list = static_cast<list <BusinessMemberAssetsSummary_profiles_inner> > (getProfiles());
		node = converttoJson(&new_list, "BusinessMemberAssetsSummary_profiles_inner", "array");
	} else {
		node = json_node_alloc();
		list<BusinessMemberAssetsSummary_profiles_inner> new_list = static_cast<list <BusinessMemberAssetsSummary_profiles_inner> > (getProfiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BusinessMemberAssetsSummary_profiles_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BusinessMemberAssetsSummary_profiles_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *profilesKey = "profiles";
	json_object_set_member(pJsonObject, profilesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<BusinessMemberAssetsSummary_ad_accounts_inner>
BusinessMemberAssetsSummary::getAdAccounts()
{
	return ad_accounts;
}

void
BusinessMemberAssetsSummary::setAdAccounts(std::list <BusinessMemberAssetsSummary_ad_accounts_inner> ad_accounts)
{
	this->ad_accounts = ad_accounts;
}

std::list<BusinessMemberAssetsSummary_profiles_inner>
BusinessMemberAssetsSummary::getProfiles()
{
	return profiles;
}

void
BusinessMemberAssetsSummary::setProfiles(std::list <BusinessMemberAssetsSummary_profiles_inner> profiles)
{
	this->profiles = profiles;
}


