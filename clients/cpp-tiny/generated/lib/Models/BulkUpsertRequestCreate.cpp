

#include "BulkUpsertRequestCreate.h"

using namespace Tiny;

BulkUpsertRequestCreate::BulkUpsertRequestCreate()
{
	ad_groups = std::list<AdGroupCreateRequest>();
	ads = std::list<AdCreateRequest>();
	campaigns = std::list<CampaignCreateRequest>();
	catalog_product_groups = std::list<BulkUpsertRequestCreateCatalogProductGroupsItems>();
	keywords = std::list<KeywordsRequest>();
	labels = std::list<LabelBulkCreateRequest>();
	product_groups = std::list<ProductGroupPromotionCreateRequest>();
	schedules = std::list<ScheduleCreateRequest>();
}

BulkUpsertRequestCreate::BulkUpsertRequestCreate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertRequestCreate::~BulkUpsertRequestCreate()
{

}

void
BulkUpsertRequestCreate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_groupsKey = "ad_groups";

    if(object.has_key(ad_groupsKey))
    {
        bourne::json value = object[ad_groupsKey];


        std::list<AdGroupCreateRequest> ad_groups_list;
        AdGroupCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ad_groups_list.push_back(element);
        }
        ad_groups = ad_groups_list;


    }

    const char *adsKey = "ads";

    if(object.has_key(adsKey))
    {
        bourne::json value = object[adsKey];


        std::list<AdCreateRequest> ads_list;
        AdCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ads_list.push_back(element);
        }
        ads = ads_list;


    }

    const char *campaignsKey = "campaigns";

    if(object.has_key(campaignsKey))
    {
        bourne::json value = object[campaignsKey];


        std::list<CampaignCreateRequest> campaigns_list;
        CampaignCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaigns_list.push_back(element);
        }
        campaigns = campaigns_list;


    }

    const char *catalog_product_groupsKey = "catalog_product_groups";

    if(object.has_key(catalog_product_groupsKey))
    {
        bourne::json value = object[catalog_product_groupsKey];


        std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups_list;
        BulkUpsertRequestCreateCatalogProductGroupsItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            catalog_product_groups_list.push_back(element);
        }
        catalog_product_groups = catalog_product_groups_list;


    }

    const char *keywordsKey = "keywords";

    if(object.has_key(keywordsKey))
    {
        bourne::json value = object[keywordsKey];


        std::list<KeywordsRequest> keywords_list;
        KeywordsRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            keywords_list.push_back(element);
        }
        keywords = keywords_list;


    }

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];


        std::list<LabelBulkCreateRequest> labels_list;
        LabelBulkCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            labels_list.push_back(element);
        }
        labels = labels_list;


    }

    const char *product_groupsKey = "product_groups";

    if(object.has_key(product_groupsKey))
    {
        bourne::json value = object[product_groupsKey];


        std::list<ProductGroupPromotionCreateRequest> product_groups_list;
        ProductGroupPromotionCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_groups_list.push_back(element);
        }
        product_groups = product_groups_list;


    }

    const char *schedulesKey = "schedules";

    if(object.has_key(schedulesKey))
    {
        bourne::json value = object[schedulesKey];


        std::list<ScheduleCreateRequest> schedules_list;
        ScheduleCreateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            schedules_list.push_back(element);
        }
        schedules = schedules_list;


    }


}

