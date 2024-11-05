/*
 * CatalogsVerticalsListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given catalog_id and product group filter.
 */

#ifndef _CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_
#define _CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h"
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsHotelListProductsByCatalogBasedFilterRequest.h"
#include "CatalogsLocale.h"
#include "CatalogsRetailListProductsByCatalogBasedFilterRequest.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalsListProductsByCatalogBasedFilterRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalsListProductsByCatalogBasedFilterRequest();
	CatalogsVerticalsListProductsByCatalogBasedFilterRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalsListProductsByCatalogBasedFilterRequest();

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
	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	CatalogsLocale getLocale();

	/*! \brief Set 
	 */
	void setLocale(CatalogsLocale  locale);

private:
	std::string catalog_type;
	std::string catalog_id;
	CatalogsCreativeAssetsProductGroupFilters filters;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalsListProductsByCatalogBasedFilterRequest_H_ */
