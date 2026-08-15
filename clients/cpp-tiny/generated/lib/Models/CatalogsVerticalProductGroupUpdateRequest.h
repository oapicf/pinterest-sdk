
/*
 * CatalogsVerticalProductGroupUpdateRequest.h
 *
 * Request object for updating a catalog based product group.
 */

#ifndef TINY_CPP_CLIENT_CatalogsVerticalProductGroupUpdateRequest_H_
#define TINY_CPP_CLIENT_CatalogsVerticalProductGroupUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsCreativeAssetsProductGroupUpdateRequest.h"
#include "CatalogsHotelProductGroupUpdateRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailProductGroupUpdateRequest.h"
#include "Country.h"

namespace Tiny {


/*! \brief Request object for updating a catalog based product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsVerticalProductGroupUpdateRequest();
    CatalogsVerticalProductGroupUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsVerticalProductGroupUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
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
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
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
    std::string catalog_type{};
    Country country;
    std::string description{};
    CatalogsCreativeAssetsProductGroupFilters filters;
    CatalogsLocale locale;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsVerticalProductGroupUpdateRequest_H_ */
