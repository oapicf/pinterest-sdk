
/*
 * BulkUpsertRequestUpdateCatalogProductGroupsItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BulkUpsertRequestUpdateCatalogProductGroupsItems_H_
#define TINY_CPP_CLIENT_BulkUpsertRequestUpdateCatalogProductGroupsItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsLocale.h"
#include "CatalogsProductGroupUpdateRequest.h"
#include "CatalogsVerticalProductGroupUpdateRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BulkUpsertRequestUpdateCatalogProductGroupsItems{
public:

    /*! \brief Constructor.
	 */
    BulkUpsertRequestUpdateCatalogProductGroupsItems();
    BulkUpsertRequestUpdateCatalogProductGroupsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkUpsertRequestUpdateCatalogProductGroupsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters filters);
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool isIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool is_featured);
	/*! \brief Get Name of catalog product group
	 */
	std::string getName();

	/*! \brief Set Name of catalog product group
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country country);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale locale);


    private:
    std::string description{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    bool is_featured{};
    std::string name{};
    std::string catalog_type{};
    Country country;
    CatalogsLocale locale;
};
}

#endif /* TINY_CPP_CLIENT_BulkUpsertRequestUpdateCatalogProductGroupsItems_H_ */
