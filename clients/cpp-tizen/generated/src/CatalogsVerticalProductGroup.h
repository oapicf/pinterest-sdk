/*
 * CatalogsVerticalProductGroup.h
 *
 * 
 */

#ifndef _CatalogsVerticalProductGroup_H_
#define _CatalogsVerticalProductGroup_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroup.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsHotelProductGroup.h"
#include "CatalogsHotelProductGroupType.h"
#include "CatalogsProductGroupStatus.h"
#include "CatalogsRetailProductGroup.h"
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

class CatalogsVerticalProductGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalProductGroup();
	CatalogsVerticalProductGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalProductGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog ID pertaining to the product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog ID pertaining to the product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	std::string getCountry();

	/*! \brief Set 
	 */
	void setCountry(std::string  country);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get id of the catalogs feed belonging to this catalog product group
	 */
	std::string getFeedId();

	/*! \brief Set id of the catalogs feed belonging to this catalog product group
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get ID of the catalog product group.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog product group.
	 */
	void setId(std::string  id);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	std::string getLocale();

	/*! \brief Set 
	 */
	void setLocale(std::string  locale);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	CatalogsProductGroupStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsProductGroupStatus  status);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupType getType();

	/*! \brief Set 
	 */
	void setType(CatalogsHotelProductGroupType  type);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int  updated_at);

private:
	std::string catalog_id;
	std::string catalog_type;
	std::string country;
	int created_at;
	std::string description;
	std::string feed_id;
	CatalogsCreativeAssetsProductGroupFilters filters;
	std::string id;
	bool is_featured;
	std::string locale;
	std::string name;
	CatalogsProductGroupStatus status;
	CatalogsHotelProductGroupType type;
	int updated_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroup_H_ */
