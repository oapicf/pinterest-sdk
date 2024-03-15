/*
 * CatalogsHotelBatchRequest.h
 *
 * Request object to update catalogs hotel items
 */

#ifndef _CatalogsHotelBatchRequest_H_
#define _CatalogsHotelBatchRequest_H_


#include <string>
#include "CatalogsHotelBatchItem.h"
#include "CatalogsType.h"
#include "Country.h"
#include "Language.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to update catalogs hotel items
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelBatchRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelBatchRequest();
	CatalogsHotelBatchRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelBatchRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
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
	/*! \brief Get Array with catalogs item operations
	 */
	std::list<CatalogsHotelBatchItem> getItems();

	/*! \brief Set Array with catalogs item operations
	 */
	void setItems(std::list <CatalogsHotelBatchItem> items);
	/*! \brief Get Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	void setCatalogId(std::string  catalog_id);

private:
	CatalogsType catalog_type;
	Country country;
	Language language;
	std::list <CatalogsHotelBatchItem>items;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelBatchRequest_H_ */
