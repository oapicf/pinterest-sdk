/*
 * CatalogsHotelProductGroupFiltersAnyOf.h
 *
 * 
 */

#ifndef _CatalogsHotelProductGroupFiltersAnyOf_H_
#define _CatalogsHotelProductGroupFiltersAnyOf_H_


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

class CatalogsHotelProductGroupFiltersAnyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelProductGroupFiltersAnyOf();
	CatalogsHotelProductGroupFiltersAnyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelProductGroupFiltersAnyOf();

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

private:
	std::list <CatalogsHotelProductGroupFilterKeys>any_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelProductGroupFiltersAnyOf_H_ */
