/*
 * BulkUpsertRequestCreate.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef _BulkUpsertRequestCreate_H_
#define _BulkUpsertRequestCreate_H_


#include <string>
#include "AdCreateRequest.h"
#include "AdGroupCreateRequest.h"
#include "CampaignCreateRequest.h"
#include "KeywordsRequest.h"
#include "LabelCreateRequest.h"
#include "Multiple_product_groups_inner.h"
#include "ProductGroupPromotionCreateRequest.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request for creation of entities in bulk.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertRequestCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkUpsertRequestCreate();
	BulkUpsertRequestCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkUpsertRequestCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdGroupCreateRequest> getAdGroups();

	/*! \brief Set 
	 */
	void setAdGroups(std::list <AdGroupCreateRequest> ad_groups);
	/*! \brief Get 
	 */
	std::list<AdCreateRequest> getAds();

	/*! \brief Set 
	 */
	void setAds(std::list <AdCreateRequest> ads);
	/*! \brief Get 
	 */
	std::list<CampaignCreateRequest> getCampaigns();

	/*! \brief Set 
	 */
	void setCampaigns(std::list <CampaignCreateRequest> campaigns);
	/*! \brief Get 
	 */
	std::list<Multiple_product_groups_inner> getCatalogProductGroups();

	/*! \brief Set 
	 */
	void setCatalogProductGroups(std::list <Multiple_product_groups_inner> catalog_product_groups);
	/*! \brief Get 
	 */
	std::list<KeywordsRequest> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <KeywordsRequest> keywords);
	/*! \brief Get 
	 */
	std::list<LabelCreateRequest> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <LabelCreateRequest> labels);
	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionCreateRequest> getProductGroups();

	/*! \brief Set 
	 */
	void setProductGroups(std::list <ProductGroupPromotionCreateRequest> product_groups);

private:
	std::list <AdGroupCreateRequest>ad_groups;
	std::list <AdCreateRequest>ads;
	std::list <CampaignCreateRequest>campaigns;
	std::list <Multiple_product_groups_inner>catalog_product_groups;
	std::list <KeywordsRequest>keywords;
	std::list <LabelCreateRequest>labels;
	std::list <ProductGroupPromotionCreateRequest>product_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkUpsertRequestCreate_H_ */
