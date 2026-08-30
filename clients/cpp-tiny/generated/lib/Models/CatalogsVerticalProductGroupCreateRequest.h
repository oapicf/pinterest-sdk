
/*
 * CatalogsVerticalProductGroupCreateRequest.h
 *
 * Request object for creating a catalog based product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsVerticalProductGroupCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsVerticalProductGroupCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupCreateRequest.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsHotelProductGroupCreateRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailProductGroupCreateRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object for creating a catalog based product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsVerticalProductGroupCreateRequest();
    CatalogsVerticalProductGroupCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsVerticalProductGroupCreateRequest();


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
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale locale);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    std::string description{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    CatalogsLocale locale;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsVerticalProductGroupCreateRequest_H_ */
