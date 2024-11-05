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
#include "CatalogsProductGroupStatus.h"
#include "CatalogsProductGroupType.h"
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

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get ID of the creative assets product group.
	 */
	std::string getId();

	/*! \brief Set ID of the creative assets product group.
	 */
	void setId(std::string  id);
	/*! \brief Get Name of creative assets product group
	 */
	std::string getName();

	/*! \brief Set Name of creative assets product group
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
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
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
	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get id of the catalogs feed belonging to this catalog product group
	 */
	std::string getFeedId();

	/*! \brief Set id of the catalogs feed belonging to this catalog product group
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	std::string getCountry();

	/*! \brief Set 
	 */
	void setCountry(std::string  country);
	/*! \brief Get 
	 */
	std::string getLocale();

	/*! \brief Set 
	 */
	void setLocale(std::string  locale);

private:
	std::string catalog_type;
	std::string id;
	std::string name;
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	bool is_featured;
	CatalogsProductGroupType type;
	CatalogsProductGroupStatus status;
	int created_at;
	int updated_at;
	std::string catalog_id;
	std::string feed_id;
	std::string country;
	std::string locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroup_H_ */
