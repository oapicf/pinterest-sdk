/*
 * CatalogsBaseFiltersAnyOf.h
 *
 * 
 */

#ifndef _CatalogsBaseFiltersAnyOf_H_
#define _CatalogsBaseFiltersAnyOf_H_


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

class CatalogsBaseFiltersAnyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsBaseFiltersAnyOf();
	CatalogsBaseFiltersAnyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsBaseFiltersAnyOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsBaseFilterKeys> getAnyOf();

	/*! \brief Set 
	 */
	void setAnyOf(std::list <CatalogsBaseFilterKeys> any_of);

private:
	std::list <CatalogsBaseFilterKeys>any_of;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsBaseFiltersAnyOf_H_ */
