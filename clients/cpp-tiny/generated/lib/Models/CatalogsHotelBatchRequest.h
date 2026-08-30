
/*
 * CatalogsHotelBatchRequest.h
 *
 * Request object to update catalogs hotel items
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsHotelBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsHotelBatchItem.h"
#include "Country.h"
#include <list>

namespace Tiny {


/*! \brief Request object to update catalogs hotel items
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelBatchRequest();
    CatalogsHotelBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelBatchRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
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
	/*! \brief Get Array with catalogs item operations
	 */
	std::list<CatalogsHotelBatchItem> getItems();

	/*! \brief Set Array with catalogs item operations
	 */
	void setItems(std::list<CatalogsHotelBatchItem> items);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string language);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    std::list<CatalogsHotelBatchItem> items;
    std::string language{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelBatchRequest_H_ */
