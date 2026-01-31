/*
 * BulkUpsertRequestUpdate.h
 *
 * Request for creation of entities in bulk.
 */

#ifndef _BulkUpsertRequestUpdate_H_
#define _BulkUpsertRequestUpdate_H_


#include <string>
#include "AdGroupUpdateRequest.h"
#include "AdUpdateRequest.h"
#include "CampaignUpdateRequest.h"
#include "Catalogs_product_groups_update_request.h"
#include "KeywordUpdate.h"
#include "LabelBulkUpdateRequest.h"
#include "ProductGroupPromotionUpdateRequest.h"
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

class BulkUpsertRequestUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkUpsertRequestUpdate();
	BulkUpsertRequestUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkUpsertRequestUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AdGroupUpdateRequest> getAdGroups();

	/*! \brief Set 
	 */
	void setAdGroups(std::list <AdGroupUpdateRequest> ad_groups);
	/*! \brief Get 
	 */
	std::list<AdUpdateRequest> getAds();

	/*! \brief Set 
	 */
	void setAds(std::list <AdUpdateRequest> ads);
	/*! \brief Get 
	 */
	std::list<CampaignUpdateRequest> getCampaigns();

	/*! \brief Set 
	 */
	void setCampaigns(std::list <CampaignUpdateRequest> campaigns);
	/*! \brief Get 
	 */
	std::list<Catalogs_product_groups_update_request> getCatalogProductGroups();

	/*! \brief Set 
	 */
	void setCatalogProductGroups(std::list <Catalogs_product_groups_update_request> catalog_product_groups);
	/*! \brief Get 
	 */
	std::list<KeywordUpdate> getKeywords();

	/*! \brief Set 
	 */
	void setKeywords(std::list <KeywordUpdate> keywords);
	/*! \brief Get 
	 */
	std::list<LabelBulkUpdateRequest> getLabels();

	/*! \brief Set 
	 */
	void setLabels(std::list <LabelBulkUpdateRequest> labels);
	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionUpdateRequest> getProductGroups();

	/*! \brief Set 
	 */
	void setProductGroups(std::list <ProductGroupPromotionUpdateRequest> product_groups);

private:
	std::list <AdGroupUpdateRequest>ad_groups;
	std::list <AdUpdateRequest>ads;
	std::list <CampaignUpdateRequest>campaigns;
	std::list <Catalogs_product_groups_update_request>catalog_product_groups;
	std::list <KeywordUpdate>keywords;
	std::list <LabelBulkUpdateRequest>labels;
	std::list <ProductGroupPromotionUpdateRequest>product_groups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BulkUpsertRequestUpdate_H_ */
