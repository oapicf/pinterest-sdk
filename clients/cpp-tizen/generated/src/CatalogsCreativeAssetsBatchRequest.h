/*
 * CatalogsCreativeAssetsBatchRequest.h
 *
 * Request object to update catalogs creative assets items
 */

#ifndef _CatalogsCreativeAssetsBatchRequest_H_
#define _CatalogsCreativeAssetsBatchRequest_H_


#include <string>
#include "CatalogsCreativeAssetsBatchItem.h"
#include "Country.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to update catalogs creative assets items
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsBatchRequest();
	CatalogsCreativeAssetsBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsBatchRequest();

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
	/*! \brief Get Array with creative assets item operations
	 */
	std::list<CatalogsCreativeAssetsBatchItem> getItems();

	/*! \brief Set Array with creative assets item operations
	 */
	void setItems(std::list <CatalogsCreativeAssetsBatchItem> items);
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
	std::list <CatalogsCreativeAssetsBatchItem>items;
	std::string language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsBatchRequest_H_ */
