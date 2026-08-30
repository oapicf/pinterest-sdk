/*
 * CatalogsRetailBatchRequest.h
 *
 * A request object that can have multiple operations on a single retail batch
 */

#ifndef _CatalogsRetailBatchRequest_H_
#define _CatalogsRetailBatchRequest_H_


#include <string>
#include "CatalogsRetailBatchRequestItemsItems.h"
#include "Country.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A request object that can have multiple operations on a single retail batch
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailBatchRequest();
	CatalogsRetailBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailBatchRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
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
	/*! \brief Get Array with catalogs item operations
	 */
	std::list<CatalogsRetailBatchRequestItemsItems> getItems();

	/*! \brief Set Array with catalogs item operations
	 */
	void setItems(std::list <CatalogsRetailBatchRequestItemsItems> items);
	/*! \brief Get We recommend using the CatalogsLocale values.
	 */
	std::string getLanguage();

	/*! \brief Set We recommend using the CatalogsLocale values.
	 */
	void setLanguage(std::string  language);

private:
	std::string catalog_id;
	std::string catalog_type;
	Country country;
	std::list <CatalogsRetailBatchRequestItemsItems>items;
	std::string language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailBatchRequest_H_ */
