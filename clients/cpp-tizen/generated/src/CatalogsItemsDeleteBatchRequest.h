/*
 * CatalogsItemsDeleteBatchRequest.h
 *
 * Request object to delete catalogs items
 */

#ifndef _CatalogsItemsDeleteBatchRequest_H_
#define _CatalogsItemsDeleteBatchRequest_H_


#include <string>
#include "BatchOperation.h"
#include "Country.h"
#include "ItemDeleteBatchRecord.h"
#include "Language.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to delete catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsDeleteBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsDeleteBatchRequest();
	CatalogsItemsDeleteBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsDeleteBatchRequest();

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
	std::list<ItemDeleteBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemDeleteBatchRecord> items);

private:
	Country country;
	Language language;
	BatchOperation operation;
	std::list <ItemDeleteBatchRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsDeleteBatchRequest_H_ */
