/*
 * CatalogsItemsUpdateBatchRequest.h
 *
 * Request object to update catalogs items
 */

#ifndef _CatalogsItemsUpdateBatchRequest_H_
#define _CatalogsItemsUpdateBatchRequest_H_


#include <string>
#include "BatchOperation.h"
#include "Country.h"
#include "ItemUpdateBatchRecord.h"
#include "Language.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to update catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsUpdateBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsUpdateBatchRequest();
	CatalogsItemsUpdateBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsUpdateBatchRequest();

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
	std::list<ItemUpdateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemUpdateBatchRecord> items);

private:
	Country country;
	Language language;
	BatchOperation operation;
	std::list <ItemUpdateBatchRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsUpdateBatchRequest_H_ */
