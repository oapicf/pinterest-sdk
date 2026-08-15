
/*
 * CatalogsRetailProductGroupCreateRequest.h
 *
 * Request object for creating a product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailProductGroupCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsRetailProductGroupCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsLocale.h"
#include "CatalogsProductGroupFiltersRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object for creating a product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailProductGroupCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailProductGroupCreateRequest();
    CatalogsRetailProductGroupCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailProductGroupCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the retail product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	std::string getCatalogType();

	/*! \brief Set Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsProductGroupFiltersRequest getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFiltersRequest  filters);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale  locale);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    std::string description{};
    CatalogsProductGroupFiltersRequest filters;
    CatalogsLocale locale;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailProductGroupCreateRequest_H_ */
