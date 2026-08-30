
/*
 * BulkUpsertRequestCreate.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef TINY_CPP_CLIENT_BulkUpsertRequestCreate_H_
#define TINY_CPP_CLIENT_BulkUpsertRequestCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdCreateRequest.h"
#include "AdGroupCreateRequest.h"
#include "BulkUpsertRequestCreateCatalogProductGroupsItems.h"
#include "CampaignCreateRequest.h"
#include "KeywordsRequest.h"
#include "LabelBulkCreateRequest.h"
#include "ProductGroupPromotionCreateRequest.h"
#include "ScheduleCreateRequest.h"
#include <list>

namespace Tiny {


/*! \brief Request for creation of entities in bulk.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertRequestCreate{
public:

    /*! \brief Constructor.
	 */
    BulkUpsertRequestCreate();
    BulkUpsertRequestCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkUpsertRequestCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdGroupCreateRequest> getAdGroups();

	/*! \brief Set 
	 */
	void setAdGroups(std::list<AdGroupCreateRequest> ad_groups);
	/*! \brief Get 
	 */
	std::list<AdCreateRequest> getAds();

	/*! \brief Set 
	 */
	void setAds(std::list<AdCreateRequest> ads);
	/*! \brief Get 
	 */
	std::list<CampaignCreateRequest> getCampaigns();

	/*! \brief Set 
	 */
	void setCampaigns(std::list<CampaignCreateRequest> campaigns);
	/*! \brief Get 
	 */
	std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> getCatalogProductGroups();

	/*! \brief Set 
	 */
	void setCatalogProductGroups(std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups);
	/*! \brief Get 
	 */
	std::list<KeywordsRequest> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list<KeywordsRequest> keywords);
	/*! \brief Get 
	 */
	std::list<LabelBulkCreateRequest> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list<LabelBulkCreateRequest> labels);
	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionCreateRequest> getProductGroups();

	/*! \brief Set 
	 */
	void setProductGroups(std::list<ProductGroupPromotionCreateRequest> product_groups);
	/*! \brief Get 
	 */
	std::list<ScheduleCreateRequest> getSchedules();

	/*! \brief Set 
	 */
	void setSchedules(std::list<ScheduleCreateRequest> schedules);


    private:
    std::list<AdGroupCreateRequest> ad_groups;
    std::list<AdCreateRequest> ads;
    std::list<CampaignCreateRequest> campaigns;
    std::list<BulkUpsertRequestCreateCatalogProductGroupsItems> catalog_product_groups;
    std::list<KeywordsRequest> keywords;
    std::list<LabelBulkCreateRequest> labels;
    std::list<ProductGroupPromotionCreateRequest> product_groups;
    std::list<ScheduleCreateRequest> schedules;
};
}

#endif /* TINY_CPP_CLIENT_BulkUpsertRequestCreate_H_ */
