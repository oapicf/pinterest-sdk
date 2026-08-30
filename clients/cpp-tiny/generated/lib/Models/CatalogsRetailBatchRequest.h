
/*
 * CatalogsRetailBatchRequest.h
 *
 * A request object that can have multiple operations on a single retail batch
 */

#ifndef TINY_CPP_CLIENT_CatalogsRetailBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsRetailBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsRetailBatchRequestItemsItems.h"
#include "Country.h"
#include <list>

namespace Tiny {


/*! \brief A request object that can have multiple operations on a single retail batch
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsRetailBatchRequest();
    CatalogsRetailBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsRetailBatchRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
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
	std::list<CatalogsRetailBatchRequestItemsItems> getItems();

	/*! \brief Set Array with catalogs item operations
	 */
	void setItems(std::list<CatalogsRetailBatchRequestItemsItems> items);
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
    std::list<CatalogsRetailBatchRequestItemsItems> items;
    std::string language{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsRetailBatchRequest_H_ */
