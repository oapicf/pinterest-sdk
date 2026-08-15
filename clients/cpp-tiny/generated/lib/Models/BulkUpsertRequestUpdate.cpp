

#include "BulkUpsertRequestUpdate.h"

using namespace Tiny;

BulkUpsertRequestUpdate::BulkUpsertRequestUpdate()
{
	ad_groups = std::list<AdGroupUpdateRequest>();
	ads = std::list<AdUpdateRequest>();
	campaigns = std::list<CampaignUpdateRequest>();
	catalog_product_groups = std::list<Catalogs_product_groups_update_request>();
	keywords = std::list<KeywordUpdate>();
	labels = std::list<LabelBulkUpdateRequest>();
	product_groups = std::list<ProductGroupPromotionUpdateRequest>();
}

BulkUpsertRequestUpdate::BulkUpsertRequestUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkUpsertRequestUpdate::~BulkUpsertRequestUpdate()
{

}

void
BulkUpsertRequestUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_groupsKey = "ad_groups";

    if(object.has_key(ad_groupsKey))
    {
        bourne::json value = object[ad_groupsKey];


        std::list<AdGroupUpdateRequest> ad_groups_list;
        AdGroupUpdateRequest element;
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


        std::list<AdUpdateRequest> ads_list;
        AdUpdateRequest element;
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


        std::list<CampaignUpdateRequest> campaigns_list;
        CampaignUpdateRequest element;
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


        std::list<Catalogs_product_groups_update_request> catalog_product_groups_list;
        Catalogs_product_groups_update_request element;
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


        std::list<KeywordUpdate> keywords_list;
        KeywordUpdate element;
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


        std::list<LabelBulkUpdateRequest> labels_list;
        LabelBulkUpdateRequest element;
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


        std::list<ProductGroupPromotionUpdateRequest> product_groups_list;
        ProductGroupPromotionUpdateRequest element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            product_groups_list.push_back(element);
        }
        product_groups = product_groups_list;


    }


}

bourne::json
BulkUpsertRequestUpdate::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdGroupUpdateRequest> ad_groups_list = getAdGroups();
    bourne::json ad_groups_arr = bourne::json::array();

    for(auto& var : ad_groups_list)
    {
        AdGroupUpdateRequest obj = var;
        ad_groups_arr.append(obj.toJson());
    }
    object["ad_groups"] = ad_groups_arr;






    std::list<AdUpdateRequest> ads_list = getAds();
    bourne::json ads_arr = bourne::json::array();

    for(auto& var : ads_list)
    {
        AdUpdateRequest obj = var;
        ads_arr.append(obj.toJson());
    }
    object["ads"] = ads_arr;






    std::list<CampaignUpdateRequest> campaigns_list = getCampaigns();
    bourne::json campaigns_arr = bourne::json::array();

    for(auto& var : campaigns_list)
    {
        CampaignUpdateRequest obj = var;
        campaigns_arr.append(obj.toJson());
    }
    object["campaigns"] = campaigns_arr;






    std::list<Catalogs_product_groups_update_request> catalog_product_groups_list = getCatalogProductGroups();
    bourne::json catalog_product_groups_arr = bourne::json::array();

    for(auto& var : catalog_product_groups_list)
    {
        Catalogs_product_groups_update_request obj = var;
        catalog_product_groups_arr.append(obj.toJson());
    }
    object["catalog_product_groups"] = catalog_product_groups_arr;






    std::list<KeywordUpdate> keywords_list = getKeywords();
    bourne::json keywords_arr = bourne::json::array();

    for(auto& var : keywords_list)
    {
        KeywordUpdate obj = var;
        keywords_arr.append(obj.toJson());
    }
    object["keywords"] = keywords_arr;






    std::list<LabelBulkUpdateRequest> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        LabelBulkUpdateRequest obj = var;
        labels_arr.append(obj.toJson());
    }
    object["labels"] = labels_arr;






    std::list<ProductGroupPromotionUpdateRequest> product_groups_list = getProductGroups();
    bourne::json product_groups_arr = bourne::json::array();

    for(auto& var : product_groups_list)
    {
        ProductGroupPromotionUpdateRequest obj = var;
        product_groups_arr.append(obj.toJson());
    }
    object["product_groups"] = product_groups_arr;




    return object;

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

std::list<Catalogs_product_groups_update_request>
BulkUpsertRequestUpdate::getCatalogProductGroups()
{
	return catalog_product_groups;
}

void
BulkUpsertRequestUpdate::setCatalogProductGroups(std::list <Catalogs_product_groups_update_request> catalog_product_groups)
{
	this->catalog_product_groups = catalog_product_groups;
}

std::list<KeywordUpdate>
BulkUpsertRequestUpdate::getKeywords()
{
	return keywords;
}

void
BulkUpsertRequestUpdate::setKeywords(std::list <KeywordUpdate> keywords)
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



