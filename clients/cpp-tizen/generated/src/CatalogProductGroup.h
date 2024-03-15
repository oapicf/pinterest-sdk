/*
 * CatalogProductGroup.h
 *
 * non-promoted catalog product group entity
 */

#ifndef _CatalogProductGroup_H_
#define _CatalogProductGroup_H_


#include <string>
#include "Board.h"
#include "EntityStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief non-promoted catalog product group entity
 *
 *  \ingroup Models
 *
 */

class CatalogProductGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogProductGroup();
	CatalogProductGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogProductGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the catalog product group.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog product group.
	 */
	void setId(std::string  id);
	/*! \brief Get Merchant ID pertaining to the owner of the catalog product group.
	 */
	std::string getMerchantId();

	/*! \brief Set Merchant ID pertaining to the owner of the catalog product group.
	 */
	void setMerchantId(std::string  merchant_id);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string  name);
	/*! \brief Get Object holding a list of filters
	 */
	std::string getFilters();

	/*! \brief Set Object holding a list of filters
	 */
	void setFilters(std::string  filters);
	/*! \brief Get Object holding a list of filters
	 */
	std::string getFilterV2();

	/*! \brief Set Object holding a list of filters
	 */
	void setFilterV2(std::string  filter_v2);
	/*! \brief Get 
	 */
	Board getType();

	/*! \brief Set 
	 */
	void setType(Board  type);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get id of the feed profile belonging to this catalog product group
	 */
	std::string getFeedProfileId();

	/*! \brief Set id of the feed profile belonging to this catalog product group
	 */
	void setFeedProfileId(std::string  feed_profile_id);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getLastUpdate();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setLastUpdate(int  last_update);
	/*! \brief Get Amount of products in the catalog product group
	 */
	int getProductCount();

	/*! \brief Set Amount of products in the catalog product group
	 */
	void setProductCount(int  product_count);
	/*! \brief Get index of the featured position of the catalog product group
	 */
	int getFeaturedPosition();

	/*! \brief Set index of the featured position of the catalog product group
	 */
	void setFeaturedPosition(int  featured_position);

private:
	std::string id;
	std::string merchant_id;
	std::string name;
	std::string filters;
	std::string filter_v2;
	Board type;
	EntityStatus status;
	std::string feed_profile_id;
	int created_at;
	int last_update;
	int product_count;
	int featured_position;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogProductGroup_H_ */
