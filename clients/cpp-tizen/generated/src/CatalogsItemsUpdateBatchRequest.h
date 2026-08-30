/*
 * CatalogsItemsUpdateBatchRequest.h
 *
 * Request object to update catalogs items
 */

#ifndef _CatalogsItemsUpdateBatchRequest_H_
#define _CatalogsItemsUpdateBatchRequest_H_


#include <string>
#include "Country.h"
#include "ItemUpdateBatchRecord.h"
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
	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemUpdateBatchRecord> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemUpdateBatchRecord> items);
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
	std::list <ItemUpdateBatchRecord>items;
	std::string language;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsUpdateBatchRequest_H_ */