bourne::json
BulkUpsertRequestCreate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdGroupCreateRequest> ad_groups_list = getAdGroups();
    bourne::json ad_groups_arr = bourne::json::array();

    for(auto& var : ad_groups_list)
    {
        AdGroupCreateRequest obj = var;
        ad_groups_arr.append(obj.toJson());
    }
    object["ad_groups"] = ad_groups_arr;






    std::list<AdCreateRequest> ads_list = getAds();
    bourne::json ads_arr = bourne::json::array();

    for(auto& var : ads_list)
    {
        AdCreateRequest obj = var;
        ads_arr.append(obj.toJson());
    }
    object["ads"] = ads_arr;






    std::list<CampaignCreateRequest> campaigns_list = getCampaigns();
    bourne::json campaigns_arr = bourne::json::array();

    for(auto& var : campaigns_list)
    {
        CampaignCreateRequest obj = var;
        campaigns_arr.append(obj.toJson());
    }
    object["campaigns"] = campaigns_arr;






    std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups_list = getCatalogProductGroups();
    bourne::json catalog_product_groups_arr = bourne::json::array();

    for(auto& var : catalog_product_groups_list)
    {
        BulkUpsertRequestCreateCatalogProductGroupsItems obj = var;
        catalog_product_groups_arr.append(obj.toJson());
    }
    object["catalog_product_groups"] = catalog_product_groups_arr;






    std::list<KeywordsRequest> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordsRequest obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;






    std::list<LabelBulkCreateRequest> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        LabelBulkCreateRequest obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;






    std::list<ProductGroupPromotionCreateRequest> product_groups_list = getProductGroups();
    bourne::json product_groups_arr = bourne::json::array();

    for(auto& var : product_groups_list)
    {
        ProductGroupPromotionCreateRequest obj = var;
        product_groups_arr.append(obj.toJson());
    }
    object["product_groups"] = product_groups_arr;






    std::list<ScheduleCreateRequest> schedules_list = getSchedules();
    bourne::json schedules_arr = bourne::json::array();

    for(auto& var : schedules_list)
    {
        ScheduleCreateRequest obj = var;
        schedules_arr.append(obj.toJson());
    }
    object["schedules"] = schedules_arr;




    return object;

}

std::list<AdGroupCreateRequest>
BulkUpsertRequestCreate::getAdGroups()
{
	return ad_groups;
}

void
BulkUpsertRequestCreate::setAdGroups(std::list<AdGroupCreateRequest> ad_groups)
{
	this->ad_groups = ad_groups;
}

std::list<AdCreateRequest>
BulkUpsertRequestCreate::getAds()
{
	return ads;
}

void
BulkUpsertRequestCreate::setAds(std::list<AdCreateRequest> ads)
{
	this->ads = ads;
}

std::list<CampaignCreateRequest>
BulkUpsertRequestCreate::getCampaigns()
{
	return campaigns;
}

void
BulkUpsertRequestCreate::setCampaigns(std::list<CampaignCreateRequest> campaigns)
{
	this->campaigns = campaigns;
}

std::list<BulkUpsertRequestCreateCatalogProductGroupsItems>
BulkUpsertRequestCreate::getCatalogProductGroups()
{
	return catalog_product_groups;
}

void
BulkUpsertRequestCreate::setCatalogProductGroups(std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups)
{
	this->catalog_product_groups = catalog_product_groups;
}

std::list<KeywordsRequest>
BulkUpsertRequestCreate::getKeywords()
{
	return keywords;
}

void
BulkUpsertRequestCreate::setKeywords(std::list<KeywordsRequest> keywords)
{
	this->keywords = keywords;
}

std::list<LabelBulkCreateRequest>
BulkUpsertRequestCreate::getLabels()
{
	return labels;
}

void
BulkUpsertRequestCreate::setLabels(std::list<LabelBulkCreateRequest> labels)
{
	this->labels = labels;
}

std::list<ProductGroupPromotionCreateRequest>
BulkUpsertRequestCreate::getProductGroups()
{
	return product_groups;
}

void
BulkUpsertRequestCreate::setProductGroups(std::list<ProductGroupPromotionCreateRequest> product_groups)
{
	this->product_groups = product_groups;
}

std::list<ScheduleCreateRequest>
BulkUpsertRequestCreate::getSchedules()
{
	return schedules;
}

void
BulkUpsertRequestCreate::setSchedules(std::list<ScheduleCreateRequest> schedules)
{
	this->schedules = schedules;
}



