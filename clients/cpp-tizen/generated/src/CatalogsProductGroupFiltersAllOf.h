/*
 * CatalogsProductGroupFiltersAllOf.h
 *
 * 
 */

#ifndef _CatalogsProductGroupFiltersAllOf_H_
#define _CatalogsProductGroupFiltersAllOf_H_


#include <string>
#include "CatalogsProductGroupFilterKeys.h"
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

class CatalogsProductGroupFiltersAllOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsProductGroupFiltersAllOf();
	CatalogsProductGroupFiltersAllOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsProductGroupFiltersAllOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroupFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsProductGroupFilterKeys> all_of);

private:
	std::list <CatalogsProductGroupFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsProductGroupFiltersAllOf_H_ */
