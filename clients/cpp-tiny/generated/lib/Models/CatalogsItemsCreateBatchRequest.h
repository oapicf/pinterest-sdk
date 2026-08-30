
/*
 * CatalogsItemsCreateBatchRequest.h
 *
 * Request object to create catalogs items
 */

#ifndef TINY_CPP_CLIENT_CatalogsItemsCreateBatchRequest_H_
#define TINY_CPP_CLIENT_CatalogsItemsCreateBatchRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Country.h"
#include "ItemCreateBatchRecord.h"
#include <list>

namespace Tiny {


/*! \brief Request object to create catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsCreateBatchRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsItemsCreateBatchRequest();
    CatalogsItemsCreateBatchRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItemsCreateBatchRequest();


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
	std::list<ItemCreateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list<ItemCreateBatchRecord> items);
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
    std::list<ItemCreateBatchRecord> items;
    std::string language{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItemsCreateBatchRequest_H_ */
