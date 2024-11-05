/*
 * CatalogsItemsFilters.h
 *
 * 
 */

#ifndef _CatalogsItemsFilters_H_
#define _CatalogsItemsFilters_H_


#include <string>
#include "CatalogsCreativeAssetsItemsFilter.h"
#include "CatalogsHotelItemsFilter.h"
#include "CatalogsRetailItemsFilter.h"
#include "CatalogsType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsItemsFilters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItemsFilters();
	CatalogsItemsFilters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItemsFilters();

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
	std::list<std::string> getItemIds();

	/*! \brief Set 
	 */
	void setItemIds(std::list <std::string> item_ids);
	/*! \brief Get Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	 */
	void setCatalogId(std::string  catalog_id);
	/*! \brief Get 
	 */
	std::list<std::string> getHotelIds();

	/*! \brief Set 
	 */
	void setHotelIds(std::list <std::string> hotel_ids);
	/*! \brief Get 
	 */
	std::list<std::string> getCreativeAssetsIds();

	/*! \brief Set 
	 */
	void setCreativeAssetsIds(std::list <std::string> creative_assets_ids);

private:
	CatalogsType catalog_type;
	std::list <std::string>item_ids;
	std::string catalog_id;
	std::list <std::string>hotel_ids;
	std::list <std::string>creative_assets_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItemsFilters_H_ */
