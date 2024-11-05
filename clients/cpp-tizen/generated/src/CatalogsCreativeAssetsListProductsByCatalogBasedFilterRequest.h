/*
 * CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given creative assets catalog_id and product group filter.
 */

#ifndef _CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_
#define _CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given creative assets catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest();
	CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest();

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

private:
	std::string catalog_type;
	std::string catalog_id;
	CatalogsCreativeAssetsProductGroupFilters filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest_H_ */
