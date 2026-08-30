
/*
 * CatalogsListProductsByFilterRequest.h
 *
 * Request object to list products for a given product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsListProductsByFilterRequest_H_
#define TINY_CPP_CLIENT_CatalogsListProductsByFilterRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsListProductsByFeedBasedFilter.h"
#include "CatalogsLocale.h"
#include "CatalogsVerticalsListProductsByCatalogBasedFilterRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object to list products for a given product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsListProductsByFilterRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsListProductsByFilterRequest();
    CatalogsListProductsByFilterRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsListProductsByFilterRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog Feed id pertaining to the catalog product group filter.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group filter.
	 */
	void setFeedId(std::string feed_id);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters filters);
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
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale locale);


    private:
    std::string feed_id{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    CatalogsLocale locale;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsListProductsByFilterRequest_H_ */
