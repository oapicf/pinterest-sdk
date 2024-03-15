/*
 * CatalogsHotelProductGroupFilters.h
 *
 * Object holding a group of filters for a hotel product group
 */

#ifndef _CatalogsHotelProductGroupFilters_H_
#define _CatalogsHotelProductGroupFilters_H_


#include <string>
#include "CatalogsHotelProductGroupFilterKeys.h"
#include "CatalogsHotelProductGroupFiltersAllOf.h"
#include "CatalogsHotelProductGroupFiltersAnyOf.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object holding a group of filters for a hotel product group
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupFilters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupFilters();
	CatalogsHotelProductGroupFilters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupFilters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsHotelProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsHotelProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsHotelProductGroupFilterKeys>any_of;
	std::list <CatalogsHotelProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupFilters_H_ */
