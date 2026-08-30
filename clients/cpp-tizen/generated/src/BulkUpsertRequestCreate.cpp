#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkUpsertRequestCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkUpsertRequestCreate::BulkUpsertRequestCreate()
{
	//__init();
}

BulkUpsertRequestCreate::~BulkUpsertRequestCreate()
{
	//__cleanup();
}

void
BulkUpsertRequestCreate::__init()
{
	//new std::list()std::list> ad_groups;
	//new std::list()std::list> ads;
	//new std::list()std::list> campaigns;
	//new std::list()std::list> catalog_product_groups;
	//new std::list()std::list> keywords;
	//new std::list()std::list> labels;
	//new std::list()std::list> product_groups;
	//new std::list()std::list> schedules;
}

void
BulkUpsertRequestCreate::__cleanup()
{
	//if(ad_groups != NULL) {
	//ad_groups.RemoveAll(true);
	//delete ad_groups;
	//ad_groups = NULL;
	//}
	//if(ads != NULL) {
	//ads.RemoveAll(true);
	//delete ads;
	//ads = NULL;
	//}
	//if(campaigns != NULL) {
	//campaigns.RemoveAll(true);
	//delete campaigns;
	//campaigns = NULL;
	//}
	//if(catalog_product_groups != NULL) {
	//catalog_product_groups.RemoveAll(true);
	//delete catalog_product_groups;
	//catalog_product_groups = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//if(product_groups != NULL) {
	//product_groups.RemoveAll(true);
	//delete product_groups;
	//product_groups = NULL;
	//}
	//if(schedules != NULL) {
	//schedules.RemoveAll(true);
	//delete schedules;
	//schedules = NULL;
	//}
	//
}

