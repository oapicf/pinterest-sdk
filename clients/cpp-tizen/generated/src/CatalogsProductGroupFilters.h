/*
 * CatalogsProductGroupFilters.h
 *
 * Object holding a group of filters for a catalog product group
 */

#ifndef _CatalogsProductGroupFilters_H_
#define _CatalogsProductGroupFilters_H_


#include <string>
#include "CatalogsProductGroupFilterKeys.h"
#include "CatalogsProductGroupFiltersAllOf.h"
#include "CatalogsProductGroupFiltersAnyOf.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object holding a group of filters for a catalog product group
 *
 *  \ingroup Models
 *
 */

class CatalogsProductGroupFilters : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFilters();
	CatalogsProductGroupFilters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFilters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsProductGroupFilterKeys> any_of);
	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsProductGroupFilterKeys>any_of;
	std::list <CatalogsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFilters_H_ */
