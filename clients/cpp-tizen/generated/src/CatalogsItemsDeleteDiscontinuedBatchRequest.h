/*
 * CatalogsItemsDeleteDiscontinuedBatchRequest.h
 *
 * Request object to discontinue catalogs items
 */

#ifndef _CatalogsItemsDeleteDiscontinuedBatchRequest_H_
#define _CatalogsItemsDeleteDiscontinuedBatchRequest_H_


#include <string>
#include "BatchOperation.h"
#include "Country.h"
#include "ItemDeleteDiscontinuedBatchRecord.h"
#include "Language.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to discontinue catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsDeleteDiscontinuedBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsDeleteDiscontinuedBatchRequest();
	CatalogsItemsDeleteDiscontinuedBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsDeleteDiscontinuedBatchRequest();

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
	std::list<ItemDeleteDiscontinuedBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemDeleteDiscontinuedBatchRecord> items);

private:
	Country country;
	Language language;
	BatchOperation operation;
	std::list <ItemDeleteDiscontinuedBatchRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsDeleteDiscontinuedBatchRequest_H_ */
