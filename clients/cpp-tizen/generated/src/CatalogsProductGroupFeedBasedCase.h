/*
 * Catalogs_product_group_feed_based_case.h
 *
 * 
 */

#ifndef _Catalogs_product_group_feed_based_case_H_
#define _Catalogs_product_group_feed_based_case_H_


#include <string>
#include "CatalogsProductGroupFilters.h"
#include "CatalogsProductGroupStatus.h"
#include "CatalogsProductGroupType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_product_group_feed_based_case : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_product_group_feed_based_case();
	Catalogs_product_group_feed_based_case(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_product_group_feed_based_case();

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
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters  filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	CatalogsProductGroupType getType();

	/*! \brief Set 
	 */
	void setType(CatalogsProductGroupType  type);
	/*! \brief Get 
	 */
	CatalogsProductGroupStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsProductGroupStatus  status);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int  updated_at);
	/*! \brief Get id of the catalogs feed belonging to this catalog product group
	 */
	std::string getFeedId();

	/*! \brief Set id of the catalogs feed belonging to this catalog product group
	 */
	void setFeedId(std::string  feed_id);

private:
	std::string id;
	std::string name;
	std::string description;
	CatalogsProductGroupFilters filters;
	bool is_featured;
	CatalogsProductGroupType type;
	CatalogsProductGroupStatus status;
	int created_at;
	int updated_at;
	std::string feed_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_product_group_feed_based_case_H_ */
