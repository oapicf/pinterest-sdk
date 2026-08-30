#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkUpsertRequestUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkUpsertRequestUpdate::BulkUpsertRequestUpdate()
{
	//__init();
}

BulkUpsertRequestUpdate::~BulkUpsertRequestUpdate()
{
	//__cleanup();
}

void
BulkUpsertRequestUpdate::__init()
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
BulkUpsertRequestUpdate::__cleanup()
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
BulkUpsertRequestUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_groupsKey = "ad_groups";
	node = json_object_get_member(pJsonObject, ad_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupUpdateRequest> new_list;
			AdGroupUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupUpdateRequest")) {
					jsonToValue(&inst, temp_json, "AdGroupUpdateRequest", "");
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
			list<AdUpdateRequest> new_list;
			AdUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdUpdateRequest")) {
					jsonToValue(&inst, temp_json, "AdUpdateRequest", "");
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
			list<CampaignUpdateRequest> new_list;
			CampaignUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignUpdateRequest")) {
					jsonToValue(&inst, temp_json, "CampaignUpdateRequest", "");
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
			list<BulkUpsertRequestUpdateCatalogProductGroupsItems> new_list;
			BulkUpsertRequestUpdateCatalogProductGroupsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BulkUpsertRequestUpdateCatalogProductGroupsItems")) {
					jsonToValue(&inst, temp_json, "BulkUpsertRequestUpdateCatalogProductGroupsItems", "");
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
			list<KeywordUpdateGenerated> new_list;
			KeywordUpdateGenerated inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordUpdateGenerated")) {
					jsonToValue(&inst, temp_json, "KeywordUpdateGenerated", "");
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
			list<LabelBulkUpdateRequest> new_list;
			LabelBulkUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LabelBulkUpdateRequest")) {
					jsonToValue(&inst, temp_json, "LabelBulkUpdateRequest", "");
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
			list<ProductGroupPromotionUpdateRequest> new_list;
			ProductGroupPromotionUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ProductGroupPromotionUpdateRequest")) {
					jsonToValue(&inst, temp_json, "ProductGroupPromotionUpdateRequest", "");
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
			list<ScheduleUpdateRequest> new_list;
			ScheduleUpdateRequest inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ScheduleUpdateRequest")) {
					jsonToValue(&inst, temp_json, "ScheduleUpdateRequest", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			schedules = new_list;
		}
		
	}
}

BulkUpsertRequestUpdate::BulkUpsertRequestUpdate(char* json)
{
	this->fromJson(json);
}

