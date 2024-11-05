/*
 * CatalogsVerticalBatchRequest.h
 *
 * A request object that can have multiple operations on a single batch
 */

#ifndef _CatalogsVerticalBatchRequest_H_
#define _CatalogsVerticalBatchRequest_H_


#include <string>
#include "CatalogsCreativeAssetsBatchItem.h"
#include "CatalogsCreativeAssetsBatchRequest.h"
#include "CatalogsHotelBatchRequest.h"
#include "CatalogsItemsRequest_language.h"
#include "CatalogsRetailBatchRequest.h"
#include "Country.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A request object that can have multiple operations on a single batch
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalBatchRequest();
	CatalogsVerticalBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalBatchRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get 
	 */
	CatalogsItemsRequest_language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(CatalogsItemsRequest_language  language);
	/*! \brief Get Array with creative assets item operations
	 */
	std::list<CatalogsCreativeAssetsBatchItem> getItems();

	/*! \brief Set Array with creative assets item operations
	 */
	void setItems(std::list <CatalogsCreativeAssetsBatchItem> items);
	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	Country country;
	CatalogsItemsRequest_language language;
	std::list <CatalogsCreativeAssetsBatchItem>items;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalBatchRequest_H_ */
