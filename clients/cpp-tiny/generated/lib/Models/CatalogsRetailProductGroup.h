
/*
 * CatalogsRetailProductGroup.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailProductGroup_H_
#define TINY_CPP_CLIENT_CatalogsRetailProductGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupFilters.h"
#include "CatalogsProductGroupStatus.h"
#include "CatalogsProductGroupType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroup{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailProductGroup();
    CatalogsRetailProductGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailProductGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog ID pertaining to the product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog ID pertaining to the product group.
	 */
	void setCatalogId(std::string catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	std::string getCountry();

	/*! \brief Set 
	 */
	void setCountry(std::string country);
	/*! \brief Get Unix timestamp in seconds of when catalog product group was created.
	 */
	int getCreatedAt();

	/*! \brief Set Unix timestamp in seconds of when catalog product group was created.
	 */
	void setCreatedAt(int created_at);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get id of the catalogs feed belonging to this catalog product group
	 */
	std::string getFeedId();

	/*! \brief Set id of the catalogs feed belonging to this catalog product group
	 */
	void setFeedId(std::string feed_id);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters filters);
	/*! \brief Get ID of the catalog product group.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog product group.
	 */
	void setId(std::string id);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool isIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool is_featured);
	/*! \brief Get 
	 */
	std::string getLocale();

	/*! \brief Set 
	 */
	void setLocale(std::string locale);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	CatalogsProductGroupStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(CatalogsProductGroupStatus status);
	/*! \brief Get 
	 */
	CatalogsProductGroupType getType();

	/*! \brief Set 
	 */
	void setType(CatalogsProductGroupType type);
	/*! \brief Get Unix timestamp in seconds of last time catalog product group was updated.
	 */
	int getUpdatedAt();

	/*! \brief Set Unix timestamp in seconds of last time catalog product group was updated.
	 */
	void setUpdatedAt(int updated_at);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    std::string country{};
    int created_at{};
    std::string description{};
    std::string feed_id{};
    CatalogsProductGroupFilters filters;
    std::string id{};
    bool is_featured{};
    std::string locale{};
    std::string name{};
    CatalogsProductGroupStatus status;
    CatalogsProductGroupType type;
    int updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailProductGroup_H_ */
