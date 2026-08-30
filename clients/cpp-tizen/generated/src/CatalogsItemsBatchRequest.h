/*
 * CatalogsItemsBatchRequest.h
 *
 * Request object of catalogs items batch
 */

#ifndef _CatalogsItemsBatchRequest_H_
#define _CatalogsItemsBatchRequest_H_


#include <string>
#include "CatalogsItemsCreateBatchRequest.h"
#include "CatalogsItemsDeleteBatchRequest.h"
#include "CatalogsItemsDeleteDiscontinuedBatchRequest.h"
#include "CatalogsItemsUpdateBatchRequest.h"
#include "CatalogsItemsUpsertBatchRequest.h"
#include "Country.h"
#include "ItemDeleteBatchRecord.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object of catalogs items batch
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsBatchRequest();
	CatalogsItemsBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsBatchRequest();

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
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);

private:
	Country country;
	std::list <ItemDeleteBatchRecord>items;
	std::string language;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsBatchRequest_H_ */
