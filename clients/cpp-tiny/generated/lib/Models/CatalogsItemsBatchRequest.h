
/*
 * CatalogsItemsBatchRequest.h
 *
 * Request object of catalogs items batch
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsItemsBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BatchOperation.h"
#include "CatalogsItemsCreateBatchRequest.h"
#include "CatalogsItemsDeleteBatchRequest.h"
#include "CatalogsItemsDeleteDiscontinuedBatchRequest.h"
#include "CatalogsItemsUpdateBatchRequest.h"
#include "CatalogsItemsUpsertBatchRequest.h"
#include "Country.h"
#include "ItemDeleteBatchRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request object of catalogs items batch
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsBatchRequest();
    CatalogsItemsBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsBatchRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    Country country;
    std::list<ItemDeleteBatchRecord> items;
    std::string language{};
    BatchOperation operation;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsBatchRequest_H_ */
