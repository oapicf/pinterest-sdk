/*
 * CatalogsHotelAvailableFilterValues.h
 *
 * 
 */

#ifndef _CatalogsHotelAvailableFilterValues_H_
#define _CatalogsHotelAvailableFilterValues_H_


#include <string>
#include "Catalogs_hotel_filter_values_map.h"
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

class CatalogsHotelAvailableFilterValues : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelAvailableFilterValues();
	CatalogsHotelAvailableFilterValues(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelAvailableFilterValues();

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
	Catalogs_hotel_filter_values_map getFilterValues();

	/*! \brief Set 
	 */
	void setFilterValues(Catalogs_hotel_filter_values_map  filter_values);

private:
	std::string catalog_type;
	Catalogs_hotel_filter_values_map filter_values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelAvailableFilterValues_H_ */
