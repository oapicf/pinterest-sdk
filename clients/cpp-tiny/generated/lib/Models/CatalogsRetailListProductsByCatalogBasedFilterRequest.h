
/*
 * CatalogsRetailListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given retail catalog_id and product group filter.
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailListProductsByCatalogBasedFilterRequest_H_
#define TINY_CPP_CLIENT_CatalogsRetailListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsLocale.h"
#include "CatalogsProductGroupFilters.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object to list products for a given retail catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailListProductsByCatalogBasedFilterRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailListProductsByCatalogBasedFilterRequest();
    CatalogsRetailListProductsByCatalogBasedFilterRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailListProductsByCatalogBasedFilterRequest();


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
	/*! \brief Get Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	std::string getCatalogType();

	/*! \brief Set Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters filters);
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
    CatalogsProductGroupFilters filters;
    CatalogsLocale locale;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailListProductsByCatalogBasedFilterRequest_H_ */
