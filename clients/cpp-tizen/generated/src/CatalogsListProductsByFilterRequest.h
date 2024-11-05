/*
 * CatalogsListProductsByFilterRequest.h
 *
 * Request object to list products for a given product group filter.
 */

#ifndef _CatalogsListProductsByFilterRequest_H_
#define _CatalogsListProductsByFilterRequest_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "CatalogsListProductsByFeedBasedFilter.h"
#include "CatalogsLocale.h"
#include "CatalogsVerticalsListProductsByCatalogBasedFilterRequest.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsListProductsByFilterRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsListProductsByFilterRequest();
	CatalogsListProductsByFilterRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsListProductsByFilterRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog Feed id pertaining to the catalog product group filter.
	 */
	std::string getFeedId();

	/*! \brief Set Catalog Feed id pertaining to the catalog product group filter.
	 */
	void setFeedId(std::string  feed_id);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
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
	std::string feed_id;
	CatalogsCreativeAssetsProductGroupFilters filters;
	std::string catalog_type;
	std::string catalog_id;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsListProductsByFilterRequest_H_ */