void
BulkUpsertRequestCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_groupsKey = "ad_groups";
	node = json_object_get_member(pJsonObject, ad_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupCreateRequest> new_list;
			AdGroupCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupCreateRequest")) {
					jsonToValue(&inst, temp_json, "AdGroupCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ad_groups = new_list;
		}
		
	}
	const gchar *adsKey = "ads";
	node = json_object_get_member(pJsonObject, adsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdCreateRequest> new_list;
			AdCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdCreateRequest")) {
					jsonToValue(&inst, temp_json, "AdCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			ads = new_list;
		}
		
	}
	const gchar *campaignsKey = "campaigns";
	node = json_object_get_member(pJsonObject, campaignsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignCreateRequest> new_list;
			CampaignCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignCreateRequest")) {
					jsonToValue(&inst, temp_json, "CampaignCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaigns = new_list;
		}
		
	}
	const gchar *catalog_product_groupsKey = "catalog_product_groups";
	node = json_object_get_member(pJsonObject, catalog_product_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BulkUpsertRequestCreateCatalogProductGroupsItems> new_list;
			BulkUpsertRequestCreateCatalogProductGroupsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BulkUpsertRequestCreateCatalogProductGroupsItems")) {
					jsonToValue(&inst, temp_json, "BulkUpsertRequestCreateCatalogProductGroupsItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			catalog_product_groups = new_list;
		}
		
	}
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordsRequest> new_list;
			KeywordsRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordsRequest")) {
					jsonToValue(&inst, temp_json, "KeywordsRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LabelBulkCreateRequest> new_list;
			LabelBulkCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelBulkCreateRequest")) {
					jsonToValue(&inst, temp_json, "LabelBulkCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
	const gchar *product_groupsKey = "product_groups";
	node = json_object_get_member(pJsonObject, product_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ProductGroupPromotionCreateRequest> new_list;
			ProductGroupPromotionCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductGroupPromotionCreateRequest")) {
					jsonToValue(&inst, temp_json, "ProductGroupPromotionCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			product_groups = new_list;
		}
		
	}
	const gchar *schedulesKey = "schedules";
	node = json_object_get_member(pJsonObject, schedulesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ScheduleCreateRequest> new_list;
			ScheduleCreateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ScheduleCreateRequest")) {
					jsonToValue(&inst, temp_json, "ScheduleCreateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			schedules = new_list;
		}
		
	}
}

BulkUpsertRequestCreate::BulkUpsertRequestCreate(char* json)
{
	this->fromJson(json);
}

char*
BulkUpsertRequestCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdGroupCreateRequest")) {
		list<AdGroupCreateRequest> new_list = static_cast<list <AdGroupCreateRequest> > (getAdGroups());
		node = converttoJson(&new_list, "AdGroupCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupCreateRequest> new_list = static_cast<list <AdGroupCreateRequest> > (getAdGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_groupsKey = "ad_groups";
	json_object_set_member(pJsonObject, ad_groupsKey, node);
	if (isprimitive("AdCreateRequest")) {
		list<AdCreateRequest> new_list = static_cast<list <AdCreateRequest> > (getAds());
		node = converttoJson(&new_list, "AdCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<AdCreateRequest> new_list = static_cast<list <AdCreateRequest> > (getAds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *adsKey = "ads";
	json_object_set_member(pJsonObject, adsKey, node);
	if (isprimitive("CampaignCreateRequest")) {
		list<CampaignCreateRequest> new_list = static_cast<list <CampaignCreateRequest> > (getCampaigns());
		node = converttoJson(&new_list, "CampaignCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<CampaignCreateRequest> new_list = static_cast<list <CampaignCreateRequest> > (getCampaigns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaignsKey = "campaigns";
	json_object_set_member(pJsonObject, campaignsKey, node);
	if (isprimitive("BulkUpsertRequestCreateCatalogProductGroupsItems")) {
		list<BulkUpsertRequestCreateCatalogProductGroupsItems> new_list = static_cast<list <BulkUpsertRequestCreateCatalogProductGroupsItems> > (getCatalogProductGroups());
		node = converttoJson(&new_list, "BulkUpsertRequestCreateCatalogProductGroupsItems", "array");
	} else {
		node = json_node_alloc();
		list<BulkUpsertRequestCreateCatalogProductGroupsItems> new_list = static_cast<list <BulkUpsertRequestCreateCatalogProductGroupsItems> > (getCatalogProductGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BulkUpsertRequestCreateCatalogProductGroupsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BulkUpsertRequestCreateCatalogProductGroupsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *catalog_product_groupsKey = "catalog_product_groups";
	json_object_set_member(pJsonObject, catalog_product_groupsKey, node);
	if (isprimitive("KeywordsRequest")) {
		list<KeywordsRequest> new_list = static_cast<list <KeywordsRequest> > (getKeywords());
		node = converttoJson(&new_list, "KeywordsRequest", "array");
	} else {
		node = json_node_alloc();
		list<KeywordsRequest> new_list = static_cast<list <KeywordsRequest> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordsRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordsRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	if (isprimitive("LabelBulkCreateRequest")) {
		list<LabelBulkCreateRequest> new_list = static_cast<list <LabelBulkCreateRequest> > (getLabels());
		node = converttoJson(&new_list, "LabelBulkCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<LabelBulkCreateRequest> new_list = static_cast<list <LabelBulkCreateRequest> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelBulkCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelBulkCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);
	if (isprimitive("ProductGroupPromotionCreateRequest")) {
		list<ProductGroupPromotionCreateRequest> new_list = static_cast<list <ProductGroupPromotionCreateRequest> > (getProductGroups());
		node = converttoJson(&new_list, "ProductGroupPromotionCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<ProductGroupPromotionCreateRequest> new_list = static_cast<list <ProductGroupPromotionCreateRequest> > (getProductGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductGroupPromotionCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductGroupPromotionCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *product_groupsKey = "product_groups";
	json_object_set_member(pJsonObject, product_groupsKey, node);
	if (isprimitive("ScheduleCreateRequest")) {
		list<ScheduleCreateRequest> new_list = static_cast<list <ScheduleCreateRequest> > (getSchedules());
		node = converttoJson(&new_list, "ScheduleCreateRequest", "array");
	} else {
		node = json_node_alloc();
		list<ScheduleCreateRequest> new_list = static_cast<list <ScheduleCreateRequest> > (getSchedules());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ScheduleCreateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ScheduleCreateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *schedulesKey = "schedules";
	json_object_set_member(pJsonObject, schedulesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AdGroupCreateRequest>
BulkUpsertRequestCreate::getAdGroups()
{
	return ad_groups;
}

void
BulkUpsertRequestCreate::setAdGroups(std::list <AdGroupCreateRequest> ad_groups)
{
	this->ad_groups = ad_groups;
}

std::list<AdCreateRequest>
BulkUpsertRequestCreate::getAds()
{
	return ads;
}

void
BulkUpsertRequestCreate::setAds(std::list <AdCreateRequest> ads)
{
	this->ads = ads;
}

std::list<CampaignCreateRequest>
BulkUpsertRequestCreate::getCampaigns()
{
	return campaigns;
}

void
BulkUpsertRequestCreate::setCampaigns(std::list <CampaignCreateRequest> campaigns)
{
	this->campaigns = campaigns;
}

std::list<BulkUpsertRequestCreateCatalogProductGroupsItems>
BulkUpsertRequestCreate::getCatalogProductGroups()
{
	return catalog_product_groups;
}

void
BulkUpsertRequestCreate::setCatalogProductGroups(std::list <BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups)
{
	this->catalog_product_groups = catalog_product_groups;
}

std::list<KeywordsRequest>
BulkUpsertRequestCreate::getKeywords()
{
	return keywords;
}

void
BulkUpsertRequestCreate::setKeywords(std::list <KeywordsRequest> keywords)
{
	this->keywords = keywords;
}

std::list<LabelBulkCreateRequest>
BulkUpsertRequestCreate::getLabels()
{
	return labels;
}

void
BulkUpsertRequestCreate::setLabels(std::list <LabelBulkCreateRequest> labels)
{
	this->labels = labels;
}

std::list<ProductGroupPromotionCreateRequest>
BulkUpsertRequestCreate::getProductGroups()
{
	return product_groups;
}

void
BulkUpsertRequestCreate::setProductGroups(std::list <ProductGroupPromotionCreateRequest> product_groups)
{
	this->product_groups = product_groups;
}

std::list<ScheduleCreateRequest>
BulkUpsertRequestCreate::getSchedules()
{
	return schedules;
}

void
BulkUpsertRequestCreate::setSchedules(std::list <ScheduleCreateRequest> schedules)
{
	this->schedules = schedules;
}


