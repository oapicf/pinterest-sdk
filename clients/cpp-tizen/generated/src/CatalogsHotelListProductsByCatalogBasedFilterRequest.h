/*
 * CatalogsHotelListProductsByCatalogBasedFilterRequest.h
 *
 * Request object to list products for a given hotel catalog_id and product group filter.
 */

#ifndef _CatalogsHotelListProductsByCatalogBasedFilterRequest_H_
#define _CatalogsHotelListProductsByCatalogBasedFilterRequest_H_


#include <string>
#include "CatalogsHotelProductGroupFilters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object to list products for a given hotel catalog_id and product group filter.
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelListProductsByCatalogBasedFilterRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelListProductsByCatalogBasedFilterRequest();
	CatalogsHotelListProductsByCatalogBasedFilterRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelListProductsByCatalogBasedFilterRequest();

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
	/*! \brief Get Catalog id pertaining to the hotel product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel product group.
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsHotelProductGroupFilters  filters);

private:
	std::string catalog_type;
	std::string catalog_id;
	CatalogsHotelProductGroupFilters filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelListProductsByCatalogBasedFilterRequest_H_ */
