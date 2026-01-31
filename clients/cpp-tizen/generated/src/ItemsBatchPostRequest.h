/*
 * Items_batch_post_request.h
 *
 * 
 */

#ifndef _Items_batch_post_request_H_
#define _Items_batch_post_request_H_


#include <string>
#include "BatchOperation.h"
#include "CatalogsItemsBatchRequest.h"
#include "CatalogsVerticalBatchRequest.h"
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


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Items_batch_post_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Items_batch_post_request();
	Items_batch_post_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Items_batch_post_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
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
	BatchOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(BatchOperation  operation);

private:
	std::string catalog_id;
	std::string catalog_type;
	Country country;
	std::list <ItemDeleteBatchRecord>items;
	std::string language;
	BatchOperation operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Items_batch_post_request_H_ */
