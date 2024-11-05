/*
 * CatalogsRetailListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given retail catalog_id and product group filter.
 */

#ifndef _CatalogsRetailListProductsByCatalogBasedFilterRequest_H_
#define _CatalogsRetailListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "CatalogsLocale.h"
#include "CatalogsProductGroupFilters.h"
#include "Country.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given retail catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailListProductsByCatalogBasedFilterRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailListProductsByCatalogBasedFilterRequest();
	CatalogsRetailListProductsByCatalogBasedFilterRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailListProductsByCatalogBasedFilterRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	std::string getCatalogType();

	/*! \brief Set Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get Catalog id pertaining to the retail product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the retail product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	CatalogsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsProductGroupFilters  filters);
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
	CatalogsProductGroupFilters filters;
	Country country;
	CatalogsLocale locale;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailListProductsByCatalogBasedFilterRequest_H_ */