char*
BulkUpsertRequestUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AdGroupUpdateRequest")) {
		list<AdGroupUpdateRequest> new_list = static_cast<list <AdGroupUpdateRequest> > (getAdGroups());
		node = converttoJson(&new_list, "AdGroupUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupUpdateRequest> new_list = static_cast<list <AdGroupUpdateRequest> > (getAdGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupUpdateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *ad_groupsKey = "ad_groups";
	json_object_set_member(pJsonObject, ad_groupsKey, node);
	if (isprimitive("AdUpdateRequest")) {
		list<AdUpdateRequest> new_list = static_cast<list <AdUpdateRequest> > (getAds());
		node = converttoJson(&new_list, "AdUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<AdUpdateRequest> new_list = static_cast<list <AdUpdateRequest> > (getAds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdUpdateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *adsKey = "ads";
	json_object_set_member(pJsonObject, adsKey, node);
	if (isprimitive("CampaignUpdateRequest")) {
		list<CampaignUpdateRequest> new_list = static_cast<list <CampaignUpdateRequest> > (getCampaigns());
		node = converttoJson(&new_list, "CampaignUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<CampaignUpdateRequest> new_list = static_cast<list <CampaignUpdateRequest> > (getCampaigns());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignUpdateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaignsKey = "campaigns";
	json_object_set_member(pJsonObject, campaignsKey, node);
	if (isprimitive("BulkUpsertRequestUpdateCatalogProductGroupsItems")) {
		list<BulkUpsertRequestUpdateCatalogProductGroupsItems> new_list = static_cast<list <BulkUpsertRequestUpdateCatalogProductGroupsItems> > (getCatalogProductGroups());
		node = converttoJson(&new_list, "BulkUpsertRequestUpdateCatalogProductGroupsItems", "array");
	} else {
		node = json_node_alloc();
		list<BulkUpsertRequestUpdateCatalogProductGroupsItems> new_list = static_cast<list <BulkUpsertRequestUpdateCatalogProductGroupsItems> > (getCatalogProductGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BulkUpsertRequestUpdateCatalogProductGroupsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BulkUpsertRequestUpdateCatalogProductGroupsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *catalog_product_groupsKey = "catalog_product_groups";
	json_object_set_member(pJsonObject, catalog_product_groupsKey, node);
	if (isprimitive("KeywordUpdateGenerated")) {
		list<KeywordUpdateGenerated> new_list = static_cast<list <KeywordUpdateGenerated> > (getKeywords());
		node = converttoJson(&new_list, "KeywordUpdateGenerated", "array");
	} else {
		node = json_node_alloc();
		list<KeywordUpdateGenerated> new_list = static_cast<list <KeywordUpdateGenerated> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordUpdateGenerated>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordUpdateGenerated obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	if (isprimitive("LabelBulkUpdateRequest")) {
		list<LabelBulkUpdateRequest> new_list = static_cast<list <LabelBulkUpdateRequest> > (getLabels());
		node = converttoJson(&new_list, "LabelBulkUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<LabelBulkUpdateRequest> new_list = static_cast<list <LabelBulkUpdateRequest> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LabelBulkUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LabelBulkUpdateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);
	if (isprimitive("ProductGroupPromotionUpdateRequest")) {
		list<ProductGroupPromotionUpdateRequest> new_list = static_cast<list <ProductGroupPromotionUpdateRequest> > (getProductGroups());
		node = converttoJson(&new_list, "ProductGroupPromotionUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<ProductGroupPromotionUpdateRequest> new_list = static_cast<list <ProductGroupPromotionUpdateRequest> > (getProductGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ProductGroupPromotionUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ProductGroupPromotionUpdateRequest obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *product_groupsKey = "product_groups";
	json_object_set_member(pJsonObject, product_groupsKey, node);
	if (isprimitive("ScheduleUpdateRequest")) {
		list<ScheduleUpdateRequest> new_list = static_cast<list <ScheduleUpdateRequest> > (getSchedules());
		node = converttoJson(&new_list, "ScheduleUpdateRequest", "array");
	} else {
		node = json_node_alloc();
		list<ScheduleUpdateRequest> new_list = static_cast<list <ScheduleUpdateRequest> > (getSchedules());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ScheduleUpdateRequest>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ScheduleUpdateRequest obj = *it;
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

std::list<AdGroupUpdateRequest>
BulkUpsertRequestUpdate::getAdGroups()
{
	return ad_groups;
}

void
BulkUpsertRequestUpdate::setAdGroups(std::list <AdGroupUpdateRequest> ad_groups)
{
	this->ad_groups = ad_groups;
}

std::list<AdUpdateRequest>
BulkUpsertRequestUpdate::getAds()
{
	return ads;
}

void
BulkUpsertRequestUpdate::setAds(std::list <AdUpdateRequest> ads)
{
	this->ads = ads;
}

std::list<CampaignUpdateRequest>
BulkUpsertRequestUpdate::getCampaigns()
{
	return campaigns;
}

void
BulkUpsertRequestUpdate::setCampaigns(std::list <CampaignUpdateRequest> campaigns)
{
	this->campaigns = campaigns;
}

std::list<BulkUpsertRequestUpdateCatalogProductGroupsItems>
BulkUpsertRequestUpdate::getCatalogProductGroups()
{
	return catalog_product_groups;
}

void
BulkUpsertRequestUpdate::setCatalogProductGroups(std::list <BulkUpsertRequestUpdateCatalogProductGroupsItems> catalog_product_groups)
{
	this->catalog_product_groups = catalog_product_groups;
}

std::list<KeywordUpdateGenerated>
BulkUpsertRequestUpdate::getKeywords()
{
	return keywords;
}

void
BulkUpsertRequestUpdate::setKeywords(std::list <KeywordUpdateGenerated> keywords)
{
	this->keywords = keywords;
}

std::list<LabelBulkUpdateRequest>
BulkUpsertRequestUpdate::getLabels()
{
	return labels;
}

void
BulkUpsertRequestUpdate::setLabels(std::list <LabelBulkUpdateRequest> labels)
{
	this->labels = labels;
}

std::list<ProductGroupPromotionUpdateRequest>
BulkUpsertRequestUpdate::getProductGroups()
{
	return product_groups;
}

void
BulkUpsertRequestUpdate::setProductGroups(std::list <ProductGroupPromotionUpdateRequest> product_groups)
{
	this->product_groups = product_groups;
}

std::list<ScheduleUpdateRequest>
BulkUpsertRequestUpdate::getSchedules()
{
	return schedules;
}

void
BulkUpsertRequestUpdate::setSchedules(std::list <ScheduleUpdateRequest> schedules)
{
	this->schedules = schedules;
}


