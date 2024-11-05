/*
 * CatalogsItemsUpsertBatchRequest.h
 *
 * Request object to upsert catalogs items
 */

#ifndef _CatalogsItemsUpsertBatchRequest_H_
#define _CatalogsItemsUpsertBatchRequest_H_


#include <string>
#include "BatchOperation.h"
#include "CatalogsItemsRequest_language.h"
#include "Country.h"
#include "ItemUpsertBatchRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to upsert catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsUpsertBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsUpsertBatchRequest();
	CatalogsItemsUpsertBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsUpsertBatchRequest();

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
	CatalogsItemsRequest_language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(CatalogsItemsRequest_language  language);
	/*! \brief Get 
	 */
	BatchOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(BatchOperation  operation);
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemUpsertBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemUpsertBatchRecord> items);

private:
	Country country;
	CatalogsItemsRequest_language language;
	BatchOperation operation;
	std::list <ItemUpsertBatchRecord>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsUpsertBatchRequest_H_ */
