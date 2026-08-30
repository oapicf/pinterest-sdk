
/*
 * CatalogsVerticalsListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given catalog_id and product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_
#define TINY_CPP_CLIENT_CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsHotelListProductsByCatalogBasedFilterRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailListProductsByCatalogBasedFilterRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object to list products for a given catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalsListProductsByCatalogBasedFilterRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest();
    CatalogsVerticalsListProductsByCatalogBasedFilterRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsVerticalsListProductsByCatalogBasedFilterRequest();


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
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country country);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters filters);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale locale);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    CatalogsCreativeAssetsProductGroupFilters filters;
    CatalogsLocale locale;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_ */
