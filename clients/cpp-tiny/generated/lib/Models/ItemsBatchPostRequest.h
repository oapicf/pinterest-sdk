
/*
 * Items_batch_post_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Items_batch_post_request_H_
#define TINY_CPP_CLIENT_Items_batch_post_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BatchOperation.h"
#include "CatalogsItemsBatchRequest.h"
#include "CatalogsVerticalBatchRequest.h"
#include "Country.h"
#include "ItemDeleteBatchRecord.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Items_batch_post_request{
public:

    /*! \brief Constructor.
	 */
    Items_batch_post_request();
    Items_batch_post_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Items_batch_post_request();


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
	void setCatalogId(std::string  catalog_id);
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
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemDeleteBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemDeleteBatchRecord> items);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string  language);
	/*! \brief Get 
	 */
	BatchOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(BatchOperation  operation);


    private:
    std::string catalog_id{};
    std::string catalog_type{};
    Country country;
    std::list<ItemDeleteBatchRecord> items;
    std::string language{};
    BatchOperation operation;
};
}

#endif /* TINY_CPP_CLIENT_Items_batch_post_request_H_ */
