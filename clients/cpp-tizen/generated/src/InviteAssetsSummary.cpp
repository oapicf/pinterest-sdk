#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteAssetsSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteAssetsSummary::InviteAssetsSummary()
{
	//__init();
}

InviteAssetsSummary::~InviteAssetsSummary()
{
	//__cleanup();
}

void
InviteAssetsSummary::__init()
{
	//new std::list()std::list> ad_accounts;
	//new std::list()std::list> profiles;
}

void
InviteAssetsSummary::__cleanup()
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
InviteAssetsSummary::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_accountsKey = "ad_accounts";
	node = json_object_get_member(pJsonObject, ad_accountsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<InviteAssetsSummary_ad_accounts_inner> new_list;
			InviteAssetsSummary_ad_accounts_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("InviteAssetsSummary_ad_accounts_inner")) {
					jsonToValue(&inst, temp_json, "InviteAssetsSummary_ad_accounts_inner", "");
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
			list<InviteAssetsSummary_profiles_inner> new_list;
			InviteAssetsSummary_profiles_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("InviteAssetsSummary_profiles_inner")) {
					jsonToValue(&inst, temp_json, "InviteAssetsSummary_profiles_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			profiles = new_list;
		}
		
	}
}

InviteAssetsSummary::InviteAssetsSummary(char* json)
{
	this->fromJson(json);
}

char*
InviteAssetsSummary::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InviteAssetsSummary_ad_accounts_inner")) {
		list<InviteAssetsSummary_ad_accounts_inner> new_list = static_cast<list <InviteAssetsSummary_ad_accounts_inner> > (getAdAccounts());
		node = converttoJson(&new_list, "InviteAssetsSummary_ad_accounts_inner", "array");
	} else {
		node = json_node_alloc();
		list<InviteAssetsSummary_ad_accounts_inner> new_list = static_cast<list <InviteAssetsSummary_ad_accounts_inner> > (getAdAccounts());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<InviteAssetsSummary_ad_accounts_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			InviteAssetsSummary_ad_accounts_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_accountsKey = "ad_accounts";
	json_object_set_member(pJsonObject, ad_accountsKey, node);
	if (isprimitive("InviteAssetsSummary_profiles_inner")) {
		list<InviteAssetsSummary_profiles_inner> new_list = static_cast<list <InviteAssetsSummary_profiles_inner> > (getProfiles());
		node = converttoJson(&new_list, "InviteAssetsSummary_profiles_inner", "array");
	} else {
		node = json_node_alloc();
		list<InviteAssetsSummary_profiles_inner> new_list = static_cast<list <InviteAssetsSummary_profiles_inner> > (getProfiles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<InviteAssetsSummary_profiles_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			InviteAssetsSummary_profiles_inner obj = *it;
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

std::list<InviteAssetsSummary_ad_accounts_inner>
InviteAssetsSummary::getAdAccounts()
{
	return ad_accounts;
}

void
InviteAssetsSummary::setAdAccounts(std::list <InviteAssetsSummary_ad_accounts_inner> ad_accounts)
{
	this->ad_accounts = ad_accounts;
}

std::list<InviteAssetsSummary_profiles_inner>
InviteAssetsSummary::getProfiles()
{
	return profiles;
}

void
InviteAssetsSummary::setProfiles(std::list <InviteAssetsSummary_profiles_inner> profiles)
{
	this->profiles = profiles;
}


