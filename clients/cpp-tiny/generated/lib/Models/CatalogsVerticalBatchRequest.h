
/*
 * CatalogsVerticalBatchRequest.h
 *
 * A request object that can have multiple operations on a single batch
 */

#ifndef TINY_CPP_CLIENT_CatalogsVerticalBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsVerticalBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreativeAssetsBatchItem.h"
#include "CatalogsCreativeAssetsBatchRequest.h"
#include "CatalogsHotelBatchRequest.h"
#include "CatalogsRetailBatchRequest.h"
#include "Country.h"
#include <list>

namespace Tiny {


/*! \brief A request object that can have multiple operations on a single batch
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsVerticalBatchRequest();
    CatalogsVerticalBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsVerticalBatchRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
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
	/*! \brief Get Array with creative assets item operations
	 */
	std::list<CatalogsCreativeAssetsBatchItem> getItems();

	/*! \brief Set Array with creative assets item operations
	 */
	void setItems(std::list<CatalogsCreativeAssetsBatchItem> items);
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
    std::list<CatalogsCreativeAssetsBatchItem> items;
    std::string language{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsVerticalBatchRequest_H_ */
