/*
 * CatalogsItemsCreateBatchRequest.h
 *
 * Request object to create catalogs items
 */

#ifndef _CatalogsItemsCreateBatchRequest_H_
#define _CatalogsItemsCreateBatchRequest_H_


#include <string>
#include "BatchOperation.h"
#include "Country.h"
#include "ItemCreateBatchRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to create catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsCreateBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsCreateBatchRequest();
	CatalogsItemsCreateBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsCreateBatchRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemCreateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemCreateBatchRecord> items);
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
	std::list <ItemCreateBatchRecord>items;
	std::string language;
	BatchOperation operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsCreateBatchRequest_H_ */
