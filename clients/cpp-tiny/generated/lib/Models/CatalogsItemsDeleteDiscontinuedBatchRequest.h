
/*
 * CatalogsItemsDeleteDiscontinuedBatchRequest.h
 *
 * Request object to discontinue catalogs items
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsDeleteDiscontinuedBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsItemsDeleteDiscontinuedBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include "ItemDeleteDiscontinuedBatchRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request object to discontinue catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsDeleteDiscontinuedBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsDeleteDiscontinuedBatchRequest();
    CatalogsItemsDeleteDiscontinuedBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsDeleteDiscontinuedBatchRequest();


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
	void setCountry(Country country);
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemDeleteDiscontinuedBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list<ItemDeleteDiscontinuedBatchRecord> items);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string language);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);


    private:
    Country country;
    std::list<ItemDeleteDiscontinuedBatchRecord> items;
    std::string language{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsDeleteDiscontinuedBatchRequest_H_ */
