
/*
 * CatalogsItemsUpdateBatchRequest.h
 *
 * Request object to update catalogs items
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsUpdateBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsItemsUpdateBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BatchOperation.h"
#include "Country.h"
#include "ItemUpdateBatchRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request object to update catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsUpdateBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsUpdateBatchRequest();
    CatalogsItemsUpdateBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsUpdateBatchRequest();


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
	std::list<ItemUpdateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemUpdateBatchRecord> items);
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
    std::list<ItemUpdateBatchRecord> items;
    std::string language{};
    BatchOperation operation;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsUpdateBatchRequest_H_ */
