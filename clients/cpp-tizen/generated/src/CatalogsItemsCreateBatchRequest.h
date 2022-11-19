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
#include "Language.h"
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
	/*! \brief Get 
	 */
	Language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(Language  language);
	/*! \brief Get 
	 */
	BatchOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(BatchOperation  operation);
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemCreateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemCreateBatchRecord> items);

private:
	Country country;
	Language language;
	BatchOperation operation;
	std::list <ItemCreateBatchRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsCreateBatchRequest_H_ */
