/*
 * CatalogsBaseFiltersAllOf.h
 *
 * 
 */

#ifndef _CatalogsBaseFiltersAllOf_H_
#define _CatalogsBaseFiltersAllOf_H_


#include <string>
#include "CatalogsBaseFilterKeys.h"
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

class CatalogsBaseFiltersAllOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsBaseFiltersAllOf();
	CatalogsBaseFiltersAllOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsBaseFiltersAllOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsBaseFilterKeys> getAllOf();

	/*! \brief Set 
	 */
	void setAllOf(std::list <CatalogsBaseFilterKeys> all_of);

private:
	std::list <CatalogsBaseFilterKeys>all_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsBaseFiltersAllOf_H_ */
