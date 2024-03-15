/*
 * CatalogsHotelProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef _CatalogsHotelProductGroupFiltersAllOf_H_
#define _CatalogsHotelProductGroupFiltersAllOf_H_


#include <string>
#include "CatalogsHotelProductGroupFilterKeys.h"
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

class CatalogsHotelProductGroupFiltersAllOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupFiltersAllOf();
	CatalogsHotelProductGroupFiltersAllOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupFiltersAllOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsHotelProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsHotelProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsHotelProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupFiltersAllOf_H_ */
