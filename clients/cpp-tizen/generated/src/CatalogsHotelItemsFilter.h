/*
 * CatalogsHotelItemsFilter.h
 *
 * 
 */

#ifndef _CatalogsHotelItemsFilter_H_
#define _CatalogsHotelItemsFilter_H_


#include <string>
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

class CatalogsHotelItemsFilter : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelItemsFilter();
	CatalogsHotelItemsFilter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelItemsFilter();

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
	std::list<std::string> getHotelIds();

	/*! \brief Set 
	 */
	void setHotelIds(std::list <std::string> hotel_ids);
	/*! \brief Get Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::list <std::string>hotel_ids;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelItemsFilter_H_ */
